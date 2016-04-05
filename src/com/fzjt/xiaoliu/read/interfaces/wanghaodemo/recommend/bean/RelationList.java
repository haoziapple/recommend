/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean.RelationList
 * @description:TODO
 * @date:2016-3-1 上午10:30:52
 * @version:v1.0.0 
 * @author:WangHao
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2016-3-1     WangHao       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean;

import java.util.List;

/** 
 * 某一个物品与所有其他物品的相关系数表
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean.RelationList
 * @description:TODO
 * @version:v1.0.0 
 * @date:2016-3-1 上午10:30:54
 * @author:WangHao
 */
public class RelationList
{
	/**
	 * 物品key--暂时使用sku key
	 */
	public String itemKey;
	
	/**
	 * 对应的关系系数列表
	 */
	public List<RelationInfo> valueList;

	public String getItemKey()
	{
		return itemKey;
	}

	public void setItemKey(String itemKey)
	{
		this.itemKey = itemKey;
	}

	public List<RelationInfo> getValueList()
	{
		return valueList;
	}

	public void setValueList(List<RelationInfo> valueList)
	{
		this.valueList = valueList;
	}
}
