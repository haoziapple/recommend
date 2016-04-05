/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.info.req.ReqHelpInfo
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
package com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.info.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 请求获取帮助内容信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.info.req.ReqHelpInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 下午8:10:15
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqHelpInfo
{
    // 帮助内容key
    @XmlElement(name = "datakey")
    private String dateKey;

    public String getDateKey()
    {
        return dateKey;
    }

    public void setDateKey(String dateKey)
    {
        this.dateKey = dateKey;
    }

}
