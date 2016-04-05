package com.fzjt.xiaoliu.read.interfaces.business.first.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fzjt.xiaoliu.read.interfaces.bean.request.XzqhBean;


/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.first.bean.FirstBean
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 上午11:20:18
 * @author:ZhangYun
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class FirstBean extends XzqhBean
{
	
	/**
	 *  全站唯一标示
	 */
	@XmlElement(name = "goodskey")
	private String goodsKey="" ;
	
	/**
	 *  名称
	 */
	@XmlElement(name = "goodsname")
	private String goodsName="" ;
	
	/**
	 *  描述
	 */
	@XmlElement(name = "goodsdesc")
	private String goodsDesc="" ;
	
	/**
	 *  原价
	 */
	@XmlElement(name = "oldprice")
	private String oldPrice ="";
	
	/**
	 *  现价
	 */
	@XmlElement(name = "nowprice")
	private String nowPrice="" ;
	
	/**
	 *  图片URL
	 */
	@XmlElement(name = "goodsurl")
	private String goodsUrl="" ;
	
	/**
	 *  排序
	 */
	@XmlElement(name = "sort")
	private String sort="" ;
	
    /**
     *  关联大类类型
     */
    @XmlElement(name = "servicetypekey")
    private String serviceTypeKey="" ;
    
    /**
     *  关联小类类型
     */
    @XmlElement(name = "goodstype")
    private String goodsType="" ;

    public String getGoodsKey()
    {
        return goodsKey;
    }

    public void setGoodsKey(String goodsKey)
    {
        this.goodsKey = goodsKey;
    }

    public String getGoodsName()
    {
        return goodsName;
    }

    public void setGoodsName(String goodsName)
    {
        this.goodsName = goodsName;
    }

    public String getGoodsDesc()
    {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc)
    {
        this.goodsDesc = goodsDesc;
    }

    public String getOldPrice()
    {
        return oldPrice;
    }

    public void setOldPrice(String oldPrice)
    {
        this.oldPrice = oldPrice;
    }

    public String getNowPrice()
    {
        return nowPrice;
    }

    public void setNowPrice(String nowPrice)
    {
        this.nowPrice = nowPrice;
    }

    public String getGoodsUrl()
    {
        return goodsUrl;
    }

    public void setGoodsUrl(String goodsUrl)
    {
        this.goodsUrl = goodsUrl;
    }

    public String getSort()
    {
        return sort;
    }

    public void setSort(String sort)
    {
        this.sort = sort;
    }

    public String getServiceTypeKey()
    {
        return serviceTypeKey;
    }

    public void setServiceTypeKey(String serviceTypeKey)
    {
        this.serviceTypeKey = serviceTypeKey;
    }

    public String getGoodsType()
    {
        return goodsType;
    }

    public void setGoodsType(String goodsType)
    {
        this.goodsType = goodsType;
    }
    
    
}
