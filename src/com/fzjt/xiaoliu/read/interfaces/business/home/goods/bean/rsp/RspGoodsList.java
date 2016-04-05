/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.rsp.RspGoodsList
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-7     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.rsp;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * RspGoodsList
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.rsp.RspGoodsList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-7 下午1:31:54
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspGoodsList
{
	@XmlElement(name = "info")
	private List<RspGoodsInfo> rspGoodsInfo = null;

	public List<RspGoodsInfo> getRspGoodsInfo()
	{
		return rspGoodsInfo;
	}

	public void setRspGoodsInfo(List<RspGoodsInfo> rspGoodsInfo)
	{
		this.rspGoodsInfo = rspGoodsInfo;
	}

}
