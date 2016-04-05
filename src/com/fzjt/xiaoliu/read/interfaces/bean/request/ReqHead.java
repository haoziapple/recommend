package com.fzjt.xiaoliu.read.interfaces.bean.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 请求头
 * 
 * @className:com.fzjt.interfaces.bean.request.ReqHead
 * @description:TODO
 * @version:v1.0.0
 * @date:2014-9-18 上午10:46:17
 * @author:LiChangjiang
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqHead
{
	public ReqHead()
	{
	};

	/**
	 * 访问接口模块名称
	 */
	@XmlElement(name = "modular")
	private String modular = "";
	/**
	 * 账号
	 */
	@XmlElement(name = "username")
	private String userName = "";

	/**
	 * 密码
	 */
	@XmlElement(name = "password")
	private String password = "";

	/**
	 * 请求接口名称
	 */
	@XmlElement(name = "requestname")
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
	 * 使用人
	 */
	@XmlElement(name = "peoplename")
	private String peoplename = "";


	
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

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getPeoplename()
	{
		return peoplename;
	}

	public void setPeoplename(String peoplename)
	{
		this.peoplename = peoplename;
	}

	public String getModular()
	{
		return modular;
	}

	public void setModular(String modular)
	{
		this.modular = modular;
	}

	@Override
	public String toString()
	{
		return "ReqHead [password=" + password + ", peoplename=" + peoplename + ", requestName=" + requestName + ", timestamp=" + timestamp + ", userName="
				+ userName + ", versions=" + versions + ",modular" + modular + "]";
	}

}
