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
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuInfo.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 商品 Sku information
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuInfo.rsp.RspGoodsSkuInfo
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-13 下午8:19:33
 * @author:LiChangjiang
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspGoodsSkuInfo
{
	@XmlTransient
	private String ID = "";

	/**
	 * sku_key
	 */
	@XmlElement(name = "skukey")
	private String skuKey;

	/**
	 * 商品KEY
	 */
	@XmlElement(name = "goodskey")
	private String goodsKey;

	/**
	 * 特征值Key
	 */
	@XmlElement(name = "vkey")
	private String vKey;

	/**
	 * sku属性名称
	 */
	@XmlElement(name = "skuname")
	private String skuName;

	/**
	 * 状态（0有效，1无效）
	 */
	@XmlElement(name = "status")
	private String status;

	/**
	 * 库存量
	 */
	@XmlElement(name = "stocknumber")
	private String stockNumber;

	/**
	 * 邮费（单位：分）
	 */
	@XmlElement(name = "postage")
	private String postAge;

	/**
	 * 商品类别
	 */
	@XmlElement(name = "typekey")
	private String typeKey;

	/**
	 * sku列表展示图片
	 */
	@XmlElement(name = "skupic")
	private String skuPic;

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getSkuKey() {
        return skuKey;
    }

    public void setSkuKey(String skuKey) {
        this.skuKey = skuKey;
    }

    public String getGoodsKey() {
        return goodsKey;
    }

    public void setGoodsKey(String goodsKey) {
        this.goodsKey = goodsKey;
    }

    public String getvKey() {
        return vKey;
    }

    public void setvKey(String vKey) {
        this.vKey = vKey;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber;
    }

    public String getPostAge() {
        return postAge;
    }

    public void setPostAge(String postAge) {
        this.postAge = postAge;
    }

    public String getTypeKey() {
        return typeKey;
    }

    public void setTypeKey(String typeKey) {
        this.typeKey = typeKey;
    }

    public String getSkuPic() {
        return skuPic;
    }

    public void setSkuPic(String skuPic) {
        this.skuPic = skuPic;
    }
	
}
