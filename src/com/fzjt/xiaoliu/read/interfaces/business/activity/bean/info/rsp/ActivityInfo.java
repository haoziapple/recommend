/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.activity.bean.info.rsp.ActivityInfo
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

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.activity.bean.info.rsp.ActivityInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-11 上午9:24:40
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ActivityInfo
{
    /**
     * 活动key
     */
    @XmlElement(name = "actvtkey")
    private String actvtKey;

    /**
     * 活动名称
     */
    @XmlElement(name = "actvtname")
    private String actvtName;

    /**
     * 活动图片
     */
    @XmlElement(name = "actvtpic")
    private String actvtPic;

    /**
     * 活动描述
     */
    @XmlElement(name = "actvtdesc")
    private String actvtDesc;

    /**
     * 跳转URL
     */
    @XmlElement(name = "linkurl")
    private String linkUrl;

    /**
     * 开始时间
     */
    @XmlElement(name = "datebegin")
    private String dateBeginStr;

    private Date dateBegin;

    /**
     * 截止时间
     */
    @XmlElement(name = "dateend")
    private String dateEndStr;

    private Date dateEnd;

    public String getActvtKey()
    {
        return actvtKey;
    }

    public void setActvtKey(String actvtKey)
    {
        this.actvtKey = actvtKey;
    }

    public String getActvtName()
    {
        return actvtName;
    }

    public void setActvtName(String actvtName)
    {
        this.actvtName = actvtName;
    }

    public String getActvtPic()
    {
        return actvtPic;
    }

    public void setActvtPic(String actvtPic)
    {
        this.actvtPic = actvtPic;
    }

    public String getActvtDesc()
    {
        return actvtDesc;
    }

    public void setActvtDesc(String actvtDesc)
    {
        this.actvtDesc = actvtDesc;
    }

    public String getLinkUrl()
    {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl)
    {
        this.linkUrl = linkUrl;
    }

    public String getDateBeginStr()
    {
        return dateBeginStr;
    }

    public void setDateBeginStr(String dateBeginStr)
    {
        this.dateBeginStr = dateBeginStr;
    }

    public Date getDateBegin()
    {
        return dateBegin;
    }

    public void setDateBegin(Date dateBegin)
    {
        this.dateBegin = dateBegin;
    }

    public String getDateEndStr()
    {
        return dateEndStr;
    }

    public void setDateEndStr(String dateEndStr)
    {
        this.dateEndStr = dateEndStr;
    }

    public Date getDateEnd()
    {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd)
    {
        this.dateEnd = dateEnd;
    }

}
