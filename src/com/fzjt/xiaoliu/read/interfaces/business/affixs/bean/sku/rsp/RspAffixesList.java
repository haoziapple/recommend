/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.rsp.RspAffixesList
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

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.rsp.RspAffixesList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-17 上午10:57:43
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspAffixesList
{
    @XmlElement(name = "info")
    private List<RspAffixesInfo> rspAffixesInfo;

    public List<RspAffixesInfo> getRspAffixesInfo()
    {
        return rspAffixesInfo;
    }

    public void setRspAffixesInfo(List<RspAffixesInfo> rspAffixesInfo)
    {
        this.rspAffixesInfo = rspAffixesInfo;
    }

}
