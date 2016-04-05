/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.req.ReqGoodsBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiChangjiang
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-10-30     LiChangjiang       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.bean.list.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.req.ReqGoodsBean
 * @version:v1.0.0
 * @date:2015-10-30 下午3:49:42
 * @author:LiChangjiang
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqGoodsBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqGoodsBody reqGoodsBody;

    public ReqGoodsBody getReqGoodsBody()
    {
        return reqGoodsBody;
    }

    public void setReqGoodsBody(ReqGoodsBody reqGoodsBody)
    {
        this.reqGoodsBody = reqGoodsBody;
    }

}
