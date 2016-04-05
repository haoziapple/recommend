/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.affixs.dao.impl.AffixesDAOImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-14     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.affixs.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.rsp.RspAffixesInfo;
import com.fzjt.xiaoliu.read.interfaces.business.affixs.dao.AffixesDAO;

/**
 * dao实现类
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.affixs.dao.impl.AffixesDAOImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-17 上午10:59:34
 * @author:TangKai
 */
public class AffixesDAOImpl extends SqlMapClientDaoSupport implements AffixesDAO
{

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<RspAffixesInfo> querySkuAffixsByKey(String skuKey) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("skuAffixs.querySkuAffixsByKey", skuKey);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<RspAffixesInfo> queryGoodsAffixsByKey(String goodsKey)
    {
        return this.getSqlMapClientTemplate().queryForList("goodsAffixs.queryGoodsAffixsByKey", goodsKey);
    }
}
