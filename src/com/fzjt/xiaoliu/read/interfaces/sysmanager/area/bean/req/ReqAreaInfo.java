/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.req.ReqAreaInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-12     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 请求bean
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.req.ReqAreaInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-12 下午5:50:39
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqAreaInfo
{
	/**
	 * 区域id  
	 */
	@XmlElement(name = "areakey")
	private String areaKey = "";

	public String getAreaKey()
	{
		return areaKey;
	}

	public void setAreaKey(String areaKey)
	{
		this.areaKey = areaKey;
	}

}
