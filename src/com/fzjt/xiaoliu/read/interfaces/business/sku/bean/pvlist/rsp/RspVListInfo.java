/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.rsp.RspVListInfo
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
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.rsp.RspVListInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-14 下午2:14:04
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspVListInfo
{
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

}
