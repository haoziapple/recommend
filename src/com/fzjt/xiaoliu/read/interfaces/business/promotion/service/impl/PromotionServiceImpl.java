/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.service.impl.PromotionServiceImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-9     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.promotion.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.detail.RspDetailBody;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.detail.RspDetailInfo;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.req.ReqPromotionBody;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.rsp.PromotionInfo;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.rsp.PromotionList;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.rsp.RspPromotionBody;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.rsp.PacketInfo;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.rsp.PacketInfoList;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.rsp.RspPromListBody;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.rsp.SkuInfo;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.dao.PromotionDAO;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.service.PromotionService;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao.ParameterDAO;
import com.fzjt.xiaoliu.read.interfaces.util.Constant;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.service.impl.PromotionServiceImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-9 上午10:40:03
 * @author:TangKai
 */
public class PromotionServiceImpl implements PromotionService
{
    /**
     * dao服务
     */
    private PromotionDAO promotionDAO;

    /**
     * 图片路径dao
     */
    private ParameterDAO parameterDAO;

    /**
     * {@inheritDoc}
     */
    @Override
    public RspPromotionBody queryPromotionList(ReqPromotionBody reqBody) throws SQLException
    {
        // 定义返回信息
        RspPromotionBody rspBody = new RspPromotionBody();
        PromotionList rspList = new PromotionList();

        // 调用服务，返回活动信息列表
        List<PromotionInfo> promotionList = promotionDAO.queryPromotionList(reqBody.getReqInfo());

        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);
        // 图片地址拼接
        if (!ListTools.isNullOrEmpty(promotionList))
        {
            for (PromotionInfo temp : promotionList)
            {
                if (StringTools.isNullOrEmpty(temp)||StringTools.isNullOrEmpty(temp.getPromotionPic()))
                {
                    continue;
                }
                temp.setPromotionPic(parameterValue + temp.getPromotionPic());
            }
        }

        // 设置返回信息
        rspList.setPromotionList(promotionList);
        rspBody.setRspList(rspList);

        return rspBody;
    }

    /**
     * {@inheritDoc}
     */
    public RspPromListBody queryPromGoodsInfo(String promotionKey) throws SQLException
    {
        // 定义返回信息
        RspPromListBody rspBody = new RspPromListBody();
        PacketInfoList rspList = new PacketInfoList();
        List<PacketInfo> packetList = new ArrayList<PacketInfo>();
        List<SkuInfo> goodsList = new ArrayList<SkuInfo>();

        // 获取当前活动活动组key
        List<PacketInfo> packetInfoList = promotionDAO.queryPacketKeyList(promotionKey);
        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        // 对每个活动组key，查询商品信息
        if (!ListTools.isNullOrEmpty(packetInfoList))
        {
            for (PacketInfo temp : packetInfoList)
            {
            	if(StringTools.isNullOrEmpty(temp)){
            		continue;
            	}
            	
                goodsList = promotionDAO.queryPacketGoodsInfo(temp.getPacketKey());
                // 商品图片地址拼接
                if (!ListTools.isNullOrEmpty(goodsList))
                {
                    for (SkuInfo goodstemp : goodsList)
                    {
                        if (StringTools.isNullOrEmpty(goodstemp)||StringTools.isNullOrEmpty(goodstemp.getPicUrl()))
                        {
                            continue;
                        }
                        goodstemp.setPicUrl(parameterValue + goodstemp.getPicUrl());
                    }
                }

                // 添加返回packeyList元素
                PacketInfo tempPacInfo = new PacketInfo();
                tempPacInfo.setGoodsList(goodsList);
                tempPacInfo.setPacketKey(temp.getPacketKey());
                tempPacInfo.setPacketName(temp.getPacketName());
                packetList.add(tempPacInfo);
            }
        }

        // 设置返回信息
        rspList.setPacketList(packetList);
        rspBody.setRspInfo(rspList);

        return rspBody;
    }

    /**
     * {@inheritDoc}
     */
    public RspDetailBody queryPromotionInfo(String promotionKey) throws SQLException
    {
        // 定义返回body
        RspDetailBody rspBody = new RspDetailBody();

        // 根据promotionkey查询活动详情
        RspDetailInfo rspInfo = promotionDAO.queryPromotionInfo(promotionKey);

        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        // 拼接文件路径
        if (!StringTools.isNullOrEmpty(rspInfo))
        {
            // 拼接活动图片路径
            if (!StringTools.isNullOrEmpty(rspInfo.getPromotionPic()))
            {
                rspInfo.setPromotionPic(parameterValue + rspInfo.getPromotionPic());
            }
            // 拼接分享图片路径
            if (!StringTools.isNullOrEmpty(rspInfo.getSharePic()))
            {
                rspInfo.setSharePic(parameterValue + rspInfo.getSharePic());
            }
        }

        // 返回信息
        rspBody.setReqInfo(rspInfo);
        return rspBody;
    }

    public PromotionDAO getPromotionDAO()
    {
        return promotionDAO;
    }

    public void setPromotionDAO(PromotionDAO promotionDAO)
    {
        this.promotionDAO = promotionDAO;
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
