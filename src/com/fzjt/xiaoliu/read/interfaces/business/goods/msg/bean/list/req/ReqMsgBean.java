/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.req.ReqMsgBean
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
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * msg请求体
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.req.ReqMsgBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午4:18:12
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqMsgBean extends ReqBean
{
	@XmlElement(name = "body")
	private ReqMsgBody reqMsgBody;

	/**
	 * @return the reqMsgBody
	 */
	public ReqMsgBody getReqMsgBody()
	{
		return reqMsgBody;
	}

	/**
	 * @param reqMsgBody
	 *            the reqMsgBody to set
	 */
	public void setReqMsgBody(ReqMsgBody reqMsgBody)
	{
		this.reqMsgBody = reqMsgBody;
	}

}
