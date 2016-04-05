package com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.bean.UserKeyInfo;
/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.bean.req.ReqCustomerBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-2 下午4:24:27
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqCustomerBody {
	/**
	 * 查询 customer 对象
	 */
	@XmlElement(name="info")
	private UserKeyInfo userKeyInfo=null;

	public UserKeyInfo getUserKeyInfo() {
		return userKeyInfo;
	}

	public void setUserKeyInfo(UserKeyInfo userKeyInfo) {
		this.userKeyInfo = userKeyInfo;
	}
	
}
