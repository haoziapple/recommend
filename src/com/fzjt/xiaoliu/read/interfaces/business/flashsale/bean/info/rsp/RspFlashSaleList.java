/**
 * Copyright (C) 2016 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.rsp.RspFlashSaleList
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2016-1-6     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.rsp;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.rsp.RspFlashSaleList
 * @description:TODO
 * @version:v1.0.0
 * @date:2016-1-6 下午8:15:59
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspFlashSaleList
{
    @XmlElement(name = "info")
    private List<RspFlashSaleInfo> infoList;

    public List<RspFlashSaleInfo> getInfoList()
    {
        return infoList;
    }

    public void setInfoList(List<RspFlashSaleInfo> infoList)
    {
        this.infoList = infoList;
    }

}
