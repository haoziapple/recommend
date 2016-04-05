/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.ReqGoodsBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-7     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * home goods请求体
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.ReqGoodsBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-7 下午1:09:31
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqGoodsBean extends ReqBean
{
	@XmlElement(name = "body")
	private ReqGoodsBody reqGoodsBody;

	public ReqGoodsBody getReqGoodsBody()
	{
		return reqGoodsBody;
	}

	public void setReqGoodsBody(ReqGoodsBody reqGoodsBody)
	{
		this.reqGoodsBody = reqGoodsBody;
	}

}
