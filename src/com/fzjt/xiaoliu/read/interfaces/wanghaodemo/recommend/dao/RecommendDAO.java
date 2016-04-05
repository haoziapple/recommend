/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.dao.impl.RecommendDAO
 * @description:TODO
 * @date:2016-3-1 上午11:17:39
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
package com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.dao;

import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean.ItemVoteInfo;
import com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean.RelationInfo;
import com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean.UserVoteInfo;

/**
 * 推荐系统DAO
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.dao.impl.RecommendDAO
 * @description:TODO
 * @version:v1.0.0
 * @date:2016-3-1 上午11:17:46
 * @author:WangHao
 */
public interface RecommendDAO
{
	/**
	 * 设定所有有效商品
	 */
	public Long setAllItem(List<String> list, int time);

	/**
	 * 设定物品打分记录列表
	 */
	public String setItemVoteInfo(String item, List<ItemVoteInfo> infoList, int time);

	/**
	 * 设定用户打分记录列表
	 */
	public String setUserVoteInfo(String user, List<UserVoteInfo> infoList, int time);
	
	/**
	 * 设定商品的相关系数列表
	 */
	public String setRelationInfo(String item, List<RelationInfo> relationInfo, int time);

	/**
	 * 设定用户推荐系数列表
	 */
	public Long setRecommendList(String user, List<RelationInfo> relationInfo, int time);
	
	/**
	 * 查询对某一商品用户的打分记录
	 */
	public List<ItemVoteInfo> queryItemVoteInfo(String itemKey);

	/**
	 * 查询某一个用户对所有商品的打分记录
	 */
	public List<UserVoteInfo> queryUserVoteInfo(String userKey);

	/**
	 * 查询所有有效的商品
	 */
	public List<String> queryAvailabelItems();

	/**
	 * 查询某一个物品的相关系数列表
	 */
	public List<RelationInfo> queryItemRelation(String itemKey);
	
	/**
	 * 查询用户的推荐商品列表
	 */
	public List<String> queryRecommendItems(String userKey, int count);
}
