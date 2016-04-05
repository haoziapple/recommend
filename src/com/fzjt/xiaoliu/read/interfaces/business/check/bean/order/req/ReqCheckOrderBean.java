/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.bean.order.req.ReqCheckOrderBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-8     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.check.bean.order.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.bean.order.req.ReqCheckOrderBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-23 下午4:32:44
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqCheckOrderBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqCheckOrderBody reqBody;

    public ReqCheckOrderBody getReqBody()
    {
        return reqBody;
    }

    public void setReqBody(ReqCheckOrderBody reqBody)
    {
        this.reqBody = reqBody;
    }

}
