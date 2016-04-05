/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.rsp.RspHelpListBody
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
package com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.rsp.RspHelpListBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 下午9:15:50
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspHelpListBody
{

    @XmlElement(name = "list")
    private RspHelpList rspListInfo;

    public RspHelpList getRspListInfo()
    {
        return rspListInfo;
    }

    public void setRspListInfo(RspHelpList rspListInfo)
    {
        this.rspListInfo = rspListInfo;
    }

}
