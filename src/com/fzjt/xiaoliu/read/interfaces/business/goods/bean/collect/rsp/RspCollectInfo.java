/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.rsp.RspCollectInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-18     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 返回收藏列表信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.rsp.RspCollectInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-18 上午10:41:14
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspCollectInfo
{
	/**
	 * 商品key
	 */
	@XmlElement(name = "goodskey")
	private String goodsKey = "";

	/**
	 * 商品图片
	 */
	@XmlElement(name = "goodspic")
	private String goodsPic = "";

	/**
	 * 商品名称
	 */
	@XmlElement(name = "goodsname")
	private String goodsName = "";

	/**
	 * 商品原价（市场价）
	 */
	@XmlElement(name = "priceold")
	private String priceOld = "";

	/**
	 * 商品现价
	 */
	@XmlElement(name = "pricenow")
	private String priceNow = "";

	/**
	 * 促销标题
	 */
	@XmlElement(name = "saletitle")
	private String saleTitle = "";

	/**
	 * 上下架信息
	 */
	@XmlElement(name = "onsale")
	private String onSale = "";
	
	/**
	 * 商品状态
	 */
	@XmlElement(name = "status")
	private String status = "";

	@XmlTransient
	private String indexNum = "";

	public String getGoodsKey()
	{
		return goodsKey;
	}

	public void setGoodsKey(String goodsKey)
	{
		this.goodsKey = goodsKey;
	}

	public String getGoodsPic()
	{
		return goodsPic;
	}

	public void setGoodsPic(String goodsPic)
	{
		this.goodsPic = goodsPic;
	}

	public String getGoodsName()
	{
		return goodsName;
	}

	public void setGoodsName(String goodsName)
	{
		this.goodsName = goodsName;
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

	public String getSaleTitle()
	{
		return saleTitle;
	}

	public void setSaleTitle(String saleTitle)
	{
		this.saleTitle = saleTitle;
	}

	public String getIndexNum()
	{
		return indexNum;
	}

	public void setIndexNum(String indexNum)
	{
		this.indexNum = indexNum;
	}

	public String getOnSale()
	{
		return onSale;
	}

	public void setOnSale(String onSale)
	{
		this.onSale = onSale;
	}
	
	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}
}
