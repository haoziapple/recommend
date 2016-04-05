/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.req.ReqRecommendBody
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

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.req.ReqRecommendBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-19 上午10:42:35
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqRecommendBody
{
    @XmlElement(name = "info")
    private ReqRecommendInfo info = null;

    public ReqRecommendInfo getInfo()
    {
        return info;
    }

    public void setInfo(ReqRecommendInfo info)
    {
        this.info = info;
    }

}