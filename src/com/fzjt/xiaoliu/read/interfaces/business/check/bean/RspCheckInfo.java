/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.bean.rsp.RspCheckOrderInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-8     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.check.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 校验订单 返回信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.bean.rsp.RspCheckOrderInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-8 下午3:19:36
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspCheckInfo
{
    /**
     * 商品名称
     */
    @XmlElement(name = "goodsname")
    private String goodsName = "";

    /**
     * 校验信息
     */
    @XmlElement(name = "checkinfo")
    private String checkInfo = "";

    /**
     * 校验信息描述
     */
    @XmlElement(name = "checkdesc")
    private String checkDesc = "";

    public String getGoodsName()
    {
        return goodsName;
    }

    public void setGoodsName(String goodsName)
    {
        this.goodsName = goodsName;
    }

    public String getCheckInfo()
    {
        return checkInfo;
    }

    public void setCheckInfo(String checkInfo)
    {
        this.checkInfo = checkInfo;
    }

    public String getCheckDesc()
    {
        return checkDesc;
    }

    public void setCheckDesc(String checkDesc)
    {
        this.checkDesc = checkDesc;
    }

}
