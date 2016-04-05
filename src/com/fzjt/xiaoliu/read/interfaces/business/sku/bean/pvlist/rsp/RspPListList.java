/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.rsp.RspPListList
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
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.rsp;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.rsp.RspPListList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-14 下午3:08:54
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspPListList
{
    @XmlElement(name = "info")
    private List<RspPListInfo> rspPListInfo = null;

    public List<RspPListInfo> getRspPListInfo()
    {
        return rspPListInfo;
    }

    public void setRspPListInfo(List<RspPListInfo> rspPListInfo)
    {
        this.rspPListInfo = rspPListInfo;
    }

}
