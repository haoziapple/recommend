/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.dao.GoodsDAO
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
package com.fzjt.xiaoliu.read.interfaces.business.goods.dao;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.list.req.ReqGoodsInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.list.rsp.RspGoodsInfo;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.dao.GoodsDAO
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-10-31 上午9:31:32
 * @author:LiChangjiang
 */
public interface ShopGoodsDAO
{

	/**
	 * 根据商家信息、类别查询商品列表(根据价格排序)
	 * 
	 * @Description:
	 * @param reqGoodsInfo
	 * @return
	 * @throws SQLException
	 * @version:v1.0
	 * @author:TangKai
	 * @date:2015-12-14 下午8:10:25
	 */
	List<RspGoodsInfo> queryShopGListByPrice(ReqGoodsInfo reqGoodsInfo) throws SQLException;

	/**
	 * 根据商家信息、类别查询商品列表(根据销量排序)
	 * 
	 * @Description:
	 * @param reqGoodsInfo
	 * @return
	 * @throws SQLException
	 * @version:v1.0
	 * @author:TangKai
	 * @date:2015-12-14 下午8:10:25
	 */
	List<RspGoodsInfo> queryShopGListBySale(ReqGoodsInfo reqGoodsInfo) throws SQLException;

	/**
	 * 根据商家信息、类别查询商品列表(根据时间排序)
	 * 
	 * @Description:
	 * @param reqGoodsInfo
	 * @return
	 * @throws SQLException
	 * @version:v1.0
	 * @author:TangKai
	 * @date:2015-12-14 下午8:10:25
	 */
	List<RspGoodsInfo> queryShopGListByTime(ReqGoodsInfo reqGoodsInfo) throws SQLException;

	/**
	 * 查询商品集合的大小
	 * 
	 * @Description:
	 * @param reqGoodsInfo
	 * @return
	 * @throws SQLException
	 * @version:v1.0
	 * @author:TangKai
	 * @date:2015-12-15 上午10:31:10
	 */
	String queryGListCountByShop(ReqGoodsInfo reqGoodsInfo) throws SQLException;

	/**
	 * 查询商品销量
	 * 
	 * @Description:
	 * @param reqGoodsInfo
	 * @return
	 * @throws SQLException
	 * @version:v1.0
	 * @author:LiangJin
	 * @date:2015-12-21 上午9:01:56
	 */
	String queryGoodsSale(String goodsKey) throws SQLException;

	/**
	 * 查询商品sku库存
	 * 
	 * @Description:
	 * @param goodsKey
	 * @return
	 * @throws SQLException
	 * @version:v1.0
	 * @author:LiangJin
	 * @date:2015-12-21 上午9:03:08
	 */
	String queryGoodsSkuStock(String skuKey) throws SQLException;

	/**
	 * 查询sku集合
	 * 
	 * @Description:
	 * @param goodsKey
	 * @return
	 * @throws SQLException
	 * @version:v1.0
	 * @author:LiangJin
	 * @date:2015-12-21 下午2:15:27
	 */
	List<String> querySkuKeyList(String goodsKey) throws SQLException;

	/**
	 * 查询是否为活动
	 * 
	 * @Description:
	 * @param goodsKey
	 * @return
	 * @throws SQLException
	 * @version:v1.0
	 * @author:LiangJin
	 * @date:2016-2-24 上午10:08:41
	 */
	String queryActivity(String goodsKey) throws SQLException;
}
