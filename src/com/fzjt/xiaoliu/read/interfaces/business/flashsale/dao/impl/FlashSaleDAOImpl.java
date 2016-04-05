/**
 * Copyright (C) 2016 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.dao.impl.FlashSaleDAOImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2016-1-6     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.flashsale.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.req.ReqFlashSaleInfo;
import com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.rsp.RspFlashSaleInfo;
import com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.list.req.ReqFSGoodsInfo;
import com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.list.rsp.RspFSGoodsInfo;
import com.fzjt.xiaoliu.read.interfaces.business.flashsale.dao.FlashSaleDAO;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.dao.impl.FlashSaleDAOImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2016-1-6 下午8:20:08
 * @author:TangKai
 */
public class FlashSaleDAOImpl extends SqlMapClientDaoSupport implements FlashSaleDAO
{

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<RspFlashSaleInfo> queryFlashSaleList(ReqFlashSaleInfo reqInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("flashsale.queryFlashSaleList", reqInfo);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<RspFSGoodsInfo> queryFSGoodsList(ReqFSGoodsInfo reqInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("flashsale.queryFSGoodsList", reqInfo);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String queryFSGoodsListCount(String salesKey) throws SQLException
    {
        return (String) this.getSqlMapClientTemplate().queryForObject("flashsale.queryFSGoodsListCount", salesKey);
    }

    @Override
    public String queryFSGoodsLeft(RspFSGoodsInfo goodsInfo) throws SQLException
    {
        return (String) this.getSqlMapClientTemplate().queryForObject("flashsale.queryFSGoodsLeft", goodsInfo);
    }

}
