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
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuInfo.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
/**
 * 商品skukey
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.goodssku.bean.req.ReqGoodsSkuBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-11 上午11:12:18
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqGoodsSkuBody
{
	@XmlElement(name="info")
	private SkuKeyInfo skuKeyInfo;

	public SkuKeyInfo getSkuKeyInfo()
	{
		return skuKeyInfo;
	}

	public void setSkuKeyInfo(SkuKeyInfo skuKeyInfo)
	{
		this.skuKeyInfo = skuKeyInfo;
	}
	
}
