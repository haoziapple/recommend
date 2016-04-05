/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.content.dao.ContentDAO
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-5     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.floor.content.dao;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.home.floor.content.bean.req.ReqContentInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.content.bean.rsp.RspContentInfo;

/**
 * 通过楼层key，查询楼层模块信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.content.dao.ContentDAO
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-5 下午4:18:58
 * @author:LiangJin
 */
public interface ContentDAO
{
    /**
     * 通过楼层key，查询楼层模块信息
     * 
     * @Description: 通过楼层key，查询楼层模块内的所有数据集合
     * @param floorKey
     *            楼层KEY
     * @return List
     * @throws SQLException
     * @version:v1.0
     * @author:LiChangjiang
     * @date:2015-11-7 下午2:29:51
     */
	List<RspContentInfo> queryContentInfo(ReqContentInfo reqContentInfo) throws SQLException;
}
