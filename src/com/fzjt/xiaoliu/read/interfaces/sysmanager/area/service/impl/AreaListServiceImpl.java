/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.area.service.impl.AreaListServiceImpl
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
package com.fzjt.xiaoliu.read.interfaces.sysmanager.area.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.rsp.RspAreaInfo;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.area.dao.AreaListDAO;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.area.service.AreaListService;
/**
 * 查询行政区域实现类
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.area.service.impl.AreaListServiceImpl
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-12 下午7:13:08
 * @author:LiangJin
 */
public class AreaListServiceImpl implements AreaListService
{
	/**
	 * 注入dao
	 */
	private AreaListDAO areaListDAO;

	/**
     * {@inheritDoc}
     */
	public List<RspAreaInfo> queryAreaList(String areaCode) throws SQLException
	{
		return areaListDAO.queryAreaList(areaCode);
		
	}

	/**
     * {@inheritDoc}
     */
	public List<RspAreaInfo> queryAreaAllList() throws SQLException
	{
		return areaListDAO.queryAreaAllList();
	}

	public AreaListDAO getAreaListDAO()
	{
		return areaListDAO;
	}

	public void setAreaListDAO(AreaListDAO areaListDAO)
	{
		this.areaListDAO = areaListDAO;
	}
	
	

}
