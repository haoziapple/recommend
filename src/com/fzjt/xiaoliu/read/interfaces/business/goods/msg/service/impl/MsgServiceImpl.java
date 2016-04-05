/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.service.impl.msgServiceImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-13     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.msg.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.list.req.ReqMsgBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.list.req.ReqMsgInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.list.rsp.RspMsgBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.list.rsp.RspMsgInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.list.rsp.RspMsgList;
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.req.ReqMsg4ShopBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.req.ReqMsg4ShopInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.rsp.RspMsgBody4Shop;
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.rsp.RspMsgInfo4Shop;
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.rsp.RspMsgList4Shop;
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.dao.MsgDAO;
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.service.MsgService;
import com.fzjt.xiaoliu.read.interfaces.business.usercenter.msg.bean.customer.req.ReqMsg4UserBody;
import com.fzjt.xiaoliu.read.interfaces.business.usercenter.msg.bean.customer.req.ReqMsg4UserInfo;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao.ParameterDAO;
import com.fzjt.xiaoliu.read.interfaces.util.Constant;
import com.fzjt.xiaoliu.read.interfaces.util.DateUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * MsgService实现类
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.service.impl.MsgServiceImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午6:27:19
 * @author:LiangJin
 */
public class MsgServiceImpl implements MsgService
{
    /**
     * 注入dao
     */
    private MsgDAO msgDAO;

    private ParameterDAO parameterDAO;

    /**
     * {@inheritDoc}
     */
    public RspMsgBody queryGoodsMsg(ReqMsgBody reqMsgBody) throws SQLException
    {
        // 设置分页信息
        ReqMsgInfo reqInfo = reqMsgBody.getReqMsgInfo();

        // 确保分页信息参数不为空
        if (StringTools.isNullOrEmpty(reqMsgBody.getPageBean())
                || StringTools.isNullOrEmpty(reqMsgBody.getPageBean().getFromNum())
                || StringTools.isNullOrEmpty(reqMsgBody.getPageBean().getToNum()))
        {
            reqInfo.setFromNum(Constant.DEFAULT_PAGE_FROM);
            reqInfo.setToNum(Constant.DEFAULT_PAGE_TO);
        }
        else
        {
            // 设置分页信息
            reqInfo.setFromNum(reqMsgBody.getPageBean().getFromNum());
            reqInfo.setToNum(reqMsgBody.getPageBean().getToNum());
        }

        // 定义返回信息
        RspMsgBody rspResult = new RspMsgBody();
        RspMsgList rspList = new RspMsgList();
        List<RspMsgInfo> list = null;
        String count = "";

        // 调DAO，查询留言
        list = msgDAO.queryGoodsMsg(reqInfo);

        // 查询留言总数
        count = msgDAO.queryMsgCountByKey(reqInfo);

        // 判断查询结果是否为空
        if (ListTools.isNullOrEmpty(list))
        {
            rspList.setRspMsgInfo(list);
            rspResult.setRspMsgList(rspList);
            rspResult.setCount("0");
            return rspResult;
        }

        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        // 拼装图片地址路径
        for (RspMsgInfo temp : list)
        {
        	if(StringTools.isNullOrEmpty(temp)){
        		continue;
        	}
        	
            // 头像url拼接
            if (!StringTools.isNullOrEmpty(temp.getHeadPic()))
            {
                temp.setHeadPic(parameterValue + temp.getHeadPic());
            }

            // 添加时间转换 【年月日时分】
            if (!StringTools.isNullOrEmpty(temp.getAddTime()))
            {
                temp.setAddTimeStr(DateUtils.dateToStrNoS(temp.getAddTime()));
            }

            // 回复时间 【年月日时分】
            if (!StringTools.isNullOrEmpty(temp.getReplyTime()))
            {
                temp.setReplyTimeStr(DateUtils.dateToStrNoS(temp.getReplyTime()));
            }
        }

        rspList.setRspMsgInfo(list);
        rspResult.setRspMsgList(rspList);
        rspResult.setCount(count);
        return rspResult;
    }

