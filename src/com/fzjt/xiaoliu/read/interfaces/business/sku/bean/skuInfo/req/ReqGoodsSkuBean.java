/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.req.ReqGoodsBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-3     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuInfo.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;
/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.goodssku.bean.req.ReqGoodsSkuBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-11 上午11:16:28
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqGoodsSkuBean extends ReqBean
{
	@XmlElement(name = "body")
    private ReqGoodsSkuBody reqGoodsSkuBody;

	public ReqGoodsSkuBody getReqGoodsSkuBody()
	{
		return reqGoodsSkuBody;
	}

	public void setReqGoodsSkuBody(ReqGoodsSkuBody reqGoodsSkuBody)
	{
		this.reqGoodsSkuBody = reqGoodsSkuBody;
	}
    
}
