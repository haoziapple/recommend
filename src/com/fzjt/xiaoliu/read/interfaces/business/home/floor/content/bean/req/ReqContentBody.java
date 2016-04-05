/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.content.bean.req.ReqContentBody
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

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.content.bean.req.ReqContentBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-5 下午4:48:05
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqContentBody
{
	@XmlElement(name = "info")
	private ReqContentInfo reqContentInfo;

	public ReqContentInfo getReqContentInfo()
	{
		return reqContentInfo;
	}

	public void setReqContentInfo(ReqContentInfo reqContentInfo)
	{
		this.reqContentInfo = reqContentInfo;
	}

}
