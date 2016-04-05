/**
 * Copyright (C) 2016 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.service.impl.FlashSaleServiceImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2016-1-6     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.flashsale.service.impl;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.req.ReqFlashSaleBody;
import com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.rsp.RspFlashSaleBody;
import com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.rsp.RspFlashSaleInfo;
import com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.rsp.RspFlashSaleList;
import com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.list.req.ReqFSGoodsBody;
import com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.list.req.ReqFSGoodsInfo;
import com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.list.rsp.RspFSGoodsBody;
import com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.list.rsp.RspFSGoodsInfo;
import com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.list.rsp.RspFSGoodsList;
import com.fzjt.xiaoliu.read.interfaces.business.flashsale.dao.FlashSaleDAO;
import com.fzjt.xiaoliu.read.interfaces.business.flashsale.service.FlashSaleService;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao.ParameterDAO;
import com.fzjt.xiaoliu.read.interfaces.util.Constant;
import com.fzjt.xiaoliu.read.interfaces.util.DateUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.service.impl.FlashSaleServiceImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2016-1-6 下午8:21:46
 * @author:TangKai
 */
public class FlashSaleServiceImpl implements FlashSaleService
{
    private ParameterDAO parameterDAO;

    private FlashSaleDAO flashSaleDAO;

    /**
     * {@inheritDoc}
     */
    @Override
    public RspFlashSaleBody queryFlashSaleList(ReqFlashSaleBody reqBody) throws SQLException
    {
        RspFlashSaleBody rspBody = new RspFlashSaleBody();
        RspFlashSaleList rspList = new RspFlashSaleList();

        // 获取活动信息
        List<RspFlashSaleInfo> infoList = flashSaleDAO.queryFlashSaleList(reqBody.getReqInfo());

        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        boolean defaultShowSetted = false;
        if (!ListTools.isNullOrEmpty(infoList))
        {
            for (RspFlashSaleInfo temp : infoList)
            {
                // 活动图片地址拼接
                if (!StringTools.isNullOrEmpty(temp) && !StringTools.isNullOrEmpty(temp.getSalesPic()))
                {
                    temp.setSalesPic(parameterValue + temp.getSalesPic());
                }

                // 开始日期转换
                if (!StringTools.isNullOrEmpty(temp) && !StringTools.isNullOrEmpty(temp.getBeginTime()))
                {
                    temp.setBeginTimeDate(DateUtils.dateToStrLong(temp.getBeginTime()));
                }

                // 结束日期转换
                if (!StringTools.isNullOrEmpty(temp) && !StringTools.isNullOrEmpty(temp.getEndTime()))
                {
                    temp.setEndTimeDate(DateUtils.dateToStrLong(temp.getEndTime()));
                }

                // 设定活动状态：1-即将开始，2-已经结束，3-正在进行
                if (!StringTools.isNullOrEmpty(temp) && !StringTools.isNullOrEmpty(temp.getBeginTime())
                        && !StringTools.isNullOrEmpty(temp.getEndTime()))
                {
                    temp.setSaleStatus(CheckFlashStatus(temp));
                }

                // 设定是否默认展示：0-默认展示，1-默认不展示
                if (!StringTools.isNullOrEmpty(temp) && !StringTools.isNullOrEmpty(temp.getSaleStatus()))
                {
                    // 默认展示已被设定，设定不默认展示
                    if (defaultShowSetted)
                    {
                        temp.setDefaultShow("1");
                    }
                    // 活动正在进行,则设定展示
                    else if (temp.getSaleStatus().equals("3"))
                    {
                        temp.setDefaultShow("0");
                        defaultShowSetted = true;
                    }
                    // 活动已经结束
                    else if (temp.getSaleStatus().equals("2"))
                    {
                        // 结束的为最后一个活动
                        if (temp.equals(infoList.get(infoList.size() - 1)))
                        {
                            temp.setDefaultShow("0");
                            defaultShowSetted = true;
                        }
                        else
                        {
                            temp.setDefaultShow("1");
                        }
                    }
                    // 活动即将开始
                    else if (temp.getSaleStatus().equals("1"))
                    {
                        temp.setDefaultShow("0");
                        defaultShowSetted = true;
                    }
                }
            }
        }

        rspList.setInfoList(infoList);
        rspBody.setRspList(rspList);
        return rspBody;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RspFSGoodsBody queryFSGoodsList(ReqFSGoodsBody reqBody) throws SQLException
    {
        ReqFSGoodsInfo reqInfo = reqBody.getReqInfo();
        RspFSGoodsBody rspBody = new RspFSGoodsBody();
        RspFSGoodsList rspList = new RspFSGoodsList();

        List<RspFSGoodsInfo> goodsList = null;
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

        // 查询商品列表
        goodsList = flashSaleDAO.queryFSGoodsList(reqInfo);

        // 查询到的商品个数
        String count = flashSaleDAO.queryFSGoodsListCount(reqInfo.getSalesKey());

        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        if (!ListTools.isNullOrEmpty(goodsList))
        {
            for (RspFSGoodsInfo temp : goodsList)
            {
                // 图片地址拼接
                if (!StringTools.isNullOrEmpty(temp) && !StringTools.isNullOrEmpty(temp.getSkuPic()))
                {
                    temp.setSkuPic(parameterValue + temp.getSkuPic());
                }
                // 查询活动商品剩余量
                if (!StringTools.isNullOrEmpty(temp) && !StringTools.isNullOrEmpty(temp.getSkuCount()))
                {
                    String left = flashSaleDAO.queryFSGoodsLeft(temp);
                    temp.setSkuLeft(left);
                }
            }
        }

        rspList.setGoodsList(goodsList);
        rspBody.setRspList(rspList);
        rspBody.setCount(count);
        return rspBody;
    }

    /**
     * 
     * @Description:检验并取得活动状态:1-即将开始，2-已经结束，3-正在进行
     * @param temp
     * @return
     * @version:v1.0
     * @author:WangHao
     * @date:2016-2-17 上午9:55:19
     */
    private String CheckFlashStatus(RspFlashSaleInfo temp)
    {
        Date begin = temp.getBeginTime();
        Date end = temp.getEndTime();
        Date now = temp.getSysTime();
        if (now.before(begin))
        {
            return "1";
        }
        else if (now.after(end))
        {
            return "2";
        }
        else
        {
            return "3";
        }
    }

    public ParameterDAO getParameterDAO()
    {
        return parameterDAO;
    }

    public void setParameterDAO(ParameterDAO parameterDAO)
    {
        this.parameterDAO = parameterDAO;
    }

    public FlashSaleDAO getFlashSaleDAO()
    {
        return flashSaleDAO;
    }

    public void setFlashSaleDAO(FlashSaleDAO flashSaleDAO)
    {
        this.flashSaleDAO = flashSaleDAO;
    }

}
