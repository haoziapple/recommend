/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.type.service.TypeService
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-13     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.type.service;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.rsp.RspTypeInfo;

/**
 * 查询商品类别
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.type.service.TypeService
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午1:18:10
 * @author:LiangJin
 */
public interface TypeService
{

	/**
	 * 查询商品类别树级结构
	 * 
	 * @Description:
	 * @param typeKey
	 * @return list
	 * @throws SQLException
	 * @version:v1.0
	 * @author:LiangJin
	 * @date:2015-11-13 下午1:21:44
	 */
	List<RspTypeInfo> queryGoodsType(String typeKey) throws SQLException;

}
