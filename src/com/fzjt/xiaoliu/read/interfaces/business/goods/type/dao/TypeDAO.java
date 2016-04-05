/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.type.dao.TypeDAO
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
package com.fzjt.xiaoliu.read.interfaces.business.goods.type.dao;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.rsp.RspTypeInfo;

/**
 * 查询商品类别
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.type.dao.TypeDAO
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 上午11:12:20
 * @author:LiangJin
 */
public interface TypeDAO
{
	/**
	 * 根据typeKey查询商品类别的下级
	 * 
	 * @Description:
	 * @param typeKey
	 * @return List
	 * @throws SQLException
	 * @version:v1.0
	 * @author:LiangJin
	 * @date:2015-11-13 上午11:14:11
	 */
	List<RspTypeInfo> queryGoodsTypeByKey(String typeKey) throws SQLException;

	/**
	 * 查询商品类别树级结构
	 * 
	 * @Description:
	 * @return List
	 * @throws SQLException
	 * @version:v1.0
	 * @author:LiangJin
	 * @date:2015-11-13 上午11:14:51
	 */
	List<RspTypeInfo> queryGoodsType() throws SQLException;

}
