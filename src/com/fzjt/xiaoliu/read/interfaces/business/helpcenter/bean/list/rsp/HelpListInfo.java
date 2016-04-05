/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.rsp.HelpListInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-2     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 返回PC商城帮助中心类别
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.rsp.HelpListInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 下午8:30:31
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class HelpListInfo
{
    /**
     * 类别key
     */
    @XmlElement(name = "hctkey")
    private String hctKey;

    /**
     * 类别名称
     */
    @XmlElement(name = "hctname")
    private String hctName;

    /**
     * 帮助内容key
     */
    @XmlElement(name = "datakey")
    private String dataKey;

    /**
     * 帮助信息list
     */
    @XmlElement(name = "hlist")
    private HelpInfoList titleList;

    public String getHctKey()
    {
        return hctKey;
    }

    public void setHctKey(String hctKey)
    {
        this.hctKey = hctKey;
    }

    public String getHctName()
    {
        return hctName;
    }

    public void setHctName(String hctName)
    {
        this.hctName = hctName;
    }

    public HelpInfoList getTitleList()
    {
        return titleList;
    }

    public void setTitleList(HelpInfoList titleList)
    {
        this.titleList = titleList;
    }

    public String getDataKey()
    {
        return dataKey;
    }

    public void setDataKey(String dataKey)
    {
        this.dataKey = dataKey;
    }

}
