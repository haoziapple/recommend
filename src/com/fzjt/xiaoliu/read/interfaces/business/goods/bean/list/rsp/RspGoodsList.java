/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.rsp.RspGoodsList
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

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.rsp.RspGoodsList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-10-30 下午4:10:21
 * @author:LiChangjiang
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspGoodsList
{
    @XmlElement(name = "info")
    private List<RspGoodsInfo> goodsList = null;

    public List<RspGoodsInfo> getGoodsList()
    {
        return goodsList;
    }

    public void setGoodsList(List<RspGoodsInfo> goodsList)
    {
        this.goodsList = goodsList;
    }

}
