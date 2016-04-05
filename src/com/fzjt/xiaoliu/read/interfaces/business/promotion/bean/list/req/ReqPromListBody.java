/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.req.ReqPromListBody
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
package com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.req.ReqPromListBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-9 下午3:38:14
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqPromListBody
{
    @XmlElement(name = "info")
    private ReqPromListInfo reqInfo;

    public ReqPromListInfo getReqInfo()
    {
        return reqInfo;
    }

    public void setReqInfo(ReqPromListInfo reqInfo)
    {
        this.reqInfo = reqInfo;
    }

}
