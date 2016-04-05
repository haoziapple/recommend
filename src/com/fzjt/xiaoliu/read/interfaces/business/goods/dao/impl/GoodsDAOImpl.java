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

import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.req.ReqCollectInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.rsp.RspCollectInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.detail.rsp.RspGoodsDetInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.req.GoodsKeyInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.rsp.RspGoodsObjInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.list.req.ReqGoodsInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.list.rsp.RspGoodsInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.req.ReqGoodsListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.rsp.RspGoodsListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.req.ReqRecommendInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.rsp.RspRecommendInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.dao.GoodsDAO;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.dao.impl.GoodsDAOImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-10-30 下午5:14:39
 * @author:LiChangjiang
 */

public class GoodsDAOImpl extends SqlMapClientDaoSupport implements GoodsDAO
{
    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<RspGoodsInfo> queryGoodsListByShop(ReqGoodsInfo reqGoodsInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("goods.queryGoodsListByShop", reqGoodsInfo);
    }

    /**
     * {@inheritDoc}
     */
    public RspGoodsObjInfo queryGoodsByGoodsKey(String goodsKey) throws SQLException
    {
        return (RspGoodsObjInfo) this.getSqlMapClientTemplate().queryForObject("goods.queryGoodsByGoodsKey", goodsKey);

    }

    /**
     * {@inheritDoc}
     */
    public RspGoodsDetInfo queryGoodsDetByGoodsKey(String goodsKey) throws SQLException
    {
        return (RspGoodsDetInfo) this.getSqlMapClientTemplate().queryForObject("goods.queryGoodsDetByGoodsKey",
                goodsKey);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<RspGoodsListInfo> queryGoodsListBySaleNum(ReqGoodsListInfo reqGoodsListInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("goods.queryGoodsListBySaleNum", reqGoodsListInfo);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<RspGoodsListInfo> queryGoodsListByPrice(ReqGoodsListInfo reqGoodsListInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("goods.queryGoodsListByPrice", reqGoodsListInfo);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<RspGoodsListInfo> queryGoodsListByOnTime(ReqGoodsListInfo reqGoodsListInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("goods.queryGoodsListByOnTime", reqGoodsListInfo);
    }

    /**
     * {@inheritDoc}
     */
    public String queryGoodsListCount(ReqGoodsListInfo reqGoodsListInfo) throws SQLException
    {
        return (String) this.getSqlMapClientTemplate().queryForObject("goods.queryGoodsListCount", reqGoodsListInfo);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<RspCollectInfo> queryUserCollectList(ReqCollectInfo reqCollectInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("goods.queryUserCollectList", reqCollectInfo);
    }

    /**
     * {@inheritDoc}
     */
    public String queryGoodsCollectCount(ReqCollectInfo reqCollectInfo) throws SQLException
    {
        return (String) this.getSqlMapClientTemplate().queryForObject("goods.queryGoodsCollectCount", reqCollectInfo);
    }

    /**
     * {@inheritDoc}
     */
    public void addHistoryInfo(GoodsKeyInfo goodsKeyInfo) throws SQLException
    {
        this.getSqlMapClientTemplate().insert("goods.addHistoryInfo", goodsKeyInfo);

    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<RspRecommendInfo> queryRecommendGoods(ReqRecommendInfo reqRecommendInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("goods.queryRecommendGoods", reqRecommendInfo);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String queryUserVisitGoodsType(ReqRecommendInfo reqRecommendInfo) throws SQLException
    {
        return (String) this.getSqlMapClientTemplate()
                .queryForObject("goods.queryUserVisitGoodsType", reqRecommendInfo);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String countSearchHistory(ReqGoodsListInfo reqInfo) throws SQLException
    {
        return (String) this.getSqlMapClientTemplate().queryForObject("goods.countSearchHistory", reqInfo);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void updateSearchTime(ReqGoodsListInfo reqInfo) throws SQLException
    {
        this.getSqlMapClientTemplate().update("goods.updateSearchTime", reqInfo);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addSearchHistory(ReqGoodsListInfo reqInfo) throws SQLException
    {
        this.getSqlMapClientTemplate().insert("goods.addSearchHistory", reqInfo);
    }
}
