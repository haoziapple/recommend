/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.list.rsp.ReqMsg4ShopBean
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
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * 商家查询买家咨询列表
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.list.rsp.ReqMsg4ShopBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015年11月24日 上午9:49:59
 * @author:LiChangjiang
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqMsg4ShopBean extends ReqBean
{
	@XmlElement(name = "body")
	private ReqMsg4ShopBody reqBody = null;

	/**
	 * @return the reqBody
	 */
	public ReqMsg4ShopBody getReqBody()
	{
		return reqBody;
	}

	/**
	 * @param reqBody
	 *            the reqBody to set
	 */
	public void setReqBody(ReqMsg4ShopBody reqBody)
	{
		this.reqBody = reqBody;
	}

}
