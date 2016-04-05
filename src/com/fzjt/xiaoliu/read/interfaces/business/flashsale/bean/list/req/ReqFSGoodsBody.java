package com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.list.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fzjt.xiaoliu.read.interfaces.util.PageBeanInfo;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.goods.req.ReqFSGoodsBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2016-1-7 上午9:34:15
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqFSGoodsBody extends PageBeanInfo
{
    @XmlElement(name = "info")
    private ReqFSGoodsInfo reqInfo;

    public ReqFSGoodsInfo getReqInfo()
    {
        return reqInfo;
    }

    public void setReqInfo(ReqFSGoodsInfo reqInfo)
    {
        this.reqInfo = reqInfo;
    }

}
