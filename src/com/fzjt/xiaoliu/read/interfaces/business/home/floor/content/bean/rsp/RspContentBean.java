/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.content.bean.rsp.RspContentBean
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
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * content请求
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.content.bean.rsp.RspContentBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-5 下午4:52:50
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspContentBean extends RspBean
{
	@XmlElement(name = "body")
	private RspContentBody rspContentBody;

	public RspContentBody getRspContentBody()
	{
		return rspContentBody;
	}

	public void setRspContentBody(RspContentBody rspContentBody)
	{
		this.rspContentBody = rspContentBody;
	}

}
