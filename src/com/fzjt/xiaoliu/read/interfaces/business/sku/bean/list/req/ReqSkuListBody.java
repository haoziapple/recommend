/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.list.req.ReqSkuListBody
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
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.list.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.list.req.ReqSkuListBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-4 下午8:07:58
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqSkuListBody
{
    @XmlElement(name = "info")
    private ReqSkuListInfo reqInfo;

    public ReqSkuListInfo getReqInfo()
    {
        return reqInfo;
    }

    public void setReqInfo(ReqSkuListInfo reqInfo)
    {
        this.reqInfo = reqInfo;
    }

}
