/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.street.dao.impl.StreetDAOImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-21     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.sysmanager.street.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.sysmanager.street.bean.info.rsp.RspStreetInfo;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.street.dao.StreetDAO;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.street.dao.impl.StreetDAOImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-21 下午5:20:53
 * @author:TangKai
 */
public class StreetDAOImpl extends SqlMapClientDaoSupport implements StreetDAO
{

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<RspStreetInfo> queryStreetInfoByAreaCode(String areaCode) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("street.queryStreetInfoByAreaCode", areaCode);
    }

}
