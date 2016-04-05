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
package com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;
/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.req.ReqGoodsObjBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-3 下午3:27:16
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqGoodsObjBean extends ReqBean
{
	@XmlElement(name = "body")
    private ReqGoodsObjBody reqGoodsBody;

	public ReqGoodsObjBody getReqGoodsBody()
	{
		return reqGoodsBody;
	}

	public void setReqGoodsBody(ReqGoodsObjBody reqGoodsBody)
	{
		this.reqGoodsBody = reqGoodsBody;
	}
    
}
