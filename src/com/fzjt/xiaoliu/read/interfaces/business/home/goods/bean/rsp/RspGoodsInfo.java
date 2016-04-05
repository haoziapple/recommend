/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.rsp.RspGoodsInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-7     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.rsp;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 响应bean
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.rsp.RspGoodsInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-7 下午1:34:01
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspGoodsInfo
{
    @XmlTransient
    private int ID;

    /**
     * 商品KEY
     */
    @XmlElement(name = "goodskey")
    private String goodsKey;

    /**
     * 商品标题
     */
    @XmlElement(name = "goodstitle")
    private String goodsTitle;

    /**
     * 商品图片地址
     */
    @XmlElement(name = "goodspics")
    private String goodsPics;

    /**
     * 添加时间
     */
    @XmlElement(name = "addtime")
    private Date addTime;

    /**
     * 顺序,用于排序
     */
    @XmlElement(name = "indexnum")
    private int indexNum;

    /**
     * 查询条数
     */
    @XmlElement(name = "rn")
    private int rn;

    /**
     * 商品原价（市场价）
     */
    @XmlElement(name = "priceold")
    private String priceOld;

    /**
     * 商品现价
     */
    @XmlElement(name = "pricenow")
    private String priceNow;

    /**
     * 上下架
     */
    @XmlElement(name = "onsale")
    private String onSale;

    /**
     * @return the iD
     */
    public int getID()
    {
        return ID;
    }

    /**
     * @param iD
     *            the iD to set
     */
    public void setID(int iD)
    {
        ID = iD;
    }

    /**
     * @return the goodsKey
     */
    public String getGoodsKey()
    {
        return goodsKey;
    }

    /**
     * @param goodsKey
     *            the goodsKey to set
     */
    public void setGoodsKey(String goodsKey)
    {
        this.goodsKey = goodsKey;
    }

    /**
     * @return the goodsTitle
     */
    public String getGoodsTitle()
    {
        return goodsTitle;
    }

    /**
     * @param goodsTitle
     *            the goodsTitle to set
     */
    public void setGoodsTitle(String goodsTitle)
    {
        this.goodsTitle = goodsTitle;
    }

    /**
     * @return the goodsPics
     */
    public String getGoodsPics()
    {
        return goodsPics;
    }

    /**
     * @param goodsPics
     *            the goodsPics to set
     */
    public void setGoodsPics(String goodsPics)
    {
        this.goodsPics = goodsPics;
    }

    /**
     * @return the addTime
     */
    public Date getAddTime()
    {
        return addTime;
    }

    /**
     * @param addTime
     *            the addTime to set
     */
    public void setAddTime(Date addTime)
    {
        this.addTime = addTime;
    }

    /**
     * @return the indexNum
     */
    public int getIndexNum()
    {
        return indexNum;
    }

    /**
     * @param indexNum
     *            the indexNum to set
     */
    public void setIndexNum(int indexNum)
    {
        this.indexNum = indexNum;
    }

    /**
     * @return the rn
     */
    public int getRn()
    {
        return rn;
    }

    /**
     * @param rn
     *            the rn to set
     */
    public void setRn(int rn)
    {
        this.rn = rn;
    }

    /**
     * @return the priceOld
     */
    public String getPriceOld()
    {
        return priceOld;
    }

    /**
     * @param priceOld
     *            the priceOld to set
     */
    public void setPriceOld(String priceOld)
    {
        this.priceOld = priceOld;
    }

    /**
     * @return the priceNow
     */
    public String getPriceNow()
    {
        return priceNow;
    }

    /**
     * @param priceNow
     *            the priceNow to set
     */
    public void setPriceNow(String priceNow)
    {
        this.priceNow = priceNow;
    }

    public String getOnSale()
    {
        return onSale;
    }

    public void setOnSale(String onSale)
    {
        this.onSale = onSale;
    }

}
