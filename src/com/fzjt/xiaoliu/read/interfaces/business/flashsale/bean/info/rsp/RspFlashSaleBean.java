/**
 * Copyright (C) 2016 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.rsp.RspFlashSaleBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2016-1-6     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.rsp.RspFlashSaleBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2016-1-6 下午8:14:10
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspFlashSaleBean extends RspBean
{
    @XmlElement(name = "body")
    private RspFlashSaleBody rspBody;

    public RspFlashSaleBody getRspBody()
    {
        return rspBody;
    }

    public void setRspBody(RspFlashSaleBody rspBody)
    {
        this.rspBody = rspBody;
    }
}
