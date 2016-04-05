/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.module.bean.req.ReqmoduleBody
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-5     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.floor.module.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.module.bean.req.ReqmoduleBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-5 下午1:08:14
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqModuleBody
{
    @XmlElement(name = "info")
    private ReqModuleInfo reqModuleInfo;

    public ReqModuleInfo getReqModuleInfo()
    {
        return reqModuleInfo;
    }

    public void setReqModuleInfo(ReqModuleInfo reqModuleInfo)
    {
        this.reqModuleInfo = reqModuleInfo;
    }

}
