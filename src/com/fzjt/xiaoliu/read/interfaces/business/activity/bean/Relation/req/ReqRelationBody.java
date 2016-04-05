/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.activity.bean.Relation.req.ReqRelationBody
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

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.activity.bean.Relation.req.ReqRelationBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-14 下午1:45:09
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqRelationBody
{
    @XmlElement(name = "info")
    private ReqRelationInfo reqInfo;

    public ReqRelationInfo getReqInfo()
    {
        return reqInfo;
    }

    public void setReqInfo(ReqRelationInfo reqInfo)
    {
        this.reqInfo = reqInfo;
    }
}
