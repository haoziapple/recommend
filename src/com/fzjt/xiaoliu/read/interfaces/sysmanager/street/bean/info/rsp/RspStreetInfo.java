/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.street.bean.info.rsp.RspStreetInfo
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
 * 响应bean
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.street.bean.info.rsp.RspStreetInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-21 下午4:58:21
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspStreetInfo
{
    /**
     * 区域code
     */
    @XmlElement(name = "streetkey")
    private String streetKey;

    /**
     * 街道名称
     */
    @XmlElement(name = "streetname")
    private String streetName;
    /**
     * 满多少免运费
     */
    @XmlElement(name = "freeshipping")
    private String freeShipping;

    /**
     * 运费
     */
    @XmlElement(name = "freight")
    private String freight;

    public String getStreetKey()
    {
        return streetKey;
    }

    public void setStreetKey(String streetKey)
    {
        this.streetKey = streetKey;
    }

    public String getStreetName()
    {
        return streetName;
    }

    public void setStreetName(String streetName)
    {
        this.streetName = streetName;
    }

    public String getFreeShipping()
    {
        return freeShipping;
    }

    public void setFreeShipping(String freeShipping)
    {
        this.freeShipping = freeShipping;
    }

    public String getFreight()
    {
        return freight;
    }

    public void setFreight(String freight)
    {
        this.freight = freight;
    }

}
