/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.turn.img.bean.req.ReqImgBean
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
package com.fzjt.xiaoliu.read.interfaces.business.home.turnImg.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * turn img 请求
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.turn.img.bean.req.ReqImgBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-6 下午2:03:25
 * @author:LiangJin
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqImgBean extends ReqBean
{
	/**
	 * 请求体
	 */
	@XmlElement(name = "body")
	private ReqImgBody reqImgBody;

	public ReqImgBody getReqImgBody()
	{
		return reqImgBody;
	}

	public void setReqImgBody(ReqImgBody reqImgBody)
	{
		this.reqImgBody = reqImgBody;
	}

}
