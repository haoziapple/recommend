/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.info.rsp.RspHelpInfo
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
package com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.info.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 返回PC商城首页帮助信息内容
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.info.rsp.RspHelpInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 下午8:18:44
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspHelpInfo
{
    // 标题
    @XmlElement(name = "title")
    private String title;

    // 内容
    @XmlElement(name = "context")
    private String context;

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getContext()
    {
        return context;
    }

    public void setContext(String context)
    {
        this.context = context;
    }
}
