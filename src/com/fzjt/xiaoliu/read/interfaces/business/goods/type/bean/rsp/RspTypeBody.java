/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.rsp.RspTypeBody
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

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.rsp.RspTypeBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 上午10:04:21
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspTypeBody
{
	@XmlElement(name = "list")
	private RspTypeList rspTypeList;

	public RspTypeList getRspTypeList()
	{
		return rspTypeList;
	}

	public void setRspTypeList(RspTypeList rspTypeList)
	{
		this.rspTypeList = rspTypeList;
	}

}
