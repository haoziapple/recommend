/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.req.ReqPromotionBody
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
package com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.req.ReqPromotionBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-9 上午10:35:33
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqPromotionBody
{
    @XmlElement(name = "info")
    private ReqPromotionInfo reqInfo;

    public ReqPromotionInfo getReqInfo()
    {
        return reqInfo;
    }

    public void setReqInfo(ReqPromotionInfo reqInfo)
    {
        this.reqInfo = reqInfo;
    }

}
