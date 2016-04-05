/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.push.sysmsg.bean.req.ReqSysMsgBody
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
package com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.list.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fzjt.xiaoliu.read.interfaces.util.PageBeanInfo;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.push.sysmsg.bean.req.ReqSysMsgBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-18 上午10:42:31
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqSysMsgBody extends PageBeanInfo
{
	@XmlElement(name = "info")
	private ReqSysMsgInfo reqSysMsgInfo;

	public ReqSysMsgInfo getReqSysMsgInfo()
	{
		return reqSysMsgInfo;
	}

	public void setReqSysMsgInfo(ReqSysMsgInfo reqSysMsgInfo)
	{
		this.reqSysMsgInfo = reqSysMsgInfo;
	}

}
