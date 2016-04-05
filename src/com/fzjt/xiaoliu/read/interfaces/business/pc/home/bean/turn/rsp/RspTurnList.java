/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.turn.bean.rsp.RspTurnList
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

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.turn.rsp.RspTurnList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 上午11:23:51
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspTurnList
{
	@XmlElement(name = "info")
	private List<RspTurnInfo> rspTurnInfo;

	public List<RspTurnInfo> getRspTurnInfo()
	{
		return rspTurnInfo;
	}

	public void setRspTurnInfo(List<RspTurnInfo> rspTurnInfo)
	{
		this.rspTurnInfo = rspTurnInfo;
	}

}
