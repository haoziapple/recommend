/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.rsp.RspPromListBody
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
package com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.rsp.RspPromListBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-9 下午1:42:30
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspPromListBody
{
    @XmlElement(name = "list")
    private PacketInfoList rspInfo;

    public PacketInfoList getRspInfo()
    {
        return rspInfo;
    }

    public void setRspInfo(PacketInfoList rspInfo)
    {
        this.rspInfo = rspInfo;
    }

}
