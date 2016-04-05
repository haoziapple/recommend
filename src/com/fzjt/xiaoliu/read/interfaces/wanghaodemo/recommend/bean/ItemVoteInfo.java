/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean.ItemVoteInfo
 * @description:TODO
 * @date:2016-3-1 上午11:54:26
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
package com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean;
/** 
 * 某一物品的用户打分信息
 * @className:com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean.ItemVoteInfo
 * @description:TODO
 * @version:v1.0.0 
 * @date:2016-3-1 上午11:54:29
 * @author:WangHao
 */
public class ItemVoteInfo
{
	/**
	 * 用户key
	 */
	public String userKey;
	
	/**
	 * 用户打分值
	 */
	public double point;

	public String getUserKey()
	{
		return userKey;
	}

	public void setUserKey(String userKey)
	{
		this.userKey = userKey;
	}

	public double getPoint()
	{
		return point;
	}

	public void setPoint(double point)
	{
		this.point = point;
	}
}
