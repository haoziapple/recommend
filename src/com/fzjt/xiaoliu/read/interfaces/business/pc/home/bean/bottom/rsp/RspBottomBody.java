/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.bottom.rsp.RspBottomBody
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

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.bottom.rsp.RspBottomBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 下午3:15:48
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspBottomBody
{
	@XmlElement(name = "info")
	private RspBottomInfo RspBottomInfo;

	public RspBottomInfo getRspBottomInfo()
	{
		return RspBottomInfo;
	}

	public void setRspBottomInfo(RspBottomInfo rspBottomInfo)
	{
		RspBottomInfo = rspBottomInfo;
	}

	

}
