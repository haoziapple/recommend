/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.req.ReqPromotionBean
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
package com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.req.ReqPromotionBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-9 上午10:36:50
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqPromotionBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqPromotionBody reqBody;

    public ReqPromotionBody getReqBody()
    {
        return reqBody;
    }

    public void setReqBody(ReqPromotionBody reqBody)
    {
        this.reqBody = reqBody;
    }
}
