/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.req.ReqAreaBodyBean
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
package com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.req.ReqAreaBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-12 下午5:48:34
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqAreaBody
{
	@XmlElement(name="info")
	private ReqAreaInfo reqAreaInfo;

	public ReqAreaInfo getReqAreaInfo()
	{
		return reqAreaInfo;
	}

	public void setReqAreaInfo(ReqAreaInfo reqAreaInfo)
	{
		this.reqAreaInfo = reqAreaInfo;
	}
	
	

}
