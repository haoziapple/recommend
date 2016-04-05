/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.street.bean.info.req.ReqStreetBody
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

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.street.bean.info.req.ReqStreetBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-21 下午4:56:00
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqStreetBody
{

    @XmlElement(name = "info")
    private ReqStreetInfo reqStreetInfo;

    public ReqStreetInfo getReqStreetInfo()
    {
        return reqStreetInfo;
    }

    public void setReqStreetInfo(ReqStreetInfo reqStreetInfo)
    {
        this.reqStreetInfo = reqStreetInfo;
    }
}
