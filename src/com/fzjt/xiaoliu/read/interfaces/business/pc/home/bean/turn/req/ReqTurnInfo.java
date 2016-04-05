/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.turn.bean.req.ReqTurnInfo
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
package com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.turn.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * pc首页轮播请求bean
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.turn.req.ReqTurnInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 上午11:22:58
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqTurnInfo
{
	/**
	 * 省
	 */
	@XmlElement(name = "province")
	private String province;

	/**
	 * 市
	 */
	@XmlElement(name = "city")
	private String city;

	public String getProvince()
	{
		return province;
	}

	public void setProvince(String province)
	{
		this.province = province;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

}
