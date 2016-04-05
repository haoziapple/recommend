package com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.list.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.goods.req.ReqFSGoodsBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2016-1-7 上午9:34:10
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqFSGoodsBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqFSGoodsBody reqBody;

    public ReqFSGoodsBody getReqBody()
    {
        return reqBody;
    }

    public void setReqBody(ReqFSGoodsBody reqBody)
    {
        this.reqBody = reqBody;
    }

}
