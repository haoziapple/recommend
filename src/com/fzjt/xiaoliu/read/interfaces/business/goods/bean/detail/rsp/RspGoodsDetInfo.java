/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.describe.rsp.RspGoodsDesInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-9     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.bean.detail.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
/**
 * 商品详情bean
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.detail.rsp.RspGoodsDetInfo
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-9 下午3:12:21
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspGoodsDetInfo
{
	@XmlElement(name="goodsdetail")
	private String goodsDetail;

	public String getGoodsDetail()
	{
		return goodsDetail;
	}

	public void setGoodsDetail(String goodsDetail)
	{
		this.goodsDetail = goodsDetail;
	}
	
	

}
