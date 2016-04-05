package com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.bean.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.bean.CustomerInfo;
/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.bean.rsp.RspCustomerBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-2 下午4:24:58
 * @author:LiangJin
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspCustomerBody {
	@XmlElement(name="info")
	private CustomerInfo customerInfo;

	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}

	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}
	
}
