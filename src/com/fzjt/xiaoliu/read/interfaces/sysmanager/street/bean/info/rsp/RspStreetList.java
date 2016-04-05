/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.street.bean.info.rsp.RspStreetList
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

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.street.bean.info.rsp.RspStreetList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-21 下午5:02:32
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspStreetList
{
    @XmlElement(name = "info")
    private List<RspStreetInfo> rspStreetInfoList;

    public List<RspStreetInfo> getRspStreetInfoList()
    {
        return rspStreetInfoList;
    }

    public void setRspStreetInfoList(List<RspStreetInfo> rspStreetInfoList)
    {
        this.rspStreetInfoList = rspStreetInfoList;
    }

}
