package com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.bean.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * customer用户信息查询响应
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.bean.rsp.RspCustomerBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-2 下午4:24:42
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspCustomerBean extends RspBean
{
	@XmlElement(name = "body")
	private RspCustomerBody body = null;

	public RspCustomerBody getBody()
	{
		return body;
	}

	public void setBody(RspCustomerBody body)
	{
		this.body = body;
	}

}
