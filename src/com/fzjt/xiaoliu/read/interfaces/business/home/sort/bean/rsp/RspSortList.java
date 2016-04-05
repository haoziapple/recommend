/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sort.bean.rsp.RspSortList
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

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sort.bean.rsp.RspSortList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-6 下午3:40:12
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspSortList
{
	@XmlElement(name = "info")
	private List<RspSortInfo> rspSortInfo;

	public List<RspSortInfo> getRspSortInfo()
	{
		return rspSortInfo;
	}

	public void setRspSortInfo(List<RspSortInfo> rspSortInfo)
	{
		this.rspSortInfo = rspSortInfo;
	}

}
