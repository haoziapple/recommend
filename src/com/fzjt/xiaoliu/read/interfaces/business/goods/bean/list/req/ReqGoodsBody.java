/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.req.ReqGoodsBody
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiChangjiang
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-10-30     LiChangjiang       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.bean.list.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fzjt.xiaoliu.read.interfaces.util.PageBeanInfo;

/**
 * ReqGoodsBody
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.req.ReqGoodsBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-10-30 下午3:35:52
 * @author:LiChangjiang
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqGoodsBody extends PageBeanInfo
{
    @XmlElement(name = "info")
    private ReqGoodsInfo reqGoodsInfo;

    public ReqGoodsInfo getReqGoodsInfo()
    {
        return reqGoodsInfo;
    }

    public void setReqGoodsInfo(ReqGoodsInfo reqGoodsInfo)
    {
        this.reqGoodsInfo = reqGoodsInfo;
    }

}
