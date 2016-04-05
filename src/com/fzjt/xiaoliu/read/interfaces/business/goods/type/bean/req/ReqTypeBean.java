/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.req.ReqTypeBean
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
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;
/**
 * type请求体
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.req.ReqTypeBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-13 上午9:55:39
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqTypeBean extends ReqBean
{
	@XmlElement(name="body")
	private ReqTypeBody reqTypeBody;

	public ReqTypeBody getReqTypeBody()
	{
		return reqTypeBody;
	}

	public void setReqTypeBody(ReqTypeBody reqTypeBody)
	{
		this.reqTypeBody = reqTypeBody;
	}
	
	

}
