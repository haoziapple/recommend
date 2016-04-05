/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.area.dao.impl.AreaListDAOImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-12     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.sysmanager.area.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.rsp.RspAreaInfo;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.area.dao.AreaListDAO;
/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.area.dao.impl.AreaListDAOImpl
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-12 下午7:03:39
 * @author:LiangJin
 */
public class AreaListDAOImpl extends SqlMapClientDaoSupport implements AreaListDAO
{

	/**
     * {@inheritDoc}
     */
	@SuppressWarnings("unchecked")
	public List<RspAreaInfo> queryAreaList(String areaCode) throws SQLException
	{
		
		return this.getSqlMapClientTemplate().queryForList("area.queryAreaList", areaCode);
	}

	/**
     * {@inheritDoc}
     */
	@SuppressWarnings("unchecked")
	public List<RspAreaInfo> queryAreaAllList() throws SQLException
	{
		
		return this.getSqlMapClientTemplate().queryForList("area.queryAreaAllList");
	}

}
