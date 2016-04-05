/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.req.ReqMsg4ShopBody
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiChangjiang
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015年11月24日     LiChangjiang       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fzjt.xiaoliu.read.interfaces.util.PageBeanInfo;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.req.ReqMsg4ShopBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015年11月24日 上午9:51:37
 * @author:LiChangjiang
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqMsg4ShopBody extends PageBeanInfo
{
	/**
	 * 
	 */
	@XmlElement(name = "info")
	private ReqMsg4ShopInfo reqInfo = null;

	/**
	 * @return the reqInfo
	 */
	public ReqMsg4ShopInfo getReqInfo()
	{
		return reqInfo;
	}

	/**
	 * @param reqInfo
	 *            the reqInfo to set
	 */
	public void setReqInfo(ReqMsg4ShopInfo reqInfo)
	{
		this.reqInfo = reqInfo;
	}

}
