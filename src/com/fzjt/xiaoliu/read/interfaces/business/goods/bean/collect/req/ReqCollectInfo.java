/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.req.ReqCollectInfo
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
package com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 业务bean，请求收藏列表信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.req.ReqCollectInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-18 上午10:28:52
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqCollectInfo
{
    /**
     * 用户key
     */
    @XmlElement(name = "userkey")
    private String userKey = "";

    /**
     * 类别key
     */
    @XmlElement(name = "typekey")
    private String typeKey = "";

    /**
     * 起始条数
     */
    @XmlElement(name = "fromnum")
    private String fromNum = "";

    /**
     * 截止条数
     */
    @XmlElement(name = "tonum")
    private String toNum = "";

    /**
     * 
     */
    @XmlElement(name = "rn")
    private String rn = "";

    public String getRn()
    {
        return rn;
    }

    public void setRn(String rn)
    {
        this.rn = rn;
    }

    public String getUserKey()
    {
        return userKey;
    }

    public void setUserKey(String userKey)
    {
        this.userKey = userKey;
    }

    public String getTypeKey()
    {
        return typeKey;
    }

    public void setTypeKey(String typeKey)
    {
        this.typeKey = typeKey;
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
