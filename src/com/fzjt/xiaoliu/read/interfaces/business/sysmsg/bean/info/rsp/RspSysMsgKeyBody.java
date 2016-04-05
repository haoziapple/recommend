/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.info.rsp.RspSysMsgKeyBody
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
package com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.info.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.list.rsp.RspSysMsgInfo;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.info.rsp.RspSysMsgKeyBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-19 下午8:35:59
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspSysMsgKeyBody
{
    @XmlElement(name = "info")
    private RspSysMsgInfo rspSysMsgInfo;

    public RspSysMsgInfo getRspSysMsgInfo()
    {
        return rspSysMsgInfo;
    }

    public void setRspSysMsgInfo(RspSysMsgInfo rspSysMsgInfo)
    {
        this.rspSysMsgInfo = rspSysMsgInfo;
    }
}
