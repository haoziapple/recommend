package com.fzjt.xiaoliu.read.interfaces.bean.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 请求bean
 * @className:com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 上午11:15:39
 * @author:ZhangYun
 */
@XmlAccessorType(XmlAccessType.FIELD)

public class ReqBean
{

	/**
	 * 请求头
	 */
	@XmlElement(name = "head")
	private ReqHead head = null;

	
	public ReqHead getHead()
	{
		return head;
	}

	public void setHead(ReqHead head)
	{
		this.head = head;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return new ToStringBuilder(this).append("head", this.head).toString();
	}

}
