/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.dao.impl.PromotionDAOImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-9     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.promotion.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.detail.RspDetailInfo;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.req.ReqPromotionInfo;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.rsp.PromotionInfo;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.rsp.PacketInfo;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.rsp.SkuInfo;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.dao.PromotionDAO;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.dao.impl.PromotionDAOImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-9 上午10:39:33
 * @author:TangKai
 */
public class PromotionDAOImpl extends SqlMapClientDaoSupport implements PromotionDAO
{

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<PromotionInfo> queryPromotionList(ReqPromotionInfo reqInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("promotion.queryPromotionList", reqInfo);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<PacketInfo> queryPacketKeyList(String promKey) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("promotion.queryPacketKeyList", promKey);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<SkuInfo> queryPacketGoodsInfo(String packetKey) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("promotion.queryPacketGoodsInfo", packetKey);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RspDetailInfo queryPromotionInfo(String promKey) throws SQLException
    {
        return (RspDetailInfo) this.getSqlMapClientTemplate().queryForObject("promotion.queryPromotionInfo", promKey);
    }

}
