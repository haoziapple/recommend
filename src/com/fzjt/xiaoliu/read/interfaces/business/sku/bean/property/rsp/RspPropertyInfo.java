/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.rsp.RspPropertyInfo
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
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 查询结果信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.rsp.RspPropertyInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午3:16:10
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspPropertyInfo
{

    /**
     * 特征量KEY
     */
    @XmlElement(name = "pkey")
    private String pKey;

    /**
     * 特征量名称
     */
    @XmlElement(name = "pname")
    private String pName;

    /**
     * 排序
     */
    @XmlElement(name = "orderflag")
    private String orderFlag;

    public String getpKey()
    {
        return pKey;
    }

    public void setpKey(String pKey)
    {
        this.pKey = pKey;
    }

    public String getpName()
    {
        return pName;
    }

    public void setpName(String pName)
    {
        this.pName = pName;
    }

    public String getOrderFlag()
    {
        return orderFlag;
    }

    public void setOrderFlag(String orderFlag)
    {
        this.orderFlag = orderFlag;
    }
}