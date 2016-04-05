/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.rsp.RspGoodsBody
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

import com.fzjt.xiaoliu.read.interfaces.util.RspPageBean;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.rsp.RspGoodsBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-10-30 下午4:09:37
 * @author:LiChangjiang
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspGoodsBody extends RspPageBean
{
    @XmlElement(name = "list")
    private RspGoodsList rspGoodsList = null;

    public RspGoodsList getRspGoodsList()
    {
        return rspGoodsList;
    }

    public void setRspGoodsList(RspGoodsList rspGoodsList)
    {
        this.rspGoodsList = rspGoodsList;
    }

}
