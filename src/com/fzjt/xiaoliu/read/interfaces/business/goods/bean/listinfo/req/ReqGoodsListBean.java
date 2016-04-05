/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.req.ReqGoodsListBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-16      TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.req.ReqGoodsListBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-16 下午4:39:40
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqGoodsListBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqGoodsListBody reqGoodsListBody;

    public ReqGoodsListBody getReqGoodsListBody()
    {
        return reqGoodsListBody;
    }

    public void setReqGoodsListBody(ReqGoodsListBody reqGoodsListBody)
    {
        this.reqGoodsListBody = reqGoodsListBody;
    }

}
