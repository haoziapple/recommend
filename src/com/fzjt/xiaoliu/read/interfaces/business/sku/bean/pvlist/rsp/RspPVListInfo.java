/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.rsp.RspPVListInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-14     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.rsp.RspPVListInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-14 下午2:14:04
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspPVListInfo
{
    /**
     * 特征量KEY
     */
    @XmlElement(name = "pkey")
    private String pKey;

    /**
     * 特征量名称
     */
    @XmlElement(name = "pname")
    private String pName;

    /**
     * 特征值list
     */
    @XmlElement(name = "vlist")
    private RspVListList rspVListList;

    public String getpKey()
    {
        return pKey;
    }

    public void setpKey(String pKey)
    {
        this.pKey = pKey;
    }

    public String getpName()
    {
        return pName;
    }

    public void setpName(String pName)
    {
        this.pName = pName;
    }

    public RspVListList getRspVListList()
    {
        return rspVListList;
    }

    public void setRspVListList(RspVListList rspVListList)
    {
        this.rspVListList = rspVListList;
    }

}
