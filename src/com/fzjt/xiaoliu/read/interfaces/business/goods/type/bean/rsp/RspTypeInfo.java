/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.rsp.RspTypeInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-13     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 响应bean
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.rsp.RspTypeInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 上午10:07:33
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspTypeInfo
{
	/**
	 * 类别key
	 */
	@XmlElement(name = "typekey")
	private String typeKey;

	/**
	 * 上级类别key
	 */
	@XmlElement(name = "suptypekey")
	private String supTypeKey;

	/**
	 * 类别名称
	 */
	@XmlElement(name = "typename")
	private String typeName;

	/**
	 * 类别描述
	 */
	@XmlElement(name = "typedesc")
	private String typeDesc;

	/**
	 * 状态(0有效，1无效)
	 */
	@XmlTransient
	private String status;

	/**
	 * 排序
	 */
	@XmlElement(name = "orderflag")
	private int orderFlag;

	/**
	 * 是否叶节点（0是，1否）
	 */
	@XmlElement(name = "isend")
	private String isEnd;

	/**
	 * 类别颜色
	 */
	@XmlElement(name = "typecolor")
	private String typeColor;

	/**
	 * 类别图片
	 */
	@XmlElement(name = "typepic")
	private String typePic;

	/**
	 * 是否首页展现（0是，1否）
	 */
	@XmlElement(name = "isshow")
	private String isShow;

	public String getTypeKey()
	{
		return typeKey;
	}

	public void setTypeKey(String typeKey)
	{
		this.typeKey = typeKey;
	}

	public String getSupTypeKey()
	{
		return supTypeKey;
	}

	public void setSupTypeKey(String supTypeKey)
	{
		this.supTypeKey = supTypeKey;
	}

	public String getTypeName()
	{
		return typeName;
	}

	public void setTypeName(String typeName)
	{
		this.typeName = typeName;
	}

	public String getTypeDesc()
	{
		return typeDesc;
	}

	public void setTypeDesc(String typeDesc)
	{
		this.typeDesc = typeDesc;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public int getOrderFlag()
	{
		return orderFlag;
	}

	public void setOrderFlag(int orderFlag)
	{
		this.orderFlag = orderFlag;
	}

	public String getIsEnd()
	{
		return isEnd;
	}

	public void setIsEnd(String isEnd)
	{
		this.isEnd = isEnd;
	}

	public String getTypeColor()
	{
		return typeColor;
	}

	public void setTypeColor(String typeColor)
	{
		this.typeColor = typeColor;
	}

	public String getTypePic()
	{
		return typePic;
	}

	public void setTypePic(String typePic)
	{
		this.typePic = typePic;
	}

	public String getIsShow()
	{
		return isShow;
	}

	public void setIsShow(String isShow)
	{
		this.isShow = isShow;
	}

}
