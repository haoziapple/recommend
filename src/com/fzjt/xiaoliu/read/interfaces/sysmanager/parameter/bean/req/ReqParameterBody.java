package com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;


@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.bean.req.ReqParameterBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 上午11:28:03
 * @author:ZhangYun
 */
public class ReqParameterBody extends ReqBean
{
	/**
	 * 参数请求bean
	 */
	@XmlElement(name = "body")
	private ReqParameter reqParameter = null;

	public ReqParameter getReqParameter()
	{
		return reqParameter;
	}

	public void setReqParameter(ReqParameter reqParameter)
	{
		this.reqParameter = reqParameter;
	}
     
}
