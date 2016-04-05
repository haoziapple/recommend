/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.rsp.PacketInfo
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
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.rsp.PacketInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-9 下午1:38:44
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class PacketInfo
{
    /**
     * 活动组key
     */
    @XmlElement(name = "packetkey")
    private String packetKey;

    /**
     * 活动组名称
     */
    @XmlElement(name = "packetname")
    private String packetName;

    /**
     * 商品信息list
     */
    @XmlElement(name = "skulist")
    private List<SkuInfo> goodsList;

    public String getPacketKey()
    {
        return packetKey;
    }

    public void setPacketKey(String packetKey)
    {
        this.packetKey = packetKey;
    }

    public String getPacketName()
    {
        return packetName;
    }

    public void setPacketName(String packetName)
    {
        this.packetName = packetName;
    }

    public List<SkuInfo> getGoodsList()
    {
        return goodsList;
    }

    public void setGoodsList(List<SkuInfo> goodsList)
    {
        this.goodsList = goodsList;
    }
}
