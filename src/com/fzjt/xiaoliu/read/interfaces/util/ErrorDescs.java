/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiChangjiang
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-13     LiChangjiang       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.util;

/**
 * 错误码描述
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午9:05:59
 * @author:LiChangjiang
 */
public class ErrorDescs
{
    /**
     * 请求参数为空
     */
    public static String PARAM_NULL_ERROR = "请求参数为空";
    
    /**
     * 请求数据格式错误
     */
    public static String REQ_FORMAT_ERROR= "请求数据格式错误";
    
    /**
     * 远程方法调用失败
     */
    public static String RMI_RESULT_ERROR = "远程方法调用失败";
    
    /**
     * 数据库操作异常
     */
    public static String EXECUTE_DB_ERROR = "数据库操作异常";
    
    /**
     * 返回数据转换异常
     */
    public static String RESPONSE_DATE_ERROR = "返回数据转换异常";
    /**
     * 获取XML报文错误
     */
    public static String XML_WRONG_ERROR= "获取XML报文错误";
    
    /*---------------------------------- 商品模块begin-------------------------------------- */
    /**
     * 所查询的商品信息缺失
     */
    public static String GOODS_INFO_NULL_ERROR = "所查询的商品信息缺失";
    
    /**
     * 查询的账户信息缺失
     */
    public static String ACCOUNT_INFO_NULL_ERROR = "账户缺失";
    
    /**
     * 所查询的附件信息缺失
     */
    public static String AFFIXES_INFO_NULL_ERROR = "所查询的附件信息缺失";
    
    /**
     * 所查询特征值、特征量的key缺失
     */
    public static String PV_INFO_NULL_ERROR = "所查询特征值特征量的key缺失";
    
    /**
     * 所查询的系统推送信息缺失
     */
    public static String SYSMSG_INFO_NULL_ERROR = "所查询的系统推送信息缺失";
    
    /**
     * 所查询的商品SKU信息缺失
     */
    public static String SKU_INFO_NULL_ERROR = "所查询的商品SKU信息缺失";
    
    /**
     * 所查询的楼层信息缺失
     */
    public static String FLOOR_INFO_NULL_ERROR = "所查询的楼层信息缺失";
    
    /**
     * 所查询area信息缺失
     */
    public static String AREA_INFO_NULL_ERROR = "所查询area信息缺失";
    
    /**
     * 所查询底部按钮信息缺失
     */
    public static String BOTTOM_INFO_NULL_ERROR = "所查询底部按钮信息缺失";
    
    /**
     * 所查询分类信息缺失
     */
    public static String SORT_INFO_NULL_ERROR = "所查询分类信息缺失";
    
    /**
     * 所查询首页轮播图片信息缺失
     */
    public static String TURN_INFO_NULL_ERROR = "所查询首页轮播图片信息缺失";
    
    /**
     * 促销活动信息为空
     */
    public static String PROMOTION_INFO_NULL_ERROR = "促销活动信息为空";
    
    /**
     * 平台推广活动信息为空
     */
    public static String ACTVT_INFO_NULL_ERROR = "平台推广活动信息为空";
    
    /**
     * 商品状态无效
     */
    public static String GOODS_STATUS_ERROR = "商品状态无效";

    /**
     * 商品上下架状态错误
     */
    public static String GOODS_UPSALE_ERROR = "商品上下架状态错误";

    /**
     * 购买商品超过限购数量
     */
    public static String GOODS_LIMIT_ERROR = "购买商品超过限购数量";

    /**
     * 购买商品超过库存
     */
    public static String GOODS_STOCK_ERROR = "购买商品超过库存";

    /**
     * 购买商品超过限购日期内总数
     */
    public static String GOODS_DATE_LIMIT_ERROR = "购买商品超过限购日期内总数";
    
    /**
     * 限时秒杀活动信息为空
     */
    public static String FLASH_SALE_NULL_ERROR = "限时秒杀活动信息为空";
    
}
