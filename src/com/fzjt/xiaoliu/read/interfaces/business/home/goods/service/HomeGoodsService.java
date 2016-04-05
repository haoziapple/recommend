/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.goods.service.GoodsService
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-7     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.goods.service;

import java.sql.SQLException;

import com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.req.ReqGoodsBody;
import com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.rsp.RspGoodsBody;

/**
 * 查询页面商品信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.goods.service.HomeGoodsService
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-7 下午4:24:46
 * @author:LiangJin
 */
public interface HomeGoodsService
{
	/**
	 * 
	 * @Description:根据给定的起始与截止条数，查询界面商品信息
	 * @param reqGoodsInfo
	 * @return list
	 * @throws SQLException
	 * @version:v1.0
	 * @author:LiangJin
	 * @date:2015-11-7 下午2:52:57
	 */
	RspGoodsBody queryGoodsList(ReqGoodsBody reqGoodsBody) throws SQLException;

}
