package com.fzjt.xiaoliu.read.interfaces.util;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;

/**
 * Stringtool
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.util.StringTools
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-10-24 下午12:45:47
 * @author:ZhangYun
 */
public class StringTools
{

    /**
     * 字符串去首尾空格
     * 
     * @Description:
     * @param str
     * @return
     * @version:v1.0
     * @author:Bing Lu
     * @date:2014-9-2 下午4:10:39
     */
    public static String removeSpace(String str)
    {
        if (StringTools.isNullOrEmpty(str))
        {
            return "";
        }
        return str.trim();
    }

    /**
     * 判断字符串非空
     * 
     * @Description:当字符串为空返回true
     * @param str
     * @return
     * @version:v1.0
     * @author:LiChangjiang
     * @date:2012-11-27 下午02:22:38
     */
    public static boolean isNullOrEmpty(String str)
    {
        str = checkStringNull4IOS(str);

        if (null == str || "".equals(str.trim()) || "null".equals(str.trim()))
        {
            return true;
        }
        return false;
    }

    /**
     * 判断对象是否为空
     * 
     * @Description:当字符串为空返回true
     * @param obj
     * @return
     * @version:v1.0
     * @author:LiChangjiang
     * @date:2012-11-27 下午02:26:55
     */
    public static boolean isNullOrEmpty(Object obj)
    {
        if (null == obj || "".equals(obj))
        {
            return true;
        }
        return false;
    }

    /**
     * 将字符串转换成Integer
     * 
     * @Description: 字符串为空或非数字返回0
     * @param str
     * @return
     * @version:v1.0
     * @author:LiChangjiang
     * @date:2012-11-27 下午03:02:50
     */
    public static int parseStr2Int(String str)
    {
        int num = 0;
        try
        {
            if (StringTools.isNullOrEmpty(str))
            {
                return 0;
            }
            num = Integer.parseInt(StringTools.removeSpace(str));
        }
        catch (NumberFormatException e)
        {
            return 0;
        }
        return num;
    }

    /**
     * 截取字符串
     * 
     * @Description:按规定的长度截取字符串，过长部分用“...”表示
     * @param str
     *            需要截取的字符串
     * @param length
     *            需要被截取的长度
     * @return String
     * @version:v1.0
     * @author:LiChangjiang
     * @date:2012-12-5 上午11:40:08
     */
    public static String cutOutString(String str, int length)
    {
        str = StringTools.removeSpace(str);
        String newStr = str;
        if (StringTools.isNullOrEmpty(str))
        {
            return "";
        }

        if (str.length() > length)
        {
            newStr = str.substring(0, length) + "...";
        }
        return newStr;
    }

    /**
     * 字符串编码转换的实现方法
     * 
     * @param str
     *            待转换编码的字符串
     * @param newCharset
     *            目标编码
     * @return
     * @throws UnsupportedEncodingException
     */
    public String changeCharset(String str, String newCharset) throws UnsupportedEncodingException
    {
        if (str != null)
        {
            // 用默认字符编码解码字符串。
            byte[] bs = str.getBytes();
            // 用新的字符编码生成字符串
            return new String(bs, newCharset);
        }
        return null;
    }

    /**
     * 元转换成分
     * 
     * @Description:把元转换成分，保留两位小数
     * @param yuan
     * @return
     * @version:v1.0
     * @author:LiuQiang
     * @date:2015-4-3 上午9:00:09
     */
    public static String yuanToFen(String yuan)
    {
        String yuanStr = "";

        String currency = yuan.replaceAll("\\$|\\￥|\\,", ""); // 处理包含, ￥ 或者$的金额
        int index = currency.indexOf(".");
        int length = currency.length();
        BigDecimal amBig = null;
        if (index == -1)
        {
            amBig = new BigDecimal(currency + "00");
        }
        else if (length - index >= 3)
        {
            amBig = new BigDecimal((currency.substring(0, index + 3)).replace(".", ""));
        }
        else if (length - index == 2)
        {
            amBig = new BigDecimal((currency.substring(0, index + 2)).replace(".", "") + 0);
        }
        else
        {
            amBig = new BigDecimal((currency.substring(0, index + 1)).replace(".", "") + "00");
        }
        yuanStr = amBig.toString();
        return yuanStr;
    }

    /**
     * 
     * @Description: 过滤特殊有问题字符，转换成*
     * @param str
     * @return String
     * @version:v1.0
     * @author:刘强
     * @date:2015-6-4 下午3:13:53
     */
    public static String checkString(String str)
    {
        return str.replaceAll(
                "[^a-zA-Z0-9_\u4E00-\u9FA5 `\\-=~!@#$&*()_+,.!?，。、？！;'{}:：；‘’、“”\\[\\]\"/\\\\……《》<>·【】——°]", "*");
    }

    /**
     * 用于处理IOS端默认的空字符串(null)
     * 
     * @Description:如果是"(null)"则返回""
     * @param str
     * @return
     * @version:v1.0
     * @author:LiChangjiang
     * @date:2015年11月30日 下午8:01:41
     */
    public static String checkStringNull4IOS(String IOSstr)
    {
        return Constant.IOS_NULL.equals(IOSstr) ? "" : IOSstr;
    }

}
