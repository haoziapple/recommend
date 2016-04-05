package com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.dao;

import java.sql.SQLException;

import com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.bean.CustomerInfo;

/**
 * 根据用户 通用标识符 查询账户信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.dao.CustomerDAO
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-2 下午4:27:06
 * @author:LiangJin
 */
public interface CustomerDAO
{
	/**
	 * 根据用户 通用标识符 查询账户信息
	 * 
	 * @Description:
	 * @param userkey   用户key
	 * @return CustomerInfo
	 * @throws SQLException
	 * @version:v1.0
	 * @author:LiangJin
	 * @date:2015-11-9 上午9:11:29
	 */
	CustomerInfo queryCustomerInfoByUserKey(String userkey) throws SQLException;
}
