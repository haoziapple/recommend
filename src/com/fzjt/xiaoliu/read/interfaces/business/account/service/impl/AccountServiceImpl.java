/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.account.service.AccountServiceImpl
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
package com.fzjt.xiaoliu.read.interfaces.business.account.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.account.bean.rsp.RspAccountInfo;
import com.fzjt.xiaoliu.read.interfaces.business.account.dao.AccountDAO;
import com.fzjt.xiaoliu.read.interfaces.business.account.service.AccountService;

public class AccountServiceImpl implements AccountService
{
	private AccountDAO accountDAO;

	public List<RspAccountInfo> queryAccount(String userkey) throws SQLException
	{
	
		
		List<RspAccountInfo> account = accountDAO.queryAccount(userkey);
		
		// TODO Auto-generated method stub
		return account;
	}

	/**
	 * @return the accountDAO
	 */
	public AccountDAO getAccountDAO()
	{
		return accountDAO;
	}

	/**
	 * @param accountDAO the accountDAO to set
	 */
	public void setAccountDAO(AccountDAO accountDAO)
	{
		this.accountDAO = accountDAO;
	}

}
