package com.fzjt.xiaoliu.read.interfaces.util;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 分页的BEAN
 * @className:com.fzjt.xiaoliu.read.interfaces.util.PageBeanInfo
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 下午12:40:52
 * @author:ZhangYun
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class PageBeanInfo
{
    
    @XmlElement(name = "page")
	private PageBean pageBean;

    public PageBean getPageBean()
    {
        return pageBean;
    }

    public void setPageBean(PageBean pageBean)
    {
        this.pageBean = pageBean;
    }
	    
	
}
