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
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.req.ReqPropertyBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-13 下午3:12:45
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqPropertyBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqPropertyBody reqPropertyBody;

    public ReqPropertyBody getReqPropertyBody()
    {
        return reqPropertyBody;
    }

    public void setReqPropertyBody(ReqPropertyBody reqPropertyBody)
    {
        this.reqPropertyBody = reqPropertyBody;
    }

}