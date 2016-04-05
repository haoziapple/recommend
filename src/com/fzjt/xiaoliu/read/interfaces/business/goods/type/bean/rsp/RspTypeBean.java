/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.rsp.RspTypeBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-13     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;
/**
 * 响应体
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.rsp.RspTypeBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-13 上午10:02:11
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspTypeBean extends RspBean
{
	@XmlElement(name="body")
	private RspTypeBody rspTypeBody;

	public RspTypeBody getRspTypeBody()
	{
		return rspTypeBody;
	}

	public void setRspTypeBody(RspTypeBody rspTypeBody)
	{
		this.rspTypeBody = rspTypeBody;
	}
	
	

}
