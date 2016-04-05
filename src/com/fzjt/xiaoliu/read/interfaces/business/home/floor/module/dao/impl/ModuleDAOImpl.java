/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.module.dao.impl.ModuleDAOImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-5     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.floor.module.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.business.home.floor.module.bean.req.ReqModuleInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.module.bean.rsp.RspModuleInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.module.dao.ModuleDAO;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.module.dao.impl.ModuleDAOImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-5 下午2:39:53
 * @author:LiangJin
 */
public class ModuleDAOImpl extends SqlMapClientDaoSupport implements ModuleDAO
{

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<RspModuleInfo> queryModule(ReqModuleInfo reqModuleInfo) throws SQLException
    {

        return this.getSqlMapClientTemplate().queryForList("module.queryModule", reqModuleInfo);
    }

}
