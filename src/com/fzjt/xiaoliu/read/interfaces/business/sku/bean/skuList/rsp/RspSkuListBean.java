/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.skulist.bean.rsp.RspSkuListBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-12    TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuList.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;


/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.skulist.bean.rsp.RspSkuListBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-12 下午6:29:44
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspSkuListBean extends RspBean
{
	@XmlElement(name = "body")
	private RspSkuListBody rspSkuListBody = null;

    public RspSkuListBody getRspSkuListBody()
    {
        return rspSkuListBody;
    }

    public void setRspSkuListBody(RspSkuListBody rspSkuListBody)
    {
        this.rspSkuListBody = rspSkuListBody;
    }

}
