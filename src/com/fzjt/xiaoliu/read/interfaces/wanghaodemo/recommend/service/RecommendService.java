/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.service.RecommendService
 * @description:TODO
 * @date:2016-3-1 上午10:23:28
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
package com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.service;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.wanghaodemo.recommend.bean.RelationInfo;

public interface RecommendService
{
	/**
	 * 初始化redis中的数据，同时设定数据有效时间
	 * @Description:
	 * @param time
	 * @return
	 * @version:v1.0
	 * @author:WangHao
	 * @date:2016-3-2 下午12:21:13
	 */
	public String InitiateData(int time) throws SQLException;
	
	/**
	 * 计算某一个物品的相关系数列表
	 * @Description:
	 * @return
	 * @version:v1.0
	 * @author:WangHao
	 * @date:2016-3-1 上午10:54:02
	 */
	public List<RelationInfo> CalucateItemRelation(String itemKey);
	
	/**
	 * 计算某一用户的相关系数表
	 * @Description:
	 * @param userKey
	 * @return
	 * @version:v1.0
	 * @author:WangHao
	 * @date:2016-3-1 上午11:05:45
	 */
	public List<RelationInfo> CalucateRelationFor(String userKey);

}
