/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.affix.req.ReqGoodsAffixBody
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-17     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.goods.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.goods.req.ReqGoodsAffixBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-17 下午12:22:19
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqGoodsAffixBody
{
    @XmlElement(name="info")
    private ReqGoodsAffixInfo reqGoodsAffixInfo;

    public ReqGoodsAffixInfo getReqGoodsAffixInfo()
    {
        return reqGoodsAffixInfo;
    }

    public void setReqGoodsAffixInfo(ReqGoodsAffixInfo reqGoodsAffixInfo)
    {
        this.reqGoodsAffixInfo = reqGoodsAffixInfo;
    }
}
