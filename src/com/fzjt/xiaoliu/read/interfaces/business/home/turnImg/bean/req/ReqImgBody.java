package com.fzjt.xiaoliu.read.interfaces.business.home.turnImg.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.turn.img.bean.req.ReqImgBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-6 下午2:04:15
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqImgBody
{
    @XmlElement(name = "info")
    private ReqImgInfo reqInfo;

    public ReqImgInfo getReqInfo()
    {
        return reqInfo;
    }

    public void setReqInfo(ReqImgInfo reqInfo)
    {
        this.reqInfo = reqInfo;
    }
}
