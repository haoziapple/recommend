/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.rsp.PriceInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-4     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.rsp;

/**
 * floor商品价格
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.rsp.PriceInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-4 下午3:51:10
 * @author:TangKai
 */
public class PriceInfo
{
    /**
     * 商品原价
     */
    private String priceOld;

    /**
     * 商品原价
     */
    private String priceNow;

    public String getPriceOld()
    {
        return priceOld;
    }

    public void setPriceOld(String priceOld)
    {
        this.priceOld = priceOld;
    }

    public String getPriceNow()
    {
        return priceNow;
    }

    public void setPriceNow(String priceNow)
    {
        this.priceNow = priceNow;
    }
}
