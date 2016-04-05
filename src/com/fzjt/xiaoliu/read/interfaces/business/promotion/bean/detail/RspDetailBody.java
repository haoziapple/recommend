/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.detail.RspDetailBody
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-9     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.detail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.detail.RspDetailBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-9 下午8:01:46
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspDetailBody
{
    @XmlElement(name = "info")
    private RspDetailInfo reqInfo;

    public RspDetailInfo getReqInfo()
    {
        return reqInfo;
    }

    public void setReqInfo(RspDetailInfo reqInfo)
    {
        this.reqInfo = reqInfo;
    }

}
