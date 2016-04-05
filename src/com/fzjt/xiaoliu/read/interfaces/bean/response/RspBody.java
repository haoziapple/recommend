package com.fzjt.xiaoliu.read.interfaces.bean.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 返回体
 * @className:com.fzjt.xiaoliu.read.interfaces.bean.response.RspBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 上午11:17:00
 * @author:ZhangYun
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspBody
{
    /**
     * 返回码
     */
    @XmlElement(name = "result")
    private String result = "";

    /**
     * 返回描述
     */
    @XmlElement(name = "desc")
    private String desc = "";

    public String getResult()
    {
        return result;
    }

    public void setResult(String result)
    {
        this.result = result;
    }

    public String getDesc()
    {
        return desc;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
    }

}
