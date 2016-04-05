/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.req.ReqRecommendBean
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
package com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.req.ReqRecommendBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-19 上午10:43:59
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqRecommendBean extends ReqBean
{
    /**
     * 请求体
     */
    @XmlElement(name = "body")
    private ReqRecommendBody reqBody = null;

    public ReqRecommendBody getReqBody()
    {
        return reqBody;
    }

    public void setReqBody(ReqRecommendBody reqBody)
    {
        this.reqBody = reqBody;
    }

}
