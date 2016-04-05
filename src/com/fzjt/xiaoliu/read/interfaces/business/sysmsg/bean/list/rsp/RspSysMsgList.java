/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.push.sysmsg.bean.rsp.RspSysMsgList
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

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.push.sysmsg.bean.rsp.RspSysMsgList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-18 上午10:50:14
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspSysMsgList
{
	@XmlElement(name="info")
	private List<RspSysMsgInfo> rspSysMsgInfo;

	public List<RspSysMsgInfo> getRspSysMsgInfo()
	{
		return rspSysMsgInfo;
	}

	public void setRspSysMsgInfo(List<RspSysMsgInfo> rspSysMsgInfo)
	{
		this.rspSysMsgInfo = rspSysMsgInfo;
	}

}
