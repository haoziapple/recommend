package com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.bean.req.ReqParameter
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 上午11:27:40
 * @author:ZhangYun
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqParameter
{
	@XmlElement(name = "info")
	private ReqParameterBean reqParameterBean = null;

	public ReqParameterBean getReqParameterBean()
	{
		return reqParameterBean;
	}

	public void setReqParameterBean(ReqParameterBean reqParameterBean)
	{
		this.reqParameterBean = reqParameterBean;
	}

	
}
