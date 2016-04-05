/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.street.bean.info.rsp.RspStreetBody
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

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.street.bean.info.rsp.RspStreetBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-21 下午5:03:50
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspStreetBody
{
    @XmlElement(name = "list")
    private RspStreetList rspStreetList;

    public RspStreetList getRspStreetList()
    {
        return rspStreetList;
    }

    public void setRspStreetList(RspStreetList rspStreetList)
    {
        this.rspStreetList = rspStreetList;
    }

}
