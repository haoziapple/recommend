/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.rsp.SkuInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-9     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.rsp.SkuInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-9 下午1:33:32
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class SkuInfo
{

	/**
	 * 活动组key
	 */
	@XmlElement(name = "packetkey")
	private String packetKey;

	/**
	 * 商品key
	 */
	@XmlElement(name = "goodskey")
	private String goodsKey;

	/**
	 * skukey
	 */
	@XmlElement(name = "skukey")
	private String skuKey;

	/**
	 * sku名称
	 */
	@XmlElement(name = "skuname")
	private String skuName;

	/**
	 * 图片
	 */
	@XmlElement(name = "picurl")
	private String picUrl;

	/**
	 * 原价
	 */
	@XmlElement(name = "priceold")
	private String priceOld;

	/**
	 * 现价
	 */
	@XmlElement(name = "pricenow")
	private String priceNow;

	/**
	 * 现价
	 */
	@XmlElement(name = "skutitle")
	private String skuTitle;

	public String getPacketKey()
	{
		return packetKey;
	}

	public void setPacketKey(String packetKey)
	{
		this.packetKey = packetKey;
	}

	public String getGoodsKey()
	{
		return goodsKey;
	}

	public void setGoodsKey(String goodsKey)
	{
		this.goodsKey = goodsKey;
	}

	public String getSkuKey()
	{
		return skuKey;
	}

	public void setSkuKey(String skuKey)
	{
		this.skuKey = skuKey;
	}

	public String getSkuName()
	{
		return skuName;
	}

	public void setSkuName(String skuName)
	{
		this.skuName = skuName;
	}

	public String getPicUrl()
	{
		return picUrl;
	}

	public void setPicUrl(String picUrl)
	{
		this.picUrl = picUrl;
	}

	public String getPriceOld()
	{
		return priceOld;
	}

	public void setPriceOld(String priceOld)
	{
		this.priceOld = priceOld;
	}

	public String getPriceNow()
	{
		return priceNow;
	}

	public void setPriceNow(String priceNow)
	{
		this.priceNow = priceNow;
	}

	public String getSkuTitle()
	{
		return skuTitle;
	}

	public void setSkuTitle(String skuTitle)
	{
		this.skuTitle = skuTitle;
	}

}
