/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sort.bean.rsp.RspSortBody
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-6     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.sort.bean.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sort.bean.rsp.RspSortBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-6 下午3:39:08
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspSortBody
{
	@XmlElement(name = "list")
	private RspSortList rspSortList;

	public RspSortList getRspSortList()
	{
		return rspSortList;
	}

	public void setRspSortList(RspSortList rspSortList)
	{
		this.rspSortList = rspSortList;
	}

}
