/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.req.ReqGoodsListInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-16      TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 商品列表页显示请求信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.req.ReqGoodsListInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-16 下午4:38:43
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqGoodsListInfo
{
    /**
     * 排序方式（0:从低到高，1：从高到低）
     */
    @XmlElement(name = "sort")
    private String sort = "";

    /**
     * 排序类别（0：按价格排序，1：按销量排序， 2：上架时间）
     */
    @XmlElement(name = "sortstyle")
    private String sortStyle = "";

    /**
     * 商品类别
     */
    @XmlElement(name = "goodstype")
    private String goodsType = "";

    /**
     * 商品名
     */
    @XmlElement(name = "goodsname")
    private String goodsName = "";

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
    * 
    */
    @XmlElement(name = "rn")
    private String rn = "";

    /**
     * userkey
     */
    @XmlElement(name = "userkey")
    private String userKey = "";

    public String getSort()
    {
        return sort;
    }

    public void setSort(String sort)
    {
        this.sort = sort;
    }

    public String getSortStyle()
    {
        return sortStyle;
    }

    public void setSortStyle(String sortStyle)
    {
        this.sortStyle = sortStyle;
    }

    public String getGoodsType()
    {
        return goodsType;
    }

    public void setGoodsType(String goodsType)
    {
        this.goodsType = goodsType;
    }

    public String getGoodsName()
    {
        return goodsName;
    }

    public void setGoodsName(String goodsName)
    {
        this.goodsName = goodsName;
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

    public String getRn()
    {
        return rn;
    }

    public void setRn(String rn)
    {
        this.rn = rn;
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

    public String getUserKey()
    {
        return userKey;
    }

    public void setUserKey(String userKey)
    {
        this.userKey = userKey;
    }

}
