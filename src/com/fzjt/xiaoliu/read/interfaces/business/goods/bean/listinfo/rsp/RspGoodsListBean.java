/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.rsp.RspGoodsListBean
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
package com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.rsp.RspGoodsListBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-16 下午4:41:12
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspGoodsListBean extends RspBean
{
    @XmlElement(name = "body")
    private RspGoodsListBody rspGoodsListBody = null;

    public RspGoodsListBody getRspGoodsListBody()
    {
        return rspGoodsListBody;
    }

    public void setRspGoodsListBody(RspGoodsListBody rspGoodsListBody)
    {
        this.rspGoodsListBody = rspGoodsListBody;
    }

}
