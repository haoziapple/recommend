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
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuVal.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * 商品sku bean
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuVal.rsp.RspSkuValBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午9:27:09
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspSkuValBean extends RspBean
{
    @XmlElement(name = "body")
    private RspSkuValBody rspSkuValBody;

    public RspSkuValBody getRspSkuValBody()
    {
        return rspSkuValBody;
    }

    public void setRspSkuValBody(RspSkuValBody rspSkuValBody)
    {
        this.rspSkuValBody = rspSkuValBody;
    }

}
