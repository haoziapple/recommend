package com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.list.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.list.rsp.RspFSGoodsBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2016-1-7 上午10:20:18
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspFSGoodsBean extends RspBean
{
    @XmlElement(name = "body")
    private RspFSGoodsBody rspBody;

    public RspFSGoodsBody getRspBody()
    {
        return rspBody;
    }

    public void setRspBody(RspFSGoodsBody rspBody)
    {
        this.rspBody = rspBody;
    }

}
