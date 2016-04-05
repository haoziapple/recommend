/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.usercenter.msg.bean.customer.req.ReqMsg4UserInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-26     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.usercenter.msg.bean.customer.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.usercenter.msg.bean.customer.req.ReqMsg4UserInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-26 下午2:05:28
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqMsg4UserInfo
{

    /**
     * 用户key
     */
    @XmlElement(name = "userkey")
    private String userKey = "";

    /**
     * 回复状态（0全部，1已回复，2未回复）
     */
    @XmlElement(name = "replystatus")
    private String replyStatus = "";

    /**
     * 商品key
     */
    @XmlElement(name = "goodskey")
    private String goodsKey = "";

    /**
     * 起始条数
     */
    @XmlAttribute
    private String fromNum;

    /**
     * 截止条数
     */
    @XmlAttribute
    private String toNum;

    public String getUserKey()
    {
        return userKey;
    }

    public void setUserKey(String userKey)
    {
        this.userKey = userKey;
    }

    public String getReplyStatus()
    {
        return replyStatus;
    }

    public void setReplyStatus(String replyStatus)
    {
        this.replyStatus = replyStatus;
    }

    public String getGoodsKey()
    {
        return goodsKey;
    }

    public void setGoodsKey(String goodsKey)
    {
        this.goodsKey = goodsKey;
    }

    public String getFromNum()
    {
        return fromNum;
    }

    public void setFromNum(String fromNum)
    {
        this.fromNum = fromNum;
    }

    public String getToNum()
    {
        return toNum;
    }

    public void setToNum(String toNum)
    {
        this.toNum = toNum;
    }

}
