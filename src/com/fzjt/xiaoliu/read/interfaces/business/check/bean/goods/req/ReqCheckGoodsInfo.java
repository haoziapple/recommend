/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.bean.goods.req.ReqCheckGoodsInfo
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

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.bean.goods.req.ReqCheckGoodsInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-23 下午4:27:56
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqCheckGoodsInfo
{
    /**
     * userkey
     */
    @XmlElement(name = "userkey")
    private String userKey = "";

    /**
     * 商品key，多个商品用","分隔
     */
    @XmlElement(name = "goodskey")
    private String goodsKey = "";

    /**
     * skuKey，多个商品用","分隔
     */
    @XmlElement(name = "skukey")
    private String skuKey = "";

    /**
     * 购买数量，多个商品用","分隔
     */
    @XmlElement(name = "num")
    private String num = "";

    /**
     * 0表示从购物车生成订单或者直接购买的商品验证 ，1表示添加购物车时的商品验证
     */
    @XmlElement(name = "style")
    private String style = "";

    public String getUserKey()
    {
        return userKey;
    }

    public void setUserKey(String userKey)
    {
        this.userKey = userKey;
    }

    public String getGoodsKey()
    {
        return goodsKey;
    }

    public void setGoodsKey(String goodsKey)
    {
        this.goodsKey = goodsKey;
    }

    public String getSkuKey()
    {
        return skuKey;
    }

    public void setSkuKey(String skuKey)
    {
        this.skuKey = skuKey;
    }

    public String getNum()
    {
        return num;
    }

    public void setNum(String num)
    {
        this.num = num;
    }

    public String getStyle()
    {
        return style;
    }

    public void setStyle(String style)
    {
        this.style = style;
    }

}
