/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.street.dao.StreetDAO
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-21     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.sysmanager.street.dao;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.sysmanager.street.bean.info.rsp.RspStreetInfo;

/**
 * 街道信息服务
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.street.dao.StreetDAO
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-21 下午5:08:42
 * @author:TangKai
 */
public interface StreetDAO
{

    /**
     * 查询街道信息
     * 
     * @Description:根据areacode查询街道信息
     * @param areaCode
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-21 下午5:11:19
     */
    List<RspStreetInfo> queryStreetInfoByAreaCode(String areaCode) throws SQLException;
}
