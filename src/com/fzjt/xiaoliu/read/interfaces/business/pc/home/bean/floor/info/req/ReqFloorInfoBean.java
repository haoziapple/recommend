/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.req.ReqFloorInfoBean
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
package com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.req.ReqFloorInfoBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-4 下午2:35:35
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqFloorInfoBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqFloorInfoBody reqBody;

    public ReqFloorInfoBody getReqBody()
    {
        return reqBody;
    }

    public void setReqBody(ReqFloorInfoBody reqBody)
    {
        this.reqBody = reqBody;
    }

}
