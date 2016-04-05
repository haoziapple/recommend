/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.account.ReqAccountBody
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
public class ReqAccountBody
{
	@XmlElement(name="info")
	private ReqAccountInfo reqAccountInfo;

	/**
	 * @return the reqAccountInfo
	 */
	public ReqAccountInfo getReqAccountInfo()
	{
		return reqAccountInfo;
	}

	/**
	 * @param reqAccountInfo the reqAccountInfo to set
	 */
	public void setReqAccountInfo(ReqAccountInfo reqAccountInfo)
	{
		this.reqAccountInfo = reqAccountInfo;
	}
	
	

}
