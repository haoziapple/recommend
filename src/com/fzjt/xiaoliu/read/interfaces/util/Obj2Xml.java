package com.fzjt.xiaoliu.read.interfaces.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;

/**
 * XML数据流处理类
 * @className:com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 下午12:39:48
 * @author:ZhangYun
 */
public class Obj2Xml
{

	/**
	 * 对象转换成为XML数据格式流
	 * @Description:
	 * @param objClass
	 * @param obj
	 * @param out
	 * @throws JAXBException
	 * @throws IOException
	 * @version:v1.0
	 * @author:ZhangYun
	 * @date:2015-10-24 下午12:39:58
	 */
	public static void obj2Xml(Class<?> objClass, Object obj, ByteArrayOutputStream out) throws JAXBException,
			IOException
	{
		JAXBContext context = JAXBContext.newInstance(objClass);

		Marshaller ma = context.createMarshaller();
		ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		ma.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);// 是否省略xml头信息
		ma.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		String str = "<?xml version='1.0' encoding='UTF-8'?>";
		out.write(str.getBytes("UTF-8")); // 设置xml头信息

		ma.marshal(obj, out);
	}

	/**
	 * 将XML数据流转换成为OBJECT
	 * @Description:
	 * @param xmlStr
	 * @param objClass
	 * @return
	 * @throws JAXBException
	 * @throws DocumentException
	 * @version:v1.0
	 * @author:ZhangYun
	 * @date:2015-10-24 下午12:40:08
	 */
	public static Object xml2Obj(String xmlStr, Class<?> objClass) throws JAXBException, DocumentException
	{
		Object obj = null;
		Document xmlDoc = null;

		// 将String转换为Document
		xmlDoc = DocumentHelper.parseText(xmlStr);

		JAXBContext context = JAXBContext.newInstance(objClass);
		Unmarshaller unmarsh = context.createUnmarshaller();

		String str = xmlDoc.asXML();
		Reader read = new StringReader(str);

		obj = unmarsh.unmarshal(read);
		return obj;
	}

}
