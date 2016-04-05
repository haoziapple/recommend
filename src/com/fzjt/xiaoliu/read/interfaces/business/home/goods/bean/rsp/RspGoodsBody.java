/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.rsp.RspGoodsBody
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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fzjt.xiaoliu.read.interfaces.util.RspPageBean;

/**
 * RspGoodsBody
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.rsp.RspGoodsBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-7 下午1:31:45
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspGoodsBody extends RspPageBean
{
	@XmlElement(name = "list")
	private RspGoodsList rspGoodsList = null;

	public RspGoodsList getRspGoodsList()
	{
		return rspGoodsList;
	}

	public void setRspGoodsList(RspGoodsList rspGoodsList)
	{
		this.rspGoodsList = rspGoodsList;
	}

}
