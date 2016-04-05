/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.rsp.RspMsgInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-13     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.list.rsp;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.list.rsp.RspMsgInfo
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015年11月24日 上午9:39:08
 * @author:LiChangjiang
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspMsgInfo
{
    /**
     * 消息key
     */
    @XmlElement(name = "msgkey")
    private String msgKey;

    /**
     * 商品key
     */
    @XmlElement(name = "goodskey")
    private String goodsKey;

    /**
     * 发送人key
     */
    @XmlElement(name = "userkey")
    private String userKey;

    /**
     * 接收人key
     */
    @XmlElement(name = "shopkey")
    private String shopKey;

    /**
     * 咨询
     */
    @XmlElement(name = "msginfo")
    private String msgInfo;

    /**
     * 回复信息
     */
    @XmlElement(name = "replyinfo")
    private String replyInfo;

    /**
     * 发送时间
     */
    @XmlTransient
    private Date addTime;
    /**
     * 发送时间
     */
    @XmlElement(name = "addtime")
    private String addTimeStr;

    /**
     * 回复时间
     */
    @XmlTransient
    private Date replyTime;

    /**
     * 回复时间
     */
    @XmlElement(name = "replytime")
    private String replyTimeStr;

    /**
     * 回复状态（0已回复，1待回复）
     */
    @XmlElement(name = "replystatus")
    private String replyStatus;

    /**
     * 状态（0有效，1无效）
     */
    @XmlElement(name = "status")
    private String status;

    /**
     * 用户昵称
     */
    @XmlElement(name = "nickname")
    private String nickName;

    /**
     * 头像
     */
    @XmlElement(name = "headpic")
    private String headPic = "";

    /**
     * 用于排序
     */
    @XmlElement(name = "indexnum")
    private String indexNum = "";

    public String getMsgKey()
    {
        return msgKey;
    }

    public void setMsgKey(String msgKey)
    {
        this.msgKey = msgKey;
    }

    public String getGoodsKey()
    {
        return goodsKey;
    }

    public void setGoodsKey(String goodsKey)
    {
        this.goodsKey = goodsKey;
    }

    public String getUserKey()
    {
        return userKey;
    }

    public void setUserKey(String userKey)
    {
        this.userKey = userKey;
    }

    public String getShopKey()
    {
        return shopKey;
    }

    public void setShopKey(String shopKey)
    {
        this.shopKey = shopKey;
    }

    public String getMsgInfo()
    {
        return msgInfo;
    }

    public void setMsgInfo(String msgInfo)
    {
        this.msgInfo = msgInfo;
    }

    public String getReplyInfo()
    {
        return replyInfo;
    }

    public void setReplyInfo(String replyInfo)
    {
        this.replyInfo = replyInfo;
    }

    public Date getAddTime()
    {
        return addTime;
    }

    public void setAddTime(Date addTime)
    {
        this.addTime = addTime;
    }

    public Date getReplyTime()
    {
        return replyTime;
    }

    public void setReplyTime(Date replyTime)
    {
        this.replyTime = replyTime;
    }

    public String getReplyStatus()
    {
        return replyStatus;
    }

    public void setReplyStatus(String replyStatus)
    {
        this.replyStatus = replyStatus;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getNickName()
    {
        return nickName;
    }

    public void setNickName(String nickName)
    {
        this.nickName = nickName;
    }

    public String getIndexNum()
    {
        return indexNum;
    }

    public void setIndexNum(String indexNum)
    {
        this.indexNum = indexNum;
    }

    public String getAddTimeStr()
    {
        return addTimeStr;
    }

    public void setAddTimeStr(String addTimeStr)
    {
        this.addTimeStr = addTimeStr;
    }

    public String getReplyTimeStr()
    {
        return replyTimeStr;
    }

    public void setReplyTimeStr(String replyTimeStr)
    {
        this.replyTimeStr = replyTimeStr;
    }

    public String getHeadPic()
    {
        return headPic;
    }

    public void setHeadPic(String headPic)
    {
        this.headPic = headPic;
    }

}
