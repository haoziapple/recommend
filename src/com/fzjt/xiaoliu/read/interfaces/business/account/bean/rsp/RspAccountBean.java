/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.account.bean.rsp.RspAccountBean
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
package com.fzjt.xiaoliu.read.interfaces.business.account.bean.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspAccountBean extends RspBean
{
	@XmlElement(name = "body")
	private RspAccountBody rspAccountBody;

	/**
	 * @return the rspAccountBody
	 */
	public RspAccountBody getRspAccountBody()
	{
		return rspAccountBody;
	}

	/**
	 * @param rspAccountBody
	 *            the rspAccountBody to set
	 */
	public void setRspAccountBody(RspAccountBody rspAccountBody)
	{
		this.rspAccountBody = rspAccountBody;
	}

}
