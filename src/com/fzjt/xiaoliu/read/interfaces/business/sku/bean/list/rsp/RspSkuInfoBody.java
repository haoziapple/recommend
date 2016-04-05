/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.list.rsp.RspSkuInfoBody
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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.list.rsp.RspSkuInfoBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-4 下午8:16:48
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspSkuInfoBody
{
    @XmlElement(name = "list")
    private SkuInfoList rspList;

    public SkuInfoList getRspList()
    {
        return rspList;
    }

    public void setRspList(SkuInfoList rspList)
    {
        this.rspList = rspList;
    }
}
