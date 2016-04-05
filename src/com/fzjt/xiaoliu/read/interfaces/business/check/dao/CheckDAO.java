/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.dao.CheckDAO
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-8     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.check.dao;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.check.bean.GoodsDistInfo;
import com.fzjt.xiaoliu.read.interfaces.business.check.bean.GoodsLimitInfo;
import com.fzjt.xiaoliu.read.interfaces.business.check.bean.OrderInfo;
import com.fzjt.xiaoliu.read.interfaces.business.check.bean.goods.req.ReqCheckGoodsInfo;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.dao.CheckDAO
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-8 下午3:43:54
 * @author:TangKai
 */
public interface CheckDAO
{

    /**
     * 查询订单信息
     * 
     * @Description:
     * @param orderInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-8 下午3:39:58
     */
    public List<OrderInfo> queryOrderInfoList(String orderInfo) throws SQLException;

    /**
     * 查询商品限购数量
     * 
     * @Description:
     * @param info
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-8 下午3:42:25
     */
    String queryGoodsLimitNum(GoodsDistInfo info) throws SQLException;

    /**
     * 查询商品剩余库存数量
     * 
     * @Description:
     * @param info
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-8 下午3:43:05
     */
    String queryGoodsTrueNum(GoodsDistInfo info) throws SQLException;

    /**
     * 查询商品状态
     * 
     * @Description:
     * @param info
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-8 下午3:44:04
     */
    String queryGoodsStatus(GoodsDistInfo info) throws SQLException;

    /**
     * 查询商品上下架
     * 
     * @Description:
     * @param info
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-8 下午3:49:56
     */
    String queryGoodsOnSale(GoodsDistInfo info) throws SQLException;

    /**
     * 查询提交订单商品限购信息（限购时间和限购数量）
     * 
     * @Description:
     * @param info
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-8 下午3:50:04
     */
    GoodsLimitInfo queryGoodsLimitInfo(GoodsLimitInfo info) throws SQLException;

    /**
     * 查询指定限购信息商品
     * 
     * @Description:
     * @param info
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-8 下午3:50:13
     */
    Integer queryBuyGoodsCount(GoodsLimitInfo info) throws SQLException;

    /**
     * 根据goodsKey查询商品名称
     * 
     * @Description:
     * @param goodsKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-24 下午4:24:01
     */
    String queryGoodsName(String goodsKey) throws SQLException;

    /**
     * 查询购物车中已存在该商品的数量
     * 
     * @Description:
     * @param reqInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-24 下午5:51:35
     */
    Integer queryCartGoodsNum(ReqCheckGoodsInfo reqInfo) throws SQLException;

    /**
     * 查询用户已购买商品数
     * 
     * @Description:
     * @param reqInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-24 下午6:37:31
     */
    Integer queryGoodsBuyNum(OrderInfo reqInfo) throws SQLException;

}
