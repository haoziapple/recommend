/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.service.GoodsService
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
package com.fzjt.xiaoliu.read.interfaces.business.goods.service;

import java.sql.SQLException;

import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.req.ReqCollectBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.rsp.RspCollectBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.detail.rsp.RspGoodsDetInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.req.GoodsKeyInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.rsp.RspGoodsObjInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.list.req.ReqGoodsBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.list.rsp.RspGoodsBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.req.ReqGoodsListBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.rsp.RspGoodsListBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.req.ReqRecommendBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.rsp.RspRecommendBody;

/**
 * 商品Service
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.service.GoodsService
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-10-30 下午5:10:42
 * @author:LiChangjiang
 */
public interface GoodsService
{
    /**
     * 根据商家查询商品列表
     * 
     * @Description:
     * @param reqGoodsInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:LiChangjiang
     * @date:2015-10-30 下午5:38:27
     */
    RspGoodsBody queryGoodsListByShop(ReqGoodsBody reqGoodsBody) throws SQLException;

    /**
     * 根据商品goodskey查询商品信息
     * 
     * @Description:
     * @param goodsKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:LiangJin
     * @date:2015-11-3 下午3:35:08
     */
    RspGoodsObjInfo queryGoodsByGoodsKey(GoodsKeyInfo goodsKeyInfo) throws SQLException;

    /**
     * 根据商品goodskey查询商品詳情
     * 
     * @Description:
     * @param goodsKey
     * @return RspGoodsDetInfo
     * @throws SQLException
     * @version:v1.0
     * @author:LiangJin
     * @date:2015-11-9 下午3:21:50
     */
    RspGoodsDetInfo queryGoodsDetByGoodsKey(String goodsKey) throws SQLException;

    /**
     * 根据商品的排序方式（价格、量、上架时间）、类别、名称查询商品列表
     * 
     * @Description:根据商品的排序方式（价格、量、上架时间）、类别、名称查询商品列表
     * @param reqGoodsListInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-16 下午5:58:50
     */
    RspGoodsListBody queryGoodsList(ReqGoodsListBody reqGoodsListBody) throws SQLException;

    /**
     * 根据用户key和商品类型查询用户收藏商品数量
     * 
     * @Description:
     * @param reqCollectBody
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-18 上午11:16:17
     */
    RspCollectBody queryCollectList(ReqCollectBody reqCollectBody) throws SQLException;

    /**
     * 查询推荐商品列表
     * 
     * @Description:
     * @param reqRecommendInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-19 上午11:15:52
     */
    RspRecommendBody queryRecommendGoods(ReqRecommendBody reqRecommendBody) throws SQLException;
}
