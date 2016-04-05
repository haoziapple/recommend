/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.req.ReqPropertyBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-13     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.req.ReqPVListBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-14 下午3:00:55
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqPVListBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqPVListBody reqPVListBody;

    public ReqPVListBody getReqPVListBody()
    {
        return reqPVListBody;
    }

    public void setReqPVListBody(ReqPVListBody reqPVListBody)
    {
        this.reqPVListBody = reqPVListBody;
    }
}