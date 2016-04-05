/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.rsp.RspGoodsInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiChangjiang
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-10-30     LiChangjiang       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.bean.list.rsp;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.bean.list.rsp.RspGoodsInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-10-31 下午3:09:28
 * @author:LiChangjiang
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RspGoodsInfo
{
	@XmlTransient
	private String ID = "";

	/**
	 * 商品key
	 */
	@XmlElement(name = "goodskey")
	private String goodsKey;

	/**
	 * 商家KEY
	 */
	@XmlElement(name = "shopkey")
	private String shopKey;

	/**
	 * 商品名称
	 */
	@XmlElement(name = "goodsname")
	private String goodsName;

	/**
	 * 商品规格描述
	 */
	@XmlElement(name = "goodssize")
	private String goodsSize;

	/**
	 * 商品类别key
	 */
	@XmlElement(name = "goodstype")
	private String goodsType;

	/**
	 * 类别名称
	 */
	@XmlElement(name = "typename")
	private String typeName;

	/**
	 * 配送信息
	 */
	@XmlElement(name = "peisong")
	private String peisong;

	/**
	 * 服务信息
	 */
	@XmlElement(name = "serveinfo")
	private String serveInfo;

	/**
	 * 商品图片
	 */
	@XmlElement(name = "goodspics")
	private String goodsPics;

	/**
	 * 商品种类（0自营，1非自营）
	 */
	@XmlElement(name = "goodskind")
	private String goodsKind;

	/**
	 * 添加时间
	 */
	@XmlElement(name = "addtime")
	private String addTimeStr;
	/**
	 * 添加时间
	 */
	@XmlTransient
	private Date addTime;

	/**
	 * 更新时间
	 */
	@XmlTransient
	private Date uppTime;
	/**
	 * 更新时间
	 */
	@XmlElement(name = "upptime")
	private String uppTimeStr;

	/**
	 * 商品描述
	 */
	@XmlElement(name = "goodsDetail")
	private String goodsDetail;

	/**
	 * 状态（0有效，1无效，2是删除）
	 */
	@XmlElement(name = "status")
	private String status;

	/**
	 * 省
	 */
	@XmlElement(name = "province")
	private String province;

	/**
	 * 市
	 */
	@XmlElement(name = "city")
	private String city;

	/**
	 * 区
	 */
	@XmlElement(name = "area")
	private String area;

	/**
	 * 搜索条件组合
	 */
	@XmlElement(name = "queryopts")
	private String queryOpts;

	/**
	 * 促销标题
	 */
	@XmlElement(name = "saletitle")
	private String saleTitle;

	/**
	 * 商品数量
	 */
	@XmlElement(name = "goodscount")
	private String goodsCount;

	/**
	 * 商品编码
	 */
	@XmlElement(name = "goodscode")
	private String goodsCode;

	/**
	 * 销售状态（0 上架，1下架，2待上架）
	 */
	@XmlElement(name = "onsale")
	private String onSale;

	/**
	 * 下架时间
	 */
	@XmlElement(name = "offtime")
	private String offTimeStr;
	/**
	 * 下架时间
	 */
	@XmlTransient
	private Date offTime;

	/**
	 * 上架时间
	 * 
	 */
	@XmlElement(name = "ontime")
	private String onTimeStr;

	/**
	 * 上架时间
	 * 
	 */
	@XmlTransient
	private Date onTime;

	/**
	 * 优惠信息
	 */
	@XmlElement(name = "privilegeinfo")
	private String privilegeInfo;

	/**
	 * 限购数量（-1表示不作限制，可以任意购买）
	 */
	@XmlElement(name = "limitcount")
	private String limitCount;

	/**
	 * 商品原价（市场价）
	 */
	@XmlElement(name = "priceold")
	private String priceOld;

	/**
	 * 商品现价
	 */
	@XmlElement(name = "pricenow")
	private String priceNow;

	/**
	 * 默认skukey
	 */
	@XmlElement(name = "defaultsku")
	private String defaultSku;

	/**
	 * 配送方式
	 */
	@XmlElement(name = "peisongtype")
	private String peisongType;

	/**
	 * 是否支持发票（0支持，1不支持）
	 */
	@XmlElement(name = "isinvoice")
	private String isInvoice;

	/**
	 * 限购期限
	 */
	@XmlElement(name = "limitdate")
	private String limitDate;

	private String indexNum = "";

	/**
	 * 商品销量
	 */
	@XmlElement(name = "salenum")
	private String saleNum;

	/**
	 * 商品 库存
	 */
	@XmlElement(name = "goodsstock")
	private String goodsStock;
	
	/**
	 * 活动标识，0為是活動，1不是活動
	 */
	@XmlElement(name = "activity")
	private String activity;

	public String getID()
	{
		return ID;
	}

	public void setID(String iD)
	{
		ID = iD;
	}

	public String getGoodsKey()
	{
		return goodsKey;
	}

	public void setGoodsKey(String goodsKey)
	{
		this.goodsKey = goodsKey;
	}

	public String getShopKey()
	{
		return shopKey;
	}

	public void setShopKey(String shopKey)
	{
		this.shopKey = shopKey;
	}

	public String getGoodsName()
	{
		return goodsName;
	}

	public void setGoodsName(String goodsName)
	{
		this.goodsName = goodsName;
	}

	public String getGoodsType()
	{
		return goodsType;
	}

	public void setGoodsType(String goodsType)
	{
		this.goodsType = goodsType;
	}

	public String getGoodsSize()
	{
		return goodsSize;
	}

	public void setGoodsSize(String goodsSize)
	{
		this.goodsSize = goodsSize;
	}

	public String getTypeName()
	{
		return typeName;
	}

	public void setTypeName(String typeName)
	{
		this.typeName = typeName;
	}

	public String getPeisong()
	{
		return peisong;
	}

	public void setPeisong(String peisong)
	{
		this.peisong = peisong;
	}

	public String getServeInfo()
	{
		return serveInfo;
	}

	public void setServeInfo(String serveInfo)
	{
		this.serveInfo = serveInfo;
	}

	public String getGoodsPics()
	{
		return goodsPics;
	}

	public void setGoodsPics(String goodsPics)
	{
		this.goodsPics = goodsPics;
	}

	public String getGoodsKind()
	{
		return goodsKind;
	}

	public void setGoodsKind(String goodsKind)
	{
		this.goodsKind = goodsKind;
	}

	public String getAddTimeStr()
	{
		return addTimeStr;
	}

	public void setAddTimeStr(String addTimeStr)
	{
		this.addTimeStr = addTimeStr;
	}

	public Date getAddTime()
	{
		return addTime;
	}

	public void setAddTime(Date addTime)
	{
		this.addTime = addTime;
	}

	public Date getUppTime()
	{
		return uppTime;
	}

	public void setUppTime(Date uppTime)
	{
		this.uppTime = uppTime;
	}

	public String getUppTimeStr()
	{
		return uppTimeStr;
	}

	public void setUppTimeStr(String uppTimeStr)
	{
		this.uppTimeStr = uppTimeStr;
	}

	public String getGoodsDetail()
	{
		return goodsDetail;
	}

	public void setGoodsDetail(String goodsDetail)
	{
		this.goodsDetail = goodsDetail;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getProvince()
	{
		return province;
	}

	public void setProvince(String province)
	{
		this.province = province;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getArea()
	{
		return area;
	}

	public void setArea(String area)
	{
		this.area = area;
	}

	public String getQueryOpts()
	{
		return queryOpts;
	}

	public void setQueryOpts(String queryOpts)
	{
		this.queryOpts = queryOpts;
	}

	public String getSaleTitle()
	{
		return saleTitle;
	}

	public void setSaleTitle(String saleTitle)
	{
		this.saleTitle = saleTitle;
	}

	public String getGoodsCount()
	{
		return goodsCount;
	}

	public void setGoodsCount(String goodsCount)
	{
		this.goodsCount = goodsCount;
	}

	public String getGoodsCode()
	{
		return goodsCode;
	}

	public void setGoodsCode(String goodsCode)
	{
		this.goodsCode = goodsCode;
	}

	public String getOnSale()
	{
		return onSale;
	}

	public void setOnSale(String onSale)
	{
		this.onSale = onSale;
	}

	public String getOffTimeStr()
	{
		return offTimeStr;
	}

	public void setOffTimeStr(String offTimeStr)
	{
		this.offTimeStr = offTimeStr;
	}

	public Date getOffTime()
	{
		return offTime;
	}

	public void setOffTime(Date offTime)
	{
		this.offTime = offTime;
	}

	public String getOnTimeStr()
	{
		return onTimeStr;
	}

	public void setOnTimeStr(String onTimeStr)
	{
		this.onTimeStr = onTimeStr;
	}

	public Date getOnTime()
	{
		return onTime;
	}

	public void setOnTime(Date onTime)
	{
		this.onTime = onTime;
	}

	public String getPrivilegeInfo()
	{
		return privilegeInfo;
	}

	public void setPrivilegeInfo(String privilegeInfo)
	{
		this.privilegeInfo = privilegeInfo;
	}

	public String getLimitCount()
	{
		return limitCount;
	}

	public void setLimitCount(String limitCount)
	{
		this.limitCount = limitCount;
	}

	public String getIndexNum()
	{
		return indexNum;
	}

	public void setIndexNum(String indexNum)
	{
		this.indexNum = indexNum;
	}

	public String getPriceOld()
	{
		return priceOld;
	}

	public void setPriceOld(String priceOld)
	{
		this.priceOld = priceOld;
	}

	public String getPriceNow()
	{
		return priceNow;
	}

	public void setPriceNow(String priceNow)
	{
		this.priceNow = priceNow;
	}

	public String getDefaultSku()
	{
		return defaultSku;
	}

	public void setDefaultSku(String defaultSku)
	{
		this.defaultSku = defaultSku;
	}

	public String getPeisongType()
	{
		return peisongType;
	}

	public void setPeisongType(String peisongType)
	{
		this.peisongType = peisongType;
	}

	public String getIsInvoice()
	{
		return isInvoice;
	}

	public void setIsInvoice(String isInvoice)
	{
		this.isInvoice = isInvoice;
	}

	public String getLimitDate()
	{
		return limitDate;
	}

	public void setLimitDate(String limitDate)
	{
		this.limitDate = limitDate;
	}

	public String getSaleNum()
	{
		return saleNum;
	}

	public void setSaleNum(String saleNum)
	{
		this.saleNum = saleNum;
	}

	public String getGoodsStock()
	{
		return goodsStock;
	}

	public void setGoodsStock(String goodsStock)
	{
		this.goodsStock = goodsStock;
	}

	public String getActivity()
	{
		return activity;
	}

	public void setActivity(String activity)
	{
		this.activity = activity;
	}
	
	

}
