/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.push.sysmsg.dao.impl.SysMsgDAOImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-18     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sysmsg.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.list.req.ReqSysMsgInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.list.rsp.RspSysMsgInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.dao.SysMsgDAO;

/**
 * SysMsgDAO实现类
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sysmsg.dao.impl.SysMsgDAOImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-19 下午7:48:33
 * @author:TangKai
 */
public class SysMsgDAOImpl extends SqlMapClientDaoSupport implements SysMsgDAO
{

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<RspSysMsgInfo> queryPushSysMsg(ReqSysMsgInfo reqSysMsgInfo) throws SQLException
    {
        return this.getSqlMapClientTemplate().queryForList("sysMsg.queryPushSysMsg", reqSysMsgInfo);
    }

    /**
     * {@inheritDoc}
     */
    public String queryPushCount(ReqSysMsgInfo reqSysMsgInfo) throws SQLException
    {
        return (String) this.getSqlMapClientTemplate().queryForObject("sysMsg.queryPushCount", reqSysMsgInfo);
    }

    /**
     * {@inheritDoc}
     */
    public RspSysMsgInfo querySysMsgByKey(String msgkey) throws SQLException
    {
        return (RspSysMsgInfo) this.getSqlMapClientTemplate().queryForObject("sysMsg.querySysMsgByKey", msgkey);
    }

}
