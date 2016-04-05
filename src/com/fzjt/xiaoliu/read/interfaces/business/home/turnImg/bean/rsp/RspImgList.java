package com.fzjt.xiaoliu.read.interfaces.business.home.turnImg.bean.rsp;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.turn.img.bean.rsp.RspImgList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-6 下午2:10:17
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspImgList
{
	@XmlElement(name = "info")
	private List<RspImgInfo> rspImgInfo;

	public List<RspImgInfo> getRspImgInfo()
	{
		return rspImgInfo;
	}

	public void setRspImgInfo(List<RspImgInfo> rspImgInfo)
	{
		this.rspImgInfo = rspImgInfo;
	}

}
