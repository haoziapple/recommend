/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.req.ReqGoodsListBody
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-16      TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fzjt.xiaoliu.read.interfaces.util.PageBeanInfo;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.req.ReqGoodsListBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-16 下午4:39:09
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqGoodsListBody extends PageBeanInfo
{
    @XmlElement(name = "info")
    private ReqGoodsListInfo reqGoodsListInfo;

    public ReqGoodsListInfo getReqGoodsListInfo()
    {
        return reqGoodsListInfo;
    }

    public void setReqGoodsListInfo(ReqGoodsListInfo reqGoodsListInfo)
    {
        this.reqGoodsListInfo = reqGoodsListInfo;
    }

}
