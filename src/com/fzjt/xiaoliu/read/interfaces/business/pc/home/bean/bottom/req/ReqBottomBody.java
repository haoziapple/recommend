/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.bottom.req.ReqBottomBody
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

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.bottom.req.ReqBottomBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 下午3:09:45
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqBottomBody
{
	@XmlElement(name = "info")
	private ReqBottomInfo reqBottomInfo;

	public ReqBottomInfo getReqBottomInfo()
	{
		return reqBottomInfo;
	}

	public void setReqBottomInfo(ReqBottomInfo reqBottomInfo)
	{
		this.reqBottomInfo = reqBottomInfo;
	}

}
