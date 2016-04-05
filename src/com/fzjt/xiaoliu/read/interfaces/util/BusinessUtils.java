package com.fzjt.xiaoliu.read.interfaces.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqHead;
import com.fzjt.xiaoliu.read.interfaces.bean.response.RspHead;


/**
 * 业务方法工具类
 * @className:com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 下午12:34:00
 * @author:ZhangYun
 */
public class BusinessUtils
{

    /**
     * 转换请求头为返回头
     * @Description:
     * @param req
     * @return
     * @version:v1.0
     * @author:ZhangYun
     * @date:2015-10-24 下午12:34:13
     */
    public static RspHead transformHead(ReqHead req)
    {
        if (StringTools.isNullOrEmpty(req))
        {
            return null;
        }
        RspHead head = new RspHead();

        head.setRequestName(req.getRequestName());
        //head.setTimestamp(DateUtils.getStringNow1());
        head.setTimestamp(req.getTimestamp());
        head.setVersions(req.getVersions());
        head.setResultCode("0");

        return head;
    }

    /**
     * 
     * @Description:
     * @param errorCode
     * @param errorDesc
     * @return
     * @version:v1.0
     * @author:ZhangYun
     * @date:2015-10-24 下午12:34:29
     */
    public static String rspErrorHeadInfo(String errorCode, String errorDesc)
    {
        // 如果请求的参数体位空返回错误TODO
        String rspXml = "<?xml version='1.0' encoding='UTF-8' ?>" + "<fzjt>" + "<head>" + "<responsename></responsename>" + "<timestamp>"
                + DateUtils.getStringNow1() + "</timestamp>" + "<versions>null</versions>" + "<resultcode>" + errorCode + "</resultcode>" + "<resultdesc>"
                + errorDesc + "</resultdesc>" + "</head>" + "<body></body>" + "</fzjt>";

        return rspXml;
    }
    
    /**
     * 根据模块CODE和随机数位数获取改模块对应的全站唯一KEY
     * @Description:
     * @param typeCode
     * @return
     * @version:v1.0
     * @author:ZhangYun
     * @date:2015-10-24 下午12:34:40
     */
    public static String getKeyByTypeCode(String typeCode)
    {
        Random jjj = new Random();
        Date currentTime = new Date();

        String key = "";
        String randomNum = "";

        // 获取当前时间
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddhhmmss");
        String dateString = formatter.format(currentTime);

        // 取四位随机数
        for (int k = 0; k < 4; k++)
        {
            randomNum = randomNum + jjj.nextInt(9);
        }

        key = typeCode + dateString + randomNum;
        return key;
    }
}
