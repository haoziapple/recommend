/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.view.rsp.RspViewBean
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
package com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.view.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.view.rsp.RspViewBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-4 下午5:09:06
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspViewBean extends RspBean
{
    @XmlElement(name = "body")
    private RspViewBody rspBody;

    public RspViewBody getRspBody()
    {
        return rspBody;
    }

    public void setRspBody(RspViewBody rspBody)
    {
        this.rspBody = rspBody;
    }

}
