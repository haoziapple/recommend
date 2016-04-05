/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.dao.impl.FloorDAOImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-4     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.pc.home.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.req.ReqFloorInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.rsp.FloorInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.rsp.PriceInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.view.req.ReqViewInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.view.rsp.ViewInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.dao.FloorDAO;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.dao.impl.FloorDAOImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-4 下午3:06:14
 * @author:TangKai
 */
public class FloorDAOImpl extends SqlMapClientDaoSupport implements FloorDAO
{

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<FloorInfo> queryFloorInfoList(ReqFloorInfo reqInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("floor.queryFloorInfoList", reqInfo);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PriceInfo queryGoodsPrice(FloorInfo floorInfo) throws SQLException
    {
        return (PriceInfo) this.getSqlMapClientTemplate().queryForObject("floor.queryGoodsPrice", floorInfo);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<ViewInfo> queryViewList(ReqViewInfo reqInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("floor.queryViewList", reqInfo);
    }

}
