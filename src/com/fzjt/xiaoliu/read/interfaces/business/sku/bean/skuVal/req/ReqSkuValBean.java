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
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuVal.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuVal.req.ReqSkuValBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午9:22:21
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqSkuValBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqSkuValBody reqSkuValBody;

    public ReqSkuValBody getReqSkuValBody()
    {
        return reqSkuValBody;
    }

    public void setReqSkuValBody(ReqSkuValBody reqSkuValBody)
    {
        this.reqSkuValBody = reqSkuValBody;
    }

}
