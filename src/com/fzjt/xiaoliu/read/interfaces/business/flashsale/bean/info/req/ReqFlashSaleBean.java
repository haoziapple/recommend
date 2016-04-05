/**
 * Copyright (C) 2016 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.req.ReqFlashSaleBean
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
package com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.req.ReqFlashSaleBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2016-1-6 下午8:13:13
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqFlashSaleBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqFlashSaleBody reqBody;

    public ReqFlashSaleBody getReqBody()
    {
        return reqBody;
    }

    public void setReqBody(ReqFlashSaleBody reqBody)
    {
        this.reqBody = reqBody;
    }

}
