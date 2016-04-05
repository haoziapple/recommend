/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.bottom.req.ReqBottomBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-2     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.bottom.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;
/**
 * pc底部按钮信息体
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.bottom.req.ReqBottomBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-12-2 下午3:08:14
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqBottomBean extends ReqBean
{
	@XmlElement(name="body")
	private ReqBottomBody reqBottomBody;

	public ReqBottomBody getReqBottomBody()
	{
		return reqBottomBody;
	}

	public void setReqBottomBody(ReqBottomBody reqBottomBody)
	{
		this.reqBottomBody = reqBottomBody;
	}
	
	

}
