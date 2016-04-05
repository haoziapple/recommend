/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.push.sysmsg.bean.rsp.RspSysMsgInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-18     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.list.rsp;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 响应bean
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.list.rsp.RspSysMsgInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-19 下午7:49:46
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspSysMsgInfo
{
    /**
     * 标题
     */
    @XmlElement(name = "title")
    private String title = "";

    /**
     * 通知消息
     */
    @XmlElement(name = "alert")
    private String alert = "";

    /**
     * 内容
     */
    @XmlElement(name = "msgcontent")
    private String msgContent = "";

    /**
     * 推送时间
     */
    @XmlTransient
    private Date addTime;

    /**
     * 推送时间
     */
    @XmlElement(name = "addtime")
    private String addTimeStr = "";

    /**
     * 消息key
     */
    @XmlElement(name = "msgkey")
    private String msgKey = "";

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAlert()
    {
        return alert;
    }

    public void setAlert(String alert)
    {
        this.alert = alert;
    }

    public String getMsgContent()
    {
        return msgContent;
    }

    public void setMsgContent(String msgContent)
    {
        this.msgContent = msgContent;
    }

    public String getMsgKey()
    {
        return msgKey;
    }

    public void setMsgKey(String msgKey)
    {
        this.msgKey = msgKey;
    }

    public String getAddTimeStr()
    {
        return addTimeStr;
    }

    public void setAddTimeStr(String addTimeStr)
    {
        this.addTimeStr = addTimeStr;
    }

    public void setAddTime(Date addTime)
    {
        this.addTime = addTime;
    }

    public Date getAddTime()
    {
        return addTime;
    }

}
