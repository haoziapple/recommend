/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.req.ReqPVListInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-14     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.req.ReqPVListInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-14 下午4:49:18
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqPVListInfo
{
    /**
     * goodsKey
     */
    @XmlElement(name = "goodskey")
    private String goodsKey;

    /**
     * 用于查询vkey的pKey
     */
    private String pKey;

    /**
     * typeKey
     */
    @XmlElement(name = "typekey")
    private String typeKey;

    public String getGoodsKey()
    {
        return goodsKey;
    }

    public void setGoodsKey(String goodsKey)
    {
        this.goodsKey = goodsKey;
    }

    public String getpKey()
    {
        return pKey;
    }

    public void setpKey(String pKey)
    {
        this.pKey = pKey;
    }

    public String getTypeKey()
    {
        return typeKey;
    }

    public void setTypeKey(String typeKey)
    {
        this.typeKey = typeKey;
    }

}
