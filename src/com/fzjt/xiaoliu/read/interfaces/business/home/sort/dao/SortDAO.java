/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sort.dao.SortDAO
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-6     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.sort.dao;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.home.sort.bean.req.ReqSortInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.sort.bean.rsp.RspSortInfo;

/**
 * 调sql，查询分类信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sort.dao.SortDAO
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-6 下午4:01:42
 * @author:LiangJin
 */
public interface SortDAO
{
    /**
     * 查询首页分类模块
     * 
     * @Description:
     * @return List
     * @throws SQLException
     * @version:v1.0
     * @author:LiChangjiang
     * @date:2015-11-7 下午4:26:23
     */
    List<RspSortInfo> querySortInfo(ReqSortInfo reqSortInfo) throws SQLException;

}
