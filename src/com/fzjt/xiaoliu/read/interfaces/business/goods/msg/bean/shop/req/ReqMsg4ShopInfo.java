/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.req.ReqMsg4ShopInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiChangjiang
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015年11月24日     LiChangjiang       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.req.ReqMsg4ShopInfo
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015年11月24日 上午10:38:03
 * @author:LiChangjiang
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqMsg4ShopInfo
{
	/**
	 * 商家key
	 */
	@XmlElement(name = "shopkey")
	private String shopKey = "";

	/**
	 * 回复状态（0全部，1已回复，2未回复）
	 */
	@XmlElement(name = "replytype")
	private String replyType = "";

	/**
	 * 商品key
	 */
	@XmlElement(name = "goodskey")
	private String goodsKey = "";

	/**
	 * 起始条数
	 */
	@XmlAttribute
	private String fromNum;

	/**
	 * 截止条数
	 */
	@XmlAttribute
	private String toNum;

	/**
	 * @return the shopKey
	 */
	public String getShopKey()
	{
		return shopKey;
	}

	/**
	 * @param shopKey
	 *            the shopKey to set
	 */
	public void setShopKey(String shopKey)
	{
		this.shopKey = shopKey;
	}

	/**
	 * @return the replyType
	 */
	public String getReplyType()
	{
		return replyType;
	}

	/**
	 * @param replyType
	 *            the replyType to set
	 */
	public void setReplyType(String replyType)
	{
		this.replyType = replyType;
	}

	/**
	 * @return the goodsKey
	 */
	public String getGoodsKey()
	{
		return goodsKey;
	}

	/**
	 * @param goodsKey
	 *            the goodsKey to set
	 */
	public void setGoodsKey(String goodsKey)
	{
		this.goodsKey = goodsKey;
	}

	/**
	 * @return the fromNum
	 */
	public String getFromNum()
	{
		return fromNum;
	}

	/**
	 * @param fromNum
	 *            the fromNum to set
	 */
	public void setFromNum(String fromNum)
	{
		this.fromNum = fromNum;
	}

	/**
	 * @return the toNum
	 */
	public String getToNum()
	{
		return toNum;
	}

	/**
	 * @param toNum
	 *            the toNum to set
	 */
	public void setToNum(String toNum)
	{
		this.toNum = toNum;
	}

}
