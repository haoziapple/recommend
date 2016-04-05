package com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import javax.xml.bind.annotation.XmlElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * customer请求
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.bean.req.ReqCustomerBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-2 下午4:24:14
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqCustomerBean extends ReqBean
{
	/**
	 * 请求体
	 */
	@XmlElement(name = "body")
	private ReqCustomerBody body = null;

	public ReqCustomerBody getBody()
	{
		return body;
	}

	public void setBody(ReqCustomerBody body)
	{
		this.body = body;
	}

}
