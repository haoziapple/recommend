/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.module.bean.rsp.RspModuleBean
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
package com.fzjt.xiaoliu.read.interfaces.business.home.floor.module.bean.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * module响应模块
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.module.bean.rsp.RspModuleBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-5 下午1:14:46
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspModuleBean extends RspBean
{
	/**
	 * 响应体
	 */
	@XmlElement(name = "body")
	private RspModuleBody body;

	public RspModuleBody getBody()
	{
		return body;
	}

	public void setBody(RspModuleBody body)
	{
		this.body = body;
	}

}
