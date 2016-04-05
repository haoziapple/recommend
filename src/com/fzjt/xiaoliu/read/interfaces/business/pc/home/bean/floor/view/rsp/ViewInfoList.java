/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.view.rsp.ViewInfoList
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-4     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.view.rsp;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.view.rsp.ViewInfoList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-4 下午5:06:53
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ViewInfoList
{
    @XmlElement(name = "info")
    private List<ViewInfo> viewList;

    public List<ViewInfo> getViewList()
    {
        return viewList;
    }

    public void setViewList(List<ViewInfo> viewList)
    {
        this.viewList = viewList;
    }
}
