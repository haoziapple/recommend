/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.rsp.PromotionList
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

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.rsp.PromotionList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-9 上午10:49:38
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class PromotionList
{
    @XmlElement(name = "info")
    private List<PromotionInfo> promotionList;

    public List<PromotionInfo> getPromotionList()
    {
        return promotionList;
    }

    public void setPromotionList(List<PromotionInfo> promotionList)
    {
        this.promotionList = promotionList;
    }

}
