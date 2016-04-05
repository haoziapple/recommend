/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.rsp.RspCollectBody
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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fzjt.xiaoliu.read.interfaces.util.RspPageBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.rsp.RspCollectBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-18 上午10:55:08
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspCollectBody extends RspPageBean
{
    @XmlElement(name = "list")
    private RspCollectList rspCollectList = null;

    public RspCollectList getRspCollectList()
    {
        return rspCollectList;
    }

    public void setRspCollectList(RspCollectList rspCollectList)
    {
        this.rspCollectList = rspCollectList;
    }

}
