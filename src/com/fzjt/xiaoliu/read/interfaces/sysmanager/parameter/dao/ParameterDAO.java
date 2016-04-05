package com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao;

import java.sql.SQLException;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao.ParameterDAO
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 下午12:30:11
 * @author:ZhangYun
 */
public interface ParameterDAO
{
	
    /**
     * 根据参数key查询value值
     * @Description:
     * @param key
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:ZhangYun
     * @date:2015-10-24 下午12:30:25
     */
    String queryParameterValue(String key) throws SQLException;
    
    /**
     * 从数据库获取当前时间
     * @Description:
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:ZhangYun
     * @date:2015-10-24 下午12:30:35
     */
    String querySysDate() throws SQLException;
}
