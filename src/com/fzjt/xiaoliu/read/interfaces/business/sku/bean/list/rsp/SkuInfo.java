/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.list.rsp.SkuInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-4     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.list.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.list.rsp.SkuInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-4 下午8:10:18
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class SkuInfo
{
    /**
     * skukey
     */
    @XmlElement(name = "skukey")
    private String skuKey;

    /**
     * 特征值Key
     */
    @XmlElement(name = "vkey")
    private String vKey;

    /**
     * sku属性名称
     */
    @XmlElement(name = "skuname")
    private String skuName;

    /**
     * 库存量
     */
    @XmlElement(name = "stocknumber")
    private String stockNumber;

    /**
     * 邮费（单位：分）
     */
    @XmlElement(name = "postage")
    private String postAge;

    /**
     * 商品类别
     */
    @XmlElement(name = "typekey")
    private String typeKey;

    /**
     * sku列表展示图片
     */
    @XmlElement(name = "skupic")
    private String skuPic;

    /**
     * sku促销标题
     */
    @XmlElement(name = "skutitle")
    private String skuTitle;

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

    public String getSkuKey()
    {
        return skuKey;
    }

    public void setSkuKey(String skuKey)
    {
        this.skuKey = skuKey;
    }

    public String getvKey()
    {
        return vKey;
    }

    public void setvKey(String vKey)
    {
        this.vKey = vKey;
    }

    public String getSkuName()
    {
        return skuName;
    }

    public void setSkuName(String skuName)
    {
        this.skuName = skuName;
    }

    public String getStockNumber()
    {
        return stockNumber;
    }

    public void setStockNumber(String stockNumber)
    {
        this.stockNumber = stockNumber;
    }

    public String getPostAge()
    {
        return postAge;
    }

    public void setPostAge(String postAge)
    {
        this.postAge = postAge;
    }

    public String getTypeKey()
    {
        return typeKey;
    }

    public void setTypeKey(String typeKey)
    {
        this.typeKey = typeKey;
    }

    public String getSkuPic()
    {
        return skuPic;
    }

    public void setSkuPic(String skuPic)
    {
        this.skuPic = skuPic;
    }

    public String getSkuTitle()
    {
        return skuTitle;
    }

    public void setSkuTitle(String skuTitle)
    {
        this.skuTitle = skuTitle;
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

}
