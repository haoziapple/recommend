/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.push.sysmsg.service.impl.SysMsgServiceImpl
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
package com.fzjt.xiaoliu.read.interfaces.business.sysmsg.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.info.rsp.RspSysMsgKeyBody;
import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.list.req.ReqSysMsgBody;
import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.list.req.ReqSysMsgInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.list.rsp.RspSysMsgBody;
import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.list.rsp.RspSysMsgInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.list.rsp.RspSysMsgList;
import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.dao.SysMsgDAO;
import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.service.SysMsgService;
import com.fzjt.xiaoliu.read.interfaces.util.Constant;
import com.fzjt.xiaoliu.read.interfaces.util.DateUtils;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sysmsg.service.impl.SysMsgServiceImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-19 下午7:48:58
 * @author:TangKai
 */
public class SysMsgServiceImpl implements SysMsgService
{
    /**
     * 注入
     */
    private SysMsgDAO sysMsgDAO;

    /**
     * {@inheritDoc}
     */
    public RspSysMsgBody queryPushSysMsg(ReqSysMsgBody reqSysMsgBody) throws SQLException
    {
        // 设置分页信息
        ReqSysMsgInfo reqInfo = reqSysMsgBody.getReqSysMsgInfo();

        // 设置分页条数，如果分页参数为空就设置默认的分页条数
        if (StringTools.isNullOrEmpty(reqSysMsgBody.getPageBean())
                || StringTools.isNullOrEmpty(reqSysMsgBody.getPageBean().getFromNum())
                || StringTools.isNullOrEmpty(reqSysMsgBody.getPageBean().getToNum()))
        {
            reqInfo.setFromNum(Constant.DEFAULT_PAGE_FROM);
            reqInfo.setToNum(Constant.DEFAULT_PAGE_TO);
        }
        else
        {
            reqInfo.setFromNum(reqSysMsgBody.getPageBean().getFromNum());
            reqInfo.setToNum(reqSysMsgBody.getPageBean().getToNum());
        }

        // 定义返回信息
        RspSysMsgBody rspBody = new RspSysMsgBody();
        RspSysMsgList rspList = new RspSysMsgList();
        List<RspSysMsgInfo> list = null;
        String count = "";

        // 调DAO，查询系统消息
        list = sysMsgDAO.queryPushSysMsg(reqInfo);

        // 调DAO，查询系统消息条数
        count = sysMsgDAO.queryPushCount(reqInfo);

        // 判断查询结果是否为空
        if (StringTools.isNullOrEmpty(list))
        {
            rspList.setRspSysMsgInfo(list);
            rspBody.setRspSysMsgList(rspList);
            rspBody.setCount("0");

            return rspBody;
        }

        // 时间转换
        for (RspSysMsgInfo rspInfo : list)
        {
            if (!StringTools.isNullOrEmpty(rspInfo)&&!StringTools.isNullOrEmpty(rspInfo.getAddTime()))
            {
                rspInfo.setAddTimeStr(DateUtils.dateToStrNoS(rspInfo.getAddTime()));
            }
        }

        // 设置返回信息
        rspList.setRspSysMsgInfo(list);
        rspBody.setRspSysMsgList(rspList);
        rspBody.setCount(count);

        return rspBody;
    }

    /**
     * {@inheritDoc}
     */
    public RspSysMsgKeyBody querySysMsgByKey(String msgKey) throws SQLException
    {
        // 定义返回推送消息
        RspSysMsgKeyBody rspBody = new RspSysMsgKeyBody();
        RspSysMsgInfo rspInfo = new RspSysMsgInfo();

        // 调DAO，查询推送信息
        rspInfo = sysMsgDAO.querySysMsgByKey(msgKey);

        // 判断查询结果是否为空
        if (StringTools.isNullOrEmpty(rspInfo))
        {
            rspBody.setRspSysMsgInfo(null);
            return rspBody;
        }

        // 时间转换
        if (!StringTools.isNullOrEmpty(rspInfo.getAddTime()))
        {
            rspInfo.setAddTimeStr(DateUtils.dateToStrNoS(rspInfo.getAddTime()));
        }

        // 设置返回信息
        rspBody.setRspSysMsgInfo(rspInfo);
        return rspBody;
    }

    public SysMsgDAO getSysMsgDAO()
    {
        return sysMsgDAO;
    }

    public void setSysMsgDAO(SysMsgDAO sysMsgDAO)
    {
        this.sysMsgDAO = sysMsgDAO;
    }

}
