/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.rsp.RspCollectBean
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
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.rsp.RspCollectBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-18 上午10:54:39
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspCollectBean extends RspBean
{
    @XmlElement(name = "body")
    private RspCollectBody rspCollectBody = null;

    public RspCollectBody getRspCollectBody()
    {
        return rspCollectBody;
    }

    public void setRspCollectBody(RspCollectBody rspCollectBody)
    {
        this.rspCollectBody = rspCollectBody;
    }

}
