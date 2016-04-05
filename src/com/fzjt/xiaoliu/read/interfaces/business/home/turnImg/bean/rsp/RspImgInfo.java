package com.fzjt.xiaoliu.read.interfaces.business.home.turnImg.bean.rsp;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * turn img 返回bean
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.turn.img.bean.rsp.RspImgInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-6 下午2:13:36
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspImgInfo
{
	@XmlTransient
	private int ID;

	/**
	 * key值
	 */
	@XmlElement(name = "imgkey")
	private String imgKey;

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
	 * 排序
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

	public String getImgKey()
	{
		return imgKey;
	}

	public void setImgKey(String imgKey)
	{
		this.imgKey = imgKey;
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

}
