package com.fzjt.xiaoliu.read.interfaces.util;

import java.io.ByteArrayInputStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import java.util.zip.GZIPInputStream;

import java.util.zip.GZIPOutputStream;

/**
 * 
 * GZIP压缩解压类
 */
public class GZIPUtils
{

	/**
	 * private static String strs = "<config>" + "<id>1</id><name>张三</name>" +
	 * "<id>2</id><name>李四</name>" + "<results><result>ok</result>" +
	 * "<resutlt>no</result></results>" + "</config1>";
	 * 
	 * public static void main(String[] args) {
	 * 
	 * // 压缩字符串 byte[] bytes = compressToByte(strs);
	 * 
	 * System.out.println("压缩前：" + strs.toCharArray().length + "\t" + "压缩后：" +
	 * bytes.length);
	 * 
	 * System.out.println("压缩解压后的字符串：" + uncompressToString(bytes));
	 * 
	 * }
	 */

	private static String encode = "utf-8";// "ISO-8859-1"

	public String getEncode()
	{

		return encode;

	}

	/**
	 * 
	 * 设置 编码，默认编码：UTF-8
	 */

	public void setEncode(String encode)
	{

		GZIPUtils.encode = encode;

	}

	/**
	 * 
	 * 字符串压缩为字节数组
	 * 
	 * @throws IOException
	 */

	public static byte[] compressToByte(String str) throws IOException
	{

		if (str == null || str.length() == 0)
		{

			return null;

		}

		ByteArrayOutputStream out = new ByteArrayOutputStream();

		GZIPOutputStream gzip;

		gzip = new GZIPOutputStream(out);

		gzip.write(str.getBytes(encode));

		gzip.close();

		return out.toByteArray();

	}

	/**
	 * 
	 * 字符串压缩为字节数组
	 * 
	 * @throws IOException
	 */

	public static byte[] compressToByte(String str, String encoding) throws IOException
	{

		if (str == null || str.length() == 0)
		{

			return null;

		}

		ByteArrayOutputStream out = new ByteArrayOutputStream();

		GZIPOutputStream gzip;

		gzip = new GZIPOutputStream(out);

		gzip.write(str.getBytes(encoding));

		gzip.close();

		return out.toByteArray();

	}

	/**
	 * 
	 * 字节数组解压缩后返回字符串
	 * 
	 * @throws IOException
	 */

	public static String uncompressToString(byte[] b) throws IOException
	{

		if (b == null || b.length == 0)
		{

			return null;

		}

		ByteArrayOutputStream out = new ByteArrayOutputStream();

		ByteArrayInputStream in = new ByteArrayInputStream(b);

		GZIPInputStream gunzip = new GZIPInputStream(in);

		byte[] buffer = new byte[256];

		int n;

		while ((n = gunzip.read(buffer)) >= 0)
		{

			out.write(buffer, 0, n);

		}

		return out.toString();

	}

	/**
	 * 
	 * 字节数组解压缩后返回字符串
	 * 
	 * @throws IOException
	 */

	public static String uncompressToString(byte[] b, String encoding) throws IOException
	{
		if (b == null || b.length == 0)
		{

			return null;

		}

		ByteArrayOutputStream out = new ByteArrayOutputStream();

		ByteArrayInputStream in = new ByteArrayInputStream(b);

		GZIPInputStream gunzip = new GZIPInputStream(in);

		byte[] buffer = new byte[256];

		int n;

		while ((n = gunzip.read(buffer)) >= 0)
		{

			out.write(buffer, 0, n);

		}

		return out.toString(encoding);
	}
}
