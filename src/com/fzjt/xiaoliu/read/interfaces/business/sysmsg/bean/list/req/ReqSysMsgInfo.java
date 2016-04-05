/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.push.sysmsg.bean.req.ReqSysMsgInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-18     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.list.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 请求bean
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.list.req.ReqSysMsgInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-19 下午7:49:23
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqSysMsgInfo
{
    /**
     * 省
     */
    @XmlElement(name = "province")
    private String province = "";

    /**
     * 市
     */
    @XmlElement(name = "city")
    private String city = "";

    /**
     * 区
     */
    @XmlElement(name = "area")
    private String area = "";

    /**
     * 开始条数
     */
    @XmlElement(name = "fromnum")
    private String fromNum = "";

    /**
     * 结束条数
     */
    @XmlElement(name = "tonum")
    private String toNum = "";

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

    public String getArea()
    {
        return area;
    }

    public void setArea(String area)
    {
        this.area = area;
    }

    public String getFromNum()
    {
        return fromNum;
    }

    public void setFromNum(String fromNum)
    {
        this.fromNum = fromNum;
    }

    public String getToNum()
    {
        return toNum;
    }

    public void setToNum(String toNum)
    {
        this.toNum = toNum;
    }

}
