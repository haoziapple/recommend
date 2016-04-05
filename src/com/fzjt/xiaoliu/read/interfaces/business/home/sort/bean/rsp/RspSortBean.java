/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sort.bean.rsp.RspSortBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-6     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.sort.bean.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;
/**
 * sort请求
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sort.bean.rsp.RspSortBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-6 下午3:37:33
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspSortBean extends RspBean
{
	@XmlElement(name="body")
	private RspSortBody rspSortBody;

	public RspSortBody getRspSortBody()
	{
		return rspSortBody;
	}

	public void setRspSortBody(RspSortBody rspSortBody)
	{
		this.rspSortBody = rspSortBody;
	}
	

}
