/**
 * Copyright (C) 2015 FuZhong
 *
 *查询用户Account号
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.account.dao.AccountDAO
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
package com.fzjt.xiaoliu.read.interfaces.business.account.dao;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.account.bean.rsp.RspAccountInfo;


public interface AccountDAO
{
	/**
	 * 通过userkey查询Account号
	 */
	List<RspAccountInfo> queryAccount(String userkey) throws SQLException;

}
