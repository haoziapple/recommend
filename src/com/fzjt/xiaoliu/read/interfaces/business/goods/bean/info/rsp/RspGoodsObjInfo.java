/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.rsp.RspGoodsInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-3     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.rsp;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 商品信息bean
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.rsp.RspGoodsObjInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-3 下午3:23:56
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspGoodsObjInfo
{
    @XmlTransient
    private String ID = "";

    /**
     * 商品key
     */
    @XmlElement(name = "goodskey")
    private String goodsKey;

    /**
     * 商家KEY
     */
    @XmlElement(name = "shopkey")
    private String shopKey;

    /**
     * 商品名称
     */
    @XmlElement(name = "goodsname")
    private String goodsName;

    /**
     * 商品规格描述
     */
    @XmlElement(name = "goodssize")
    private String goodsSize;

    /**
     * 商品类别key
     */
    @XmlElement(name = "goodstype")
    private String goodsType;

    /**
     * 配送信息
     */
    @XmlElement(name = "peisong")
    private String peisong;

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
     * 商品种类（0自营，1非自营）
     */
    @XmlElement(name = "goodskind")
    private String goodsKind;

    /**
     * 添加时间
     */
    @XmlTransient
    private Date addTime;

    /**
     * 添加时间
     */
    @XmlElement(name = "addtime")
    private String addTimeStr;

    /**
     * 更新时间
     */
    @XmlTransient
    private Date uppTime;

    /**
     * 更新时间
     */
    @XmlElement(name = "upptime")
    private String uppTimeStr;
    /**
     * 商品描述
     */
    @XmlElement(name = "goodsdetail")
    private String goodsDetail;

    /**
     * 状态（0有效，1无效，2是删除）
     */
    @XmlElement(name = "status")
    private String status;

    /**
     * 省
     */
    @XmlElement(name = "province")
    private String province;

    /**
     * 市
     */
    @XmlElement(name = "city")
    private String city;

    /**
     * 区
     */
    @XmlElement(name = "area")
    private String area;

    /**
     * 搜索条件组合
     */
    @XmlElement(name = "queryopts")
    private String queryOpts;

    /**
     * 促销标题
     */
    @XmlElement(name = "saletitle")
    private String saleTitle;

    /**
     * 商品数量
     */
    @XmlElement(name = "goodscount")
    private String goodsCount;

    /**
     * 商品编码
     */
    @XmlElement(name = "goodscode")
    private String goodsCode;

    /**
     * 销售状态（0 上架，1下架，2待上架）
     */
    @XmlElement(name = "onsale")
    private String onSale;

    /**
     * 下架时间
     */
    @XmlElement(name = "offtime")
    private String offTimeStr;
    /**
     * 下架时间
     */
    @XmlTransient
    private Date offTime;

    /**
     * 上架时间
     * 
     */
    @XmlElement(name = "ontime")
    private String onTimeStr;

    /**
     * 上架时间
     * 
     */
    @XmlTransient
    private Date onTime;

    /**
     * 优惠信息
     */
    @XmlElement(name = "privilegeinfo")
    private String privilegeInfo;

    /**
     * 限购数量（-1表示不作限制，可以任意购买）
     */
    @XmlElement(name = "limitcount")
    private String limitCount;

    /**
     * 商品默认sku
     */
    @XmlElement(name = "defaultsku")
    private String defaultSku = "";

    /**
     * 商品配送方式（1“3+3”，2次日达，3预约时间）
     */
    @XmlElement(name = "peisongtype")
    private String peiSongType = "";

    /**
     * 原价oldprice
     */
    @XmlElement(name = "oldprice")
    private String oldPrice = "";

    /**
     * 现价nowprice
     */
    @XmlElement(name = "nowprice")
    private String nowPrice = "";
   
    /**
     * 是否支持发票（0支持，1不支持）
     */
    @XmlElement(name = "isinvoice")
    private String isInvoice = "";

    /**
     * 限购日期
     */
    @XmlElement(name = "limitdate")
    private String limitDate = "";

    public String getID()
    {
        return ID;
    }

    public void setID(String iD)
    {
        ID = iD;
    }

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

    public String getGoodsSize()
    {
        return goodsSize;
    }

    public void setGoodsSize(String goodsSize)
    {
        this.goodsSize = goodsSize;
    }

    public String getGoodsType()
    {
        return goodsType;
    }

    public void setGoodsType(String goodsType)
    {
        this.goodsType = goodsType;
    }

    public String getPeisong()
    {
        return peisong;
    }

    public void setPeisong(String peisong)
    {
        this.peisong = peisong;
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

    public Date getAddTime()
    {
        return addTime;
    }

    public void setAddTime(Date addTime)
    {
        this.addTime = addTime;
    }

    public String getAddTimeStr()
    {
        return addTimeStr;
    }

    public void setAddTimeStr(String addTimeStr)
    {
        this.addTimeStr = addTimeStr;
    }

    public Date getUppTime()
    {
        return uppTime;
    }

    public void setUppTime(Date uppTime)
    {
        this.uppTime = uppTime;
    }

    public String getUppTimeStr()
    {
        return uppTimeStr;
    }

    public void setUppTimeStr(String uppTimeStr)
    {
        this.uppTimeStr = uppTimeStr;
    }

    public String getGoodsDetail()
    {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail)
    {
        this.goodsDetail = goodsDetail;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getProvince()
    {
        return province;
    }

    public void setProvince(String province)
    {
        this.province = province;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getArea()
    {
        return area;
    }

    public void setArea(String area)
    {
        this.area = area;
    }

    public String getQueryOpts()
    {
        return queryOpts;
    }

    public void setQueryOpts(String queryOpts)
    {
        this.queryOpts = queryOpts;
    }

    public String getSaleTitle()
    {
        return saleTitle;
    }

    public void setSaleTitle(String saleTitle)
    {
        this.saleTitle = saleTitle;
    }

    public String getGoodsCount()
    {
        return goodsCount;
    }

    public void setGoodsCount(String goodsCount)
    {
        this.goodsCount = goodsCount;
    }

    public String getGoodsCode()
    {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode)
    {
        this.goodsCode = goodsCode;
    }

    public String getOnSale()
    {
        return onSale;
    }

    public void setOnSale(String onSale)
    {
        this.onSale = onSale;
    }

    public String getOffTimeStr()
    {
        return offTimeStr;
    }

    public void setOffTimeStr(String offTimeStr)
    {
        this.offTimeStr = offTimeStr;
    }

    public Date getOffTime()
    {
        return offTime;
    }

    public void setOffTime(Date offTime)
    {
        this.offTime = offTime;
    }

    public String getOnTimeStr()
    {
        return onTimeStr;
    }

    public void setOnTimeStr(String onTimeStr)
    {
        this.onTimeStr = onTimeStr;
    }

    public Date getOnTime()
    {
        return onTime;
    }

    public void setOnTime(Date onTime)
    {
        this.onTime = onTime;
    }

    public String getPrivilegeInfo()
    {
        return privilegeInfo;
    }

    public void setPrivilegeInfo(String privilegeInfo)
    {
        this.privilegeInfo = privilegeInfo;
    }

    public String getLimitCount()
    {
        return limitCount;
    }

    public void setLimitCount(String limitCount)
    {
        this.limitCount = limitCount;
    }

    public String getDefaultSku()
    {
        return defaultSku;
    }

    public void setDefaultSku(String defaultSku)
    {
        this.defaultSku = defaultSku;
    }

    public String getPeiSongType()
    {
        return peiSongType;
    }

    public void setPeiSongType(String peiSongType)
    {
        this.peiSongType = peiSongType;
    }

    public String getOldPrice()
    {
        return oldPrice;
    }

    public void setOldPrice(String oldPrice)
    {
        this.oldPrice = oldPrice;
    }

    public String getNowPrice()
    {
        return nowPrice;
    }

    public void setNowPrice(String nowPrice)
    {
        this.nowPrice = nowPrice;
    }

    public String getLimitDate()
    {
        return limitDate;
    }

    public void setLimitDate(String limitDate)
    {
        this.limitDate = limitDate;
    }

	public String getIsInvoice()
	{
		return isInvoice;
	}

	public void setIsInvoice(String isInvoice)
	{
		this.isInvoice = isInvoice;
	}

}
