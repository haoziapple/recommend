/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sort.bean.rsp.RspSortInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-6     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.sort.bean.rsp;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * sort bean
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sort.bean.rsp.RspSortInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-6 下午3:41:24
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspSortInfo
{
	@XmlTransient
	private int ID;

	/**
	 * 分类key
	 */
	@XmlElement(name = "sortkey")
	private String sortKey;

	/**
	 * 分类名称
	 */
	@XmlElement(name = "sortname")
	private String sortName;

	/**
	 * 分类Logo图片地址
	 */
	@XmlElement(name = "logoimgurl")
	private String logoImgURL;

	/**
	 * 链接地址
	 */
	@XmlElement(name = "linkurl")
	private String linkURL;

	/**
	 * 顺序
	 */
	@XmlElement(name = "indexnum")
	private int indexNum;

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

	public String getSortKey()
	{
		return sortKey;
	}

	public void setSortKey(String sortKey)
	{
		this.sortKey = sortKey;
	}

	public String getSortName()
	{
		return sortName;
	}

	public void setSortName(String sortName)
	{
		this.sortName = sortName;
	}

	public String getLogoImgURL()
	{
		return logoImgURL;
	}

	public void setLogoImgURL(String logoImgURL)
	{
		this.logoImgURL = logoImgURL;
	}

	public String getLinkURL()
	{
		return linkURL;
	}

	public void setLinkURL(String linkURL)
	{
		this.linkURL = linkURL;
	}

	public Date getAddTime()
	{
		return addTime;
	}

	public void setAddTime(Date addTime)
	{
		this.addTime = addTime;
	}

	public int getIndexNum()
	{
		return indexNum;
	}

	public void setIndexNum(int indexNum)
	{
		this.indexNum = indexNum;
	}

}
