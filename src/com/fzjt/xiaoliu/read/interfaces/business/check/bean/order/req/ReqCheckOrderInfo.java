/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.bean.order.req.ReqCheckOrderInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-8     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.check.bean.order.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.bean.order.req.ReqCheckOrderInfo
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-12-23 下午4:32:10
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqCheckOrderInfo
{
    /**
     * 订单编号，逗号分隔
     */
    @XmlElement(name = "orderinfo")
    private String orderInfo = "";

    public String getOrderInfo()
    {
        return orderInfo;
    }

    public void setOrderInfo(String orderInfo)
    {
        this.orderInfo = orderInfo;
    }
}
