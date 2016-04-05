/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.skulist.bean.req.ReqSkuListBean
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
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuList.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;



/**
 * sku list 请求体
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.skulist.bean.req.ReqSkuListBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-12 下午6:13:37
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqSkuListBean extends ReqBean
{
	@XmlElement(name = "body")
	private ReqSkuListBody reqSkuListBody;

    public ReqSkuListBody getReqSkuListBody()
    {
        return reqSkuListBody;
    }

    public void setReqSkuListBody(ReqSkuListBody reqSkuListBody)
    {
        this.reqSkuListBody = reqSkuListBody;
    }

}
