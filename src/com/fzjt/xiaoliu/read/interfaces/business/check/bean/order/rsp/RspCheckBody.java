/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.bean.rsp.RspCheckOrderBody
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
package com.fzjt.xiaoliu.read.interfaces.business.check.bean.order.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fzjt.xiaoliu.read.interfaces.business.check.bean.RspCheckInfo;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.bean.order.rsp.RspCheckBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-24 下午2:31:55
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspCheckBody
{
    /**
     * 校验订单 返回list
     */
    @XmlElement(name = "info")
    private RspCheckInfo rspInfo = null;

    public RspCheckInfo getRspInfo()
    {
        return rspInfo;
    }

    public void setRspInfo(RspCheckInfo rspInfo)
    {
        this.rspInfo = rspInfo;
    }

}
