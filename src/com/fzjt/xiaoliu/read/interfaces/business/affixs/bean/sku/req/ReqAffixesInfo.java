/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.req.ReqAffixesInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-14     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 请求bean
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.req.ReqAffixesInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-17 上午10:56:53
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqAffixesInfo
{
    /**
     * sku标识符
     */
    @XmlElement(name = "skukey")
    private String skuKey;

    public String getSkuKey()
    {
        return skuKey;
    }

    public void setSkuKey(String skuKey)
    {
        this.skuKey = skuKey;
    }

}
