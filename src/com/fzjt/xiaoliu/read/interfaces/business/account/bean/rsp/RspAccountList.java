/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.account.bean.rsp.RspAccountList
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

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class RspAccountList
{
	@XmlElement(name="info")
	private List<RspAccountInfo> rspAccountInfo;

	/**
	 * @return the rspAccountInfo
	 */
	public List<RspAccountInfo> getRspAccountInfo()
	{
		return rspAccountInfo;
	}

	/**
	 * @param rspAccountInfo the rspAccountInfo to set
	 */
	public void setRspAccountInfo(List<RspAccountInfo> rspAccountInfo)
	{
		this.rspAccountInfo = rspAccountInfo;
	}


}
