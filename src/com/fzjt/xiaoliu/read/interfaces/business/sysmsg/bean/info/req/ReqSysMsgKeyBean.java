/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.info.req.ReqSysMsgKeyBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-19     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.info.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.info.req.ReqSysMsgKeyBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-19 下午8:02:55
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqSysMsgKeyBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqSysMsgKeyBody reqSysMsgKeyBody;

    public ReqSysMsgKeyBody getReqSysMsgKeyBody()
    {
        return reqSysMsgKeyBody;
    }

    public void setReqSysMsgKeyBody(ReqSysMsgKeyBody reqSysMsgKeyBody)
    {
        this.reqSysMsgKeyBody = reqSysMsgKeyBody;
    }

}
