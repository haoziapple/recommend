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
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.rsp;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * RspPropertyList
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.rsp.RspPropertyList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午3:23:35
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspPropertyList
{
    @XmlElement(name = "info")
    private List<RspPropertyInfo> rspPropertylist = null;

    public List<RspPropertyInfo> getRspPropertylist()
    {
        return rspPropertylist;
    }

    public void setRspPropertylist(List<RspPropertyInfo> rspPropertylist)
    {
        this.rspPropertylist = rspPropertylist;
    }

}