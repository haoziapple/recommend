/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.service.impl.CheckServiceImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-8     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.check.service.impl;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.fzjt.xiaoliu.read.interfaces.business.check.bean.GoodsDistInfo;
import com.fzjt.xiaoliu.read.interfaces.business.check.bean.GoodsLimitInfo;
import com.fzjt.xiaoliu.read.interfaces.business.check.bean.RspCheckInfo;
import com.fzjt.xiaoliu.read.interfaces.business.check.bean.goods.req.ReqCheckGoodsInfo;
import com.fzjt.xiaoliu.read.interfaces.business.check.dao.CheckDAO;
import com.fzjt.xiaoliu.read.interfaces.business.check.service.CheckService;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.service.impl.CheckServiceImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-8 下午3:04:11
 * @author:TangKai
 */
public class CheckServiceImpl implements CheckService
{
    private CheckDAO checkDAO;

    /**
     * 分割请求参数（用“，”分割的请求参数），获取请求商品信息
     * 
     * @Description:
     * @param reqInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-25 上午10:10:57
     */
    private List<ReqCheckGoodsInfo> queryGoodsInfoList(ReqCheckGoodsInfo reqInfo) throws SQLException
    {
        List<ReqCheckGoodsInfo> reqList = new ArrayList<ReqCheckGoodsInfo>();

        if (!StringTools.isNullOrEmpty(reqInfo))
        {
            // 逗号分隔的商品信息，把它分离出来,循环去取商品信息
            String[] goodsKeyList = reqInfo.getGoodsKey().split(",");
            String[] skuKeyList = reqInfo.getSkuKey().split(",");
            String[] numList = reqInfo.getNum().split(",");
            String userKey = reqInfo.getUserKey();
            String style = reqInfo.getStyle();

            if (goodsKeyList.length == skuKeyList.length && goodsKeyList.length == numList.length)
            {
                for (int i = 0; i < goodsKeyList.length; i++)
                {
                    ReqCheckGoodsInfo goodsInfo = new ReqCheckGoodsInfo();

                    // 设置商品信息
                    goodsInfo.setUserKey(userKey);
                    goodsInfo.setGoodsKey(goodsKeyList[i]);
                    goodsInfo.setSkuKey(skuKeyList[i]);
                    goodsInfo.setNum(numList[i]);
                    goodsInfo.setStyle(style);

                    // 添加商品信息
                    reqList.add(goodsInfo);
                    goodsInfo = null;
                }
            }
        }

        return reqList;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RspCheckInfo checkGoodsInfo(ReqCheckGoodsInfo reqGoodsInfo) throws SQLException
    {
        RspCheckInfo checkInfo = null;

        List<ReqCheckGoodsInfo> reqList = queryGoodsInfoList(reqGoodsInfo);

        checkInfo = checkLimitCount(reqList);

        if (!StringTools.isNullOrEmpty(checkInfo))
        {
            return checkInfo;
        }

        boolean checkResult = true; // 默认校验通过
        String result = ""; // 错误码
        String checkDesc = "";// 错误描述

        if (!ListTools.isNullOrEmpty(reqList))
        {
            // 循环商品信息
            for (ReqCheckGoodsInfo reqInfo : reqList)
            {
                result = "";
                checkResult = true;
                checkDesc = "";

                // 校验，调用之前的DAO层，需要转成之前的Bean层,并赋值
                GoodsDistInfo distInfo = new GoodsDistInfo();
                distInfo.setGoodsKey(reqInfo.getGoodsKey());
                distInfo.setNum(reqInfo.getNum());
                distInfo.setSkuKey(reqInfo.getSkuKey());

                // 调用之前的DAO层
                // 查询库存量
                String trueResult = checkDAO.queryGoodsTrueNum(distInfo);
                // 购买数量
                int saleNum = Integer.parseInt(distInfo.getNum());
                // 商品是否有效
                String status = checkDAO.queryGoodsStatus(distInfo);
                // 商品是否下架
                String onSale = checkDAO.queryGoodsOnSale(distInfo);

                // 校验商品状态
                if (StringTools.isNullOrEmpty(status) || "1".equals(status))
                {
                    result = ErrorCodes.GOODS_STATUS_ERROR;
                    checkDesc = ErrorDescs.GOODS_STATUS_ERROR;
                    checkResult = false;
                }

                // 校验是否上架
                if (StringTools.isNullOrEmpty(onSale) || !"0".equals(onSale))
                {
                    result = ErrorCodes.GOODS_UPSALE_ERROR;
                    checkDesc = ErrorDescs.GOODS_UPSALE_ERROR;
                    checkResult = false;
                }

                // 校验库存
                if (StringTools.isNullOrEmpty(trueResult))
                {
                    result = ErrorCodes.GOODS_STOCK_ERROR;
                    checkDesc = ErrorDescs.GOODS_STOCK_ERROR;
                    checkResult = false;
                }
                else
                {
                    // 库存量
                    BigDecimal num = new BigDecimal(trueResult);

                    // 校验
                    if (num.compareTo(new BigDecimal(saleNum)) < 0)
                    {
                        result = ErrorCodes.GOODS_STOCK_ERROR;
                        checkDesc = ErrorDescs.GOODS_STOCK_ERROR;
                        checkResult = false;
                    }
                }

                String goodsName = checkDAO.queryGoodsName(reqInfo.getGoodsKey());
                // 插入错误码
                if (!checkResult)
                {
                    checkInfo = new RspCheckInfo();
                    checkInfo.setCheckInfo(result);// 插入错误码
                    checkInfo.setCheckDesc(checkDesc);// 插入错误描述
                    checkInfo.setGoodsName(goodsName);
                    return checkInfo;
                }
            }
        }

        return checkInfo;
    }

    /**
     * 校验限购
     * 
     * @Description:
     * @param reqList
     * @return
     * @version:v1.0
     * @author:TangKai
     * @throws SQLException
     * @date:2015-12-28 上午10:52:58
     */
    private RspCheckInfo checkLimitCount(List<ReqCheckGoodsInfo> reqList) throws SQLException
    {
        RspCheckInfo rspInfo = null;

        boolean checkResult = true; // 默认校验通过
        String result = ""; // 错误码
        String checkDesc = "";// 错误描述

        String userKey = "";
        String style = "";
        // 获取userkey
        if (!ListTools.isNullOrEmpty(reqList))
        {
            userKey = reqList.get(0).getUserKey();
            style = reqList.get(0).getStyle();
        }

        // 获取校验每个商品对应的购买数量
        HashMap<String, String> goodsMap = new HashMap<String, String>();
        if (!ListTools.isNullOrEmpty(reqList))
        {
            for (ReqCheckGoodsInfo temp : reqList)
            {
                if (!StringTools.isNullOrEmpty(temp))
                {
                    if (goodsMap.containsKey(temp.getGoodsKey()))
                    {
                        Integer sum = Integer.valueOf(temp.getNum())
                                + Integer.valueOf(goodsMap.get(temp.getGoodsKey()));
                        goodsMap.remove(temp.getGoodsKey());
                        goodsMap.put(temp.getGoodsKey(), sum.toString());
                    }
                    else
                    {
                        goodsMap.put(temp.getGoodsKey(), temp.getNum());
                    }
                }
            }
        }

        Iterator<Entry<String, String>> iter = goodsMap.entrySet().iterator();

        // 对每个商品校验
        while (iter.hasNext())
        {
            @SuppressWarnings("rawtypes")
            Map.Entry entry = (Entry) iter.next();
            String goodsKey = (String) entry.getKey();
            String num = (String) entry.getValue();

            GoodsLimitInfo reqLimitInfo = new GoodsLimitInfo();
            reqLimitInfo.setBuyCount(Integer.parseInt(num));// 赋值购买数量
            reqLimitInfo.setGoodsKey(goodsKey);// 赋值商品key
            reqLimitInfo.setUserKey(userKey);// 赋值UserKey

            // 查询该商品 用户X日限购信息
            GoodsLimitInfo limitInfo = checkDAO.queryGoodsLimitInfo(reqLimitInfo);

            ReqCheckGoodsInfo reqInfo = new ReqCheckGoodsInfo();
            reqInfo.setGoodsKey(goodsKey);
            reqInfo.setUserKey(userKey);
            // 购物车中该商品已有数量
            int cartNum = checkDAO.queryCartGoodsNum(reqInfo);

            int calNum = 0;
            // 当用户直接购买，或者添加购物车时，限购判断时需要计算购物车内已有该商品数量
            // 当用户直接购买，或者添加购物车时
            if ("1".equals(style))
            {
                calNum = cartNum;
            }
            else
            {
                calNum = 0;
            }

            if (!StringTools.isNullOrEmpty(limitInfo) && limitInfo.getLimitDate() != null)
            {
                // 日期
                reqLimitInfo.setLimitDate(limitInfo.getLimitDate());
                // 因为是去支付那边，已经有了订单了，直接去订单里统计就好
                int buyCount = checkDAO.queryBuyGoodsCount(reqLimitInfo);

                // X天内限购数 - X天内购买数 - 现在购买数
                if ((limitInfo.getLimitCount() - buyCount - calNum - reqLimitInfo.getBuyCount()) < 0)
                {
                    result = ErrorCodes.GOODS_DATE_LIMIT_ERROR;
                    checkDesc = ErrorDescs.GOODS_DATE_LIMIT_ERROR;
                    checkResult = false;
                }
            }

            String goodsName = checkDAO.queryGoodsName(goodsKey);
            // 插入错误码
            if (!checkResult)
            {
                rspInfo = new RspCheckInfo();
                rspInfo.setCheckInfo(result);// 插入错误码
                rspInfo.setCheckDesc(checkDesc);// 插入错误描述
                rspInfo.setGoodsName(goodsName);
                return rspInfo;
            }
        }

        return rspInfo;
    }

    public CheckDAO getCheckDAO()
    {
        return checkDAO;
    }

    public void setCheckDAO(CheckDAO checkDAO)
    {
        this.checkDAO = checkDAO;
    }

}
