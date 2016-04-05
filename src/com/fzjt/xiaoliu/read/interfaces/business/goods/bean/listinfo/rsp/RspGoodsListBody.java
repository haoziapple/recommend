/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.rsp.RspGoodsListBody
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

import com.fzjt.xiaoliu.read.interfaces.util.RspPageBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.rsp.RspGoodsListBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-16 下午4:40:50
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspGoodsListBody extends RspPageBean
{
    @XmlElement(name = "list")
    private RspGoodsListList rspGoodsListList = null;

    public RspGoodsListList getRspGoodsListList()
    {
        return rspGoodsListList;
    }

    public void setRspGoodsListList(RspGoodsListList rspGoodsListList)
    {
        this.rspGoodsListList = rspGoodsListList;
    }

}
