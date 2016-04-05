package com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.dao.impl;

import java.sql.SQLException;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.bean.CustomerInfo;
import com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.dao.CustomerDAO;

/**
 * 用户管理
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.dao.impl.CustomerDAOImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-2 下午4:26:47
 * @author:LiangJin
 */
public class CustomerDAOImpl extends SqlMapClientDaoSupport implements CustomerDAO
{
	 /**
     * {@inheritDoc}
     */
	public CustomerInfo queryCustomerInfoByUserKey(String userkey) throws SQLException
	{

		return (CustomerInfo) this.getSqlMapClientTemplate().queryForObject("customer.queryCustomerInfoByUserKey", userkey);
	}

}
