/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.req.ReqHelpListInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-2     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 请求获取帮助内容列表
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.req.ReqHelpListInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 下午8:26:00
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqHelpListInfo
{
    // 省
    @XmlElement(name = "province")
    private String province;

    // 市
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
