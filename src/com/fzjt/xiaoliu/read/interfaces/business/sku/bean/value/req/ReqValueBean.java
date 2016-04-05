/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.req.ReqPropertyBean
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
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.value.req.ReqValueBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-13 下午6:06:25
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqValueBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqValueBody reqValueBody;

    public ReqValueBody getReqValueBody()
    {
        return reqValueBody;
    }

    public void setReqValueBody(ReqValueBody reqValueBody)
    {
        this.reqValueBody = reqValueBody;
    }

}