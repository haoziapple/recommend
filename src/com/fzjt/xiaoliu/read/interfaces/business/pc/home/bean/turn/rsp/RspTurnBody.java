/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.turn.bean.rsp.RspTurnBody
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
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.turn.rsp.RspTurnBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 上午11:23:28
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspTurnBody
{
	@XmlElement(name = "list")
	private RspTurnList rspTurnList;

	public RspTurnList getRspTurnList()
	{
		return rspTurnList;
	}

	public void setRspTurnList(RspTurnList rspTurnList)
	{
		this.rspTurnList = rspTurnList;
	}

}
