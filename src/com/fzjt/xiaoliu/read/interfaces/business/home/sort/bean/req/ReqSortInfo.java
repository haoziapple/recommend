/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.sort.bean.req.ReqSortInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiChangjiang
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-11     LiChangjiang       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.sort.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.sort.bean.req.ReqSortInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-11 下午7:33:25
 * @author:LiChangjiang
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqSortInfo
{
	/**
	 * 省
	 */
    @XmlElement(name = "province")
    private String province;

    /**
     * 市
     */
    @XmlElement(name = "city")
    private String city;

    public String getProvince()
    {
        return province;
    }

    public void setProvince(String province)
    {
        this.province = province;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

}
