/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.dao.impl.CheckDAOImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-8     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.check.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.business.check.bean.GoodsDistInfo;
import com.fzjt.xiaoliu.read.interfaces.business.check.bean.GoodsLimitInfo;
import com.fzjt.xiaoliu.read.interfaces.business.check.bean.OrderInfo;
import com.fzjt.xiaoliu.read.interfaces.business.check.bean.goods.req.ReqCheckGoodsInfo;
import com.fzjt.xiaoliu.read.interfaces.business.check.dao.CheckDAO;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.dao.impl.CheckDAOImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-8 下午3:03:11
 * @author:TangKai
 */
public class CheckDAOImpl extends SqlMapClientDaoSupport implements CheckDAO
{

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<OrderInfo> queryOrderInfoList(String orderInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("check.queryOrderInfoList", orderInfo);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String queryGoodsLimitNum(GoodsDistInfo info) throws SQLException
    {
        return (String) this.getSqlMapClientTemplate().queryForObject("check.queryGoodsLimitNum", info);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String queryGoodsTrueNum(GoodsDistInfo info) throws SQLException
    {
        return (String) this.getSqlMapClientTemplate().queryForObject("check.queryGoodsTrueNum", info);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String queryGoodsStatus(GoodsDistInfo info) throws SQLException
    {
        return (String) this.getSqlMapClientTemplate().queryForObject("check.queryGoodsStatus", info);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String queryGoodsOnSale(GoodsDistInfo info) throws SQLException
    {
        return (String) this.getSqlMapClientTemplate().queryForObject("check.queryGoodsOnSale", info);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsLimitInfo queryGoodsLimitInfo(GoodsLimitInfo info) throws SQLException
    {
        return (GoodsLimitInfo) this.getSqlMapClientTemplate().queryForObject("check.queryGoodsLimitInfo", info);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer queryBuyGoodsCount(GoodsLimitInfo info) throws SQLException
    {
        return (Integer) this.getSqlMapClientTemplate().queryForObject("check.queryBuyGoodsCount", info);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String queryGoodsName(String goodsKey) throws SQLException
    {
        return (String) this.getSqlMapClientTemplate().queryForObject("check.queryGoodsName", goodsKey);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer queryCartGoodsNum(ReqCheckGoodsInfo reqInfo) throws SQLException
    {
        return (Integer) this.getSqlMapClientTemplate().queryForObject("check.queryCartGoodsNum", reqInfo);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer queryGoodsBuyNum(OrderInfo reqInfo) throws SQLException
    {
        return (Integer) this.getSqlMapClientTemplate().queryForObject("check.queryGoodsBuyNum", reqInfo);
    }
}
