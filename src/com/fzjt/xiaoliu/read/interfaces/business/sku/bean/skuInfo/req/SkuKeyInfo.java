/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.req.GoodsKeyInfo
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
 * 业务bean，skuKey
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.goodssku.bean.req.SkuKeyInfo
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-11 上午11:10:08
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class SkuKeyInfo
{
	/**
	 * skuKey
	 */
	@XmlElement(name="skukey")
	private String skuKey;

	public String getSkuKey()
	{
		return skuKey;
	}

	public void setSkuKey(String skuKey)
	{
		this.skuKey = skuKey;
	}
	
}
