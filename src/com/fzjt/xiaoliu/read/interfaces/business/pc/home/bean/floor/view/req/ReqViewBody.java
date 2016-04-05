/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.view.req.ReqViewBody
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-4     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.view.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.view.req.ReqViewBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-4 下午4:55:29
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqViewBody
{
    /**
     * 省
     */
    @XmlElement(name = "info")
    private ReqViewInfo reqInfo;

    public ReqViewInfo getReqInfo()
    {
        return reqInfo;
    }

    public void setReqInfo(ReqViewInfo reqInfo)
    {
        this.reqInfo = reqInfo;
    }
}
