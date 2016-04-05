/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.dao.impl.FetchDataDAOImpl
 * @description:TODO
 * @date:2016-3-2 下午4:44:20
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

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean.ItemVoteInfo;
import com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean.UserVoteInfo;
import com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.dao.FetchDataDAO;

/**
 * 获取数据实现类,从oracle里获取原始数据
 * @className:com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.dao.impl.FetchDataDAOImpl
 * @description:TODO
 * @version:v1.0.0 
 * @date:2016-3-2 下午4:48:07
 * @author:WangHao
 */
public class FetchDataDAOImpl extends SqlMapClientDaoSupport implements FetchDataDAO
{
	/**
	 * 获取所有的有效物品
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> queryAllItem() throws SQLException
	{
		return this.getSqlMapClientTemplate().queryForList("recommend.queryAllItem");
	}

	/**
	 * 获取物品打分列表
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ItemVoteInfo> queryItemVoteInfo(String itemKey) throws SQLException
	{
		return this.getSqlMapClientTemplate().queryForList("recommend.queryItemVoteInfo", itemKey);
	}

	/**
	 * 获取所有的有效用户 
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> queryAllUser() throws SQLException
	{
		return this.getSqlMapClientTemplate().queryForList("recommend.queryAllUser");
	}

	/**
	 * 获取用户打分列表
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<UserVoteInfo> queryUserVoteInfo(String userKey) throws SQLException
	{
		return this.getSqlMapClientTemplate().queryForList("recommend.queryUserVoteInfo", userKey);
	}

}
