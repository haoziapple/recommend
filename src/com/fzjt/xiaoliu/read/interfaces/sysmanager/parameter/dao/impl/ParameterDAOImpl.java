package com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao.impl;

import java.sql.SQLException;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao.ParameterDAO;


/**
 * 参数信息dao实现层 
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao.impl.ParameterDAOImpl
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 下午12:29:40
 * @author:ZhangYun
 */
public class ParameterDAOImpl extends SqlMapClientDaoSupport implements ParameterDAO
{
	/**
	 * 根据参数key查询value值
	 */
	public String queryParameterValue(String key) throws SQLException
	{
		return (String)this.getSqlMapClientTemplate().queryForObject("parameter.queryParameterValue", key);
	}

    @Override
    public String querySysDate() throws SQLException
    {
        return (String)this.getSqlMapClientTemplate().queryForObject("parameter.querySysDate");
    }
}
