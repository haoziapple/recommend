/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.content.bean.rsp.RspContentBody
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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.content.bean.rsp.RspContentBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-5 下午4:55:12
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspContentBody
{
	/**
	 * 响应list
	 */
	@XmlElement(name = "list")
	private RspContentList rspContentList;

	public RspContentList getRspContentList()
	{
		return rspContentList;
	}

	public void setRspContentList(RspContentList rspContentList)
	{
		this.rspContentList = rspContentList;
	}

}
