/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.req.ReqCollectBody
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

import com.fzjt.xiaoliu.read.interfaces.util.PageBeanInfo;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.req.ReqCollectBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-18 上午10:32:33
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqCollectBody extends PageBeanInfo
{
    @XmlElement(name = "info")
    private ReqCollectInfo reqCollectInfo;

    public ReqCollectInfo getReqCollectInfo()
    {
        return reqCollectInfo;
    }

    public void setReqCollectInfo(ReqCollectInfo reqCollectInfo)
    {
        this.reqCollectInfo = reqCollectInfo;
    }
}
