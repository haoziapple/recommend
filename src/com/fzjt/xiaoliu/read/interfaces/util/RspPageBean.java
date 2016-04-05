package com.fzjt.xiaoliu.read.interfaces.util;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.util.RspPageBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 下午12:41:57
 * @author:ZhangYun
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspPageBean
{
    /**
     * 显示条数
     */
    @XmlElement(name = "count")
    private String count = "";

    public String getCount()
    {
        return count;
    }

    public void setCount(String count)
    {
        this.count = count;
    }

}
