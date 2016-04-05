/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.skulist.bean.rsp.RspSkuListList
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-12    TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuList.rsp;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * RspSkuListList
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.skulist.bean.rsp.RspSkuListList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-12 下午6:20:49
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspSkuListList
{
    @XmlElement(name = "info")
    private List<RspSkuListInfo> rspSkuListInfo = null;

    public List<RspSkuListInfo> getRspSkuListInfo()
    {
        return rspSkuListInfo;
    }

    public void setRspSkuListInfo(List<RspSkuListInfo> rspSkuListInfo)
    {
        this.rspSkuListInfo = rspSkuListInfo;
    }

}
