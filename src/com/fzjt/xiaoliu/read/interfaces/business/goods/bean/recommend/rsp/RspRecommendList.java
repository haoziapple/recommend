/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.rsp.RspRecommendList
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

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.rsp.RspRecommendList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-19 上午10:54:03
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspRecommendList
{
    @XmlElement(name = "info")
    List<RspRecommendInfo> info = null;

    public List<RspRecommendInfo> getInfo()
    {
        return info;
    }

    public void setInfo(List<RspRecommendInfo> info)
    {
        this.info = info;
    }

}
