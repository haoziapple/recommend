/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.info.req.ReqSysMsgKeyInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-19     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.info.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


/**
 * 推送消息请求信息
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.info.req.ReqSysMsgKeyInfo
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-19 下午7:56:47
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqSysMsgKeyInfo
{
    /**
     * 消息key
     */
    @XmlElement(name = "msgkey")
    private String msgKey = "";

    public String getMsgKey()
    {
        return msgKey;
    }

    public void setMsgKey(String msgKey)
    {
        this.msgKey = msgKey;
    }
}
