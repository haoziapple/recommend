/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.rsp.RspMsgList
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-13     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.list.rsp;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.rsp.RspMsgList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午4:32:54
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspMsgList
{
	@XmlElement(name = "info")
	private List<RspMsgInfo> rspMsgInfo;

	public List<RspMsgInfo> getRspMsgInfo()
	{
		return rspMsgInfo;
	}

	public void setRspMsgInfo(List<RspMsgInfo> rspMsgInfo)
	{
		this.rspMsgInfo = rspMsgInfo;
	}

}
