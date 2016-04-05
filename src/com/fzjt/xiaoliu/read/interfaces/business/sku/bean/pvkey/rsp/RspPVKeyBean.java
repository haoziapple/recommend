/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skupv.rsp.RspSkuPVBean
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
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * 反应体
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvkey.rsp.RspPVKeyBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-17 上午9:46:58
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspPVKeyBean extends RspBean
{
	@XmlElement(name = "body")
	private RspPVKeyBody rspPVKeyBody;

	public RspPVKeyBody getRspPVKeyBody()
	{
		return rspPVKeyBody;
	}

	public void setRspPVKeyBody(RspPVKeyBody rspPVKeyBody)
	{
		this.rspPVKeyBody = rspPVKeyBody;
	}

}
