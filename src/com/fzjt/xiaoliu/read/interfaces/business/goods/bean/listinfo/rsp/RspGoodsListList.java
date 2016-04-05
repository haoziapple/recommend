/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.req.RspGoodsList
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

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.rsp.RspGoodsList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-16 下午4:32:37
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspGoodsListList
{
    @XmlElement(name = "info")
    private List<RspGoodsListInfo> rspGoodsListList = null;

    public List<RspGoodsListInfo> getRspGoodsListList()
    {
        return rspGoodsListList;
    }

    public void setRspGoodsListList(List<RspGoodsListInfo> rspGoodsListList)
    {
        this.rspGoodsListList = rspGoodsListList;
    }

}
