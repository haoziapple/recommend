package com.fzjt.xiaoliu.read.interfaces.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 读取请求头中 username，userpassword 配置方法
 * @className:com.fzjt.xiaoliu.read.interfaces.util.ConfigurationsUser
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 下午12:35:49
 * @author:ZhangYun
 */
public class ConfigurationsUser
{
	

	

	public static String getValue(String key)
	{
		Properties pro = new Properties();
		ClassLoader cl = ConfigurationsUser.class.getClassLoader();
		InputStream is = cl.getResourceAsStream("configUser.properties");

		try
		{
			pro.load(is);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (!StringTools.isNullOrEmpty(is))
			{
				try
				{
					is.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		String value = pro.getProperty(key);
		return value;
	}
}
