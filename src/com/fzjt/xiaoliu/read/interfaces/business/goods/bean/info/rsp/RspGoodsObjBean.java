/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.rsp.RspGoodsBean
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
package com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * 商品信息bean
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.rsp.RspGoodsObjBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-3 下午3:26:08
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspGoodsObjBean extends RspBean
{
	@XmlElement(name="body")
	private RspGoodsObjBody rspGoodsBody;

	public RspGoodsObjBody getRspGoodsBody()
	{
		return rspGoodsBody;
	}

	public void setRspGoodsBody(RspGoodsObjBody rspGoodsBody)
	{
		this.rspGoodsBody = rspGoodsBody;
	}
	
}
