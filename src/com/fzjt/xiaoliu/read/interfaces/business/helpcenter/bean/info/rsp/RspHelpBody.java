/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.info.rsp.RspHelpBody
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
package com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.info.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.info.rsp.RspHelpBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 下午8:20:46
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspHelpBody
{
    @XmlElement(name = "info")
    private RspHelpInfo rspInfo;

    public RspHelpInfo getRspInfo()
    {
        return rspInfo;
    }

    public void setRspInfo(RspHelpInfo rspInfo)
    {
        this.rspInfo = rspInfo;
    }

}
