/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.dao.GoodsDAO
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiChangjiang
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-10-30     LiChangjiang       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.dao;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.req.ReqCollectInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.rsp.RspCollectInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.detail.rsp.RspGoodsDetInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.req.GoodsKeyInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.rsp.RspGoodsObjInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.req.ReqGoodsListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.rsp.RspGoodsListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.req.ReqRecommendInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.rsp.RspRecommendInfo;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.dao.GoodsDAO
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-10-31 上午9:31:32
 * @author:LiChangjiang
 */
public interface GoodsDAO
{
    /**
     * 根据商品的goodskey查询商品信息
     * 
     * @Description:
     * @param goodsKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:LiangJin
     * @date:2015-11-3 下午3:05:53
     */
    RspGoodsObjInfo queryGoodsByGoodsKey(String goodsKey) throws SQLException;

    /**
     * 根据商品的goodskey查询商品详情
     * 
     * @Description:
     * @param goodsKey
     *            用户key
     * @return RspGoodsDetInfo
     * @throws SQLException
     * @version:v1.0
     * @author:LiangJin
     * @date:2015-11-9 下午3:18:33
     */
    RspGoodsDetInfo queryGoodsDetByGoodsKey(String goodsKey) throws SQLException;

    /**
     * 根据商品的排序方式销量、类别、名称查询商品列表
     * 
     * @Description:根据商品的排序方式（价格、量、上架时间）、类别、名称查询商品列表
     * @param reqGoodsListInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-16 下午4:44:03
     */
    List<RspGoodsListInfo> queryGoodsListBySaleNum(ReqGoodsListInfo reqGoodsListInfo) throws SQLException;

    /**
     * 根据商品的排序方式价格、类别、名称查询商品列表
     * 
     * @Description:根据商品的排序方式（价格、量、上架时间）、类别、名称查询商品列表
     * @param reqGoodsListInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-16 下午4:44:03
     */
    List<RspGoodsListInfo> queryGoodsListByPrice(ReqGoodsListInfo reqGoodsListInfo) throws SQLException;

    /**
     * 根据商品的排序方式上架时间、类别、名称查询商品列表
     * 
     * @Description:根据商品的排序方式（价格、量、上架时间）、类别、名称查询商品列表
     * @param reqGoodsListInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-16 下午4:44:03
     */
    List<RspGoodsListInfo> queryGoodsListByOnTime(ReqGoodsListInfo reqGoodsListInfo) throws SQLException;

    /**
     * 根据商品的排序方式上架时间、类别、名称查询商品数量
     * 
     * @Description:根据商品的排序方式上架时间、类别、名称查询商品数量
     * @param reqGoodsListInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-16 下午7:25:58
     */
    String queryGoodsListCount(ReqGoodsListInfo reqGoodsListInfo) throws SQLException;

    /**
     * 根据用户key和商品类型查询用户收藏列表
     * 
     * @Description:
     * @param reqCollectInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-18 上午11:11:32
     */
    List<RspCollectInfo> queryUserCollectList(ReqCollectInfo reqCollectInfo) throws SQLException;

    /**
     * 根据用户key和商品类型查询用户收藏商品数量
     * 
     * @Description:
     * @param reqCollectInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-18 上午11:12:30
     */
    String queryGoodsCollectCount(ReqCollectInfo reqCollectInfo) throws SQLException;

    /**
     * 添加浏览记录
     * 
     * @Description:
     * @param goodsKeyInfo
     * @throws SQLException
     * @version:v1.0
     * @author:LiangJin
     * @date:2015-11-19 上午9:10:09
     */
    void addHistoryInfo(GoodsKeyInfo goodsKeyInfo) throws SQLException;

    /**
     * 查询推荐商品列表
     * 
     * @Description:
     * @param reqRecommendInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-19 上午11:00:31
     */
    List<RspRecommendInfo> queryRecommendGoods(ReqRecommendInfo reqRecommendInfo) throws SQLException;

    /**
     * 根据userkey 查询用户最近浏览的商品类别，“，”分割
     * 
     * @Description:
     * @param reqRecommendInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-19 上午10:58:53
     */
    String queryUserVisitGoodsType(ReqRecommendInfo reqRecommendInfo) throws SQLException;

    /**
     * 确认搜索历史记录是否存在
     * 
     * @Description:
     * @param reqInfo
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-7 下午9:52:02
     */
    String countSearchHistory(ReqGoodsListInfo reqInfo) throws SQLException;

    /**
     * 更新已存在搜索记录添加时间
     * 
     * @Description:
     * @param reqInfo
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-7 下午9:52:02
     */
    void updateSearchTime(ReqGoodsListInfo reqInfo) throws SQLException;

    /**
     * 添加搜索历史记录
     * 
     * @Description:
     * @param reqInfo
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-7 下午9:52:02
     */
    void addSearchHistory(ReqGoodsListInfo reqInfo) throws SQLException;
}
