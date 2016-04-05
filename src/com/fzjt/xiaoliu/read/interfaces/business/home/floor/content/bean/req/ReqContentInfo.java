/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.content.bean.req.ReqContentInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-5     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.floor.content.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 请求info
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.floor.content.bean.req.ReqContentInfo
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-12-17 下午7:49:42
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqContentInfo
{
	/**
	 * 楼层key
	 */
	@XmlElement(name = "floorkey")
	private String floorKey;
	
	/**
	 * 省
	 */
    @XmlElement(name = "province")
    private String province;
    
    /**
     * 市
     */
    @XmlElement(name = "city")
    private String city;

	public String getFloorKey()
	{
		return floorKey;
	}

	public void setFloorKey(String floorKey)
	{
		this.floorKey = floorKey;
	}

	public String getProvince()
	{
		return province;
	}

	public void setProvince(String province)
	{
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
	
	

}