    /**
     * {@inheritDoc}
     */
    public RspMsgBody4Shop queryGoodsMsg4Shop(ReqMsg4ShopBody reqBody) throws SQLException
    {

        // 设置分页信息
        ReqMsg4ShopInfo reqInfo = reqBody.getReqInfo();

        // 确保分页信息参数不为空
        if (StringTools.isNullOrEmpty(reqBody.getPageBean())
                || StringTools.isNullOrEmpty(reqBody.getPageBean().getFromNum())
                || StringTools.isNullOrEmpty(reqBody.getPageBean().getToNum()))
        {
            reqInfo.setFromNum(Constant.DEFAULT_PAGE_FROM);
            reqInfo.setToNum(Constant.DEFAULT_PAGE_TO);
        }
        else
        {
            // 设置分页信息
            reqInfo.setFromNum(reqBody.getPageBean().getFromNum());
            reqInfo.setToNum(reqBody.getPageBean().getToNum());
        }

        String flag = reqBody.getReqInfo().getReplyType();

        // 判断查询回复类型
        // 0全部，1已回复，2未回复
        if ("1".equals(flag))
        {
            reqInfo.setReplyType("0");
        }
        else if ("2".equals(flag))
        {
            reqInfo.setReplyType("1");
        }
        else
        {
            reqInfo.setReplyType("");
        }

        // 定义返回信息
        RspMsgBody4Shop rspResult = new RspMsgBody4Shop();
        RspMsgList4Shop rspList = new RspMsgList4Shop();
        List<RspMsgInfo4Shop> list = null;
        String count = "";

        // 调DAO，查询留言
        list = msgDAO.queryGoodsMsg4Shop(reqInfo);

        // 查询留言总数
        count = msgDAO.queryMsgCountByShop(reqInfo);

        // 判断查询结果是否为空
        if (ListTools.isNullOrEmpty(list))
        {
            rspList.setRspInfoList(list);
            rspResult.setRspList(rspList);
            rspResult.setCount("0");
            return rspResult;
        }
        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        // 拼装图片地址路径
        for (RspMsgInfo4Shop temp : list)
        {
        	if(StringTools.isNullOrEmpty(temp)){
        		continue;
        	}
        	
            // 头像url拼接
            if (!StringTools.isNullOrEmpty(temp.getHeadPic()))
            {
                temp.setHeadPic(parameterValue + temp.getHeadPic());
            }

            // 商品列表url拼接
            if (!StringTools.isNullOrEmpty(temp.getGoodsPic()))
            {
                temp.setGoodsPic(parameterValue + temp.getGoodsPic());
            }

            // 添加时间转换 【年月日时分】
            if (!StringTools.isNullOrEmpty(temp.getAddTime()))
            {
                temp.setAddTimeStr(DateUtils.dateToStrNoS(temp.getAddTime()));
            }

            // 回复时间 【年月日时分】
            if (!StringTools.isNullOrEmpty(temp.getReplyTime()))
            {
                temp.setReplyTimeStr(DateUtils.dateToStrNoS(temp.getReplyTime()));
            }
        }

        rspList.setRspInfoList(list);
        rspResult.setRspList(rspList);
        rspResult.setCount(count);
        return rspResult;
    }

    /**
     * {@inheritDoc}
     */
    public RspMsgBody4Shop queryGoodsMsg4User(ReqMsg4UserBody reqBody) throws SQLException
    {

        // 设置分页信息
        ReqMsg4UserInfo reqInfo = reqBody.getReqInfo();

        // 确保分页信息参数不为空
        if (StringTools.isNullOrEmpty(reqBody.getPageBean())
                || StringTools.isNullOrEmpty(reqBody.getPageBean().getFromNum())
                || StringTools.isNullOrEmpty(reqBody.getPageBean().getToNum()))
        {
            reqInfo.setFromNum(Constant.DEFAULT_PAGE_FROM);
            reqInfo.setToNum(Constant.DEFAULT_PAGE_TO);
        }
        else
        {
            // 设置分页信息
            reqInfo.setFromNum(reqBody.getPageBean().getFromNum());
            reqInfo.setToNum(reqBody.getPageBean().getToNum());
        }

        String flag = reqBody.getReqInfo().getReplyStatus();

        // 判断查询回复类型
        // 0全部，1已回复，2未回复
        if ("1".equals(flag))
        {
            reqInfo.setReplyStatus("0");
        }
        else if ("2".equals(flag))
        {
            reqInfo.setReplyStatus("1");
        }
        else
        {
            reqInfo.setReplyStatus("");
        }

        // 定义返回信息
        RspMsgBody4Shop rspResult = new RspMsgBody4Shop();
        RspMsgList4Shop rspList = new RspMsgList4Shop();
        List<RspMsgInfo4Shop> list = null;
        String count = "";

        // 调DAO，查询留言
        list = msgDAO.queryGoodsMsg4User(reqInfo);

        // 查询留言总数
        count = msgDAO.queryMsgCountByUser(reqInfo);

        // 判断查询结果是否为空
        if (ListTools.isNullOrEmpty(list))
        {
            rspList.setRspInfoList(list);
            rspResult.setRspList(rspList);
            rspResult.setCount("0");
            return rspResult;
        }
        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        // 拼装图片地址路径
        for (RspMsgInfo4Shop temp : list)
        {
        	if(StringTools.isNullOrEmpty(temp)){
        		continue;
        	}
        	
            // 头像url拼接
            if (!StringTools.isNullOrEmpty(temp.getHeadPic()))
            {
                temp.setHeadPic(parameterValue + temp.getHeadPic());
            }

            // 商品列表url拼接
            if (!StringTools.isNullOrEmpty(temp.getGoodsPic()))
            {
                temp.setGoodsPic(parameterValue + temp.getGoodsPic());
            }

            // 添加时间转换 【年月日时分】
            if (!StringTools.isNullOrEmpty(temp.getAddTime()))
            {
                temp.setAddTimeStr(DateUtils.dateToStrNoS(temp.getAddTime()));
            }

            // 回复时间 【年月日时分】
            if (!StringTools.isNullOrEmpty(temp.getReplyTime()))
            {
                temp.setReplyTimeStr(DateUtils.dateToStrNoS(temp.getReplyTime()));
            }
        }

        rspList.setRspInfoList(list);
        rspResult.setRspList(rspList);
        rspResult.setCount(count);
        return rspResult;
    }

    public MsgDAO getMsgDAO()
    {
        return msgDAO;
    }

    public void setMsgDAO(MsgDAO msgDAO)
    {
        this.msgDAO = msgDAO;
    }

    public ParameterDAO getParameterDAO()
    {
        return parameterDAO;
    }

    public void setParameterDAO(ParameterDAO parameterDAO)
    {
        this.parameterDAO = parameterDAO;
    }

}
