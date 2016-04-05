/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.rsp.RspGoodsBody
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
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuVal.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuVal.rsp.RspSkuValBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午9:26:07
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspSkuValBody
{
    @XmlElement(name = "info")
    private RspSkuValInfo rspSkuValInfo;

    public RspSkuValInfo getRspSkuValInfo()
    {
        return rspSkuValInfo;
    }

    public void setRspSkuValInfo(RspSkuValInfo rspSkuValInfo)
    {
        this.rspSkuValInfo = rspSkuValInfo;
    }

}
