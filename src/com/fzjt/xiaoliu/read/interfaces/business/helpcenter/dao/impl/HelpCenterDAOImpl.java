/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.dao.impl.HelpCenterDAOImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-2     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.helpcenter.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.info.rsp.RspHelpInfo;
import com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.req.ReqHelpListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.rsp.HelpInfo;
import com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.rsp.HelpListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.helpcenter.dao.HelpCenterDAO;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.dao.impl.HelpCenterDAOImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 下午8:51:03
 * @author:TangKai
 */
public class HelpCenterDAOImpl extends SqlMapClientDaoSupport implements HelpCenterDAO
{

    /**
     * {@inheritDoc}
     */
    @Override
    public RspHelpInfo queryHelpCenterInfo(String dataKey) throws SQLException
    {
        return (RspHelpInfo) this.getSqlMapClientTemplate().queryForObject("helpcenter.queryHelpCenterInfo", dataKey);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<HelpInfo> queryHelpInfoList(String hctKey) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("helpcenter.queryHelpInfoList", hctKey);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<HelpListInfo> queryHelpCenterList(ReqHelpListInfo reqInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("helpcenter.queryHelpCenterList", reqInfo);
    }
}
