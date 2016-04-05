/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.dao.impl.RecommendDAOImpl
 * @description:TODO
 * @date:2016-3-2 上午10:54:22
 * @version:v1.0.0 
 * @author:WangHao
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2016-3-2     WangHao       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.fzjt.xiaoliu.read.interfaces.wanghaodemo.RedisClientTemplate;
import com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean.ItemVoteInfo;
import com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean.RelationInfo;
import com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean.UserVoteInfo;
import com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.dao.RecommendDAO;

/**
 * 推荐系统DAO实现类
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.dao.impl.RecommendDAOImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2016-3-2 下午6:15:50
 * @author:WangHao
 */
public class RecommendDAOImpl implements RecommendDAO
{
	private RedisClientTemplate redisClientTemplate;

	//不使用集群
	private static final boolean cluster = false;
	//设定物品列表名
	private static final String ALLITEM = "allitem";
	//设定命名空间分隔符
	private static final String SPLITTAG = ":";
	//设定物品命名前缀
	private static final String ITEMPREFIX = "item";
	//设定用户命名前缀
	private static final String USERPREFIX = "user";
	//设定推荐列表命名前缀
	private static final String RECPREFIX = "recommend";
	//设定关系列表命名前缀
	private static final String RELPREFIX = "itemrelation";

	/**
	 * 设定所有有效商品
	 */
	@Override
	public Long setAllItem(List<String> list, int time)
	{
		String[] strings = list.toArray(new String[0]);
		Long result = null;
		//存入列表
		result = redisClientTemplate.lpush(ALLITEM, cluster, strings);
		//设置过期时间
		redisClientTemplate.expire(ALLITEM, time, cluster);
		return result;
	}

	/**
	 * 设定物品打分记录列表
	 */
	@Override
	public String setItemVoteInfo(String item, List<ItemVoteInfo> infoList, int time)
	{
		Map<String, String> map = new HashMap<String, String>();
		String result = null;
		String key = ITEMPREFIX + SPLITTAG + item;
		for (ItemVoteInfo temp : infoList)
		{
			map.put(temp.getUserKey(), Double.toString(temp.getPoint()));
		}
		//将map存入redis
		result = redisClientTemplate.hmset(key, map, cluster);
		//设置过期时间
		redisClientTemplate.expire(key, time, cluster);
		return result;
	}

	/**
	 * 设定用户打分记录列表
	 */
	@Override
	public String setUserVoteInfo(String user, List<UserVoteInfo> infoList, int time)
	{

		Map<String, String> map = new HashMap<String, String>();
		String result = null;
		String key = USERPREFIX + SPLITTAG + user;
		for (UserVoteInfo temp : infoList)
		{
			map.put(temp.getItemKey(), Double.toString(temp.getPoint()));
		}
		//将map存入redis
		result = redisClientTemplate.hmset(key, map, cluster);
		//设置过期时间
		redisClientTemplate.expire(key, time, cluster);
		return result;
	}

	/**
	 * 设定商品相关系数列表
	 */
	@Override
	public String setRelationInfo(String item, List<RelationInfo> relationInfo, int time)
	{
		Map<String, String> map = new HashMap<String, String>();
		String result = null;
		String key = RELPREFIX + SPLITTAG + item;
		for (RelationInfo temp : relationInfo)
		{
			map.put(temp.getRelatedItem(), Double.toString(temp.getRelations()));
		}
		//将map存入redis
		result = redisClientTemplate.hmset(key, map, cluster);
		//设置过期时间
		redisClientTemplate.expire(key, time, cluster);
		return result;
	}

	/**
	 * 设定用户推荐系数列表
	 */
	@Override
	public Long setRecommendList(String user, List<RelationInfo> relationInfo, int time)
	{
		Map<String, Double> map = new HashMap<String, Double>();
		Long result = null;
		String key = RECPREFIX + SPLITTAG + user;
		for (RelationInfo temp : relationInfo)
		{
			map.put(temp.getRelatedItem(), temp.getRelations());
		}
		//有序集的存入
		result = redisClientTemplate.zadd(key, map, cluster);
		// 暂时不设置推荐系数列表的过期时间
		// redisClientTemplate.expire(key, time, cluster);
		return result;
	}

	/**
	 * 查询对某一商品用户的打分记录
	 */
	@Override
	public List<ItemVoteInfo> queryItemVoteInfo(String itemKey)
	{
		List<ItemVoteInfo> result = new ArrayList<ItemVoteInfo>();
		String queryKey = ITEMPREFIX + SPLITTAG + itemKey;
		Map<String, String> map = redisClientTemplate.hgetAll(queryKey, cluster);
		for (Entry<String, String> entry : map.entrySet())
		{
			ItemVoteInfo info = new ItemVoteInfo();
			info.setUserKey(entry.getKey());
			info.setPoint(Double.valueOf(entry.getValue()));
			result.add(info);
		}
		return result;
	}

	/**
	 * 查询某一个用户对所有商品的打分记录
	 */
	@Override
	public List<UserVoteInfo> queryUserVoteInfo(String userKey)
	{
		List<UserVoteInfo> result = new ArrayList<UserVoteInfo>();
		String queryKey = USERPREFIX + SPLITTAG + userKey;
		Map<String, String> map = redisClientTemplate.hgetAll(queryKey, cluster);
		for (Entry<String, String> entry : map.entrySet())
		{
			UserVoteInfo info = new UserVoteInfo();
			info.setItemKey(entry.getKey());
			info.setPoint(Double.valueOf(entry.getValue()));
			result.add(info);
		}
		return result;
	}

	/**
	 * 查询所有有效的商品
	 */
	@Override
	public List<String> queryAvailabelItems()
	{
		return redisClientTemplate.lrange(ALLITEM, 0, -1, cluster);
	}

	/**
	 * 查询某一个物品的相关系数列表
	 */
	@Override
	public List<RelationInfo> queryItemRelation(String itemKey)
	{
		List<RelationInfo> result = new ArrayList<RelationInfo>();
		String queryKey = RELPREFIX + SPLITTAG + itemKey;
		Map<String, String> map = redisClientTemplate.hgetAll(queryKey, cluster);
		for (Entry<String, String> entry : map.entrySet())
		{
			RelationInfo info = new RelationInfo();
			info.setRelatedItem(entry.getKey());
			info.setRelations(Double.valueOf(entry.getValue()));
			result.add(info);
		}
		return result;
	}
	
	/**
	 * 查询用户的推荐商品列表
	 */
	@Override
	public List<String> queryRecommendItems(String userKey, int count)
	{
		List<String> result = new ArrayList<String>();
		String queryKey = RECPREFIX + SPLITTAG + userKey;
		Set<String> set = redisClientTemplate.zrevrange(queryKey, new Long(0), new Long(count), cluster);
		for(String temp : set)
		{
			result.add(temp);
		}
		return result;
	}

	public RedisClientTemplate getRedisClientTemplate()
	{
		return redisClientTemplate;
	}

	public void setRedisClientTemplate(RedisClientTemplate redisClientTemplate)
	{
		this.redisClientTemplate = redisClientTemplate;
	}
}
