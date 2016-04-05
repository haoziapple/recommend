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
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuInfo.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.goodssku.bean.rsp.RspGoodsSkuBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-11 下午12:57:52
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspGoodsSkuBody
{
	@XmlElement(name="info")
	private RspGoodsSkuInfo rspGoodsSkuInfo;

    public RspGoodsSkuInfo getRspGoodsSkuInfo() {
        return rspGoodsSkuInfo;
    }

    public void setRspGoodsSkuInfo(RspGoodsSkuInfo rspGoodsSkuInfo) {
        this.rspGoodsSkuInfo = rspGoodsSkuInfo;
    }


}
