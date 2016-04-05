/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.account.dao.AccountDAOImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:WangHao
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-11     WangHao       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.account.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.business.account.bean.rsp.RspAccountInfo;
import com.fzjt.xiaoliu.read.interfaces.business.account.dao.AccountDAO;

public class AccountDAOImpl extends SqlMapClientDaoSupport implements AccountDAO
{

	/**
	 * {@inheritDoc}
	 */
@SuppressWarnings("unchecked")
	public List<RspAccountInfo> queryAccount(String userkey) throws SQLException
	{
		// TODO Auto-generated method stub
		return  this.getSqlMapClientTemplate().queryForList("account.queryAccountByKey", userkey);
	}
}
