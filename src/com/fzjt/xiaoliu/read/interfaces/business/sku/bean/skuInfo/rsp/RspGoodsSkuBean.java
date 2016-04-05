/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.rsp.RspGoodsBean
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
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuInfo.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * 商品sku bean
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.goodssku.bean.rsp.RspGoodsSkuBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-11 下午13:00:08
 * @author:Tangkai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspGoodsSkuBean extends RspBean
{
	@XmlElement(name="body")
	private RspGoodsSkuBody rspGoodsSkuBody;

    public RspGoodsSkuBody getRspGoodsSkuBody() {
        return rspGoodsSkuBody;
    }

    public void setRspGoodsSkuBody(RspGoodsSkuBody rspGoodsSkuBody) {
        this.rspGoodsSkuBody = rspGoodsSkuBody;
    }

	
}
