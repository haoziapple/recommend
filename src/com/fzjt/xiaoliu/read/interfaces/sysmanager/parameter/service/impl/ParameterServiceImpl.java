package com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.service.impl;

import java.sql.SQLException;

import com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao.ParameterDAO;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.service.ParameterService;



/**
 * 参数信息service实现层
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.service.impl.ParameterServiceImpl
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 下午12:31:00
 * @author:ZhangYun
 */
public class ParameterServiceImpl implements ParameterService
{
    
    /**
     * 系统消息dao
     */
    private ParameterDAO parameterDAO;
    

    /**
     * 根据参数key查询value值
     */
    public String queryParameterValue(String key) throws SQLException
    {
        return parameterDAO.queryParameterValue(key);
    }

    
	/**
     * {@inheritDoc}
     */
    @Override
    public String queryOracleTime() throws SQLException
    {
        return parameterDAO.querySysDate();
    }


    public ParameterDAO getParameterDAO()
    {
        return parameterDAO;
    }


    public void setParameterDAO(ParameterDAO parameterDAO)
    {
        this.parameterDAO = parameterDAO;
    }

    
}
