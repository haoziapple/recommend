/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.bottom.rsp.RspBottomBean
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
package com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.bottom.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * pc响应底部按钮信息bean
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.bottom.rsp.RspBottomBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 下午3:12:42
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspBottomBean extends RspBean
{
	@XmlElement(name = "body")
	private RspBottomBody rspBottomBody;

	public RspBottomBody getRspBottomBody()
	{
		return rspBottomBody;
	}

	public void setRspBottomBody(RspBottomBody rspBottomBody)
	{
		this.rspBottomBody = rspBottomBody;
	}

}
