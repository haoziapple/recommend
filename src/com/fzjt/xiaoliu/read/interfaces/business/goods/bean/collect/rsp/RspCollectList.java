/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.rsp.RspCollectList
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-18     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.rsp;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.rsp.RspCollectList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-18 上午10:50:21
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspCollectList
{
    @XmlElement(name = "info")
    private List<RspCollectInfo> rspCollectInfoList = null;

    public List<RspCollectInfo> getRspCollectInfoList()
    {
        return rspCollectInfoList;
    }

    public void setRspCollectInfoList(List<RspCollectInfo> rspCollectInfoList)
    {
        this.rspCollectInfoList = rspCollectInfoList;
    }

}
