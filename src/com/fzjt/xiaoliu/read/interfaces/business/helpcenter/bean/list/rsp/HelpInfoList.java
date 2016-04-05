/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.rsp.HelpInfoList
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
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.rsp.HelpInfoList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 下午8:36:22
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class HelpInfoList
{

    @XmlElement(name = "hinfo")
    private List<HelpInfo> rspTitleList;

    public List<HelpInfo> getRspTitleList()
    {
        return rspTitleList;
    }

    public void setRspTitleList(List<HelpInfo> rspTitleList)
    {
        this.rspTitleList = rspTitleList;
    }

}
