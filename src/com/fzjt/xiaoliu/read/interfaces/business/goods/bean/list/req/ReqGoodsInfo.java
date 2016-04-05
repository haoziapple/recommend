/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.list.req.ReqGoodsInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiChangjiang
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-10-30     LiChangjiang       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.bean.list.req;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.list.req.ReqGoodsInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-10-31 下午3:07:51
 * @author:LiChangjiang
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqGoodsInfo
{
    /**
     * 排序方式（0:从低到高，1：从高到低）
     */
    @XmlElement(name = "sort")
    private String sort = "";

    /**
     * 排序类别（0：按价格排序，1：按销量排序）
     */
    @XmlElement(name = "sortstyle")
    private String sortStyle = "";

    /**
     * 商家key
     */
    @XmlElement(name = "shopkey")
    private String shopKey = "";

    /**
     * 商品名称
     */
    @XmlElement(name = "goodsname")
    private String goodsName = "";

    /**
     * 商品编码
     */
    @XmlElement(name = "goodscode")
    private String goodsCode = "";

    /**
     * 类别key
     */
    @XmlElement(name = "typekey")
    private String typeKey = "";

    /**
     * 起始价格
     */
    @XmlElement(name = "fromprice")
    private String fromPrice = "";

    /**
     * 截止价格
     */
    @XmlElement(name = "toprice")
    private String toPrice = "";

    /**
     * 起始发布时间
     */
    @XmlElement(name = "fromtimestr")
    private String fromTimeStr = "";

    private Date fromTime;

    /**
     * 截止发布时间
     */
    @XmlElement(name = "totimestr")
    private String toTimeStr = "";

    private Date toTime;

    /**
     * 配送方式
     */
    @XmlElement(name = "peisongtype")
    private String peisongType = "";

    private String fromNum = "";

    private String toNum = "";

    private String indexNum = "";

    /**
     * 上下架
     */
    @XmlElement(name = "onsale")
    private String onSale = "";

    /**
     * 上下架排序时间
     */
    private String onSaleSort = "";

    public String getSort()
    {
        return sort;
    }

    public void setSort(String sort)
    {
        this.sort = sort;
    }

    public String getSortStyle()
    {
        return sortStyle;
    }

    public void setSortStyle(String sortStyle)
    {
        this.sortStyle = sortStyle;
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

    public String getGoodsCode()
    {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode)
    {
        this.goodsCode = goodsCode;
    }

    public String getTypeKey()
    {
        return typeKey;
    }

    public void setTypeKey(String typeKey)
    {
        this.typeKey = typeKey;
    }

    public String getFromPrice()
    {
        return fromPrice;
    }

    public void setFromPrice(String fromPrice)
    {
        this.fromPrice = fromPrice;
    }

    public String getToPrice()
    {
        return toPrice;
    }

    public void setToPrice(String toPrice)
    {
        this.toPrice = toPrice;
    }

    public String getFromTimeStr()
    {
        return fromTimeStr;
    }

    public void setFromTimeStr(String fromTimeStr)
    {
        this.fromTimeStr = fromTimeStr;
    }

    public Date getFromTime()
    {
        return fromTime;
    }

    public void setFromTime(Date fromTime)
    {
        this.fromTime = fromTime;
    }

    public String getToTimeStr()
    {
        return toTimeStr;
    }

    public void setToTimeStr(String toTimeStr)
    {
        this.toTimeStr = toTimeStr;
    }

    public Date getToTime()
    {
        return toTime;
    }

    public void setToTime(Date toTime)
    {
        this.toTime = toTime;
    }

    public String getPeisongType()
    {
        return peisongType;
    }

    public void setPeisongType(String peisongType)
    {
        this.peisongType = peisongType;
    }

    public String getFromNum()
    {
        return fromNum;
    }

    public void setFromNum(String fromNum)
    {
        this.fromNum = fromNum;
    }

    public String getToNum()
    {
        return toNum;
    }

    public void setToNum(String toNum)
    {
        this.toNum = toNum;
    }

    public String getIndexNum()
    {
        return indexNum;
    }

    public void setIndexNum(String indexNum)
    {
        this.indexNum = indexNum;
    }

    public String getOnSale()
    {
        return onSale;
    }

    public void setOnSale(String onSale)
    {
        this.onSale = onSale;
    }

    public String getOnSaleSort()
    {
        return onSaleSort;
    }

    public void setOnSaleSort(String onSaleSort)
    {
        this.onSaleSort = onSaleSort;
    }

}
