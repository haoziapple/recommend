/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.dao.impl.GoodsSkuDAOImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-13     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sku.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.list.rsp.SkuInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.rsp.RspPropertyInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvkey.rsp.RspPVKeyInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.req.ReqPVListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.rsp.RspPListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.rsp.RspVListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuInfo.rsp.RspGoodsSkuInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuList.req.SkuListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuList.rsp.RspSkuListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuVal.req.ReqSkuValInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuVal.rsp.RspSkuValInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.value.req.ReqValueInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.value.rsp.RspValueInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.dao.GoodsSkuDAO;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.dao.impl.GoodsSkuDAOImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午3:37:15
 * @author:TangKai
 */
public class GoodsSkuDAOImpl extends SqlMapClientDaoSupport implements GoodsSkuDAO
{
    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<RspPropertyInfo> queryPropertyByTypeKey(String typeKey) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("property.queryPropertyByTypeKey", typeKey);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<RspValueInfo> queryValueByPropertyKey(ReqValueInfo reqInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("property.queryValueByPropertyKey", reqInfo);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<RspPropertyInfo> queryPListByGoodsKey(String goodsKey) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("property.queryPListByGoodsKey", goodsKey);
    }

    /**
     * {@inheritDoc}
     */
    public RspGoodsSkuInfo queryGoodsSkuInfoBySkuKey(String skuKey) throws SQLException
    {

        return (RspGoodsSkuInfo) this.getSqlMapClientTemplate().queryForObject("sku.queryGoodsSkuInfoBySkuKey", skuKey);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<RspSkuListInfo> querySkuListList(SkuListInfo skuListInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("sku.querySkuListList", skuListInfo);
    }

    /**
     * {@inheritDoc}
     */
    public String querySkuListCount(SkuListInfo skuListInfo) throws SQLException
    {
        return (String) this.getSqlMapClientTemplate().queryForObject("sku.querySkuListCount", skuListInfo);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RspSkuValInfo querySkuValByVKey(ReqSkuValInfo reqSkuValInfo) throws SQLException
    {
        return (RspSkuValInfo) this.getSqlMapClientTemplate().queryForObject("sku.querySkuValByVKey", reqSkuValInfo);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<RspPListInfo> queryPInfolistByGoodsKey(String goodsKey) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("sku.queryPInfolistByGoodsKey", goodsKey);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<RspVListInfo> queryVListByGPKey(ReqPVListInfo reqPVListInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("sku.queryVListByGPKey", reqPVListInfo);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<RspVListInfo> queryVListByPKey(String pKey) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("sku.queryVListByPKey", pKey);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<RspPVKeyInfo> queryPVListBySkuKey(String skuKey) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("sku.queryPVListBySkuKey", skuKey);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<RspPListInfo> queryPInfolistByTypeKey(String typekey) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("sku.queryPInfolistByTypeKey", typekey);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<SkuInfo> querySkuListByGoodsKey(String goodsKey) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("sku.querySkuListByGoodsKey", goodsKey);
    }
}
