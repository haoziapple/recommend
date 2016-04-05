/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sort.dao.impl.SortDAOImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-6     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.sort.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.business.home.sort.bean.req.ReqSortInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.sort.bean.rsp.RspSortInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.sort.dao.SortDAO;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.sort.dao.impl.SortDAOImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-7 上午10:07:05
 * @author:LiChangjiang
 */
public class SortDAOImpl extends SqlMapClientDaoSupport implements SortDAO
{

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<RspSortInfo> querySortInfo(ReqSortInfo reqSortInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("sort.querySortInfo", reqSortInfo);
    }

}
