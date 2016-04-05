package com.fzjt.xiaoliu.read.interfaces.bean.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 接口返回bean
 * @className:com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 上午11:16:42
 * @author:ZhangYun
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspBean
{

    /**
     * 相应消息头信息
     */
    @XmlElement(name = "head")
    private RspHead head = null;

    public RspHead getHead()
    {
        return head;
    }

    public void setHead(RspHead head)
    {
        this.head = head;
    }

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return new ToStringBuilder(this).append("head", this.head).toString();
	}


}
