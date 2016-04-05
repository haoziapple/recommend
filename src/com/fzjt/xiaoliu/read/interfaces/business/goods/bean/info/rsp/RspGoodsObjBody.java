/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.rsp.RspGoodsBody
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


/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.rsp.RspGoodsObjBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-3 下午3:25:54
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspGoodsObjBody
{
	@XmlElement(name="info")
	private RspGoodsObjInfo rspGoodsInfo;

	public RspGoodsObjInfo getRspGoodsInfo()
	{
		return rspGoodsInfo;
	}

	public void setRspGoodsInfo(RspGoodsObjInfo rspGoodsInfo)
	{
		this.rspGoodsInfo = rspGoodsInfo;
	}
	
}
