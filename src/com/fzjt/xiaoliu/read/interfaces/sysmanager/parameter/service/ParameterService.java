package com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.service;

import java.sql.SQLException;

/**
 * 参数信息service接口层
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.service.ParameterService
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 下午12:31:11
 * @author:ZhangYun
 */
public interface ParameterService
{
	
    /**
     * 根据参数key查询value值
     * @Description:
     * @param key
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:ZhangYun
     * @date:2015-10-24 下午12:31:59
     */
    String queryParameterValue(String key) throws SQLException;
    
	/**
	 * 从数据库获取当前时间
	 * @Description:
	 * @return
	 * @throws SQLException
	 * @version:v1.0
	 * @author:ZhangYun
	 * @date:2015-10-24 下午12:32:07
	 */
    String queryOracleTime() throws SQLException;
}
