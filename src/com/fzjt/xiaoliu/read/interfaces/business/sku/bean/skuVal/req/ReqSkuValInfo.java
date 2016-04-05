/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuVal.ReqSkuValInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-13     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuVal.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 请求特征值key
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuVal.req.ReqSkuValInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午9:21:44
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqSkuValInfo
{
    /**
     * vKey
     */
    @XmlElement(name = "vkey")
    private String vKey;

    /**
     * goodsKey
     */
    @XmlElement(name = "goodskey")
    private String goodsKey;

    public String getGoodsKey()
    {
        return goodsKey;
    }

    public void setGoodsKey(String goodsKey)
    {
        this.goodsKey = goodsKey;
    }

    public String getvKey()
    {
        return vKey;
    }

    public void setvKey(String vKey)
    {
        this.vKey = vKey;
    }

}