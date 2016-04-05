/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.req.ReqHelpListBody
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-2     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.req.ReqHelpListBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 下午8:28:37
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqHelpListBody
{
    @XmlElement(name = "info")
    private ReqHelpListInfo reqInfo;

    public ReqHelpListInfo getReqInfo()
    {
        return reqInfo;
    }

    public void setReqInfo(ReqHelpListInfo reqInfo)
    {
        this.reqInfo = reqInfo;
    }
}
