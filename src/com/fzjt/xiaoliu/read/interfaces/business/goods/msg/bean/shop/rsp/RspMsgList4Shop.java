/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.rsp.RspMsgList
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

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.rsp.RspMsgList4Shop
 * @description:TODO
 * @version:v1.0.0
 * @date:2015年11月24日 上午10:39:03
 * @author:LiChangjiang
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspMsgList4Shop
{
	@XmlElement(name = "info")
	private List<RspMsgInfo4Shop> rspInfoList;

	/**
	 * @return the rspInfoList
	 */
	public List<RspMsgInfo4Shop> getRspInfoList()
	{
		return rspInfoList;
	}

	/**
	 * @param rspInfoList
	 *            the rspInfoList to set
	 */
	public void setRspInfoList(List<RspMsgInfo4Shop> rspInfoList)
	{
		this.rspInfoList = rspInfoList;
	}

}
