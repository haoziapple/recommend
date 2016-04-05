/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.rsp.RspAreaBody
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-12     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.rsp.RspAreaBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-12 下午5:59:59
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspAreaBody
{
	@XmlElement(name="list")
	private RspAreaList rspAreaList;

	public RspAreaList getRspAreaList()
	{
		return rspAreaList;
	}

	public void setRspAreaList(RspAreaList rspAreaList)
	{
		this.rspAreaList = rspAreaList;
	}
	
	

}
