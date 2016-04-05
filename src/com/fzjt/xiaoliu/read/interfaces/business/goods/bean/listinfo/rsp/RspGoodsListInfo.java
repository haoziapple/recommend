/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.rsp.RspGoodsListInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-16      TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 商品列表页显示返回信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.rsp.RspGoodsListInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-16 下午4:40:02
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspGoodsListInfo
{
    /**
     * 商品key
     */
    @XmlElement(name = "goodskey")
    private String goodsKey;

    /**
     * 促销标题
     */
    @XmlElement(name = "saletitle")
    private String saleTitle;

    /**
     * 商品名称
     */
    @XmlElement(name = "goodsname")
    private String goodsName;

    /**
     * 商品类别key
     */
    @XmlElement(name = "goodstype")
    private String goodsType;

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
     * 商品编码（编号）
     */
    @XmlElement(name = "goodscode")
    private String goodsCode;

    /**
     * 原价格
     */
    @XmlElement(name = "oldprice")
    private String oldPrice;

    /**
     * 现价格
     */
    @XmlElement(name = "nowprice")
    private String nowPrice;

    private String indexNum = "";

    public String getGoodsKey()
    {
        return goodsKey;
    }

    public void setGoodsKey(String goodsKey)
    {
        this.goodsKey = goodsKey;
    }

    public String getSaleTitle()
    {
        return saleTitle;
    }

    public void setSaleTitle(String saleTitle)
    {
        this.saleTitle = saleTitle;
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

    public String getGoodsCode()
    {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode)
    {
        this.goodsCode = goodsCode;
    }

    public String getIndexNum()
    {
        return indexNum;
    }

    public void setIndexNum(String indexNum)
    {
        this.indexNum = indexNum;
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

}
