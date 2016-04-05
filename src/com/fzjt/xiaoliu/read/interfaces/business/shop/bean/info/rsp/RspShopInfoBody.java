/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.shop.bean.info.rsp.RspShopInfoBody
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
 * @className:com.fzjt.xiaoliu.read.interfaces.business.shop.bean.info.rsp.RspShopInfoBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-18 下午3:01:50
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspShopInfoBody
{
    @XmlElement(name = "info")
    private RspShopInfo rspShopInfo;

    public RspShopInfo getRspShopInfo()
    {
        return rspShopInfo;
    }

    public void setRspShopInfo(RspShopInfo rspShopInfo)
    {
        this.rspShopInfo = rspShopInfo;
    }

}
