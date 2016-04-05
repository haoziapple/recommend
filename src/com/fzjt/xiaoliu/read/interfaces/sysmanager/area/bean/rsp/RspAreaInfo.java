/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.rsp.RspAreaInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-12     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 响应bean
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.rsp.RspAreaInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-12 下午6:03:40
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspAreaInfo
{
	/**
	 * 区域id  
	 */
	@XmlElement(name = "areacode")
	private int areaCode;

	/**
	 * 区域名称
	 */
	@XmlElement(name = "areaname")
	private String areaName = "";

	/**
	 * 上级区域id
	 */
	@XmlElement(name = "superareacode")
	private int superAreaCode;

	/**
	 * 有效状态,0有效，1无效
	 */
	@XmlElement(name = "status")
	private String status = "";

	public int getAreaCode()
	{
		return areaCode;
	}

	public void setAreaCode(int areaCode)
	{
		this.areaCode = areaCode;
	}

	public String getAreaName()
	{
		return areaName;
	}

	public void setAreaName(String areaName)
	{
		this.areaName = areaName;
	}

	public int getSuperAreaCode()
	{
		return superAreaCode;
	}

	public void setSuperAreaCode(int superAreaCode)
	{
		this.superAreaCode = superAreaCode;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

}
