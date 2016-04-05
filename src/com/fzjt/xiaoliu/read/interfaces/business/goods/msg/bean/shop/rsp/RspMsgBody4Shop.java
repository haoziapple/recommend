/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.rsp.RspMsgBody
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

import com.fzjt.xiaoliu.read.interfaces.util.RspPageBean;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.rsp.RspMsgBody4Shop
 * @description:TODO
 * @version:v1.0.0
 * @date:2015年11月24日 上午10:38:53
 * @author:LiChangjiang
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspMsgBody4Shop extends RspPageBean
{
	@XmlElement(name = "list")
	private RspMsgList4Shop rspList;

	/**
	 * @return the rspList
	 */
	public RspMsgList4Shop getRspList()
	{
		return rspList;
	}

	/**
	 * @param rspList
	 *            the rspList to set
	 */
	public void setRspList(RspMsgList4Shop rspList)
	{
		this.rspList = rspList;
	}

}
