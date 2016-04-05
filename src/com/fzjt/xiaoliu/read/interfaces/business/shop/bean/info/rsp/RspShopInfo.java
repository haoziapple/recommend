/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.shop.bean.info.rsp.RspShopInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-18     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.shop.bean.info.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 返回商家信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.shop.bean.info.rsp.RspShopInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-18 下午2:38:52
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspShopInfo
{
    /**
     * 商家名称
     */
    @XmlElement(name = "shopname")
    private String shopName;

    /**
     * 商家logo
     */
    @XmlElement(name = "shoplogo")
    private String shopLogo;

    /**
     * 商家概述
     */
    @XmlElement(name = "shopdesc")
    private String shopDesc;

    /**
     * 商家性质（1个体、2企业）
     */
    @XmlElement(name = "shopnature")
    private String shopNature;

    /**
     * 商家类型
     */
    @XmlElement(name = "shoptype")
    private String shopType;

    /**
     * 商家地址
     */
    @XmlElement(name = "shopaddress")
    private String shopAddress;

    /**
     * 商家网页
     */
    @XmlElement(name = "shopwebsite")
    private String shopWebsite;

    /**
     * 邮政编码
     */
    @XmlElement(name = "postalcode")
    private String postalCode;

    /**
     * 是否加盟(0是，1否)
     */
    @XmlElement(name = "isjoin")
    private String isJoin;

    /**
     * 是否连锁(0是，1否)
     */
    @XmlElement(name = "ischain")
    private String isChain;

    /**
     * 是否可刷卡(0是，1否)
     */
    @XmlElement(name = "isswiping")
    private String isSwiping;

    /**
     * 是否可停车(0是，1否)
     */
    @XmlElement(name = "ispark")
    private String isPark;

    /**
     * 是否有WIFI(0是，1否)
     */
    @XmlElement(name = "iswifi")
    private String isWifi;

    /**
     * 营业时间范围（显示格式08：00-16：00）
     */
    @XmlElement(name = "businesshours")
    private String businessHours;

    /**
     * 微信号
     */
    @XmlElement(name = "weixin")
    private String weiXin;

    /**
     * 联系人
     */
    @XmlElement(name = "linkman")
    private String linkMan;

    /**
     * 联系人电话
     */
    @XmlElement(name = "linkmantel")
    private String linkManTel;

    /**
     * 商家关联账号的用户key
     */
    @XmlElement(name = "userkey")
    private String userKey;

    /**
     * 商家座机号码
     */
    @XmlElement(name = "shoptel")
    private String shopTel;

    /**
     * 客服电话
     */
    @XmlElement(name = "servicetel")
    private String serviceTel;

    public String getShopName()
    {
        return shopName;
    }

    public void setShopName(String shopName)
    {
        this.shopName = shopName;
    }

    public String getShopLogo()
    {
        return shopLogo;
    }

    public void setShopLogo(String shopLogo)
    {
        this.shopLogo = shopLogo;
    }

    public String getShopDesc()
    {
        return shopDesc;
    }

    public void setShopDesc(String shopDesc)
    {
        this.shopDesc = shopDesc;
    }

    public String getShopNature()
    {
        return shopNature;
    }

    public void setShopNature(String shopNature)
    {
        this.shopNature = shopNature;
    }

    public String getShopType()
    {
        return shopType;
    }

    public void setShopType(String shopType)
    {
        this.shopType = shopType;
    }

    public String getShopAddress()
    {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress)
    {
        this.shopAddress = shopAddress;
    }

    public String getShopWebsite()
    {
        return shopWebsite;
    }

    public void setShopWebsite(String shopWebsite)
    {
        this.shopWebsite = shopWebsite;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public void setPostalCode(String postalCode)
    {
        this.postalCode = postalCode;
    }

    public String getIsJoin()
    {
        return isJoin;
    }

    public void setIsJoin(String isJoin)
    {
        this.isJoin = isJoin;
    }

    public String getIsChain()
    {
        return isChain;
    }

    public void setIsChain(String isChain)
    {
        this.isChain = isChain;
    }

    public String getIsSwiping()
    {
        return isSwiping;
    }

    public void setIsSwiping(String isSwiping)
    {
        this.isSwiping = isSwiping;
    }

    public String getIsPark()
    {
        return isPark;
    }

    public void setIsPark(String isPark)
    {
        this.isPark = isPark;
    }

    public String getIsWifi()
    {
        return isWifi;
    }

    public void setIsWifi(String isWifi)
    {
        this.isWifi = isWifi;
    }

    public String getBusinessHours()
    {
        return businessHours;
    }

    public void setBusinessHours(String businessHours)
    {
        this.businessHours = businessHours;
    }

    public String getWeiXin()
    {
        return weiXin;
    }

    public void setWeiXin(String weiXin)
    {
        this.weiXin = weiXin;
    }

    public String getLinkMan()
    {
        return linkMan;
    }

    public void setLinkMan(String linkMan)
    {
        this.linkMan = linkMan;
    }

    public String getLinkManTel()
    {
        return linkManTel;
    }

    public void setLinkManTel(String linkManTel)
    {
        this.linkManTel = linkManTel;
    }

    public String getUserKey()
    {
        return userKey;
    }

    public void setUserKey(String userKey)
    {
        this.userKey = userKey;
    }

    public String getShopTel()
    {
        return shopTel;
    }

    public void setShopTel(String shopTel)
    {
        this.shopTel = shopTel;
    }

    public String getServiceTel()
    {
        return serviceTel;
    }

    public void setServiceTel(String serviceTel)
    {
        this.serviceTel = serviceTel;
    }
}
