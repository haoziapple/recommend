/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.affix.req.ReqGoodsAffixBean
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
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.affix.req.ReqGoodsAffixBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-17 上午10:30:38
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqGoodsAffixBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqGoodsAffixBody reqGoodsAffixBody;

    public ReqGoodsAffixBody getReqGoodsAffixBody()
    {
        return reqGoodsAffixBody;
    }

    public void setReqGoodsAffixBody(ReqGoodsAffixBody reqGoodsAffixBody)
    {
        this.reqGoodsAffixBody = reqGoodsAffixBody;
    }
}
