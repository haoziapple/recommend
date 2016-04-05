/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.bean.goods.req.ReqCheckGoodsBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-8     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.check.bean.goods.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.bean.goods.req.ReqCheckGoodsBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-23 下午4:28:22
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqCheckGoodsBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqCheckGoodsBody reqBody;

    public ReqCheckGoodsBody getReqBody()
    {
        return reqBody;
    }

    public void setReqBody(ReqCheckGoodsBody reqBody)
    {
        this.reqBody = reqBody;
    }

}
