/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.util.BeanUtil
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiChangjiang
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015年12月12日     LiChangjiang       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.util.BeanUtil
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015年12月14日 上午10:41:49
 * @author:LiChangjiang
 */
public class BeanUtil
{
	private static Map<String, String> defaults;
	static
	{
		defaults = new HashMap<String, String>();
		defaults.put("String", "");
		defaults.put("Date", null);
		defaults.put("default", null);
	}

	private static boolean isJavaClass(Class<?> clz)
	{
		return clz != null && clz.getClassLoader() == null;
	}

	/**
	 * 校验BEAN属性，将无值的属性初始化值
	 * @Description:
	 * @param obj
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 * @version:v1.0
	 * @author:LiChangjiang
	 * @date:2015年12月12日 下午5:04:47
	 */
	public static void checkFieldValue(Object obj) throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		if (obj == null || isJavaClass(obj.getClass()))
			return;
		Class<?> cls = obj.getClass();
		Method[] methods = cls.getDeclaredMethods();
		Field[] fields = cls.getDeclaredFields();

		for (Field field : fields)
		{
			String fName = field.getName();

			String fieldGetName = parGetOrPostName(fName, "get");
			if (!checkGetMet(methods, fieldGetName))
			{
				continue;
			}
			Method fieldGetMet = cls.getMethod(fieldGetName);
			Object fieldVal = fieldGetMet.invoke(obj);
			String type = field.getType().getSimpleName();
			if (fieldVal == null)
			{
				String fileSetName = parGetOrPostName(fName, "set");
				if (!checkGetMet(methods, fileSetName))
				{
					continue;
				}

				if (defaults.containsKey(type))
				{
					Method fildSetMet = cls.getMethod(fileSetName, field.getType());
					fildSetMet.invoke(obj, new Object[]
					{ defaults.get(type) });
				}
				else
				{
					if ("List".equals(type))
					{
						Method fildSetMet = cls.getMethod(fileSetName, new Class[]
						{ List.class });
						fildSetMet.invoke(obj, new Object[]
						{ new ArrayList<Object>() });
					}
				}
			}
			else
			{
				if ("List".equals(type))
				{
					@SuppressWarnings("unchecked")
					List<Object> children = (List<Object>) fieldVal;
					for (Object child : children)
					{
						checkFieldValue(child);
					}
				}
				else
				{
					checkFieldValue(fieldVal);
				}
			}
		}
	}

	private static String parGetOrPostName(String fieldName, String type)
	{
		if (null == fieldName || "".equals(fieldName))
		{
			return null;
		}
		int startIndex = 0;
		if (fieldName.charAt(0) == '_')
			startIndex = 1;
		return type + fieldName.substring(startIndex, startIndex + 1).toUpperCase()
				+ fieldName.substring(startIndex + 1);
	}

	private static boolean checkGetMet(Method[] methods, String fieldGetMet)
	{
		for (Method met : methods)
		{
			if (fieldGetMet.equals(met.getName()))
			{
				return true;
			}
		}
		return false;
	}

}
