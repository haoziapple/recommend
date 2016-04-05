/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.street.bean.info.req.ReqStreetBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-21     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.sysmanager.street.bean.info.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.street.bean.info.req.ReqStreetBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-21 下午4:57:32
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqStreetBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqStreetBody reqStreetBody;

    public ReqStreetBody getReqStreetBody()
    {
        return reqStreetBody;
    }

    public void setReqStreetBody(ReqStreetBody reqStreetBody)
    {
        this.reqStreetBody = reqStreetBody;
    }
}
