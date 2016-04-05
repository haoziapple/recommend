/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.service.impl.RecommendServiceImpl
 * @description:TODO
 * @date:2016-3-1 上午11:11:31
 * @version:v1.0.0 
 * @author:WangHao
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2016-3-1     WangHao       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.fzjt.xiaoliu.read.interfaces.util.ListTools;
import com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean.ItemVoteInfo;
import com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean.RelationInfo;
import com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean.UserVoteInfo;
import com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.dao.FetchDataDAO;
import com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.dao.RecommendDAO;
import com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.service.RecommendService;

/**
 * 推荐service实现类
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.service.impl.RecommendServiceImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2016-3-2 下午12:23:46
 * @author:WangHao
 */
@Service
public class RecommendServiceImpl implements RecommendService
{
	/**
	 * 注入推荐系统DAO
	 */
	private RecommendDAO recommendDAO;

	/**
	 * 注入获取数据DAO
	 */
	private FetchDataDAO fetchDataDAO;

	/**
	 * 初始化redis中的数据，同时设定数据有效时间
	 */
	@Override
	public String InitiateData(int time) throws SQLException
	{
		// 获取所有的有效物品
		List<String> itemList = fetchDataDAO.queryAllItem();
		recommendDAO.setAllItem(itemList, time);
		// 获取所有物品的打分记录列表
		for (String temp : itemList)
		{
			List<ItemVoteInfo> infoList = fetchDataDAO.queryItemVoteInfo(temp);
			if (!ListTools.isNullOrEmpty(infoList))
			{
				recommendDAO.setItemVoteInfo(temp, infoList, time);
			}
		}

		// 获取所有的有效用户
		List<String> userList = fetchDataDAO.queryAllUser();
		// 获取所有有效用户的打分记录列表
		for (String temp : userList)
		{
			List<UserVoteInfo> infoList = fetchDataDAO.queryUserVoteInfo(temp);
			if (!ListTools.isNullOrEmpty(infoList))
			{
				recommendDAO.setUserVoteInfo(temp, infoList, time);
			}
		}

		// 计算每个商品的相关系数列表并存入redis
		for (String temp : itemList)
		{
			List<RelationInfo> relationInfo = CalucateItemRelation(temp);
			if (!ListTools.isNullOrEmpty(relationInfo))
			{
				recommendDAO.setRelationInfo(temp, relationInfo, time);
			}
		}

		// 计算每个用户的推荐系数列表并存入redis
		// 以sorted set的形式，直接按顺序取出的就是推荐商品的key
		// 待优化:刷新时间和方式
		for (String temp : userList)
		{
			List<RelationInfo> relationInfo = CalucateRelationFor(temp);
			if (!ListTools.isNullOrEmpty(relationInfo))
			{
				recommendDAO.setRecommendList(temp, relationInfo, time);
			}
		}
		return null;
	}

	/**
	 * 计算某一个物品的相关系数列表
	 */
	@Override
	public List<RelationInfo> CalucateItemRelation(String itemKey)
	{
		// 该物品的相关系数列表
		List<RelationInfo> result = new ArrayList<RelationInfo>();
		// 查询该物品的所有用户打分记录
		List<ItemVoteInfo> itemVoteList = recommendDAO.queryItemVoteInfo(itemKey);
		// 打分的用户列表
		List<String> userList = new ArrayList<String>();
		if (!ListTools.isNullOrEmpty(itemVoteList))
		{
			for (ItemVoteInfo user : itemVoteList)
			{
				userList.add(user.getUserKey());
			}
		}
		if (!ListTools.isNullOrEmpty(userList))
		{
			// 该物品在用户空间中的长度
			double distanceA = CalucateDistance(itemVoteList);
			// 某一个用户的打分列表
			List<UserVoteInfo> userVoteList = new ArrayList<UserVoteInfo>();

			// 针对每一个用户,查询他的打分列表
			for (String userKey : userList)
			{
				userVoteList = recommendDAO.queryUserVoteInfo(userKey);
				// 计算相关系数
				// similarity(A,B)=cos(A,B)
				// A,B为物品打分在用户空间中的向量
				for (UserVoteInfo item : userVoteList)
				{
					boolean exist = false;
					// 遍历结果列表，如果已经计算过此物品相关系数就不再次计算
					for (RelationInfo temp : result)
					{
						if (temp.getRelatedItem().equals(item.getItemKey()))
						{
							exist = true;
							break;
						}
					}
					if (!exist)
					{
						List<ItemVoteInfo> itemVoteListB = recommendDAO.queryItemVoteInfo(item.getItemKey());
						double distanceB = CalucateDistance(itemVoteListB);
						double multiAB = CalucateMultiply(itemVoteList, itemVoteListB);
						if (distanceA * distanceB != 0)
						{
							double relations = multiAB / (distanceA * distanceB);
							RelationInfo info = new RelationInfo();
							info.setRelatedItem(item.getItemKey());
							info.setRelations(relations);
							result.add(info);
						}
					}
				}
			}
		}
		return result;
	}

