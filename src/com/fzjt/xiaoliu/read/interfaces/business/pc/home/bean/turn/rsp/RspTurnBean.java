/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.turn.bean.rsp.RspTurnBean
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
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;
/**
 * pc首页轮播响应体
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.turn.rsp.RspTurnBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-12-2 上午11:23:18
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspTurnBean extends RspBean
{
	@XmlElement(name="body")
	private RspTurnBody rspTurnBody;

	public RspTurnBody getRspTurnBody()
	{
		return rspTurnBody;
	}

	public void setRspTurnBody(RspTurnBody rspTurnBody)
	{
		this.rspTurnBody = rspTurnBody;
	}

	
}
