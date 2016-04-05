/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.ReqGoodsInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-7     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 请求参数bean
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.req.ReqGoodsInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-7 下午3:53:17
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqGoodsInfo
{
    /**
     * 起始条数
     */
    @XmlElement(name = "fromnum")
    private String fromNum = "";

    /**
     * 截止条数
     */
    @XmlElement(name = "tonum")
    private String toNum = "";

    @XmlElement(name = "province")
    private String province;

    @XmlElement(name = "city")
    private String city;

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
