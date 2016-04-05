/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.area.service.AreaListService
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
package com.fzjt.xiaoliu.read.interfaces.sysmanager.area.service;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.rsp.RspAreaInfo;

/**
 * service层，查询行政区
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.area.service.AreaListService
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-12 下午7:10:50
 * @author:LiangJin
 */
public interface AreaListService
{
	/**
	 * 根据上级查询下级
	 * 
	 * @Description:
	 * @param areaCode
	 * @return List
	 * @throws SQLException
	 * @version:v1.0
	 * @author:LiangJin
	 * @date:2015-11-12 下午7:10:56
	 */
	List<RspAreaInfo> queryAreaList(String areaCode) throws SQLException;

	/**
	 * 查询行政区划树级结构
	 * 
	 * @Description:
	 * @return List
	 * @throws SQLException
	 * @version:v1.0
	 * @author:LiangJin
	 * @date:2015-11-12 下午7:11:00
	 */
	List<RspAreaInfo> queryAreaAllList() throws SQLException;

}
