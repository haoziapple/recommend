/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.req.ReqGoodsBody
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-3     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuVal.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuVal.req.ReqSkuValBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午9:21:28
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqSkuValBody
{
    @XmlElement(name = "info")
    private ReqSkuValInfo reqSkuValInfo;

    public ReqSkuValInfo getReqSkuValInfo()
    {
        return reqSkuValInfo;
    }

    public void setReqSkuValInfo(ReqSkuValInfo reqSkuValInfo)
    {
        this.reqSkuValInfo = reqSkuValInfo;
    }

}
