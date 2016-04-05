/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.account.bean.rsp.RspAccountInfo
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

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class RspAccountInfo
{
	@XmlElement(name="account")
	private String account;

	/**
	 * @return the account
	 */
	public String getAccount()
	{
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(String account)
	{
		this.account = account;
	}
	

}
