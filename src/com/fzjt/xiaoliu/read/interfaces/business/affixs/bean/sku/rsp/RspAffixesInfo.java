/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.rsp.RspAffixesInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-14     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 响应bean
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.rsp.RspAffixesInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-17 上午10:57:20
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspAffixesInfo
{
	/**
	 * 附件key
	 */
	@XmlElement(name = "affkey")
	private String affKey;

	/**
	 * 附件名称
	 */
	@XmlElement(name = "affname")
	private String affName;

	/**
	 * 附件地址
	 */
	@XmlElement(name = "affurl")
	private String affURL;

	public String getAffName()
	{
		return affName;
	}

	public void setAffName(String affName)
	{
		this.affName = affName;
	}

	public String getAffURL()
	{
		return affURL;
	}

	public void setAffURL(String affURL)
	{
		this.affURL = affURL;
	}

	public String getAffKey()
	{
		return affKey;
	}

	public void setAffKey(String affKey)
	{
		this.affKey = affKey;
	}

}
