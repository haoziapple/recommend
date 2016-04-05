/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.shop.bean.info.req.ReqShopInfo
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
package com.fzjt.xiaoliu.read.interfaces.business.shop.bean.info.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 请求商户信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.shop.bean.info.req.ReqShopInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-18 下午2:32:42
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqShopInfo
{
    /**
     * 商家key
     */
    @XmlElement(name = "shopkey")
    private String shopKey = "";

    public String getShopKey()
    {
        return shopKey;
    }

    public void setShopKey(String shopKey)
    {
        this.shopKey = shopKey;
    }
}
