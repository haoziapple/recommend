/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.req.ReqPromListInfo
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
package com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.req.ReqPromListInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-9 下午1:28:49
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqPromListInfo
{
    /**
     * 活动key
     */
    @XmlElement(name = "promotionkey")
    private String promotionKey;

    public String getPromotionKey()
    {
        return promotionKey;
    }

    public void setPromotionKey(String promotionKey)
    {
        this.promotionKey = promotionKey;
    }
}
