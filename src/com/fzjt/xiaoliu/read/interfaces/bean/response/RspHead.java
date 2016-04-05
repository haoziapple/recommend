package com.fzjt.xiaoliu.read.interfaces.bean.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 返回头
 * @className:com.fzjt.xiaoliu.read.interfaces.bean.response.RspHead
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 上午11:17:16
 * @author:ZhangYun
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspHead
{

	/**
	 * 访问接口模块名称
	 */
	@XmlElement(name = "modular")
	private String modular = "";

	/**
	 * 请求接口名称
	 */
	@XmlElement(name = "responsename")
	private String requestName = "";

	/**
	 * 时间戳
	 */
	@XmlElement(name = "timestamp")
	private String timestamp = "";

	/**
	 * 版本号
	 */
	@XmlElement(name = "versions")
	private String versions = "";

	/**
	 * 返回码
	 */
	@XmlElement(name = "resultcode")
	private String resultCode = "";

	/**
	 * 返回描述
	 */
	@XmlElement(name = "resultdesc")
	private String resultDesc = "";

	public String getRequestName()
	{
		return requestName;
	}

	public void setRequestName(String requestName)
	{
		this.requestName = requestName;
	}

	public String getTimestamp()
	{
		return timestamp;
	}

	public void setTimestamp(String timestamp)
	{
		this.timestamp = timestamp;
	}

	public String getVersions()
	{
		return versions;
	}

	public void setVersions(String versions)
	{
		this.versions = versions;
	}

	public String getResultCode()
	{
		return resultCode;
	}

	public void setResultCode(String resultCode)
	{
		this.resultCode = resultCode;
	}

	public String getResultDesc()
	{
		return resultDesc;
	}

	public void setResultDesc(String resultDesc)
	{
		this.resultDesc = resultDesc;
	}

	public String getModular()
	{
		return modular;
	}

	public void setModular(String modular)
	{
		this.modular = modular;
	}

}
