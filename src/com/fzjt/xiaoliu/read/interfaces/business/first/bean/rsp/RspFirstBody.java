package com.fzjt.xiaoliu.read.interfaces.business.first.bean.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;


/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.first.bean.rsp.RspFirstBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 上午11:18:34
 * @author:ZhangYun
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspFirstBody extends RspBean
{
	/**
	 *  返回体
	 */
	@XmlElement(name = "body")
	private RspFirstList body = null ;

    public RspFirstList getBody()
    {
        return body;
    }

    public void setBody(RspFirstList body)
    {
        this.body = body;
    }

}
