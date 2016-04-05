/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.rsp.RspMsgInfo
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
package com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.rsp;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.rsp.RspMsgInfo4Shop
 * @description:TODO
 * @version:v1.0.0
 * @date:2015年11月24日 上午10:39:10
 * @author:LiChangjiang
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspMsgInfo4Shop
{
	/**
	 * 消息key
	 */
	@XmlElement(name = "msgkey")
	private String msgKey;

	/**
	 * 商品key
	 */
	@XmlElement(name = "goodskey")
	private String goodsKey;

	@XmlElement(name = "goodsname")
	private String goodsName;

	@XmlElement(name = "goodspic")
	private String goodsPic;

	/**
	 * 发送人key
	 */
	@XmlElement(name = "userkey")
	private String userKey;

	/**
	 * 接收人key
	 */
	@XmlElement(name = "shopkey")
	private String shopKey;

	/**
	 * 咨询
	 */
	@XmlElement(name = "msginfo")
	private String msgInfo;

	/**
	 * 回复信息
	 */
	@XmlElement(name = "replyinfo")
	private String replyInfo;

	/**
	 * 发送时间
	 */
	@XmlTransient
	private Date addTime;
	/**
	 * 发送时间
	 */
	@XmlElement(name = "addtime")
	private String addTimeStr;

	/**
	 * 回复时间
	 */
	@XmlTransient
	private Date replyTime;

	/**
	 * 回复时间
	 */
	@XmlElement(name = "replytime")
	private String replyTimeStr;

	/**
	 * 回复状态（0已回复，1待回复）
	 */
	@XmlElement(name = "replystatus")
	private String replyStatus;

	/**
	 * 状态（0有效，1无效）
	 */
	@XmlElement(name = "status")
	private String status;

	/**
	 * 用户昵称
	 */
	@XmlElement(name = "nickname")
	private String nickName;

	/**
	 * 头像
	 */
	@XmlElement(name = "headpic")
	private String headPic = "";

	/**
	 * 用于排序
	 */
	@XmlElement(name = "indexnum")
	private String indexNum = "";

	/**
	 * @return the msgKey
	 */
	public String getMsgKey()
	{
		return msgKey;
	}

	/**
	 * @param msgKey
	 *            the msgKey to set
	 */
	public void setMsgKey(String msgKey)
	{
		this.msgKey = msgKey;
	}

	/**
	 * @return the goodsKey
	 */
	public String getGoodsKey()
	{
		return goodsKey;
	}

	/**
	 * @param goodsKey
	 *            the goodsKey to set
	 */
	public void setGoodsKey(String goodsKey)
	{
		this.goodsKey = goodsKey;
	}

	/**
	 * @return the goodsName
	 */
	public String getGoodsName()
	{
		return goodsName;
	}

	/**
	 * @param goodsName
	 *            the goodsName to set
	 */
	public void setGoodsName(String goodsName)
	{
		this.goodsName = goodsName;
	}

	/**
	 * @return the goodsPic
	 */
	public String getGoodsPic()
	{
		return goodsPic;
	}

	/**
	 * @param goodsPic
	 *            the goodsPic to set
	 */
	public void setGoodsPic(String goodsPic)
	{
		this.goodsPic = goodsPic;
	}

	/**
	 * @return the userKey
	 */
	public String getUserKey()
	{
		return userKey;
	}

	/**
	 * @param userKey
	 *            the userKey to set
	 */
	public void setUserKey(String userKey)
	{
		this.userKey = userKey;
	}

	/**
	 * @return the shopKey
	 */
	public String getShopKey()
	{
		return shopKey;
	}

	/**
	 * @param shopKey
	 *            the shopKey to set
	 */
	public void setShopKey(String shopKey)
	{
		this.shopKey = shopKey;
	}

	/**
	 * @return the msgInfo
	 */
	public String getMsgInfo()
	{
		return msgInfo;
	}

	/**
	 * @param msgInfo
	 *            the msgInfo to set
	 */
	public void setMsgInfo(String msgInfo)
	{
		this.msgInfo = msgInfo;
	}

	/**
	 * @return the replyInfo
	 */
	public String getReplyInfo()
	{
		return replyInfo;
	}

	/**
	 * @param replyInfo
	 *            the replyInfo to set
	 */
	public void setReplyInfo(String replyInfo)
	{
		this.replyInfo = replyInfo;
	}

	/**
	 * @return the addTime
	 */
	public Date getAddTime()
	{
		return addTime;
	}

	/**
	 * @param addTime
	 *            the addTime to set
	 */
	public void setAddTime(Date addTime)
	{
		this.addTime = addTime;
	}

	/**
	 * @return the addTimeStr
	 */
	public String getAddTimeStr()
	{
		return addTimeStr;
	}

	/**
	 * @param addTimeStr
	 *            the addTimeStr to set
	 */
	public void setAddTimeStr(String addTimeStr)
	{
		this.addTimeStr = addTimeStr;
	}

	/**
	 * @return the replyTime
	 */
	public Date getReplyTime()
	{
		return replyTime;
	}

	/**
	 * @param replyTime
	 *            the replyTime to set
	 */
	public void setReplyTime(Date replyTime)
	{
		this.replyTime = replyTime;
	}

	/**
	 * @return the replyTimeStr
	 */
	public String getReplyTimeStr()
	{
		return replyTimeStr;
	}

	/**
	 * @param replyTimeStr
	 *            the replyTimeStr to set
	 */
	public void setReplyTimeStr(String replyTimeStr)
	{
		this.replyTimeStr = replyTimeStr;
	}

	/**
	 * @return the replyStatus
	 */
	public String getReplyStatus()
	{
		return replyStatus;
	}

	/**
	 * @param replyStatus
	 *            the replyStatus to set
	 */
	public void setReplyStatus(String replyStatus)
	{
		this.replyStatus = replyStatus;
	}

	/**
	 * @return the status
	 */
	public String getStatus()
	{
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status)
	{
		this.status = status;
	}

	/**
	 * @return the nickName
	 */
	public String getNickName()
	{
		return nickName;
	}

	/**
	 * @param nickName
	 *            the nickName to set
	 */
	public void setNickName(String nickName)
	{
		this.nickName = nickName;
	}

	/**
	 * @return the headPic
	 */
	public String getHeadPic()
	{
		return headPic;
	}

	/**
	 * @param headPic
	 *            the headPic to set
	 */
	public void setHeadPic(String headPic)
	{
		this.headPic = headPic;
	}

	/**
	 * @return the indexNum
	 */
	public String getIndexNum()
	{
		return indexNum;
	}

	/**
	 * @param indexNum
	 *            the indexNum to set
	 */
	public void setIndexNum(String indexNum)
	{
		this.indexNum = indexNum;
	}

}
