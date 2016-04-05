/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.turn.img.bean.rsp.RspImgBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-6     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.turnImg.bean.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * turn img响应
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.turn.img.bean.rsp.RspImgBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-6 下午2:06:22
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspImgBean extends RspBean
{
	@XmlElement(name = "body")
	private RspImgBody rspImgBody;

	public RspImgBody getRspImgBody()
	{
		return rspImgBody;
	}

	public void setRspImgBody(RspImgBody rspImgBody)
	{
		this.rspImgBody = rspImgBody;
	}

}
