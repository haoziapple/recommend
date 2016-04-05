/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.shop.bean.info.req.ReqShopInfoBean
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
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.shop.bean.info.req.ReqShopInfoBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-18 下午2:37:59
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqShopInfoBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqShopInfoBody reqShopInfoBody;

    public ReqShopInfoBody getReqShopInfoBody()
    {
        return reqShopInfoBody;
    }

    public void setReqShopInfoBody(ReqShopInfoBody reqShopInfoBody)
    {
        this.reqShopInfoBody = reqShopInfoBody;
    }

}
