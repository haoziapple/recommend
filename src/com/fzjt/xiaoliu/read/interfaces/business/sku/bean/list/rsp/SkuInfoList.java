/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.list.rsp.SkuInfoList
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
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.list.rsp;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.list.rsp.SkuInfoList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-4 下午8:15:37
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class SkuInfoList
{
    @XmlElement(name = "info")
    private List<SkuInfo> skuList;

    public List<SkuInfo> getSkuList()
    {
        return skuList;
    }

    public void setSkuList(List<SkuInfo> skuList)
    {
        this.skuList = skuList;
    }
}
