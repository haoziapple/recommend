/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.view.rsp.ViewInfo
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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.view.rsp.ViewInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-4 下午5:13:28
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ViewInfo
{
    /**
     * 楼层key
     */
    @XmlElement(name = "floorkey")
    private String floorKey;

    /**
     * 楼层名称
     */
    @XmlElement(name = "floorname")
    private String floorName;

    /**
     * 楼层logo
     */
    @XmlElement(name = "floorlogo")
    private String floorLogo;

    /**
     * 模板展示样式
     */
    @XmlElement(name = "temstyle")
    private String temStyle;

    public String getFloorKey()
    {
        return floorKey;
    }

    public void setFloorKey(String floorKey)
    {
        this.floorKey = floorKey;
    }

    public String getFloorName()
    {
        return floorName;
    }

    public void setFloorName(String floorName)
    {
        this.floorName = floorName;
    }

    public String getFloorLogo()
    {
        return floorLogo;
    }

    public void setFloorLogo(String floorLogo)
    {
        this.floorLogo = floorLogo;
    }

    public String getTemStyle()
    {
        return temStyle;
    }

    public void setTemStyle(String temStyle)
    {
        this.temStyle = temStyle;
    }

}
