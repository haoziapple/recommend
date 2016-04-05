/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.dao.impl.GoodsDAOImpl
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
package com.fzjt.xiaoliu.read.interfaces.business.goods.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.list.req.ReqGoodsInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.list.rsp.RspGoodsInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.dao.ShopGoodsDAO;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.dao.impl.ShopGoodsDAOImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-14 下午9:34:12
 * @author:TangKai
 */
public class ShopGoodsDAOImpl extends SqlMapClientDaoSupport implements ShopGoodsDAO
{
    /**
     * {@inheritDoc}
     */
    @Override
    public String queryGListCountByShop(ReqGoodsInfo reqGoodsInfo) throws SQLException
    {
        return (String) this.getSqlMapClientTemplate().queryForObject("shopgoods.queryGListCountByShop", reqGoodsInfo);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<RspGoodsInfo> queryShopGListByPrice(ReqGoodsInfo reqGoodsInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("shopgoods.queryShopGListByPrice", reqGoodsInfo);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<RspGoodsInfo> queryShopGListBySale(ReqGoodsInfo reqGoodsInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("shopgoods.queryShopGListBySale", reqGoodsInfo);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<RspGoodsInfo> queryShopGListByTime(ReqGoodsInfo reqGoodsInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("shopgoods.queryShopGListByTime", reqGoodsInfo);
    }

    /**
     * {@inheritDoc}
     */
	public String queryGoodsSale(String goodsKey) throws SQLException
	{
		return (String)this.getSqlMapClientTemplate().queryForObject("shopgoods.queryGoodsSale", goodsKey);
	}

	 /**
     * {@inheritDoc}
     */
	public String queryGoodsSkuStock(String skuKey) throws SQLException
	{
		return (String)this.getSqlMapClientTemplate().queryForObject("shopgoods.queryGoodsSkuStock", skuKey);
	}

	 /**
     * {@inheritDoc}
     */
	@SuppressWarnings("unchecked")
	public List<String> querySkuKeyList(String goodsKey) throws SQLException
	{
		return this.getSqlMapClientTemplate().queryForList("shopgoods.querySkuKeyList", goodsKey);
	}

	@Override
	public String queryActivity(String goodsKey) throws SQLException
	{
		return (String)this.getSqlMapClientTemplate().queryForObject("shopgoods.queryActivity",goodsKey);
	}

}
