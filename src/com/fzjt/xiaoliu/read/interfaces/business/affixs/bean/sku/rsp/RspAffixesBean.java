/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.rsp.RspAffixesBean
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
package com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBean;

/**
 * 响应体
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.rsp.RspAffixesBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-17 上午10:58:12
 * @author:TangKai
 */
@XmlRootElement(name = "fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspAffixesBean extends RspBean
{
    @XmlElement(name = "body")
    private RspAffixesBody rspAffixesBody;

    public RspAffixesBody getRspAffixesBody()
    {
        return rspAffixesBody;
    }

    public void setRspAffixesBody(RspAffixesBody rspAffixesBody)
    {
        this.rspAffixesBody = rspAffixesBody;
    }

}
