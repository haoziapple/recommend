package com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.bean.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;


@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
/**
 * 参数信息返回体
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.bean.rsp.RspParameterBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 下午12:29:13
 * @author:ZhangYun
 */
public class RspParameterBody extends RspBean
{
	@XmlElement(name = "body")
    private  RspParameter rspParameter=null;

	public RspParameter getRspParameter()
	{
		return rspParameter;
	}

	public void setRspParameter(RspParameter rspParameter)
	{
		this.rspParameter = rspParameter;
	}
	
	
}
