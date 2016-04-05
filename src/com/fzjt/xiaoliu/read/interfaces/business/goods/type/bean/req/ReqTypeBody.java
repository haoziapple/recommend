/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.req.ReqTypeBody
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
package com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.req.ReqTypeBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-13 上午9:58:10
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqTypeBody
{
	@XmlElement(name="info")
	private ReqTypeInfo reqTypeInfo;

	public ReqTypeInfo getReqTypeInfo()
	{
		return reqTypeInfo;
	}

	public void setReqTypeInfo(ReqTypeInfo reqTypeInfo)
	{
		this.reqTypeInfo = reqTypeInfo;
	}
	
	

}
