package com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
/**
 * 业务bean，userkey
 * @className:com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.bean.UserKeyInfo
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-2 下午4:25:21
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class UserKeyInfo {
	/**
	 * 唯一标识，账号
	 */
	@XmlElement(name="userkey")
	private String userKey;

	public String getUserKey() {
		return userKey;
	}

	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}
	
}
