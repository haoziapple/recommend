/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.module.bean.req.ReqmoduleBean
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
package com.fzjt.xiaoliu.read.interfaces.business.home.floor.module.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * module请求
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.module.bean.req.ReqmoduleBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-5 下午1:06:49
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqModuleBean extends ReqBean
{
	/**
	 * 请求体
	 */
	@XmlElement(name = "body")
	private ReqModuleBody body;

	public ReqModuleBody getBody()
	{
		return body;
	}

	public void setBody(ReqModuleBody body)
	{
		this.body = body;
	}

}
