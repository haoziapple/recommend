/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.rsp.RspPromotionBean
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
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.rsp.RspPromotionBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-9 上午10:53:33
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspPromotionBean extends RspBean
{
    @XmlElement(name = "body")
    private RspPromotionBody rspBody;

    public RspPromotionBody getRspBody()
    {
        return rspBody;
    }

    public void setRspBody(RspPromotionBody rspBody)
    {
        this.rspBody = rspBody;
    }
}
