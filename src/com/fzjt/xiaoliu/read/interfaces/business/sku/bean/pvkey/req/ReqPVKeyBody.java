/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skupv.req.ReqSkuPVBody
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-17     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvkey.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvkey.req.ReqPVKeyBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-17 上午9:44:29
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqPVKeyBody
{
	@XmlElement(name="info")
	private ReqPVKeyInfo reqPVKeyInfo;

	public ReqPVKeyInfo getReqPVKeyInfo()
	{
		return reqPVKeyInfo;
	}

	public void setReqPVKeyInfo(ReqPVKeyInfo reqPVKeyInfo)
	{
		this.reqPVKeyInfo = reqPVKeyInfo;
	}
	
	

}
