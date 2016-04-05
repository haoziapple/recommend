/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.content.bean.req.ReqContentBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-5     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.floor.content.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * Content请求
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.content.bean.req.ReqContentBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-5 下午4:45:11
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqContentBean extends ReqBean
{
	/**
	 * 请求体
	 */
	@XmlElement(name = "body")
	private ReqContentBody reqContentBody;

	public ReqContentBody getReqContentBody()
	{
		return reqContentBody;
	}

	public void setReqContentBody(ReqContentBody reqContentBody)
	{
		this.reqContentBody = reqContentBody;
	}

}
