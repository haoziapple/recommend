package com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.list.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fzjt.xiaoliu.read.interfaces.util.RspPageBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.list.rsp.RspFSGoodsBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2016-1-7 上午10:19:32
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspFSGoodsBody  extends RspPageBean
{
    @XmlElement(name = "list")
    private RspFSGoodsList rspList;

    public RspFSGoodsList getRspList()
    {
        return rspList;
    }

    public void setRspList(RspFSGoodsList rspList)
    {
        this.rspList = rspList;
    }

}
