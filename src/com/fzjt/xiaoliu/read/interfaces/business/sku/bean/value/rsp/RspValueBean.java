/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.rsp.RspPropertyBean
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
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.value.rsp.RspValueBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-13 下午6:15:18
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspValueBean extends RspBean
{
    @XmlElement(name = "body")
    private RspValueBody rspValueBody = null;

    public RspValueBody getRspValueBody()
    {
        return rspValueBody;
    }

    public void setRspValueBody(RspValueBody rspValueBody)
    {
        this.rspValueBody = rspValueBody;
    }

}