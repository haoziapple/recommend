/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.req.ReqMsgInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-13     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.list.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 请求bean
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.list.req.ReqMsgInfo
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015年11月24日 上午9:39:31
 * @author:LiChangjiang
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqMsgInfo
{
	/**
	 * 商品key
	 */
	@XmlElement(name = "goodskey")
	private String goodsKey;
	
	/**
	 * 起始条数
	 */
	@XmlElement(name="fromnum")
	private String fromNum;
	
	/**
	 * 截止条数
	 */
	@XmlElement(name="tonum")
	private String toNum;

	public String getGoodsKey()
	{
		return goodsKey;
	}

	public void setGoodsKey(String goodsKey)
	{
		this.goodsKey = goodsKey;
	}

	public String getFromNum()
	{
		return fromNum;
	}

	public void setFromNum(String fromNum)
	{
		this.fromNum = fromNum;
	}

	public String getToNum()
	{
		return toNum;
	}

	public void setToNum(String toNum)
	{
		this.toNum = toNum;
	}
	
	

}
