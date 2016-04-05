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
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.bean.GoodsLimitInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-8 下午3:28:42
 * @author:TangKai
 */
public class GoodsLimitInfo
{
    /**
     * 商品key
     */
    private String goodsKey = "";

    /**
     * 购买的数量
     */
    private Integer buyCount = 0;

    /**
     * 用户key
     */
    private String userKey = "";

    /**
     * 限购时间（天为单位)
     */
    private String limitDate = "";

    /**
     * 限购数量
     */
    private Integer limitCount = 0;

    public String getLimitDate()
    {
        return limitDate;
    }

    public void setLimitDate(String limitDate)
    {
        this.limitDate = limitDate;
    }

    public Integer getLimitCount()
    {
        return limitCount;
    }

    public void setLimitCount(Integer limitCount)
    {
        this.limitCount = limitCount;
    }

    public String getGoodsKey()
    {
        return goodsKey;
    }

    public void setGoodsKey(String goodsKey)
    {
        this.goodsKey = goodsKey;
    }

    public Integer getBuyCount()
    {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount)
    {
        this.buyCount = buyCount;
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
