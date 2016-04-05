/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.service.HelpCenterService
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-2     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.helpcenter.service;

import java.sql.SQLException;

import com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.info.rsp.RspHelpInfo;
import com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.req.ReqHelpListBody;
import com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.rsp.RspHelpListBody;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.service.HelpCenterService
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 下午9:19:13
 * @author:TangKai
 */
public interface HelpCenterService
{
    /**
     * 根据帮助内容key查询帮助信息
     * 
     * @Description:
     * @param dataKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-2 下午9:25:51
     */
    RspHelpInfo queryHelpCenterInfo(String dataKey) throws SQLException;

    /**
     * 查询PC商城帮助中心类别
     * 
     * @Description:
     * @param reqBody
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-2 下午9:24:57
     */
    RspHelpListBody queryHelpCenterList(ReqHelpListBody reqBody) throws SQLException;

}
