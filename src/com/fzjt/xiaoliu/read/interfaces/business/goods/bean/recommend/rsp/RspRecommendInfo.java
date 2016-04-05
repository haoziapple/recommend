/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.rsp.RspRecommendInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-19     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 推荐商品返回信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.rsp.RspRecommendInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-19 上午10:46:44
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspRecommendInfo
{
    /**
     * 商品KEY
     */
    @XmlElement(name = "goodskey")
    private String goodsKey;

    /**
     * 商家Key
     */
    @XmlElement(name = "shopkey")
    private String shopKey;

    /**
     * 商品名称
     */
    @XmlElement(name = "goodsname")
    private String goodsName;

    /**
     * 商品类别
     */
    @XmlElement(name = "goodstype")
    private String goodsType;

    /**
     * 原价
     */
    @XmlElement(name = "priceold")
    private String priceOld;

    /**
     * 商品现价
     */
    @XmlElement(name = "pricenow")
    private String priceNow;

    /**
     * 商品规格描述
     */
    @XmlElement(name = "goodssize")
    private String goodsSize;

    /**
     * 配送信息描述
     */
    @XmlElement(name = "peisong")
    private String peiSong;

    /**
     * 服务信息
     */
    @XmlElement(name = "serveinfo")
    private String serveInfo;

    /**
     * 商品图片
     */
    @XmlElement(name = "goodspics")
    private String goodsPics;

    /**
     * 商品种类
     */
    @XmlElement(name = "goodskind")
    private String goodsKind;

    /**
     * 描述
     */
    @XmlElement(name = "goodsdetail")
    private String goodsDetail;

    /**
     * 促销标题
     */
    @XmlElement(name = "saletitle")
    private String saleTitle;

    /**
     * 销量
     */
    @XmlElement(name = "salenum")
    private String saleNum;

    public String getGoodsKey()
    {
        return goodsKey;
    }

    public void setGoodsKey(String goodsKey)
    {
        this.goodsKey = goodsKey;
    }

    public String getShopKey()
    {
        return shopKey;
    }

    public void setShopKey(String shopKey)
    {
        this.shopKey = shopKey;
    }

    public String getGoodsName()
    {
        return goodsName;
    }

    public void setGoodsName(String goodsName)
    {
        this.goodsName = goodsName;
    }

    public String getGoodsType()
    {
        return goodsType;
    }

    public void setGoodsType(String goodsType)
    {
        this.goodsType = goodsType;
    }

    public String getPriceOld()
    {
        return priceOld;
    }

    public void setPriceOld(String priceOld)
    {
        this.priceOld = priceOld;
    }

    public String getPriceNow()
    {
        return priceNow;
    }

    public void setPriceNow(String priceNow)
    {
        this.priceNow = priceNow;
    }

    public String getGoodsSize()
    {
        return goodsSize;
    }

    public void setGoodsSize(String goodsSize)
    {
        this.goodsSize = goodsSize;
    }

    public String getPeiSong()
    {
        return peiSong;
    }

    public void setPeiSong(String peiSong)
    {
        this.peiSong = peiSong;
    }

    public String getServeInfo()
    {
        return serveInfo;
    }

    public void setServeInfo(String serveInfo)
    {
        this.serveInfo = serveInfo;
    }

    public String getGoodsPics()
    {
        return goodsPics;
    }

    public void setGoodsPics(String goodsPics)
    {
        this.goodsPics = goodsPics;
    }

    public String getGoodsKind()
    {
        return goodsKind;
    }

    public void setGoodsKind(String goodsKind)
    {
        this.goodsKind = goodsKind;
    }

    public String getGoodsDetail()
    {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail)
    {
        this.goodsDetail = goodsDetail;
    }

    public String getSaleTitle()
    {
        return saleTitle;
    }

    public void setSaleTitle(String saleTitle)
    {
        this.saleTitle = saleTitle;
    }

    public String getSaleNum()
    {
        return saleNum;
    }

    public void setSaleNum(String saleNum)
    {
        this.saleNum = saleNum;
    }
}
