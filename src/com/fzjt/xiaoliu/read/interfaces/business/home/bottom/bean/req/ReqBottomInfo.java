/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.rsp.RspGoodsInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-3     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.bottom.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * app底部按钮信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.bottom.bean.req.ReqBottomInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-11 下午18:00:56
 * @author:TangKai
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqBottomInfo
{
	
	/**
     * 定位省
     */
    @XmlElement(name = "province")
    private String province;
    
    /**
     * 定位市
     */
    @XmlElement(name = "city")
    private String city;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
	
}
