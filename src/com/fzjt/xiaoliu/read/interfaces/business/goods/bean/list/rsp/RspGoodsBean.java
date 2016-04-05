/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.rsp.RspGoodsBean
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
package com.fzjt.xiaoliu.read.interfaces.business.goods.bean.list.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.rsp.RspGoodsBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-10-30 下午4:04:15
 * @author:LiChangjiang
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspGoodsBean extends RspBean
{
    @XmlElement(name = "body")
    private RspGoodsBody rspGoodsBody = null;

    public RspGoodsBody getRspGoodsBody()
    {
        return rspGoodsBody;
    }

    public void setRspGoodsBody(RspGoodsBody rspGoodsBody)
    {
        this.rspGoodsBody = rspGoodsBody;
    }

}
