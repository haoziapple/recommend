/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skupv.rsp.RspSkuPVList
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

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvkey.rsp.RspPVKeyList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-17 上午9:50:10
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspPVKeyList
{
	@XmlElement(name = "info")
	private List<RspPVKeyInfo> rspPVKeyInfo;

	public List<RspPVKeyInfo> getRspPVKeyInfo()
	{
		return rspPVKeyInfo;
	}

	public void setRspPVKeyInfo(List<RspPVKeyInfo> rspPVKeyInfo)
	{
		this.rspPVKeyInfo = rspPVKeyInfo;
	}

}
