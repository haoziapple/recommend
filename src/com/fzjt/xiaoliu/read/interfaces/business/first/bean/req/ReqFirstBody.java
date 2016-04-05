package com.fzjt.xiaoliu.read.interfaces.business.first.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;


/**
 * 请求头
 * @className:com.fzjt.xiaoliu.read.interfaces.business.first.bean.req.ReqFirstBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 上午11:18:00
 * @author:ZhangYun
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqFirstBody extends ReqBean
{
	/**
	 *  请求体
	 */
	@XmlElement(name = "body")
	private ReqFirstInfo body = null ;

	public ReqFirstInfo getBody()
	{
		return body;
	}

	public void setBody(ReqFirstInfo body)
	{
		this.body = body;
	}
	
	
	
}
