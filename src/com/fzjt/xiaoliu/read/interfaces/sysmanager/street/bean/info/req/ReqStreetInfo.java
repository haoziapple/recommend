/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.street.bean.info.req.ReqStreetInfo
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
 * 获取接到信息请求参数 areacode
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.street.bean.info.req.ReqStreetInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-21 下午4:53:34
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqStreetInfo
{
    /**
     * 区域id
     */
    @XmlElement(name = "areacode")
    private String areaCode = "";

    public String getAreaCode()
    {
        return areaCode;
    }

    public void setAreaCode(String areaCode)
    {
        this.areaCode = areaCode;
    }
}
