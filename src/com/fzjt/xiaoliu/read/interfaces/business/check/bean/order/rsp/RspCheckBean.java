/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.bean.rsp.RspCheckOrderBean
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
package com.fzjt.xiaoliu.read.interfaces.business.check.bean.order.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * 校验订单 返回Bean
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.bean.order.rsp.RspCheckBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-24 下午2:32:06
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspCheckBean extends RspBean
{
    /**
     * 校验订单 返回body
     */
    @XmlElement(name = "body")
    private RspCheckBody body;

    public RspCheckBody getBody()
    {
        return body;
    }

    public void setBody(RspCheckBody body)
    {
        this.body = body;
    }

}
