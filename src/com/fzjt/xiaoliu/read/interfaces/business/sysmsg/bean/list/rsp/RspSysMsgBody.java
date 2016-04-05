/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.push.sysmsg.bean.rsp.RspSysMsgBody
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-18     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.list.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fzjt.xiaoliu.read.interfaces.util.RspPageBean;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.push.sysmsg.bean.rsp.RspSysMsgBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-18 上午10:49:31
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspSysMsgBody extends RspPageBean
{
	@XmlElement(name = "list")
	private RspSysMsgList rspSysMsgList;

	public RspSysMsgList getRspSysMsgList()
	{
		return rspSysMsgList;
	}

	public void setRspSysMsgList(RspSysMsgList rspSysMsgList)
	{
		this.rspSysMsgList = rspSysMsgList;
	}

}
