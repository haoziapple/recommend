package com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.list.rsp;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.list.rsp.RspFSGoodsList
 * @description:TODO
 * @version:v1.0.0
 * @date:2016-1-7 上午10:17:54
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspFSGoodsList
{
    @XmlElement(name = "info")
    private List<RspFSGoodsInfo> goodsList;

    public List<RspFSGoodsInfo> getGoodsList()
    {
        return goodsList;
    }

    public void setGoodsList(List<RspFSGoodsInfo> goodsList)
    {
        this.goodsList = goodsList;
    }

}
