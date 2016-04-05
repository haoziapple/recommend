/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.dao.FetchDataDAO
 * @description:TODO
 * @date:2016-3-2 下午1:08:26
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
package com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.dao;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean.ItemVoteInfo;
import com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean.UserVoteInfo;

/**
 * 获取数据类,从oracle里获取原始数据
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.dao.FetchDataDAO
 * @description:TODO
 * @version:v1.0.0 
 * @date:2016-3-2 下午4:40:34
 * @author:WangHao
 */
public interface FetchDataDAO
{
	/**
	 * 获取所有的有效物品
	 * @Description:
	 * @return
	 * @version:v1.0
	 * @author:WangHao
	 * @date:2016-3-2 下午1:39:53
	 */
	public List<String> queryAllItem() throws SQLException;
	
	/**
	 * 获取物品打分列表
	 * @Description:
	 * @param itemKey
	 * @return
	 * @version:v1.0
	 * @author:WangHao
	 * @date:2016-3-2 下午1:43:23
	 */
	public List<ItemVoteInfo> queryItemVoteInfo(String itemKey) throws SQLException;

	
	 /** 
	 * 获取所有的有效用户 
	 * @Description:
	 * @return
	 * @version:v1.0
	 * @author:WangHao
	 * @date:2016-3-2 下午2:12:30
	 */
	public List<String> queryAllUser() throws SQLException; 
	
	/**
	 * 获取用户打分列表
	 * @Description:
	 * @param userKey
	 * @return
	 * @version:v1.0
	 * @author:WangHao
	 * @date:2016-3-2 下午2:16:42
	 */
	public List<UserVoteInfo> queryUserVoteInfo(String userKey) throws SQLException;
}
