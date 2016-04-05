/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.activity.bean.info.req.ReqActivityBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-10     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.activity.bean.info.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.activity.bean.info.req.ReqActivityBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-10 下午9:39:55
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqActivityBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqActivityBody reqBody;

    public ReqActivityBody getReqBody()
    {
        return reqBody;
    }

    public void setReqBody(ReqActivityBody reqBody)
    {
        this.reqBody = reqBody;
    }

}
