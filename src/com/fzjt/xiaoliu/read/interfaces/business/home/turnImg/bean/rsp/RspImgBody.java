/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.turn.img.bean.rsp.RspImgBody
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

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.turn.img.bean.rsp.RspImgBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-6 下午2:09:33
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspImgBody
{
	@XmlElement(name = "list")
	private RspImgList rspImgList;

	public RspImgList getRspImgList()
	{
		return rspImgList;
	}

	public void setRspImgList(RspImgList rspImgList)
	{
		this.rspImgList = rspImgList;
	}

}
