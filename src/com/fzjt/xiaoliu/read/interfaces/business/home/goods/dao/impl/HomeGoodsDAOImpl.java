/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.goods.dao.impl.GoodsDAOImpl
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
package com.fzjt.xiaoliu.read.interfaces.business.home.goods.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.req.ReqGoodsInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.rsp.RspGoodsInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.goods.dao.HomeGoodsDAO;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.goods.dao.impl.HomeGoodsDAOImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-7 下午4:25:37
 * @author:LiangJin
 */
public class HomeGoodsDAOImpl extends SqlMapClientDaoSupport implements HomeGoodsDAO
{

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<RspGoodsInfo> queryGoodsList(ReqGoodsInfo reqGoodsInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("homeGoods.queryGoodsList", reqGoodsInfo);
    }

    /**
     * {@inheritDoc}
     */
    public String queryGoodsCount(ReqGoodsInfo reqGoods) throws SQLException
    {
        return (String) this.getSqlMapClientTemplate().queryForObject("homeGoods.queryGoodsCount", reqGoods);
    }

}
