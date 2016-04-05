/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean.UserVoteInfo
 * @description:TODO
 * @date:2016-3-1 上午10:44:50
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
 * 用户对物品的打分信息bean(暂时使用浏览历史数量)
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean.UserVoteInfo
 * @description:TODO
 * @version:v1.0.0 
 * @date:2016-3-1 上午10:44:52
 * @author:WangHao
 */
public class UserVoteInfo
{
	/**
	 * 物品key
	 */
	private String itemKey;
	
	/**
	 * 打分值
	 */
	private double point;

	public String getItemKey()
	{
		return itemKey;
	}

	public void setItemKey(String itemKey)
	{
		this.itemKey = itemKey;
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
