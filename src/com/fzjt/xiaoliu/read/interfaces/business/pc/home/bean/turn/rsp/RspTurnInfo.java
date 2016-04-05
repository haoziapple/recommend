/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.turn.bean.rsp.RspTurnInfo
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
package com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.turn.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * pc首页轮播响应beanpc
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.turn.rsp.RspTurnInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 上午11:23:38
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspTurnInfo
{
	/**
	 * 轮播key
	 */
	@XmlElement(name = "carouselkey")
	private String carouselKey;

	/**
	 * 访问地址
	 */
	@XmlElement(name = "visiturl")
	private String visitUrl;

	/**
	 * 轮播图片地址
	 */
	@XmlElement(name = "carouselimg")
	private String carouselImg;

	/**
	 * 轮播描述
	 */
	@XmlElement(name = "carouseldesc")
	private String carouselDesc;

	/**
	 * 排序
	 */
	@XmlElement(name = "orderflag")
	private int orderFlag;

	public String getCarouselKey()
	{
		return carouselKey;
	}

	public void setCarouselKey(String carouselKey)
	{
		this.carouselKey = carouselKey;
	}

	public String getVisitUrl()
	{
		return visitUrl;
	}

	public void setVisitUrl(String visitUrl)
	{
		this.visitUrl = visitUrl;
	}

	public String getCarouselImg()
	{
		return carouselImg;
	}

	public void setCarouselImg(String carouselImg)
	{
		this.carouselImg = carouselImg;
	}

	public String getCarouselDesc()
	{
		return carouselDesc;
	}

	public void setCarouselDesc(String carouselDesc)
	{
		this.carouselDesc = carouselDesc;
	}

	public int getOrderFlag()
	{
		return orderFlag;
	}

	public void setOrderFlag(int orderFlag)
	{
		this.orderFlag = orderFlag;
	}

}
