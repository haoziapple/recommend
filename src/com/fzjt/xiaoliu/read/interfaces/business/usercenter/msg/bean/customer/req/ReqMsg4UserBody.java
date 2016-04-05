/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.usercenter.msg.bean.customer.req.ReqMsg4UserBody
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-26     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.usercenter.msg.bean.customer.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fzjt.xiaoliu.read.interfaces.util.PageBeanInfo;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.usercenter.msg.bean.customer.req.ReqMsg4UserBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-26 下午2:18:25
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqMsg4UserBody extends PageBeanInfo
{
    @XmlElement(name = "info")
    private ReqMsg4UserInfo reqInfo;

    public ReqMsg4UserInfo getReqInfo()
    {
        return reqInfo;
    }

    public void setReqInfo(ReqMsg4UserInfo reqInfo)
    {
        this.reqInfo = reqInfo;
    }

}
