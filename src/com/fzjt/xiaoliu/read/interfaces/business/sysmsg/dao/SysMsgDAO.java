/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.push.sysmsg.dao.SysMsgDAO
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
package com.fzjt.xiaoliu.read.interfaces.business.sysmsg.dao;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.list.req.ReqSysMsgInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.list.rsp.RspSysMsgInfo;

/**
 * 查询系统推送信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.push.sysmsg.dao.SysMsgDAO
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-18 下午1:30:53
 * @author:LiangJin
 */
public interface SysMsgDAO
{
    /**
     * 查询系统推送信息列表
     * 
     * @Description:
     * @param reqSysMsgInfo
     * @return List
     * @throws SQLException
     * @version:v1.0
     * @author:LiangJin
     * @date:2015-11-18 下午1:30:57
     */
    List<RspSysMsgInfo> queryPushSysMsg(ReqSysMsgInfo reqSysMsgInfo) throws SQLException;

    /**
     * 查询系统推送信息总条数
     * 
     * @Description:
     * @param reqSysMsgInfo
     * @return String
     * @throws SQLException
     * @version:v1.0
     * @author:LiangJin
     * @date:2015-11-18 下午1:31:01
     */
    String queryPushCount(ReqSysMsgInfo reqSysMsgInfo) throws SQLException;

    /**
     * 根据msgkey查询系统推送消息信息
     * 
     * @Description:
     * @param msgkey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-19 下午8:07:23
     */
    RspSysMsgInfo querySysMsgByKey(String msgkey) throws SQLException;

}
