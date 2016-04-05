package com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.bean.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.bean.rsp.RspParameter
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 下午12:28:23
 * @author:ZhangYun
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspParameter
{
	@XmlElement(name = "parameter")
	private RspParameterBean RspParameterBean = null;

	public RspParameterBean getRspParameterBean()
	{
		return RspParameterBean;
	}

	public void setRspParameterBean(RspParameterBean rspParameterBean)
	{
		RspParameterBean = rspParameterBean;
	}
	
	
}
