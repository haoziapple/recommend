/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.account.bean.rsp.RspAccountBody
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:WangHao
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-11     WangHao       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.account.bean.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspBody;
@XmlRootElement(name="fzjt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RspAccountBody extends RspBody
{
	@XmlElement(name = "list")
    private RspAccountList rspAccountList;

    public RspAccountList getRspAccountList()
    {
        return rspAccountList;
    }

    public void setRspAccountList(RspAccountList rspAccountList)
    {
        this.rspAccountList = rspAccountList;
    }

}
