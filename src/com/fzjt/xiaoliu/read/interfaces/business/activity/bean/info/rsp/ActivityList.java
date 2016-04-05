/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.activity.bean.info.rsp.ActivityList
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-10     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.activity.bean.info.rsp;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.activity.bean.info.rsp.ActivityList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-10 下午9:42:08
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ActivityList
{
    @XmlElement(name = "info")
    private List<ActivityInfo> activityList;

    public List<ActivityInfo> getActivityList()
    {
        return activityList;
    }

    public void setActivityList(List<ActivityInfo> activityList)
    {
        this.activityList = activityList;
    }
}
