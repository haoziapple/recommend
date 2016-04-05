package com.fzjt.xiaoliu.read.interfaces.util;

import java.util.List;

/**
 * List工具类
 * @className:com.fzjt.xiaoliu.read.interfaces.util.ListTools
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 下午12:39:26
 * @author:ZhangYun
 */
public class ListTools
{

	/**
	 * 判断集合是否为空
	 * @Description:
	 * @param list
	 * @return boolean
	 * @version:v1.0
	 * @author:Bing Lu
	 * @date:2014-9-2 下午4:07:54
	 */
	public static boolean isNullOrEmpty(List<?> list)
	{
		if (null == list || list.size() == 0)
		{
			return true;
		}
		if (list.isEmpty())
		{
			return true;
		}
		return false;
	}
}
