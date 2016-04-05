/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.detail.rsp.RspGoodsDetBody
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
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.detail.rsp.RspGoodsDetBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-9 下午3:01:07
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspGoodsDetBody
{
	@XmlElement(name = "info")
	private RspGoodsDetInfo rspGoodsDetInfo;

	public RspGoodsDetInfo getRspGoodsDetInfo()
	{
		return rspGoodsDetInfo;
	}

	public void setRspGoodsDetInfo(RspGoodsDetInfo rspGoodsDetInfo)
	{
		this.rspGoodsDetInfo = rspGoodsDetInfo;
	}

}
