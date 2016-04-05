/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.req.ReqHelpListBean
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
package com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.req.ReqHelpListBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 下午8:29:52
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqHelpListBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqHelpListBody reqBody;

    public ReqHelpListBody getReqBody()
    {
        return reqBody;
    }

    public void setReqBody(ReqHelpListBody reqBody)
    {
        this.reqBody = reqBody;
    }
}
