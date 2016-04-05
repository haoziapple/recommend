/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.rsp.RspGoodsBody
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
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.bottom.bean.req.ReqBottomBody
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-11 下午18:02:52
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqBottomBody
{
	@XmlElement(name="info")
	private ReqBottomInfo reqBottomInfo;

    public ReqBottomInfo getReqBottomInfo() {
        return reqBottomInfo;
    }

    public void setReqBottomInfo(ReqBottomInfo reqBottomInfo) {
        this.reqBottomInfo = reqBottomInfo;
    }

    
}
