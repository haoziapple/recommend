/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.account.ReqAccountInfo
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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ReqAccountInfo
{
	

	@XmlElement(name="userkey")
	private String userkey;

	/**
	 * @return the userkey
	 */
	public String getUserkey()
	{
		return userkey;
	}

	/**
	 * @param userkey the userkey to set
	 */
	public void setUserkey(String userkey)
	{
		this.userkey = userkey;
	}
	
	

}
