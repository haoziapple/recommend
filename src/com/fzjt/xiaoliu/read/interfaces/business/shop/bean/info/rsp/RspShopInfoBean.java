/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.shop.bean.info.rsp.RspShopInfoBean
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
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.shop.bean.info.rsp.RspShopInfoBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-18 下午3:04:45
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspShopInfoBean extends RspBean
{
    @XmlElement(name = "body")
    private RspShopInfoBody rspShopInfoBody;

    public RspShopInfoBody getRspShopInfoBody()
    {
        return rspShopInfoBody;
    }

    public void setRspShopInfoBody(RspShopInfoBody rspShopInfoBody)
    {
        this.rspShopInfoBody = rspShopInfoBody;
    }

}
