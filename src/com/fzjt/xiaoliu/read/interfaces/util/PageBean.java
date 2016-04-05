package com.fzjt.xiaoliu.read.interfaces.util;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 分页信息
 * @className:com.fzjt.xiaoliu.read.interfaces.util.PageBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 下午12:40:29
 * @author:ZhangYun
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class PageBean
{
    /**
     * 开始条数
     */
    @XmlElement(name = "fromnum")
    private String fromNum = "";

    /**
     * 结束条数
     */
    @XmlElement(name = "tonum")
    private String toNum = "";

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
