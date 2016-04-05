/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.rsp.RspMsgBody
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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fzjt.xiaoliu.read.interfaces.util.RspPageBean;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.rsp.RspMsgBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午4:31:29
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspMsgBody extends RspPageBean
{
	@XmlElement(name = "list")
	private RspMsgList rspMsgList;

	public RspMsgList getRspMsgList()
	{
		return rspMsgList;
	}

	public void setRspMsgList(RspMsgList rspMsgList)
	{
		this.rspMsgList = rspMsgList;
	}

}
