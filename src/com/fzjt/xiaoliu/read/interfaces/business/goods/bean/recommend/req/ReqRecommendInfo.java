/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.req.ReqRecommendInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-19     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 推荐商品请求信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.req.ReqRecommendInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-19 上午10:36:04
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqRecommendInfo
{
    /**
     * 查询的每个类别商品数量,默认为2
     */
    private String count = "2";

    /**
     * 不传userkey时，默认查询商品类 逗号分割
     */
    @XmlElement(name = "goodstype")
    private String goodsType = "";

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
     * 浏览用户userkey
     */
    @XmlElement(name = "userkey")
    private String userKey = "";

    /**
     * 用户当前浏览商品goodskey
     */
    @XmlElement(name = "goodskey")
    private String goodsKey = "";

    /**
     * 查询用户浏览历史范围（以最近多少条）
     */
    private String searchRange = "";

    public String getCount()
    {
        return count;
    }

    public void setCount(String count)
    {
        this.count = count;
    }

    public String getGoodsType()
    {
        return goodsType;
    }

    public void setGoodsType(String goodsType)
    {
        this.goodsType = goodsType;
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

    public String getGoodsKey()
    {
        return goodsKey;
    }

    public void setGoodsKey(String goodsKey)
    {
        this.goodsKey = goodsKey;
    }

    public String getSearchRange()
    {
        return searchRange;
    }

    public void setSearchRange(String searchRange)
    {
        this.searchRange = searchRange;
    }

}
