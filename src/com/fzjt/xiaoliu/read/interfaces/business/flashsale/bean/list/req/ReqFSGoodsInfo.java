package com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.list.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.list.req.ReqFSGoodsInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2016-1-7 下午3:43:16
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqFSGoodsInfo
{
    /**
     * 活动key
     */
    @XmlElement(name = "saleskey")
    private String salesKey;

    private String fromNum;

    private String toNum;

    public String getSalesKey()
    {
        return salesKey;
    }

    public void setSalesKey(String salesKey)
    {
        this.salesKey = salesKey;
    }

    public String getFromNum()
    {
        return fromNum;
    }

    public void setFromNum(String fromNum)
    {
        this.fromNum = fromNum;
    }

    public String getToNum()
    {
        return toNum;
    }

    public void setToNum(String toNum)
    {
        this.toNum = toNum;
    }

}
