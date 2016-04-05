package com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.bean.req.ReqParameterBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 上午11:27:46
 * @author:ZhangYun
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqParameterBean
{
	/**
	 * 参数key
	 */
	@XmlElement(name = "parameterkey")
   private String parameterKey="";

	public String getParameterKey()
	{
		return parameterKey;
	}

	public void setParameterKey(String parameterKey)
	{
		this.parameterKey = parameterKey;
	}
   
   
}
