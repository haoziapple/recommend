/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.rsp.RspRecommendBody
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

import com.fzjt.xiaoliu.read.interfaces.util.RspPageBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.rsp.RspRecommendBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-19 上午10:53:53
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspRecommendBody extends RspPageBean
{
    @XmlElement(name = "list")
    private RspRecommendList rspList = null;

    public RspRecommendList getRspList()
    {
        return rspList;
    }

    public void setRspList(RspRecommendList rspList)
    {
        this.rspList = rspList;
    }

}
