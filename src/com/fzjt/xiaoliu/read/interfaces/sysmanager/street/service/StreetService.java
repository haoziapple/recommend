/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.street.service.StreetService
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
package com.fzjt.xiaoliu.read.interfaces.sysmanager.street.service;

import java.sql.SQLException;

import com.fzjt.xiaoliu.read.interfaces.sysmanager.street.bean.info.rsp.RspStreetBody;

/**
 * 查询街道服务
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.street.service.StreetService
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-21 下午5:23:09
 * @author:TangKai
 */
public interface StreetService
{

    /**
     * 查询街道信息
     * 
     * @Description:根据areacode查询街道信息
     * @param reqStreetBody
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-21 下午5:24:25
     */
    RspStreetBody queryStreetInfoByAreaCode(String areaCode) throws SQLException;
}
