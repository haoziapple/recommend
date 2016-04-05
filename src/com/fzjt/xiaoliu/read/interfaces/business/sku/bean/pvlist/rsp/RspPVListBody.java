/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.rsp.RspPVListBody
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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.rsp.RspPVListBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-14 下午2:54:20
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspPVListBody
{
    @XmlElement(name = "list")
    private RspPVListList rspPVList;

    public RspPVListList getRspPVList()
    {
        return rspPVList;
    }

    public void setRspPVList(RspPVListList rspPVList)
    {
        this.rspPVList = rspPVList;
    }

}
