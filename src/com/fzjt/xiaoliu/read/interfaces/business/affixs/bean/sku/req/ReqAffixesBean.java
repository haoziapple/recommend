/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.req.ReqAffixesBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-14     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqBean;

/**
 * affixes请求体
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.req.ReqAffixesBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-17 上午10:56:01
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqAffixesBean extends ReqBean
{
    @XmlElement(name = "body")
    private ReqAffixesBody reqAffixesBody;

    public ReqAffixesBody getReqAffixesBody()
    {
        return reqAffixesBody;
    }

    public void setReqAffixesBody(ReqAffixesBody reqAffixesBody)
    {
        this.reqAffixesBody = reqAffixesBody;
    }

}
