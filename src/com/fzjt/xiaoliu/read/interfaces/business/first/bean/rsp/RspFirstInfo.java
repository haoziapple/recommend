package com.fzjt.xiaoliu.read.interfaces.business.first.bean.rsp;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fzjt.xiaoliu.read.interfaces.business.first.bean.FirstBean;


/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.first.bean.rsp.RspFirstInfo
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 上午11:18:39
 * @author:ZhangYun
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspFirstInfo
{
	/**
	 *  返回 FirstBean 对象
	 */
	
	@XmlElement(name = "info")
	private List<FirstBean> list = null ;

    public List<FirstBean> getList()
    {
        return list;
    }

    public void setList(List<FirstBean> list)
    {
        this.list = list;
    }

	
}
