/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.req.ReqPVListBody
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-14     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.req.ReqPVListBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-14 下午3:00:32
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqPVListBody
{
    @XmlElement(name="info")
    private ReqPVListInfo reqPVListInfo;

    public ReqPVListInfo getReqPVListInfo()
    {
        return reqPVListInfo;
    }

    public void setReqPVListInfo(ReqPVListInfo reqPVListInfo)
    {
        this.reqPVListInfo = reqPVListInfo;
    }


}