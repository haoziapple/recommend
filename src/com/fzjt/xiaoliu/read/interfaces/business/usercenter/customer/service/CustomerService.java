package com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.service;

import java.sql.SQLException;

import com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.bean.CustomerInfo;
/**
 *  根据通用标识符 获取账户信息
 * @className:com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.service.CustomerService
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-17 下午2:34:22
 * @author:LiangJin
 */
public interface CustomerService
{
	/**
	 * 根据通用标识符 获取账户信息
	 * 
	 * @Description:
	 * @param userkey 用户key
	 * @return CustomerInfo
	 * @throws SQLException
	 * @version:v1.0
	 * @author:LiangJin
	 * @date:2015-11-2 下午4:27:32
	 */
	CustomerInfo queryCustomerInfoByUserKey(String userkey) throws SQLException;
}
