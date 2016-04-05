/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.push.sysmsg.service.SysMsgService
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-18     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sysmsg.service;

import java.sql.SQLException;

import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.info.rsp.RspSysMsgKeyBody;
import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.list.req.ReqSysMsgBody;
import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.list.rsp.RspSysMsgBody;

/**
 * 查询系统推送信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.push.sysmsg.service.SysMsgService
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-18 下午1:41:17
 * @author:LiangJin
 */
public interface SysMsgService
{
    /**
     * 查询系统推送信息列表
     * 
     * @Description:
     * @param reqSysMsgBody
     * @return list
     * @throws SQLException
     * @version:v1.0
     * @author:LiangJin
     * @date:2015-11-18 下午1:41:20
     */
    RspSysMsgBody queryPushSysMsg(ReqSysMsgBody reqSysMsgBody) throws SQLException;

    /**
     * 根据msgkey查询系统推送消息信息
     * 
     * @Description:
     * @param reqSysMsgKeyBody
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-19 下午8:13:11
     */
    RspSysMsgKeyBody querySysMsgByKey(String msgKey) throws SQLException;

}
