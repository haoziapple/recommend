/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.skulist.bean.rsp.RspSkuListBody
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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fzjt.xiaoliu.read.interfaces.util.RspPageBean;


/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.skulist.bean.rsp.RspSkuListBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-12 下午6:25:01
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspSkuListBody extends RspPageBean
{
	@XmlElement(name = "list")
	private RspSkuListList rspSkuListList = null;

    public RspSkuListList getRspSkuListList()
    {
        return rspSkuListList;
    }

    public void setRspSkuListList(RspSkuListList rspSkuListList)
    {
        this.rspSkuListList = rspSkuListList;
    }


}
