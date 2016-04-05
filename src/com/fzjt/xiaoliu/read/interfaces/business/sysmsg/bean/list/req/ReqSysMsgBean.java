/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.push.sysmsg.bean.req.ReqSysMsgBean
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
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;
/**
 * 请求体
 * @className:com.fzjt.xiaoliu.read.interfaces.business.push.sysmsg.bean.req.ReqSysMsgBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-18 上午10:40:54
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqSysMsgBean extends ReqBean
{
	@XmlElement(name="body")
	private ReqSysMsgBody reqSysMsgBody;

	public ReqSysMsgBody getReqSysMsgBody()
	{
		return reqSysMsgBody;
	}

	public void setReqSysMsgBody(ReqSysMsgBody reqSysMsgBody)
	{
		this.reqSysMsgBody = reqSysMsgBody;
	}
	
	

}
