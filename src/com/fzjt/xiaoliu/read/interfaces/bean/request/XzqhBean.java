package com.fzjt.xiaoliu.read.interfaces.bean.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class XzqhBean
{

	/**
	 * 省
	 */
	@XmlElement(name = "province")
	private String province ="";
	
	/**
	 * 市
	 */
	@XmlElement(name = "city")
	private String city = "";
	
	/**
	 * 区
	 */
	@XmlElement(name = "area")
	private String area = "";


	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getArea()
	{
		return area;
	}

	public void setArea(String area)
	{
		this.area = area;
	}
	
	
	

	

}