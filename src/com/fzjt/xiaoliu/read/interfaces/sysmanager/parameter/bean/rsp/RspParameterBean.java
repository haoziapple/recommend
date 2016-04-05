package com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.bean.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.bean.rsp.RspParameterBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 下午12:28:45
 * @author:ZhangYun
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspParameterBean
{   
	/**
	 * 参数值
	 */
	@XmlElement(name = "parametervalue")
	private String parameterValue="";

	public String getParameterValue()
	{
		return parameterValue;
	}

	public void setParameterValue(String parameterValue)
	{
		this.parameterValue = parameterValue;
	}
	
	
}
