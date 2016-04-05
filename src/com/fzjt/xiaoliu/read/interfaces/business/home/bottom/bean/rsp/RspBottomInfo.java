/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.rsp.RspGoodsInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-3     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.bottom.bean.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * app底部按钮信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.bottom.bean.rsp.RspBottomInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-11 下午16:49:56
 * @author:TangKai
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspBottomInfo
{
	@XmlTransient
	private String ID = "";

	/**
	 * 底部key
	 */
	@XmlElement(name = "bottomkey")
	private String bottomKey;

	/**
	 * 底部名称，例如：首页，分类，购物车，个人中心
	 */
	@XmlElement(name = "bottomname")
	private String bottomName;

	/**
	 * 图标地址
	 */
	@XmlElement(name = "logoimgurl")
	private String logoImgUrl;

	/**
	 * 链接地址
	 */
	@XmlElement(name = "linkurl")
	private String linkUrl;

	/**
	 * 排序
	 */
	@XmlElement(name = "indexnum")
	private String indexNum;

	/**
	 * 添加时间
	 */
	@XmlElement(name = "addtime")
	private String addTime;

	/**
	 * 底部模块类别（0app本地组件，1wap服务）
	 */
	@XmlElement(name = "bottomtype")
	private String bottomType;
	
	/**
     * 定位省
     */
    @XmlElement(name = "province")
    private String province;
    
    /**
     * 定位市
     */
    @XmlElement(name = "city")
    private String city;

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getBottomKey() {
        return bottomKey;
    }

    public void setBottomKey(String bottomKey) {
        this.bottomKey = bottomKey;
    }

    public String getBottomName() {
        return bottomName;
    }

    public void setBottomName(String bottomName) {
        this.bottomName = bottomName;
    }

    public String getLogoImgUrl() {
        return logoImgUrl;
    }

    public void setLogoImgUrl(String logoImgUrl) {
        this.logoImgUrl = logoImgUrl;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getIndexNum() {
        return indexNum;
    }

    public void setIndexNum(String indexNum) {
        this.indexNum = indexNum;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getBottomType() {
        return bottomType;
    }

    public void setBottomType(String bottomType) {
        this.bottomType = bottomType;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
	
}
