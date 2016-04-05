package com.fzjt.xiaoliu.read.interfaces.business.first.bean.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.first.bean.rsp.RspFirstList
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 上午11:18:48
 * @author:ZhangYun
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspFirstList 
{
	/**
	 *  返回体
	 */
	@XmlElement(name = "list")
	private RspFirstInfo rspFirstInfo = null ;

    public RspFirstInfo getRspFirstInfo()
    {
        return rspFirstInfo;
    }

    public void setRspFirstInfo(RspFirstInfo rspFirstInfo)
    {
        this.rspFirstInfo = rspFirstInfo;
    }
}
