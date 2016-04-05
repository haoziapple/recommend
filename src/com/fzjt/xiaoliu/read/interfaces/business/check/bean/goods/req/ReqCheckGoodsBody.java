/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.bean.goods.req.ReqCheckGoodsBody
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-8     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.check.bean.goods.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.bean.goods.req.ReqCheckGoodsBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-23 下午4:28:07
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqCheckGoodsBody
{
    @XmlElement(name = "info")
    private ReqCheckGoodsInfo reqInfo;

    public ReqCheckGoodsInfo getReqInfo()
    {
        return reqInfo;
    }

    public void setReqInfo(ReqCheckGoodsInfo reqInfo)
    {
        this.reqInfo = reqInfo;
    }

}
