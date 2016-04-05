/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.module.bean.rsp.RspModuleList
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-5     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.floor.module.bean.rsp;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.module.bean.rsp.RspModuleList
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-6 下午2:12:30
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspModuleList
{
	@XmlElement(name = "info")
	private List<RspModuleInfo> rspModuleInfo;

	public List<RspModuleInfo> getRspModuleInfo()
	{
		return rspModuleInfo;
	}

	public void setRspModuleInfo(List<RspModuleInfo> rspModuleInfo)
	{
		this.rspModuleInfo = rspModuleInfo;
	}

}
