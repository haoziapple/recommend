/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.rsp.RspPropertyBody
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
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.value.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.value.rsp.RspValueBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-13 下午6:14:20
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspValueBody
{
    @XmlElement(name = "list")
    private RspValueList rspValueList = null;

    public RspValueList getRspValueList()
    {
        return rspValueList;
    }

    public void setRspValueList(RspValueList rspValueList)
    {
        this.rspValueList = rspValueList;
    }

}