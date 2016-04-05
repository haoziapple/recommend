/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.activity.dao.impl.ActivityDAOImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-10     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.activity.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.business.activity.bean.Relation.req.ReqRelationInfo;
import com.fzjt.xiaoliu.read.interfaces.business.activity.bean.info.req.ReqActivityInfo;
import com.fzjt.xiaoliu.read.interfaces.business.activity.bean.info.rsp.ActivityInfo;
import com.fzjt.xiaoliu.read.interfaces.business.activity.dao.ActivityDAO;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.activity.dao.impl.ActivityDAOImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-10 下午9:28:40
 * @author:TangKai
 */
public class ActivityDAOImpl extends SqlMapClientDaoSupport implements ActivityDAO
{

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<ActivityInfo> queryActivityList(ReqActivityInfo reqInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("activity.queryActivityList", reqInfo);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<String> queryRelationList(ReqRelationInfo reqInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("activity.queryRelationList", reqInfo);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public ActivityInfo queryActivityInfo(String actvtKey) throws SQLException
    {
        return (ActivityInfo) this.getSqlMapClientTemplate().queryForObject("activity.queryActivityInfo", actvtKey);
    }
}
