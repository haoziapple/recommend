package com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.bean;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * CustomerBean,用于返回账户个人信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.bean.CustomerInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-2 下午4:25:10
 * @author:LiangJin
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class CustomerInfo
{
	/**
	 * 唯一标识
	 */
	@XmlElement(name = "userkey")
	private String userKey = "";
	/**
	 * 姓名
	 */
	@XmlElement(name = "username")
	private String userName = "";
	/**
	 * 昵称
	 */
	@XmlElement(name = "nickname")
	private String nickName = "";
	/**
	 * 头像
	 */
	@XmlElement(name = "headportrait")
	private String headPortrait = "";
	/**
	 * 性别（0：女， 1：男）
	 */
	@XmlElement(name = "sex")
	private String sex = "";

	/**
	 * 出生日期
	 */
	@XmlElement(name = "birthday")
	private String birthday = "";

	/**
	 * 出生日期
	 */
	@XmlTransient
	private Date dbirthday = null;

	/**
	 * 邮箱
	 */
	@XmlElement(name = "email")
	private String email = "";
	/**
	 * 手机号码
	 */
	@XmlElement(name = "phonenumber")
	private String phoneNumber = "";
	/**
	 * 家庭住址
	 */
	@XmlElement(name = "address")
	private String address = "";
	/**
	 * 身份证
	 */
	@XmlElement(name = "idcard")
	private String idCard = "";
	/**
	 * QQ号
	 */
	@XmlElement(name = "qqnum")
	private String qqNum = "";
	/**
	 * 微信号
	 */
	@XmlElement(name = "wechat")
	private String wechat = "";

	public String getUserKey()
	{
		return userKey;
	}

	public void setUserKey(String userKey)
	{
		this.userKey = userKey;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getNickName()
	{
		return nickName;
	}

	public void setNickName(String nickName)
	{
		this.nickName = nickName;
	}

	public String getHeadPortrait()
	{
		return headPortrait;
	}

	public void setHeadPortrait(String headPortrait)
	{
		this.headPortrait = headPortrait;
	}

	public String getSex()
	{
		return sex;
	}

	public void setSex(String sex)
	{
		this.sex = sex;
	}

	public Date getDbirthday()
	{
		return dbirthday;
	}

	public void setDbirthday(Date dbirthday)
	{
		this.dbirthday = dbirthday;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getIdCard()
	{
		return idCard;
	}

	public void setIdCard(String idCard)
	{
		this.idCard = idCard;
	}

	public void setBirthday(String birthday)
	{
		this.birthday = birthday;
	}

	public String getBirthday()
	{
		return birthday;
	}

	/**
	 * @return the qqNum
	 */
	public String getQqNum()
	{
		return qqNum;
	}

	/**
	 * @param qqNum the qqNum to set
	 */
	public void setQqNum(String qqNum)
	{
		this.qqNum = qqNum;
	}

	/**
	 * @return the wechat
	 */
	public String getWechat()
	{
		return wechat;
	}

	/**
	 * @param wechat the wechat to set
	 */
	public void setWechat(String wechat)
	{
		this.wechat = wechat;
	}

}
