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
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuVal.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 商品 Sku information
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuVal.rsp.RspSkuValInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午9:23:26
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspSkuValInfo
{
    @XmlTransient
    private String ID = "";

    /**
     * sku_key
     */
    @XmlElement(name = "skukey")
    private String skuKey;

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
     * sku促销标题
     */
    @XmlElement(name = "skutitle")
    private String skuTitle;

    /**
     * sku列表展示图片
     */
    @XmlElement(name = "skupic")
    private String skuPic;

    public String getID()
    {
        return ID;
    }

    public void setID(String iD)
    {
        ID = iD;
    }

    public String getSkuKey()
    {
        return skuKey;
    }

    public void setSkuKey(String skuKey)
    {
        this.skuKey = skuKey;
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

    public String getSkuTitle()
    {
        return skuTitle;
    }

    public void setSkuTitle(String skuTitle)
    {
        this.skuTitle = skuTitle;
    }

    public String getSkuPic()
    {
        return skuPic;
    }

    public void setSkuPic(String skuPic)
    {
        this.skuPic = skuPic;
    }

}
