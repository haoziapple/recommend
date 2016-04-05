/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean.RelationInfo
 * @description:TODO
 * @date:2016-3-1 上午10:28:10
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
public class RelationInfo
{
	/**
	 * 相关的物品sku key
	 */
	public String relatedItem;
	
	/**
	 * 相关系数
	 */
	public double relations;

	public String getRelatedItem()
	{
		return relatedItem;
	}

	public void setRelatedItem(String relatedItem)
	{
		this.relatedItem = relatedItem;
	}

	public double getRelations()
	{
		return relations;
	}

	public void setRelations(double relations)
	{
		this.relations = relations;
	}
	
}
