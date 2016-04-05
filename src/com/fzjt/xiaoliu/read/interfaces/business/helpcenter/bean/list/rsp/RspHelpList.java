/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.rsp.RspHelpList
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-2     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.rsp;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.rsp.RspHelpList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 下午9:13:54
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspHelpList
{
    @XmlElement(name = "info")
    private List<HelpListInfo> rspList;

    public List<HelpListInfo> getRspList()
    {
        return rspList;
    }

    public void setRspList(List<HelpListInfo> rspList)
    {
        this.rspList = rspList;
    }
}
