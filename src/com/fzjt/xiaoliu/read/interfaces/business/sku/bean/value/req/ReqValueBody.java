/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.req.ReqPropertyBody
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
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.value.req.ReqValueBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午6:05:09
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqValueBody
{
    @XmlElement(name = "info")
    private ReqValueInfo reqValueInfo;

    public ReqValueInfo getReqValueInfo()
    {
        return reqValueInfo;
    }

    public void setReqValueInfo(ReqValueInfo reqValueInfo)
    {
        this.reqValueInfo = reqValueInfo;
    }

}