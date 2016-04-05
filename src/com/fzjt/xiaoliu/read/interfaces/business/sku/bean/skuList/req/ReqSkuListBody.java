/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.skulist.bean.req.ReqSkuListBody
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
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuList.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fzjt.xiaoliu.read.interfaces.util.PageBeanInfo;


/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.skulist.bean.req.ReqSkuListBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-12 下午6:08:07
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqSkuListBody extends PageBeanInfo
{
	@XmlElement(name = "info")
	private SkuListInfo skuListInfo;

    public SkuListInfo getSkuListInfo()
    {
        return skuListInfo;
    }

    public void setSkuListInfo(SkuListInfo skuListInfo)
    {
        this.skuListInfo = skuListInfo;
    }

   

}
