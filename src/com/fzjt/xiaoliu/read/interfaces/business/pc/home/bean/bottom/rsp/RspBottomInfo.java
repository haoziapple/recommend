/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.bottom.rsp.RspBottomInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-2     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.bottom.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * pc查询底部按钮响应bean
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.bottom.rsp.RspBottomInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 下午3:18:35
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspBottomInfo
{
	/**
	 * 宣传语key
	 */
	@XmlElement(name = "slokey")
	private String sloKey;

	/**
	 * 宣传语名称
	 */
	@XmlElement(name = "sloname")
	private String sloName;

	/**
	 * 图标
	 */
	@XmlElement(name = "slologo")
	private String sloLogo;

	/**
	 * 描述
	 */
	@XmlElement(name = "slodesc")
	private String sloDesc;

	public String getSloKey()
	{
		return sloKey;
	}

	public void setSloKey(String sloKey)
	{
		this.sloKey = sloKey;
	}

	public String getSloName()
	{
		return sloName;
	}

	public void setSloName(String sloName)
	{
		this.sloName = sloName;
	}

	public String getSloLogo()
	{
		return sloLogo;
	}

	public void setSloLogo(String sloLogo)
	{
		this.sloLogo = sloLogo;
	}

	public String getSloDesc()
	{
		return sloDesc;
	}

	public void setSloDesc(String sloDesc)
	{
		this.sloDesc = sloDesc;
	}

}
