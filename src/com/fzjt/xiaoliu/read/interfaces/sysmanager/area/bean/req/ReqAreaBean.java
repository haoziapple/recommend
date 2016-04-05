/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.req.ReqAreaBean
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
package com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;
/**
 * area请求体
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.req.ReqAreaBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-12 下午5:15:28
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqAreaBean extends ReqBean
{
	@XmlElement(name="body")
	private ReqAreaBody reqAreaBody;

	public ReqAreaBody getReqAreaBody()
	{
		return reqAreaBody;
	}

	public void setReqAreaBody(ReqAreaBody reqAreaBody)
	{
		this.reqAreaBody = reqAreaBody;
	}
	
	

}
