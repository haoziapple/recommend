/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.req.ReqMsgBody
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
package com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.list.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fzjt.xiaoliu.read.interfaces.util.PageBeanInfo;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.req.ReqMsgBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午4:22:18
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqMsgBody extends PageBeanInfo
{
	@XmlElement(name = "info")
	private ReqMsgInfo reqMsgInfo;

	public ReqMsgInfo getReqMsgInfo()
	{
		return reqMsgInfo;
	}

	public void setReqMsgInfo(ReqMsgInfo reqMsgInfo)
	{
		this.reqMsgInfo = reqMsgInfo;
	}

}
