/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.rsp.RspAreaBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-12     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * area响应体
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.rsp.RspAreaBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-12 下午5:56:45
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspAreaBean extends RspBean
{
	@XmlElement(name = "body")
	private RspAreaBody rspAreaBody;

	public RspAreaBody getRspAreaBody()
	{
		return rspAreaBody;
	}

	public void setRspAreaBody(RspAreaBody rspAreaBody)
	{
		this.rspAreaBody = rspAreaBody;
	}

}
