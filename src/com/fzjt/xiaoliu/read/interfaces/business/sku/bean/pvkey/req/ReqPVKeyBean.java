/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skupv.req.ReqSkuPVBean
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
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;
/**
 * 请求体
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvkey.req.ReqPVKeyBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-17 上午9:41:34
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqPVKeyBean extends ReqBean
{
	@XmlElement(name="body")
	private ReqPVKeyBody reqPVKeyBody;

	public ReqPVKeyBody getReqPVKeyBody()
	{
		return reqPVKeyBody;
	}

	public void setReqPVKeyBody(ReqPVKeyBody reqPVKeyBody)
	{
		this.reqPVKeyBody = reqPVKeyBody;
	}

	
}
