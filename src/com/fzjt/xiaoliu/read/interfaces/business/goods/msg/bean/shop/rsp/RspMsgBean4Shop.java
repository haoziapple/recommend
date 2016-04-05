/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.rsp.RspMsgBean
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
package com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * msg响应体
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.rsp.RspMsgBean4Shop
 * @description:TODO
 * @version:v1.0.0
 * @date:2015年11月24日 上午10:38:46
 * @author:LiChangjiang
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspMsgBean4Shop extends RspBean
{
	@XmlElement(name = "body")
	private RspMsgBody4Shop rspBody;

	/**
	 * @return the rspBody
	 */
	public RspMsgBody4Shop getRspBody()
	{
		return rspBody;
	}

	/**
	 * @param rspBody
	 *            the rspBody to set
	 */
	public void setRspBody(RspMsgBody4Shop rspBody)
	{
		this.rspBody = rspBody;
	}

}
