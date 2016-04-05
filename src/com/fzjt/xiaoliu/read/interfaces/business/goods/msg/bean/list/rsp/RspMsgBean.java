/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.rsp.RspMsgBean
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
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * msg响应体
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.rsp.RspMsgBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午4:27:59
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspMsgBean extends RspBean
{
	@XmlElement(name = "body")
	private RspMsgBody rspMsgBody;

	public RspMsgBody getRspMsgBody()
	{
		return rspMsgBody;
	}

	public void setRspMsgBody(RspMsgBody rspMsgBody)
	{
		this.rspMsgBody = rspMsgBody;
	}

}
