/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.rsp.RspPromotionBody
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-9     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.rsp.RspPromotionBody
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-9 上午10:51:47
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspPromotionBody
{
    @XmlElement(name = "list")
    private PromotionList rspList;

    public PromotionList getRspList()
    {
        return rspList;
    }

    public void setRspList(PromotionList rspList)
    {
        this.rspList = rspList;
    }
}
