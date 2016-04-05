package com.fzjt.xiaoliu.read.interfaces.business.home.bottom.bean.rsp;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.bottom.bean.rsp.RspBottomList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-11 下午17:13:30
 * @author:TangKai
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspBottomList
{
    /**
     * 响应info
     */
    @XmlElement(name = "info")
    private List<RspBottomInfo> bottomList;

    public List<RspBottomInfo> getBottomList() {
        return bottomList;
    }

    public void setBottomList(List<RspBottomInfo> bottomList) {
        this.bottomList = bottomList;
    }

    
}
