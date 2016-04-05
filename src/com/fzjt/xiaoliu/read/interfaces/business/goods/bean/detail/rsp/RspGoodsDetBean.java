/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.detail.rsp.RspGoodsDetBean
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
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;
/**
 * 商品详情响应体
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.detail.rsp.RspGoodsDetBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-9 下午3:03:59
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspGoodsDetBean extends RspBean
{
	@XmlElement(name="body")
	private RspGoodsDetBody rspGoodsDetBody;

	public RspGoodsDetBody getRspGoodsDetBody()
	{
		return rspGoodsDetBody;
	}

	public void setRspGoodsDetBody(RspGoodsDetBody rspGoodsDetBody)
	{
		this.rspGoodsDetBody = rspGoodsDetBody;
	}
	
	

}
