/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skupv.req.ReqSkuPVInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-17     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvkey.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
/**
 * 请求bean
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvkey.req.ReqPVKeyInfo
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-17 上午9:44:48
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqPVKeyInfo
{
	/**
	 * sku_key
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
