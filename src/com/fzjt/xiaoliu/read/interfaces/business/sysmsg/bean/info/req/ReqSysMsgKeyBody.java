/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.info.req.ReqSysMsgKeyBody
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

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.info.req.ReqSysMsgKeyBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-19 下午8:01:11
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqSysMsgKeyBody
{
    @XmlElement(name = "info")
    private ReqSysMsgKeyInfo reqSysMsgKeyInfo;

    public ReqSysMsgKeyInfo getReqSysMsgKeyInfo()
    {
        return reqSysMsgKeyInfo;
    }

    public void setReqSysMsgKeyInfo(ReqSysMsgKeyInfo reqSysMsgKeyInfo)
    {
        this.reqSysMsgKeyInfo = reqSysMsgKeyInfo;
    }
}
