/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.req.GoodsKeyInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-3     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 业务bean，商品key
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.req.GoodsKeyInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-3 下午2:12:55
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class GoodsKeyInfo
{
    /**
     * 商品key
     */
    @XmlElement(name = "goodskey")
    private String goodsKey;

    /**
     * 用户key
     */
    @XmlElement(name = "userkey")
    private String userKey;

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
     * 类型key
     */
    @XmlTransient
    private String typeKey;

    /**
     * 历史key
     */
    @XmlTransient
    private String vKey;

    public String getGoodsKey()
    {
        return goodsKey;
    }

    public void setGoodsKey(String goodsKey)
    {
        this.goodsKey = goodsKey;
    }

    public String getUserKey()
    {
        return userKey;
    }

    public void setUserKey(String userKey)
    {
        this.userKey = userKey;
    }

    public String getTypeKey()
    {
        return typeKey;
    }

    public void setTypeKey(String typeKey)
    {
        this.typeKey = typeKey;
    }

    public String getvKey()
    {
        return vKey;
    }

    public void setvKey(String vKey)
    {
        this.vKey = vKey;
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

    public String getArea()
    {
        return area;
    }

    public void setArea(String area)
    {
        this.area = area;
    }

}
