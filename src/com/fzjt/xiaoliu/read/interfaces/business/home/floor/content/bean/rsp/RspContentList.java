/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.content.bean.rsp.RspContentList
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
package com.fzjt.xiaoliu.read.interfaces.business.home.floor.content.bean.rsp;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.content.bean.rsp.RspContentList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-5 下午5:01:30
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspContentList
{
	/**
	 * 响应info
	 */
	@XmlElement(name = "info")
	private List<RspContentInfo> contentList;

	public List<RspContentInfo> getContentList()
	{
		return contentList;
	}

	public void setContentList(List<RspContentInfo> contentList)
	{
		this.contentList = contentList;
	}

}
