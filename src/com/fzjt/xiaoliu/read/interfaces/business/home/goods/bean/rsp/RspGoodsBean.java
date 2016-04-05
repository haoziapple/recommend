/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.rsp.RspGoodsBean
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
package com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * home goods响应体
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.rsp.RspGoodsBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-7 下午1:27:44
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspGoodsBean extends RspBean
{
	@XmlElement(name = "body")
	private RspGoodsBody rspGoodsBody = null;

	public RspGoodsBody getRspGoodsBody()
	{
		return rspGoodsBody;
	}

	public void setRspGoodsBody(RspGoodsBody rspGoodsBody)
	{
		this.rspGoodsBody = rspGoodsBody;
	}

}
