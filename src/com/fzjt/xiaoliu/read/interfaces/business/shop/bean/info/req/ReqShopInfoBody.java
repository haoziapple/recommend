package com.fzjt.xiaoliu.read.interfaces.business.shop.bean.info.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.shop.bean.info.req.ReqShopInfoBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-18 下午2:36:09
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqShopInfoBody
{
    @XmlElement(name = "info")
    private ReqShopInfo reqShopInfo;

    public ReqShopInfo getReqShopInfo()
    {
        return reqShopInfo;
    }

    public void setReqShopInfo(ReqShopInfo reqShopInfo)
    {
        this.reqShopInfo = reqShopInfo;
    }
}
