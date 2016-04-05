/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.req.ReqPropertyInfo
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
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.value.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 查询特征值请求参数
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.value.req.ReqValueInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午6:03:45
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqValueInfo
{
    /**
     * pKey
     */
    @XmlElement(name = "pkey")
    private String pKey;

    /**
     * goodsKey
     */
    @XmlElement(name = "goodskey")
    private String goodsKey;

    public String getpKey()
    {
        return pKey;
    }

    public void setpKey(String pKey)
    {
        this.pKey = pKey;
    }

    public String getGoodsKey()
    {
        return goodsKey;
    }

    public void setGoodsKey(String goodsKey)
    {
        this.goodsKey = goodsKey;
    }

}