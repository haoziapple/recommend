/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.rsp.FloorInfoList
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
package com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.rsp;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.rsp.FloorInfoList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-4 下午3:17:03
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class FloorInfoList
{
    @XmlElement(name = "info")
    private List<FloorInfo> floorInfoList;

    public List<FloorInfo> getFloorInfoList()
    {
        return floorInfoList;
    }

    public void setFloorInfoList(List<FloorInfo> floorInfoList)
    {
        this.floorInfoList = floorInfoList;
    }

}
