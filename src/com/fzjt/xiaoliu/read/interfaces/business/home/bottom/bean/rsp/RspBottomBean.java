/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.rsp.RspGoodsBean
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
package com.fzjt.xiaoliu.read.interfaces.business.home.bottom.bean.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * app底部按钮信息bean
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.bottom.bean.rsp.RspBottomBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-11 下午16:51:08
 * @author:Tangkai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspBottomBean extends RspBean
{
	@XmlElement(name="body")
	private RspBottomBody rspBottomBody;

    public RspBottomBody getRspBottomBody() {
        return rspBottomBody;
    }

    public void setRspBottomBody(RspBottomBody rspBottomBody) {
        this.rspBottomBody = rspBottomBody;
    }
	
}
