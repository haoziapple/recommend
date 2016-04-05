/**
 * Copyright (C) 2016 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.req.ReqFlashSaleBody
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2016-1-6     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.req.ReqFlashSaleBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2016-1-6 下午8:11:08
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqFlashSaleBody
{
    @XmlElement(name = "info")
    private ReqFlashSaleInfo reqInfo;

    public ReqFlashSaleInfo getReqInfo()
    {
        return reqInfo;
    }

    public void setReqInfo(ReqFlashSaleInfo reqInfo)
    {
        this.reqInfo = reqInfo;
    }

}
