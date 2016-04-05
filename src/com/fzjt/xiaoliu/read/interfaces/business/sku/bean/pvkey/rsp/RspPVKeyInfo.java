/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skupv.rsp.RspSkuPVInfo
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

/**
 * 响应bean
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvkey.rsp.RspPVKeyInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-17 上午9:51:25
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspPVKeyInfo
{
	/**
	 * 特征量key
	 */
	@XmlElement(name="pkey")
	private String pKey;
	
	/**
	 * 特征量名
	 */
	@XmlElement(name="pname")
	private String pName;
	
	/**
	 * 特征值key
	 */
	@XmlElement(name="vkey")
	private String vKey;
	
	/**
	 * 特征值名
	 */
	@XmlElement(name="vname")
	private String vName;

	public String getpKey()
	{
		return pKey;
	}

	public void setpKey(String pKey)
	{
		this.pKey = pKey;
	}
	
	public String getpName()
	{
		return pName;
	}

	public void setpName(String pName)
	{
		this.pName = pName;
	}

	public String getvKey()
	{
		return vKey;
	}

	public void setvKey(String vKey)
	{
		this.vKey = vKey;
	}

	

	public String getvName()
	{
		return vName;
	}

	public void setvName(String vName)
	{
		this.vName = vName;
	}
	
	
	

}
