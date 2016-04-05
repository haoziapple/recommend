/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.street.bean.info.rsp.RspStreetBean
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
package com.fzjt.xiaoliu.read.interfaces.sysmanager.street.bean.info.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.street.bean.info.rsp.RspStreetBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-21 下午5:06:52
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspStreetBean extends RspBean
{
    @XmlElement(name = "body")
    private RspStreetBody rspStreetBody;

    public RspStreetBody getRspStreetBody()
    {
        return rspStreetBody;
    }

    public void setRspStreetBody(RspStreetBody rspStreetBody)
    {
        this.rspStreetBody = rspStreetBody;
    }

}
