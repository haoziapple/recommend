/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.info.req.ReqHelpBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-2     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.info.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.info.req.ReqHelpBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 下午8:16:05
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqHelpBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqHelpBody reqBody;

    public ReqHelpBody getReqBody()
    {
        return reqBody;
    }

    public void setReqBody(ReqHelpBody reqBody)
    {
        this.reqBody = reqBody;
    }

}
