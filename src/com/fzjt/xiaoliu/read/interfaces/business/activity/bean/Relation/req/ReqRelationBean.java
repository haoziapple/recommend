/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.activity.bean.Relation.req.ReqRelationBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-14     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.activity.bean.Relation.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.activity.bean.Relation.req.ReqRelationBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-14 下午1:46:28
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqRelationBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqRelationBody reqBody;

    public ReqRelationBody getReqBody()
    {
        return reqBody;
    }

    public void setReqBody(ReqRelationBody reqBody)
    {
        this.reqBody = reqBody;
    }
}
