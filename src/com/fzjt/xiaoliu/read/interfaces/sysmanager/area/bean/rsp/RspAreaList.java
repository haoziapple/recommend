package com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.rsp;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.rsp.RspAreaList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-12 下午6:02:25
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspAreaList
{
	@XmlElement(name = "info")
	private List<RspAreaInfo> rspAreaInfo;

	public List<RspAreaInfo> getRspAreaInfo()
	{
		return rspAreaInfo;
	}

	public void setRspAreaInfo(List<RspAreaInfo> rspAreaInfo)
	{
		this.rspAreaInfo = rspAreaInfo;
	}

}
