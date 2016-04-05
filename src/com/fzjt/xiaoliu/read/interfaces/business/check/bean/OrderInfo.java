/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.rsp.OrderInfo
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
package com.fzjt.xiaoliu.read.interfaces.business.check.bean;

/**
 * 查询订单信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.bean.OrderInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-8 下午5:04:25
 * @author:TangKai
 */
public class OrderInfo
{
    /**
     * 商品key
     */
    private String goodsKey = "";

    /**
     * 商品名称
     */
    private String goodsName = "";

    /**
     * 购买数量
     */
    private String purchaseNum = "";

    /**
     * sku Key
     */
    private String skuKey = "";

    /**
     * userKey
     */
    private String userKey = "";

    public String getGoodsKey()
    {
        return goodsKey;
    }

    public void setGoodsKey(String goodsKey)
    {
        this.goodsKey = goodsKey;
    }

    public String getGoodsName()
    {
        return goodsName;
    }

    public void setGoodsName(String goodsName)
    {
        this.goodsName = goodsName;
    }

    public String getPurchaseNum()
    {
        return purchaseNum;
    }

    public void setPurchaseNum(String purchaseNum)
    {
        this.purchaseNum = purchaseNum;
    }

    public String getSkuKey()
    {
        return skuKey;
    }

    public void setSkuKey(String skuKey)
    {
        this.skuKey = skuKey;
    }

    public String getUserKey()
    {
        return userKey;
    }

    public void setUserKey(String userKey)
    {
        this.userKey = userKey;
    }
}
