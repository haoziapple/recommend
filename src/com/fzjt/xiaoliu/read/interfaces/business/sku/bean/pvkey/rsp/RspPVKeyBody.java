/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skupv.rsp.RspSkuPVBody
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-17     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvkey.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class RspPVKeyBody
{
	@XmlElement(name = "list")
	private RspPVKeyList rspPVKeyList;

	public RspPVKeyList getRspPVKeyList()
	{
		return rspPVKeyList;
	}

	public void setRspPVKeyList(RspPVKeyList rspPVKeyList)
	{
		this.rspPVKeyList = rspPVKeyList;
	}

}
