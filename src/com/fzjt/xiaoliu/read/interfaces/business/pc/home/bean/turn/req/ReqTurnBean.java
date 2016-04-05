/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.turn.bean.req.ReqTurn
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
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * pc首页轮播请求体
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.turn.req.ReqTurnBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 上午11:22:36
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqTurnBean extends ReqBean
{
	@XmlElement(name = "body")
	private ReqTurnBody reqTurnBody;

	public ReqTurnBody getReqTurnBody()
	{
		return reqTurnBody;
	}

	public void setReqTurnBody(ReqTurnBody reqTurnBody)
	{
		this.reqTurnBody = reqTurnBody;
	}

}
