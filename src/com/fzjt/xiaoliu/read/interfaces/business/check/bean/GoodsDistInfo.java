/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.bean.GoodsLimitInfo
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
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.bean.GoodsDistInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-8 下午4:13:08
 * @author:TangKai
 */
public class GoodsDistInfo
{
    /**
     * 商品key
     */
    private String goodsKey = "";

    /**
     * skuKey
     */
    private String skuKey = "";

    /**
     * 购买数量
     */
    private String num = "";

    /**
     * 商品名
     */
    private String goodsName = "";

    public String getGoodsKey()
    {
        return goodsKey;
    }

    public void setGoodsKey(String goodsKey)
    {
        this.goodsKey = goodsKey;
    }

    public String getSkuKey()
    {
        return skuKey;
    }

    public void setSkuKey(String skuKey)
    {
        this.skuKey = skuKey;
    }

    public String getNum()
    {
        return num;
    }

    public void setNum(String num)
    {
        this.num = num;
    }

    public String getGoodsName()
    {
        return goodsName;
    }

    public void setGoodsName(String goodsName)
    {
        this.goodsName = goodsName;
    }

}
