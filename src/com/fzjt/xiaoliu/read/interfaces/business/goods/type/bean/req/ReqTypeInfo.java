/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.req.ReqTypeInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-13     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 请求bean
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.req.ReqTypeInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 上午9:59:17
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqTypeInfo
{
	/**
	 * 类型key
	 */
	@XmlElement(name = "typekey")
	private String typeKey;

	public String getTypeKey()
	{
		return typeKey;
	}

	public void setTypeKey(String typeKey)
	{
		this.typeKey = typeKey;
	}

}
