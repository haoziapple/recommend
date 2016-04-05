/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.turn.bean.req.ReqTurnBody
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
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.turn.req.ReqTurnBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-12-2 上午11:22:48
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqTurnBody
{
	@XmlElement(name = "info")
	private ReqTurnInfo reqTurnInfo;

	public ReqTurnInfo getReqTurnInfo()
	{
		return reqTurnInfo;
	}

	public void setReqTurnInfo(ReqTurnInfo reqTurnInfo)
	{
		this.reqTurnInfo = reqTurnInfo;
	}

}
