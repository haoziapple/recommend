/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.view.req.ReqViewBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-4     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.view.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.view.req.ReqViewBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-4 下午4:56:38
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqViewBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqViewBody reqBody;

    public ReqViewBody getReqBody()
    {
        return reqBody;
    }

    public void setReqBody(ReqViewBody reqBody)
    {
        this.reqBody = reqBody;
    }
}
