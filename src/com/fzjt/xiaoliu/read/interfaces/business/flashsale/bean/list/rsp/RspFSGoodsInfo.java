package com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.list.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.list.rsp.RspFSGoodsInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2016-1-7 上午9:46:16
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspFSGoodsInfo
{
    /**
     * 活动key
     */
    @XmlElement(name = "saleskey")
    private String salesKey;

    /**
     * 商品key
     */
    @XmlElement(name = "goodskey")
    private String goodsKey;

    /**
     * sku_key
     */
    @XmlElement(name = "skukey")
    private String skuKey;

    /**
     * sku名称
     */
    @XmlElement(name = "skuname")
    private String skuName;

    /**
     * sku图片
     */
    @XmlElement(name = "skupic")
    private String skuPic;

    /**
     * sku数量
     */
    @XmlElement(name = "skucount")
    private String skuCount;

    /**
     * 活动商品的sku规格
     */
    @XmlElement(name = "skuspec")
    private String skuSpec;

    /**
     * 活动商品剩余量
     */
    @XmlElement(name = "skuleft")
    private String skuLeft;

    /**
     * 活动商品价格
     */
    @XmlElement(name = "skuprice")
    private String skuPrice;

    /**
     * 是否销售（0可销售，1不销售）
     */
    @XmlElement(name = "issale")
    private String isSale;

    public String getSalesKey()
    {
        return salesKey;
    }

    public void setSalesKey(String salesKey)
    {
        this.salesKey = salesKey;
    }

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

    public String getSkuName()
    {
        return skuName;
    }

    public void setSkuName(String skuName)
    {
        this.skuName = skuName;
    }

    public String getSkuPic()
    {
        return skuPic;
    }

    public void setSkuPic(String skuPic)
    {
        this.skuPic = skuPic;
    }

    public String getSkuCount()
    {
        return skuCount;
    }

    public void setSkuCount(String skuCount)
    {
        this.skuCount = skuCount;
    }

    public String getSkuSpec()
    {
        return skuSpec;
    }

    public void setSkuSpec(String skuSpec)
    {
        this.skuSpec = skuSpec;
    }

    public String getSkuLeft()
    {
        return skuLeft;
    }

    public void setSkuLeft(String skuLeft)
    {
        this.skuLeft = skuLeft;
    }

    public String getSkuPrice()
    {
        return skuPrice;
    }

    public void setSkuPrice(String skuPrice)
    {
        this.skuPrice = skuPrice;
    }

    public String getIsSale()
    {
        return isSale;
    }

    public void setIsSale(String isSale)
    {
        this.isSale = isSale;
    }

}
