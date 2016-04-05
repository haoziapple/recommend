/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.affix.req.ReqGoodsAffixInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-17     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.goods.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 请求商品附件信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.affix.req.ReqGoodsAffixInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-17 上午10:27:55
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqGoodsAffixInfo
{
    /**
     * 商品key
     */
    @XmlElement(name = "goodskey")
    private String goodsKey;

    public String getGoodsKey()
    {
        return goodsKey;
    }

    public void setGoodsKey(String goodsKey)
    {
        this.goodsKey = goodsKey;
    }

}