/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.rsp.PromotionInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-9     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 返回活动信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.rsp.PromotionInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-9 上午10:45:40
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class PromotionInfo
{
    /**
     * 活动key
     */
    @XmlElement(name = "promotionkey")
    private String promotionKey;

    /**
     * 活动名称
     */
    @XmlElement(name = "promotionname")
    private String promotionName;

    /**
     * 活动图片
     */
    @XmlElement(name = "promotionpic")
    private String promotionPic;

    /**
     * 活动链接
     */
    @XmlElement(name = "promotionurl")
    private String promotionUrl;

    public String getPromotionKey()
    {
        return promotionKey;
    }

    public void setPromotionKey(String promotionKey)
    {
        this.promotionKey = promotionKey;
    }

    public String getPromotionName()
    {
        return promotionName;
    }

    public void setPromotionName(String promotionName)
    {
        this.promotionName = promotionName;
    }

    public String getPromotionPic()
    {
        return promotionPic;
    }

    public void setPromotionPic(String promotionPic)
    {
        this.promotionPic = promotionPic;
    }

    public String getPromotionUrl()
    {
        return promotionUrl;
    }

    public void setPromotionUrl(String promotionUrl)
    {
        this.promotionUrl = promotionUrl;
    }
}
