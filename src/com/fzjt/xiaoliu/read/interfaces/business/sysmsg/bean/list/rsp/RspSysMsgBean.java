/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.push.sysmsg.bean.rsp.RspSysMsgBean
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
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * 响应体
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.push.sysmsg.bean.rsp.RspSysMsgBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-18 上午10:45:36
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspSysMsgBean extends RspBean
{
	@XmlElement(name = "body")
	private RspSysMsgBody rspSysMsgBody;

	public RspSysMsgBody getRspSysMsgBody()
	{
		return rspSysMsgBody;
	}

	public void setRspSysMsgBody(RspSysMsgBody rspSysMsgBody)
	{
		this.rspSysMsgBody = rspSysMsgBody;
	}

}
