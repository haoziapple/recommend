/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.account.ReqAccount
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:WangHao
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-11     WangHao       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.account.bean.req;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqAccount extends ReqBean
{
	@XmlElement(name="body")
	private ReqAccountBody reqAccountBody;

	/**
	 * @return the reqAccountBody
	 */
	public ReqAccountBody getReqAccountBody()
	{
		return reqAccountBody;
	}

	/**
	 * @param reqAccountBody the reqAccountBody to set
	 */
	public void setReqAccountBody(ReqAccountBody reqAccountBody)
	{
		this.reqAccountBody = reqAccountBody;
	}

}
