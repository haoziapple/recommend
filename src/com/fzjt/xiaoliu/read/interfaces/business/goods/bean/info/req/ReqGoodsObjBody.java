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
package com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
/**
 * 商品goodskey
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.req.ReqGoodsObjBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-3 下午3:26:48
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqGoodsObjBody
{
	@XmlElement(name="info")
	private GoodsKeyInfo goodsKeyInfo;

	public GoodsKeyInfo getGoodsKeyInfo()
	{
		return goodsKeyInfo;
	}

	public void setGoodsKeyInfo(GoodsKeyInfo goodsKeyInfo)
	{
		this.goodsKeyInfo = goodsKeyInfo;
	}
	
}
