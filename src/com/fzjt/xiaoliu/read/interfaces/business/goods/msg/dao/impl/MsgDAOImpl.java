/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.dao.impl.msgDAOImpl
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
package com.fzjt.xiaoliu.read.interfaces.business.goods.msg.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.list.req.ReqMsgInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.list.rsp.RspMsgInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.req.ReqMsg4ShopInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.rsp.RspMsgInfo4Shop;
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.dao.MsgDAO;
import com.fzjt.xiaoliu.read.interfaces.business.usercenter.msg.bean.customer.req.ReqMsg4UserInfo;

/**
 * MsgDAO实现类
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.dao.impl.MsgDAOImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午6:19:44
 * @author:LiangJin
 */
public class MsgDAOImpl extends SqlMapClientDaoSupport implements MsgDAO
{

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<RspMsgInfo> queryGoodsMsg(String goodsKey) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("msg.queryGoodsMsg", goodsKey);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<RspMsgInfo> queryGoodsMsg(ReqMsgInfo reqMsgInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("msg.queryGoodsMsg", reqMsgInfo);
    }

    /**
     * {@inheritDoc}
     */
    public String queryMsgCountByKey(ReqMsgInfo reqMsgInfo) throws SQLException
    {
        return (String) this.getSqlMapClientTemplate().queryForObject("msg.queryMsgCountByKey", reqMsgInfo);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<RspMsgInfo4Shop> queryGoodsMsg4Shop(ReqMsg4ShopInfo reqInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("msg.queryGoodsMsg4Shop", reqInfo);
    }

    /**
     * {@inheritDoc}
     */
    public String queryMsgCountByShop(ReqMsg4ShopInfo reqInfo) throws SQLException
    {
        return (String) this.getSqlMapClientTemplate().queryForObject("msg.queryMsgCountByShop", reqInfo);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<RspMsgInfo4Shop> queryGoodsMsg4User(ReqMsg4UserInfo reqInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("msg.queryGoodsMsg4User", reqInfo);
    }

    /**
     * {@inheritDoc}
     */
    public String queryMsgCountByUser(ReqMsg4UserInfo reqInfo) throws SQLException
    {
        return (String) this.getSqlMapClientTemplate().queryForObject("msg.queryMsgCountByUser", reqInfo);
    }

}
