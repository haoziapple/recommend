package com.fzjt.xiaoliu.read.interfaces.business.first.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fzjt.xiaoliu.read.interfaces.business.first.bean.FirstBean;


/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.first.bean.req.ReqFirstInfo
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 上午11:18:09
 * @author:ZhangYun
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqFirstInfo
{
	/**
	 *  查询 firstBean 集合
	 */
	
	@XmlElement(name = "info")
	private FirstBean firstBean = null ;

    public FirstBean getFirstBean()
    {
        return firstBean;
    }

    public void setFirstBean(FirstBean firstBean)
    {
        this.firstBean = firstBean;
    }

}
