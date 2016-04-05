/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.skulist.bean.req.SkuListInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-12    TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuList.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuList.req.SkuListInfo
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-13 下午8:12:43
 * @author:LiChangjiang
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class SkuListInfo
{
	/**
	 * skuName
	 */
	@XmlElement(name="skuname")
	private String skuName;

	/**
     * typeKey
     */
    @XmlElement(name="typekey")
    private String typeKey;
    
    /**
     * 起始条数
     */
    @XmlElement(name = "fromnum")
    private String fromNum = "";

    /**
     * 截止条数
     */
    @XmlElement(name = "tonum")
    private String toNum = "";

    public String getSkuName()
    {
        return skuName;
    }

    public void setSkuName(String skuName)
    {
        this.skuName = skuName;
    }

    public String getTypeKey()
    {
        return typeKey;
    }

    public void setTypeKey(String typeKey)
    {
        this.typeKey = typeKey;
    }

    public String getFromNum()
    {
        return fromNum;
    }

    public void setFromNum(String fromNum)
    {
        this.fromNum = fromNum;
    }

    public String getToNum()
    {
        return toNum;
    }

    public void setToNum(String toNum)
    {
        this.toNum = toNum;
    }

    
	
}
