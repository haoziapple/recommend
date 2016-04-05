/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.rsp.RspAffixesBody
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-14     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.rsp.RspAffixesBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-17 上午10:57:58
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspAffixesBody
{
    @XmlElement(name = "list")
    private RspAffixesList rspAffixesList;

    public RspAffixesList getRspAffixesList()
    {
        return rspAffixesList;
    }

    public void setRspAffixesList(RspAffixesList rspAffixesList)
    {
        this.rspAffixesList = rspAffixesList;
    }

}
