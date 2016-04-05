/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.req.ReqPromListBean
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
package com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.req.ReqPromListBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-9 下午1:31:54
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqPromListBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqPromListBody reqBody;

    public ReqPromListBody getReqBody()
    {
        return reqBody;
    }

    public void setReqBody(ReqPromListBody reqBody)
    {
        this.reqBody = reqBody;
    }

}
