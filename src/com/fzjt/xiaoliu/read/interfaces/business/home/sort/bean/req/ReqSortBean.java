/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sort.bean.req.ReqSortBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-6     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.sort.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * sort请求体
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sort.bean.req.ReqSortBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-6 下午3:33:26
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqSortBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqSortBody reqSortBody;

    public ReqSortBody getReqSortBody()
    {
        return reqSortBody;
    }

    public void setReqSortBody(ReqSortBody reqSortBody)
    {
        this.reqSortBody = reqSortBody;
    }

}
