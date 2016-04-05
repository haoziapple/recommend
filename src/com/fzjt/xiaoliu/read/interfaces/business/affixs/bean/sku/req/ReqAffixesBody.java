/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.req.ReqAffixesBody
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
package com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.req.ReqAffixesBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-17 上午10:56:31
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqAffixesBody
{
    @XmlElement(name = "info")
    private ReqAffixesInfo reqAffixesInfo;

    public ReqAffixesInfo getReqAffixesInfo()
    {
        return reqAffixesInfo;
    }

    public void setReqAffixesInfo(ReqAffixesInfo reqAffixesInfo)
    {
        this.reqAffixesInfo = reqAffixesInfo;
    }

}
