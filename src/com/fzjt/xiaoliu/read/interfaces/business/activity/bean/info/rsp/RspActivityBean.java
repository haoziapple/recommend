/**

 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.activity.bean.info.rsp.RspActivityBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-10     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.activity.bean.info.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.activity.bean.info.rsp.RspActivityBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-10 下午9:44:48
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspActivityBean extends RspBean
{
    @XmlElement(name = "body")
    private RspActivityBody rspBody;

    public RspActivityBody getRspBody()
    {
        return rspBody;
    }

    public void setRspBody(RspActivityBody rspBody)
    {
        this.rspBody = rspBody;
    }

}
