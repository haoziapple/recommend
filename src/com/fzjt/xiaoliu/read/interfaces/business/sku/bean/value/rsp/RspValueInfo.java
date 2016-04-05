/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.rsp.RspPropertyInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-13     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.value.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 查询特征值结果信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.value.rsp.RspValueInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午6:07:34
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspValueInfo
{
    @XmlTransient
    private int ID;

    /**
     * 特征值KEY
     */
    @XmlElement(name = "vkey")
    private String vKey;

    /**
     * 特征值
     */
    @XmlElement(name = "vname")
    private String vName;

    /**
     * 状态（0有效，1无效）
     */
    @XmlElement(name = "status")
    private String status;

    /**
     * 排序
     */
    @XmlElement(name = "orderflag")
    private String orderFlag;
       
    /**
     * 特征值对应图片
     */
    @XmlElement(name = "vpic")
    private String vPic;

    public int getID()
    {
        return ID;
    }

    public void setID(int iD)
    {
        ID = iD;
    }

    public String getvKey()
    {
        return vKey;
    }

    public void setvKey(String vKey)
    {
        this.vKey = vKey;
    }

    public String getvName()
    {
        return vName;
    }

    public void setvName(String vName)
    {
        this.vName = vName;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getOrderFlag()
    {
        return orderFlag;
    }

    public void setOrderFlag(String orderFlag)
    {
        this.orderFlag = orderFlag;
    }

    public String getvPic()
    {
        return vPic;
    }

    public void setvPic(String vPic)
    {
        this.vPic = vPic;
    }

}