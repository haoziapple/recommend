/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.rsp.RspRecommendBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-19     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.rsp.RspRecommendBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-19 上午10:53:23
 * @author:TangKai //
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspRecommendBean extends RspBean
{
    @XmlElement(name = "body")
    private RspRecommendBody rspBody = null;

    public RspRecommendBody getRspBody()
    {
        return rspBody;
    }

    public void setRspBody(RspRecommendBody rspBody)
    {
        this.rspBody = rspBody;
    }

}