/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.ReqGoodsBody
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

import com.fzjt.xiaoliu.read.interfaces.util.PageBeanInfo;

/**
 * ReqGoodsBody
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.ReqGoodsBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-7 下午1:12:29
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqGoodsBody extends PageBeanInfo
{
	@XmlElement(name = "info")
	private ReqGoodsInfo reqGoodsInfo;

	public ReqGoodsInfo getReqGoodsInfo()
	{
		return reqGoodsInfo;
	}

	public void setReqGoodsInfo(ReqGoodsInfo reqGoodsInfo)
	{
		this.reqGoodsInfo = reqGoodsInfo;
	}

}
