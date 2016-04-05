/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.rsp.PacketInfoList
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

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.rsp.PacketInfoList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-9 下午1:40:24
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class PacketInfoList
{
    @XmlElement(name = "info")
    private List<PacketInfo> packetList;

    public List<PacketInfo> getPacketList()
    {
        return packetList;
    }

    public void setPacketList(List<PacketInfo> packetList)
    {
        this.packetList = packetList;
    }

}
