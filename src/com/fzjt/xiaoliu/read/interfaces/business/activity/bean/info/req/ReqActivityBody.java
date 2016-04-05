/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.activity.bean.info.req.ReqActivityBody
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

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.activity.bean.info.req.ReqActivityBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-10 下午9:39:00
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqActivityBody
{
    @XmlElement(name = "info")
    private ReqActivityInfo reqInfo;

    public ReqActivityInfo getReqInfo()
    {
        return reqInfo;
    }

    public void setReqInfo(ReqActivityInfo reqInfo)
    {
        this.reqInfo = reqInfo;
    }

}
