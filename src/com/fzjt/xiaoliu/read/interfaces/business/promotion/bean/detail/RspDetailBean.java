/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.detail.RspDetailBean
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
package com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.detail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.detail.RspDetailBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-9 下午8:03:13
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspDetailBean extends RspBean
{
    @XmlElement(name = "body")
    private RspDetailBody rspBody;

    public RspDetailBody getRspBody()
    {
        return rspBody;
    }

    public void setRspBody(RspDetailBody rspBody)
    {
        this.rspBody = rspBody;
    }
}
