/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean.UserVoteList
 * @description:TODO
 * @date:2016-3-1 上午10:48:02
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

import java.util.List;

/**
 * 某一个用户对所有物品的打分列表
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean.UserVoteList
 * @description:TODO
 * @version:v1.0.0 
 * @date:2016-3-1 上午10:48:05
 * @author:WangHao
 */
public class UserVoteList
{
	/**
	 * 用户key
	 */
	public String userKey;
	
	/**
	 * 打分列表
	 */
	public List<UserVoteInfo> voteList;

	public String getUserKey()
	{
		return userKey;
	}

	public void setUserKey(String userKey)
	{
		this.userKey = userKey;
	}

	public List<UserVoteInfo> getVoteList()
	{
		return voteList;
	}

	public void setVoteList(List<UserVoteInfo> voteList)
	{
		this.voteList = voteList;
	}
}
