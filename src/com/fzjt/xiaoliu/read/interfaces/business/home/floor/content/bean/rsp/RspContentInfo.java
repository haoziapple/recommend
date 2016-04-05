/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.content.bean.rsp.RspContentInfo
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
package com.fzjt.xiaoliu.read.interfaces.business.home.floor.content.bean.rsp;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 响应bean
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.content.bean.rsp.RspContentInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-5 下午5:01:39
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspContentInfo
{
	@XmlTransient
	private int ID;
	/**
	 * 楼层key
	 */
	@XmlElement(name = "floorkey")
	private String floorKey;
	/**
	 * 图片地址
	 */
	@XmlElement(name = "imgurl")
	private String imgURL;
	/**
	 * 链接地址
	 */
	@XmlElement(name = "linkurl")
	private String linkURL;
	/**
	 * 标识，1:商品，2：商家，3：活动
	 */
	@XmlElement(name = "flagtype")
	private String flagType;
	/**
	 * 排序用
	 */
	@XmlElement(name = "indexnum")
	private int indexNum;

	/**
	 * 商品（商家）的key 当flagType为1时值是商品key，如果flagType是2时值是商家key
	 */
	@XmlElement(name = "objkey")
	private String objKey;
	/**
	 * 添加时间
	 */
	@XmlTransient
	private Date addTime;

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

	public String getImgURL()
	{
		return imgURL;
	}

	public void setImgURL(String imgURL)
	{
		this.imgURL = imgURL;
	}

	public String getLinkURL()
	{
		return linkURL;
	}

	public void setLinkURL(String linkURL)
	{
		this.linkURL = linkURL;
	}

	public String getFlagType()
	{
		return flagType;
	}

	public void setFlagType(String flagType)
	{
		this.flagType = flagType;
	}

	public int getIndexNum()
	{
		return indexNum;
	}

	public void setIndexNum(int indexNum)
	{
		this.indexNum = indexNum;
	}

	public Date getAddTime()
	{
		return addTime;
	}

	public void setAddTime(Date addTime)
	{
		this.addTime = addTime;
	}

	/**
	 * @return the objKey
	 */
	public String getObjKey()
	{
		return objKey;
	}

	/**
	 * @param objKey
	 *            the objKey to set
	 */
	public void setObjKey(String objKey)
	{
		this.objKey = objKey;
	}

}
