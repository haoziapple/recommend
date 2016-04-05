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
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.req.ReqPropertyBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-13 下午3:11:33
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqPropertyBody
{
    @XmlElement(name="info")
    private ReqPropertyInfo  reqPropertyInfo;

    public ReqPropertyInfo getReqPropertyInfo()
    {
        return reqPropertyInfo;
    }

    public void setReqPropertyInfo(ReqPropertyInfo reqPropertyInfo)
    {
        this.reqPropertyInfo = reqPropertyInfo;
    }

}