/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.rsp.RspTypeList
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

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.rsp.RspTypeList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 上午10:05:20
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspTypeList
{
	@XmlElement(name = "info")
	private List<RspTypeInfo> rspTypeInfo;

	public List<RspTypeInfo> getRspTypeInfo()
	{
		return rspTypeInfo;
	}

	public void setRspTypeInfo(List<RspTypeInfo> rspTypeInfo)
	{
		this.rspTypeInfo = rspTypeInfo;
	}

}
