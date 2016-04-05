/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.list.req.ReqSkuListBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-4     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.list.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.list.req.ReqSkuListBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-4 下午8:09:03
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqSkuListBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqSkuListBody reqBody;

    public ReqSkuListBody getReqBody()
    {
        return reqBody;
    }

    public void setReqBody(ReqSkuListBody reqBody)
    {
        this.reqBody = reqBody;
    }
}
