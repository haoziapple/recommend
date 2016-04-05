/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.sort.bean.req.ReqSortBody
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiChangjiang
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-11     LiChangjiang       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.sort.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.sort.bean.req.ReqSortBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-11 下午7:32:25
 * @author:LiChangjiang
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqSortBody
{
    @XmlElement(name = "info")
    private ReqSortInfo reqSortInfo;

    public ReqSortInfo getReqSortInfo()
    {
        return reqSortInfo;
    }

    public void setReqSortInfo(ReqSortInfo reqSortInfo)
    {
        this.reqSortInfo = reqSortInfo;
    }

}
