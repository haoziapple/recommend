/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.rsp.RspPropertyList
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

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * RspValueList
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.value.rsp.RspValueList
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-13 下午6:13:15
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspValueList
{
    @XmlElement(name = "info")
    private List<RspValueInfo> rspValuelist = null;

    public List<RspValueInfo> getRspValuelist()
    {
        return rspValuelist;
    }

    public void setRspValuelist(List<RspValueInfo> rspValuelist)
    {
        this.rspValuelist = rspValuelist;
    }
}