	/**
	 * 计算某一用户的相关系数表 即推荐系数列表，根据这个列表进行排序推荐
	 */
	@Override
	public List<RelationInfo> CalucateRelationFor(String userKey)
	{
		List<RelationInfo> result = new ArrayList<RelationInfo>();
		// 查询该用户的打分记录
		List<UserVoteInfo> voteList = recommendDAO.queryUserVoteInfo(userKey);
		if (!ListTools.isNullOrEmpty(voteList))
		{
			for (UserVoteInfo info : voteList)
			{
				// 针对每个商品求相关系数，与相应的打分相乘后求和
				List<RelationInfo> relationList = recommendDAO.queryItemRelation(info.getItemKey());
				for (RelationInfo relationInfo : relationList)
				{
					boolean exist = false;
					// 遍历结果列表
					for (RelationInfo temp : result)
					{
						// 结果列表中已存在item,relations叠加
						if (temp.getRelatedItem().equals(relationInfo.getRelatedItem()))
						{
							double relations = temp.getRelations();
							relations += relationInfo.getRelations() * info.getPoint();
							temp.setRelations(relations);
							exist = true;
							break;
						}
					}
					// 结果列表中不存在item,向列表中添加
					if (!exist)
					{
						RelationInfo relation = new RelationInfo();
						relation.setRelatedItem(relationInfo.getRelatedItem());
						relation.setRelations(relationInfo.getRelations() * info.getPoint());
						result.add(relation);
					}
				}
			}
		}
		return result;
	}

	/**
	 * 计算某一商品向量的空间长度
	 */
	private double CalucateDistance(List<ItemVoteInfo> list)
	{
		double distance = 0;
		Iterator<ItemVoteInfo> it = list.iterator();
		while (it.hasNext())
		{
			distance += Math.pow(it.next().getPoint(), 2);
		}
		return Math.sqrt(distance);
	}

	/**
	 * 计算两个商品向量之间的矢积
	 */
	private double CalucateMultiply(List<ItemVoteInfo> itemVoteList, List<ItemVoteInfo> itemVoteListB)
	{
		double result = 0;
		ListIterator<ItemVoteInfo> itA = itemVoteList.listIterator();
		while (itA.hasNext())
		{
			String userA = itA.next().getUserKey();
			double pointA = itA.previous().getPoint();
			itA.next();
			// System.out.println("userA: " + userA + " pointA " + pointA);
			// 对于A中的每个元素都需要遍历B去寻找相同的用户
			ListIterator<ItemVoteInfo> itB = itemVoteListB.listIterator();
			while (itB.hasNext())
			{
				if (userA.equals(itB.next().getUserKey()))
				{
					result = result + pointA * itB.previous().getPoint();
					System.out.println("result: " + result);
					break;
				}
			}
		}
		return result;
	}

	public RecommendDAO getRecommendDAO()
	{
		return recommendDAO;
	}

	public void setRecommendDAO(RecommendDAO recommendDAO)
	{
		this.recommendDAO = recommendDAO;
	}

	public FetchDataDAO getFetchDataDAO()
	{
		return fetchDataDAO;
	}

	public void setFetchDataDAO(FetchDataDAO fetchDataDAO)
	{
		this.fetchDataDAO = fetchDataDAO;
	}

	// 测试代码
	public static void main(String[] args)
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"classpath:com/fzjt/xiaoliu/read/interfaces/cfg/spring/applicationContext.xml");
		RecommendServiceImpl service = (RecommendServiceImpl) ac.getBean("recommendServiceImpl");
		 try
		 {
		 service.InitiateData(3600);
		 }
		 catch (SQLException e)
		 {
		 // TODO Auto-generated catch block
		 e.printStackTrace();
		 }
		// List<RelationInfo> list =
		// service.CalucateRelationFor("U201512081339567147");
		// for(RelationInfo temp : list)
		// {
		// System.out.println(temp.getRelatedItem());
		// System.out.println(temp.getRelations());
		// }
		// List<RelationInfo> list2 =
		// service.CalucateItemRelation("GOHGgXBrrHdl7NjP8G");
		// for(RelationInfo temp : list2)
		// {
		// System.out.println(temp.getRelatedItem());
		// System.out.println(temp.getRelations());
		// }
		// RecommendServiceImpl test = new RecommendServiceImpl();
		// ItemVoteInfo info = new ItemVoteInfo();
		// ItemVoteInfo info2 = new ItemVoteInfo();
		// ItemVoteInfo info3 = new ItemVoteInfo();
		// ItemVoteInfo info4 = new ItemVoteInfo();
		// List<ItemVoteInfo> a = new ArrayList<ItemVoteInfo>();
		// List<ItemVoteInfo> b = new ArrayList<ItemVoteInfo>();
		// info.setPoint(1);
		// info.setUserKey("1");
		// info2.setPoint(2);
		// info2.setUserKey("2");
		// info3.setPoint(3);
		// info3.setUserKey("1");
		// info4.setPoint(4);
		// info4.setUserKey("2");
		// a.add(info);
		// a.add(info2);
		// ListIterator<ItemVoteInfo> itA = a.listIterator();
		// System.out.println(itA.next().getUserKey());
		// System.out.println(itA.next().getUserKey());
		//
		// b.add(info4);
		// b.add(info3);
		// double c = test.CalucateMultiply(a, b);
		// System.out.println(c);

	}
}
