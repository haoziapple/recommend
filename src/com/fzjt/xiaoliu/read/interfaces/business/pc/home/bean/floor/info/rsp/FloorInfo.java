/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.rsp.FloorInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-4     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 首页floor展示商品、商家、活动信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.rsp.FloorInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-4 下午2:36:29
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class FloorInfo
{
    /**
     * 楼层key
     */
    @XmlElement(name = "floorkey")
    private String floorKey;

    /**
     * 对象key
     */
    @XmlElement(name = "objkey")
    private String objKey;

    /**
     * 对象类型(1商品，2商家，3活动)
     */
    @XmlElement(name = "objtype")
    private String objType;

    /**
     * 对象名称
     */
    @XmlElement(name = "objname")
    private String objName;

    /**
     * 图片url
     */
    @XmlElement(name = "imgurl")
    private String imgUrl;

    /**
     * 活动跳转url
     */
    @XmlElement(name = "linkurl")
    private String linkUrl;

    /**
     * 商品原价
     */
    @XmlElement(name = "priceold")
    private String priceOld;

    /**
     * 商品现价
     */
    @XmlElement(name = "pricenow")
    private String priceNow;

    /**
     * 商品原价
     */
    @XmlElement(name = "goodskey")
    private String goodsKey;

    /**
     * 商品是否首页展示
     */
    private String isShow;

    public String getFloorKey()
    {
        return floorKey;
    }

    public void setFloorKey(String floorKey)
    {
        this.floorKey = floorKey;
    }

    public String getObjKey()
    {
        return objKey;
    }

    public void setObjKey(String objKey)
    {
        this.objKey = objKey;
    }

    public String getObjType()
    {
        return objType;
    }

    public void setObjType(String objType)
    {
        this.objType = objType;
    }

    public String getObjName()
    {
        return objName;
    }

    public void setObjName(String objName)
    {
        this.objName = objName;
    }

    public String getImgUrl()
    {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl)
    {
        this.imgUrl = imgUrl;
    }

    public String getLinkUrl()
    {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl)
    {
        this.linkUrl = linkUrl;
    }

    public String getPriceOld()
    {
        return priceOld;
    }

    public void setPriceOld(String priceOld)
    {
        this.priceOld = priceOld;
    }

    public String getPriceNow()
    {
        return priceNow;
    }

    public void setPriceNow(String priceNow)
    {
        this.priceNow = priceNow;
    }

    public String getGoodsKey()
    {
        return goodsKey;
    }

    public void setGoodsKey(String goodsKey)
    {
        this.goodsKey = goodsKey;
    }

    public String getIsShow()
    {
        return isShow;
    }

    public void setIsShow(String isShow)
    {
        this.isShow = isShow;
    }

}
