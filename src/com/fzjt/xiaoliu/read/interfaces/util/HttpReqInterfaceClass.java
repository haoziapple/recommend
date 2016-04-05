package com.fzjt.xiaoliu.read.interfaces.util;

import org.dom4j.Document;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.util.HttpReqInterfaceClass
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 下午12:38:53
 * @author:ZhangYun
 */
public class HttpReqInterfaceClass
{

	/**
	 * 
	 * @Description:
	 * @param url
	 * @return
	 * @version:v1.0
	 * @author:ZhangYun
	 * @date:2015-10-24 下午12:39:05
	 */
	public Document httpReqXml(String url)
	{
		// 设定调用的地址
		Document doc = null;
		// 打开调用的地址

		// 传递参数

		// 获取返回的值
		return doc;
	}

	/**
	 * 
	 * @Description:
	 * @param args
	 * @version:v1.0
	 * @author:ZhangYun
	 * @date:2015-10-24 下午12:39:12
	 */
	public static void main(String args[])
	{
		HttpReqInterfaceClass xml = new HttpReqInterfaceClass();
		Document doc = null;
		String url = "";
		doc = xml.httpReqXml(url);
		System.out.println(doc.asXML().toString());
	}
}
