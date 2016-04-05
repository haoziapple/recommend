/**
 * Copyright (C) 2016 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.rsp.RspFlashSaleInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2016-1-6     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.rsp;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.rsp.RspFlashSaleInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2016-1-6 下午8:09:23
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspFlashSaleInfo
{
    /**
     * 活动key
     */
    @XmlElement(name = "saleskey")
    private String salesKey;

    /**
     * 活动名称
     */
    @XmlElement(name = "salesname")
    private String salesName;

    /**
     * 活动描述
     */
    @XmlElement(name = "salesdesc")
    private String salesDesc;

    /**
     * 活动图片
     */
    @XmlElement(name = "salespic")
    private String salesPic;

    /**
     * 活动日期
     */
    @XmlElement(name = "salesdate")
    private String salesDate;

    /**
     * 活动开始时间
     */
    @XmlElement(name = "begintime")
    private String beginTimeDate;

    @XmlTransient
    private Date beginTime;

    /**
     * 活动结束时间
     */
    @XmlElement(name = "endtime")
    private String endTimeDate;

    @XmlTransient
    private Date endTime;
    
    @XmlTransient
    private Date sysTime;
    /**
     * 活动状态：1-即将开始，2-已经结束，3-正在进行
     */
    @XmlElement(name = "salestatus")
    private String saleStatus;
    
    /**
     * 是否默认展示：0-默认展示，1-不默认展示
     */
    @XmlElement(name = "defaultshow")
    private String defaultShow;

    public String getSalesKey()
    {
        return salesKey;
    }

    public void setSalesKey(String salesKey)
    {
        this.salesKey = salesKey;
    }

    public String getSalesName()
    {
        return salesName;
    }

    public void setSalesName(String salesName)
    {
        this.salesName = salesName;
    }

    public String getSalesDesc()
    {
        return salesDesc;
    }

    public void setSalesDesc(String salesDesc)
    {
        this.salesDesc = salesDesc;
    }

    public String getSalesPic()
    {
        return salesPic;
    }

    public void setSalesPic(String salesPic)
    {
        this.salesPic = salesPic;
    }

    public String getSalesDate()
    {
        return salesDate;
    }

    public void setSalesDate(String salesDate)
    {
        this.salesDate = salesDate;
    }

    public String getBeginTimeDate()
    {
        return beginTimeDate;
    }

    public void setBeginTimeDate(String beginTimeDate)
    {
        this.beginTimeDate = beginTimeDate;
    }

    public Date getBeginTime()
    {
        return beginTime;
    }

    public void setBeginTime(Date beginTime)
    {
        this.beginTime = beginTime;
    }

    public String getEndTimeDate()
    {
        return endTimeDate;
    }

    public void setEndTimeDate(String endTimeDate)
    {
        this.endTimeDate = endTimeDate;
    }

    public Date getEndTime()
    {
        return endTime;
    }

    public void setEndTime(Date endTime)
    {
        this.endTime = endTime;
    }

	public String getSaleStatus()
	{
		return saleStatus;
	}

	public void setSaleStatus(String saleStatus)
	{
		this.saleStatus = saleStatus;
	}

	public String getDefaultShow()
	{
		return defaultShow;
	}

	public void setDefaultShow(String defaultShow)
	{
		this.defaultShow = defaultShow;
	}

	public Date getSysTime()
	{
		return sysTime;
	}

	public void setSysTime(Date sysTime)
	{
		this.sysTime = sysTime;
	}
}
