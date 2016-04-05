/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.req.ReqCollectBean
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
package com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.req.ReqCollectBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-18 上午10:33:57
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqCollectBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqCollectBody reqCollectBody;

    public ReqCollectBody getReqCollectBody()
    {
        return reqCollectBody;
    }

    public void setReqCollectBody(ReqCollectBody reqCollectBody)
    {
        this.reqCollectBody = reqCollectBody;
    }
}
