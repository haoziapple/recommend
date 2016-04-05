/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.module.bean.rsp.RspModuleInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-5     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.floor.module.bean.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 响应信息bean
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.module.bean.rsp.RspModuleInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-5 下午1:44:23
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspModuleInfo
{

	@XmlTransient
	private int ID;

	/**
	 * 楼层key
	 */
	@XmlElement(name = "floorkey")
	private String floorKey;

	/**
	 * 楼层号，用于排序
	 */
	@XmlElement(name = "floornum")
	private int floorNum;

	/**
	 * 楼层标题
	 */
	@XmlElement(name = "moduletitle")
	private String moduleTitle;

	/**
	 * 对应的app key,app开发提供的
	 */
	@XmlElement(name = "appkey")
	private String appKey;

	public int getID()
	{
		return ID;
	}

	public void setID(int iD)
	{
		ID = iD;
	}

	public String getFloorKey()
	{
		return floorKey;
	}

	public void setFloorKey(String floorKey)
	{
		this.floorKey = floorKey;
	}

	public int getFloorNum()
	{
		return floorNum;
	}

	public void setFloorNum(int floorNum)
	{
		this.floorNum = floorNum;
	}

	public String getModuleTitle()
	{
		return moduleTitle;
	}

	public void setModuleTitle(String moduleTitle)
	{
		this.moduleTitle = moduleTitle;
	}

	public String getAppKey()
	{
		return appKey;
	}

	public void setAppKey(String appKey)
	{
		this.appKey = appKey;
	}

}
