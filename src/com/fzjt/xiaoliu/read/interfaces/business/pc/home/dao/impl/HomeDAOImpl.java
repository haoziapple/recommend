/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.dao.impl.HomeDAOImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-2     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.pc.home.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.bottom.req.ReqBottomInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.bottom.rsp.RspBottomInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.turn.req.ReqTurnInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.turn.rsp.RspTurnInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.dao.HomeDAO;

/**
 * HomeDAO实现类
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.dao.impl.HomeDAOImpl
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-12-2 下午1:22:20
 * @author:LiangJin
 */
public class HomeDAOImpl extends SqlMapClientDaoSupport implements HomeDAO
{

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public List<RspTurnInfo> queryTurnInfo(ReqTurnInfo reqTurnInfo) throws SQLException
	{
		return this.getSqlMapClientTemplate().queryForList("home.queryTurnInfo",reqTurnInfo);
	}

	/**
	 * {@inheritDoc}
	 */
	public RspBottomInfo queryBottomInfo(ReqBottomInfo reqBottomInfo) throws SQLException
	{
		return (RspBottomInfo)this.getSqlMapClientTemplate().queryForObject("home.queryBottomInfo",reqBottomInfo);
	}

}
