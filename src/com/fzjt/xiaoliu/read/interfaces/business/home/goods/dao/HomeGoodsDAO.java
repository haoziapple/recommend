/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.goods.dao.GoodsDAO
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-7     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.goods.dao;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.req.ReqGoodsInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.rsp.RspGoodsInfo;

/**
 * 调用sql，查询页面商品信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.goods.dao.HomeGoodsDAO
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-7 下午4:25:26
 * @author:LiangJin
 */
public interface HomeGoodsDAO
{
    /**
     * 查询界面商品信息
     * 
     * @Description:根据给定的起始与截止条数，查询界面商品信息
     * @param reqGoodsInfo
     * @return List
     * @throws SQLException
     * @version:v1.0
     * @author:LiangJin
     * @date:2015-11-7 下午2:33:57
     */
    List<RspGoodsInfo> queryGoodsList(ReqGoodsInfo reqGoodsInfo) throws SQLException;

    /**
     * 界面商品总条数
     * 
     * @Description:界面商品总条数
     * @return String
     * @throws SQLException
     * @version:v1.0
     * @author:LiangJin
     * @date:2015-11-7 下午2:34:04
     */
    String queryGoodsCount(ReqGoodsInfo reqGoods) throws SQLException;

}
