/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.service.impl.GoodsServiceImpl
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
package com.fzjt.xiaoliu.read.interfaces.business.goods.service.impl;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.req.ReqCollectBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.req.ReqCollectInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.rsp.RspCollectBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.rsp.RspCollectInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.collect.rsp.RspCollectList;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.detail.rsp.RspGoodsDetInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.req.GoodsKeyInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.rsp.RspGoodsObjInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.list.req.ReqGoodsBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.list.req.ReqGoodsInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.list.rsp.RspGoodsBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.list.rsp.RspGoodsInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.list.rsp.RspGoodsList;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.req.ReqGoodsListBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.req.ReqGoodsListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.rsp.RspGoodsListBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.rsp.RspGoodsListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.listinfo.rsp.RspGoodsListList;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.req.ReqRecommendBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.req.ReqRecommendInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.rsp.RspRecommendBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.rsp.RspRecommendInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.rsp.RspRecommendList;
import com.fzjt.xiaoliu.read.interfaces.business.goods.dao.GoodsDAO;
import com.fzjt.xiaoliu.read.interfaces.business.goods.dao.ShopGoodsDAO;
import com.fzjt.xiaoliu.read.interfaces.business.goods.service.GoodsService;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao.ParameterDAO;
import com.fzjt.xiaoliu.read.interfaces.util.Constant;
import com.fzjt.xiaoliu.read.interfaces.util.DateUtils;
import com.fzjt.xiaoliu.read.interfaces.util.GetUUID;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.service.impl.GoodsServiceImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-10-30 下午5:21:36
 * @author:LiChangjiang
 */
public class GoodsServiceImpl implements GoodsService
{

    private GoodsDAO goodsDAO;
    private ShopGoodsDAO shopGoodsDAO;

    /**
     * 参数
     */
    private ParameterDAO parameterDAO;

    /**
     * {@inheritDoc}
     */
    public RspGoodsBody queryGoodsListByShop(ReqGoodsBody reqGoodsBody) throws SQLException
    {
        // 设置分页信息
        ReqGoodsInfo reqInfo = reqGoodsBody.getReqGoodsInfo();

        // 确保分页信息参数不为空
        if (StringTools.isNullOrEmpty(reqGoodsBody.getPageBean())
                || StringTools.isNullOrEmpty(reqGoodsBody.getPageBean().getFromNum())
                || StringTools.isNullOrEmpty(reqGoodsBody.getPageBean().getToNum()))
        {
            reqInfo.setFromNum(Constant.DEFAULT_PAGE_FROM);
            reqInfo.setToNum(Constant.DEFAULT_PAGE_TO);
        }
        else
        {
            // 设置分页信息
            reqInfo.setFromNum(reqGoodsBody.getPageBean().getFromNum());
            reqInfo.setToNum(reqGoodsBody.getPageBean().getToNum());
        }

        // 请求日期格式转换
        if (!StringTools.isNullOrEmpty(reqInfo.getFromTimeStr()) && !StringTools.isNullOrEmpty(reqInfo.getToTimeStr()))
        {
            reqInfo.setToTime(DateUtils.strToDateLong(reqInfo.getToTimeStr()));
            reqInfo.setFromTime(DateUtils.strToDateLong(reqInfo.getFromTimeStr()));
        }

        // 请求价格元转换成分进行查找
        if (!StringTools.isNullOrEmpty(reqInfo.getFromPrice()) && !StringTools.isNullOrEmpty(reqInfo.getToPrice()))
        {
            reqInfo.setToPrice(StringTools.yuanToFen(reqInfo.getToPrice()));
            reqInfo.setFromPrice(StringTools.yuanToFen(reqInfo.getFromPrice()));
        }

        // 定义返回信息
        RspGoodsBody rspResult = new RspGoodsBody();
        RspGoodsList listInfo = new RspGoodsList();
        List<RspGoodsInfo> rspList = null;
        String count = "";

        // 1. 取得排序方式 0降序 1 升序
        // 2. 设定返回数据排序方式
        String sort = reqInfo.getSort();
        if ("0".equals(sort))
        {
            reqInfo.setSort("asc");
        }
        else
        {
            reqInfo.setSort("desc");
        }

        // 根据时间排序的排序类别（0:上架按上架时间排序，1：下架按下架时间排序）
        if ("0".equals(reqInfo.getOnSale()))
        {
            reqInfo.setOnSaleSort("t.ON_TIME");
        }
        else if ("1".equals(reqInfo.getOnSale()))
        {
            reqInfo.setOnSaleSort("t.OFF_TIME");
        }
        else
        {
            reqInfo.setOnSaleSort("t.ADD_TIME");
        }

        // 处理搜索商品名称中的"%","_“
        if (!StringTools.isNullOrEmpty(reqInfo) && !StringTools.isNullOrEmpty(reqInfo.getGoodsName()))
        {
            if (reqInfo.getGoodsName().contains("\\"))
            {
                reqInfo.setGoodsName(reqInfo.getGoodsName().replaceAll("\\\\", "\\\\\\\\"));
            }
            if (reqInfo.getGoodsName().contains("%") || reqInfo.getGoodsName().contains("_"))
            {
                reqInfo.setGoodsName(reqInfo.getGoodsName().replaceAll("%", "\\\\%"));
                reqInfo.setGoodsName(reqInfo.getGoodsName().replaceAll("_", "\\\\_"));
            }
        }

        // 排序字段
        String sortStyle = reqInfo.getSortStyle();
        if (!StringTools.isNullOrEmpty(reqInfo.getSortStyle()))
        {
            // 根据商品价格排序，查询商品列表
            if ("0".equals(sortStyle))
            {
                rspList = shopGoodsDAO.queryShopGListByPrice(reqInfo);
            }
            // 根据商品销量排序，查询商品列表
            else if ("1".equals(sortStyle))
            {
                rspList = shopGoodsDAO.queryShopGListBySale(reqInfo);
            }
            // 根据时间排序，查询商品列表
            else
            {
                rspList = shopGoodsDAO.queryShopGListByTime(reqInfo);
            }
        }
        // 根据时间排序，查询商品列表
        else
        {
            rspList = shopGoodsDAO.queryShopGListByTime(reqInfo);
        }

        // 查询商品数量
        count = shopGoodsDAO.queryGListCountByShop(reqInfo);

        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        // 获取数据不为空，拼装图片返回地址
        if (!ListTools.isNullOrEmpty(rspList))
        {
            for (RspGoodsInfo temp : rspList)
            {
                if (StringTools.isNullOrEmpty(temp))
                {
                    continue;
                }
                // 拼装图片地址路径
                if (!StringTools.isNullOrEmpty(temp.getGoodsPics()))
                {
                    temp.setGoodsPics(parameterValue + temp.getGoodsPics());
                }
                // 上架时间格式转换
                if (!StringTools.isNullOrEmpty(temp.getOnTime()))
                {
                    temp.setOnTimeStr(DateUtils.dateToStrLong(temp.getOnTime()));
                    temp.setOnTime(null);
                }
                // 下架时间格式转换
                if (!StringTools.isNullOrEmpty(temp.getOffTime()))
                {
                    temp.setOffTimeStr(DateUtils.dateToStrLong(temp.getOffTime()));
                    temp.setOffTime(null);
                }
                // 查询 销量和库存
                if (!StringTools.isNullOrEmpty(temp.getGoodsKey()))
                {
                    String saleNum = shopGoodsDAO.queryGoodsSale(temp.getGoodsKey());
                    temp.setSaleNum(saleNum);

                    BigDecimal goodsStock = new BigDecimal(0);
                    List<String> list = shopGoodsDAO.querySkuKeyList(temp.getGoodsKey());
                    if (!ListTools.isNullOrEmpty(list))
                    {
                        for (String skuKey : list)
                        {
                            String skuStock = shopGoodsDAO.queryGoodsSkuStock(skuKey);
                            goodsStock = goodsStock.add(new BigDecimal(skuStock));
                        }
                    }
                    temp.setGoodsStock(goodsStock.toString());
                }

                // 查询是否为活动,是活动就设置为0,不是活动就设置为1
                if (!StringTools.isNullOrEmpty(temp.getGoodsKey()))
                {
                    String num = "0";
                    num = shopGoodsDAO.queryActivity(temp.getGoodsKey());
                    if ("0".equals(num))
                    {
                        temp.setActivity("1");
                    }
                    else
                    {
                        temp.setActivity("0");
                    }
                }
            }
        }

        // 设置返回列表信息
        listInfo.setGoodsList(rspList);
        rspResult.setCount(count);
        rspResult.setRspGoodsList(listInfo);

        return rspResult;
    }

    /**
     * 
     * {@inheritDoc}
     */
    public RspGoodsObjInfo queryGoodsByGoodsKey(GoodsKeyInfo goodsKeyInfo) throws SQLException
    {
        // 通过goodskey查询商品信息
        String goodsKey = goodsKeyInfo.getGoodsKey();
        RspGoodsObjInfo reGoodsObjInfo = goodsDAO.queryGoodsByGoodsKey(goodsKey);

        // 判断请求参数里面的userkey是否为空
        if (!StringTools.isNullOrEmpty(reGoodsObjInfo) && !StringTools.isNullOrEmpty(goodsKeyInfo.getProvince())
                && !StringTools.isNullOrEmpty(goodsKeyInfo.getCity())
                && !StringTools.isNullOrEmpty(goodsKeyInfo.getUserKey()))
        {
            reGoodsObjInfo.setOnTimeStr(DateUtils.dateToStrLong(reGoodsObjInfo.getOnTime()));
            reGoodsObjInfo.setOffTimeStr(DateUtils.dateToStrLong(reGoodsObjInfo.getOffTime()));
            reGoodsObjInfo.setAddTimeStr(DateUtils.dateToStrLong(reGoodsObjInfo.getAddTime()));
            reGoodsObjInfo.setUppTimeStr(DateUtils.dateToStrLong(reGoodsObjInfo.getUppTime()));

            goodsKeyInfo.setTypeKey(reGoodsObjInfo.getGoodsType());
            String vKey = GetUUID.getUUID(Constant.VISIT_HISTORY_PREFIX);
            goodsKeyInfo.setvKey(vKey);
            // 添加浏览记录
            goodsDAO.addHistoryInfo(goodsKeyInfo);

        }

        return reGoodsObjInfo;
    }

    /**
     * 
     * {@inheritDoc}
     */
    public RspGoodsDetInfo queryGoodsDetByGoodsKey(String goodsKey) throws SQLException
    {
        RspGoodsDetInfo reDetInfo = goodsDAO.queryGoodsDetByGoodsKey(goodsKey);
        return reDetInfo;
    }

    /**
     * 
     * {@inheritDoc}
     */
    public RspGoodsListBody queryGoodsList(ReqGoodsListBody reqGoodsListBody) throws SQLException
    {
        // 定义返回信息
        RspGoodsListBody rspBody = new RspGoodsListBody();
        RspGoodsListList rspList = new RspGoodsListList();
        // 获取商品列表
        List<RspGoodsListInfo> goodsList = null;

        ReqGoodsListInfo reqGoodsListInfo = reqGoodsListBody.getReqGoodsListInfo();

        // 获取userkey和goodsname用于更新搜索记录
        String userKey = reqGoodsListInfo.getUserKey();
        String goodsName = reqGoodsListInfo.getGoodsName();

        // 判断userkey且goodsname是否为空
        if (!StringTools.isNullOrEmpty(userKey) && !StringTools.isNullOrEmpty(goodsName))
        {
            String isExist = goodsDAO.countSearchHistory(reqGoodsListInfo);

            // 如果搜索记录表中没有该搜索记录，添加搜索记录
            if ("0".equals(isExist))
            {
                goodsDAO.addSearchHistory(reqGoodsListInfo);
            }
            // 如果存在该搜索记录，更新搜索时间
            else
            {
                goodsDAO.updateSearchTime(reqGoodsListInfo);
            }
        }

        // 确保分页信息参数不为空
        if (StringTools.isNullOrEmpty(reqGoodsListBody.getPageBean())
                || StringTools.isNullOrEmpty(reqGoodsListBody.getPageBean().getFromNum())
                || StringTools.isNullOrEmpty(reqGoodsListBody.getPageBean().getToNum()))
        {
            reqGoodsListInfo.setFromNum(Constant.DEFAULT_PAGE_FROM);
            reqGoodsListInfo.setToNum(Constant.DEFAULT_PAGE_TO);
        }
        else
        {
            // 设置分页信息
            reqGoodsListInfo.setFromNum(reqGoodsListBody.getPageBean().getFromNum());
            reqGoodsListInfo.setToNum(reqGoodsListBody.getPageBean().getToNum());
        }

        // 1. 取得排序方式 0降序 1 升序
        // 2. 设定返回数据排序方式
        String sort = reqGoodsListInfo.getSort();
        if (!StringTools.isNullOrEmpty(sort))
        {
            if ("0".equals(sort))
            {
                reqGoodsListInfo.setSort("asc");
            }
            else
            {
                reqGoodsListInfo.setSort("desc");
            }
        }

        // 判断IOS端传递的特殊字符串，IOS默认空值为(null)
        // 1 判断商品名称
        if (!StringTools.isNullOrEmpty(reqGoodsListInfo.getGoodsName()))
        {
            reqGoodsListInfo.setGoodsName(StringTools.checkStringNull4IOS(reqGoodsListInfo.getGoodsName()));
        }

        // 1 判断商品类别
        if (!StringTools.isNullOrEmpty(reqGoodsListInfo.getGoodsType()))
        {
            reqGoodsListInfo.setGoodsType(StringTools.checkStringNull4IOS(reqGoodsListInfo.getGoodsType()));
        }

        // 处理搜索商品名称中的"%" "_"
        if (!StringTools.isNullOrEmpty(reqGoodsListInfo) && !StringTools.isNullOrEmpty(reqGoodsListInfo.getGoodsName()))
        {
            if (reqGoodsListInfo.getGoodsName().contains("\\"))
            {
                reqGoodsListInfo.setGoodsName(reqGoodsListInfo.getGoodsName().replaceAll("\\\\", "\\\\\\\\"));
            }
            if (reqGoodsListInfo.getGoodsName().contains("%") || reqGoodsListInfo.getGoodsName().contains("_"))
            {
                reqGoodsListInfo.setGoodsName(reqGoodsListInfo.getGoodsName().replaceAll("%", "\\\\%"));
                reqGoodsListInfo.setGoodsName(reqGoodsListInfo.getGoodsName().replaceAll("_", "\\\\_"));
            }
        }

        // 排序字段
        String sortStyle = reqGoodsListInfo.getSortStyle();

        if (!StringTools.isNullOrEmpty(reqGoodsListInfo.getSortStyle()))
        {
            // 根据商品价格排序,查询商品列表
            if ("0".equals(sortStyle))
            {
                goodsList = goodsDAO.queryGoodsListByPrice(reqGoodsListInfo);
            }
            // 根据商品销量排序,查询商品列表
            else if ("1".equals(sortStyle))
            {
                goodsList = goodsDAO.queryGoodsListBySaleNum(reqGoodsListInfo);
            }
            // 根据商品上架时间排序,查询商品列表
            else
            {
                goodsList = goodsDAO.queryGoodsListByOnTime(reqGoodsListInfo);
            }
        }

        // 返回查询到商品条数
        String count = goodsDAO.queryGoodsListCount(reqGoodsListInfo);

        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        // 获取数据不为空，拼装图片返回地址
        if (!ListTools.isNullOrEmpty(goodsList))
        {
            // 拼装图片地址路径
            for (RspGoodsListInfo temp : goodsList)
            {
                if (StringTools.isNullOrEmpty(temp) || StringTools.isNullOrEmpty(temp.getGoodsPics()))
                {
                    continue;
                }
                temp.setGoodsPics(parameterValue + temp.getGoodsPics());
            }
        }

        // 设置返回查询信息
        rspList.setRspGoodsListList(goodsList);
        rspBody.setRspGoodsListList(rspList);
        rspBody.setCount(count);
        return rspBody;
    }

    /**
     * 
     * {@inheritDoc}
     */
    public RspCollectBody queryCollectList(ReqCollectBody reqCollectBody) throws SQLException
    {
        // 定义返回信息
        RspCollectBody rspBody = new RspCollectBody();
        RspCollectList rspList = new RspCollectList();
        List<RspCollectInfo> collectList = null;

        // 获取请求信息
        ReqCollectInfo reqCollectInfo = reqCollectBody.getReqCollectInfo();

        // 确保分页信息参数不为空
        if (StringTools.isNullOrEmpty(reqCollectBody.getPageBean())
                || StringTools.isNullOrEmpty(reqCollectBody.getPageBean().getFromNum())
                || StringTools.isNullOrEmpty(reqCollectBody.getPageBean().getToNum()))
        {
            // 设置默认分页信息
            reqCollectInfo.setFromNum(Constant.DEFAULT_PAGE_FROM);
            reqCollectInfo.setToNum(Constant.DEFAULT_PAGE_TO);
        }
        else
        {
            // 设置分页信息
            reqCollectInfo.setFromNum(reqCollectBody.getPageBean().getFromNum());
            reqCollectInfo.setToNum(reqCollectBody.getPageBean().getToNum());
        }

        // 返回收藏信息列表
        collectList = goodsDAO.queryUserCollectList(reqCollectInfo);
        // 返回查询到商品条数
        String count = goodsDAO.queryGoodsCollectCount(reqCollectInfo);

        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        // 获取数据不为空，拼装图片返回地址
        if (!ListTools.isNullOrEmpty(collectList))
        {
            // 拼装图片地址路径
            for (RspCollectInfo temp : collectList)
            {
                if (StringTools.isNullOrEmpty(temp) || StringTools.isNullOrEmpty(temp.getGoodsPic()))
                {
                    continue;
                }
                temp.setGoodsPic(parameterValue + temp.getGoodsPic());
            }
        }

        // 设置返回收藏列表信息
        rspList.setRspCollectInfoList(collectList);
        rspBody.setCount(count);
        rspBody.setRspCollectList(rspList);
        return rspBody;
    }

    /**
     * 
     * {@inheritDoc}
     */
    public RspRecommendBody queryRecommendGoods(ReqRecommendBody reqRecommendBody) throws SQLException
    {
        // 定义返回信息
        RspRecommendBody rspBody = new RspRecommendBody();
        RspRecommendList rspList = new RspRecommendList();
        List<RspRecommendInfo> commendList = new ArrayList<RspRecommendInfo>();

        ReqRecommendInfo reqRecommendInfo = reqRecommendBody.getInfo();

        // 根据用户浏览历史记录获取的 预查询商品类别
        String userGoodsType = "";

        // 设置查询用户浏览历史范围（以最近多少条）
        reqRecommendInfo.setSearchRange(Constant.DEFAULT_VIEW_NUM);

        // 根据userkey 查询用户最近浏览的商品类别
        if (!StringTools.isNullOrEmpty(reqRecommendInfo.getUserKey()))
        {
            String temptGoodsType = goodsDAO.queryUserVisitGoodsType(reqRecommendInfo);
            if (!StringTools.isNullOrEmpty(temptGoodsType))
            {
                userGoodsType = temptGoodsType;
            }
        }

        // 1.设置用户最近浏览的商品类别
        // 2.默认取浏览类别最多的前两类商品，一个类别2个商品，若传进来类别只有 1个类别，此类别查询固定4个商品
        if (!StringTools.isNullOrEmpty(userGoodsType))
        {
            reqRecommendInfo.setGoodsType(userGoodsType);
        }

        // 获取查询商品类别
        String[] typeArray = reqRecommendInfo.getGoodsType().split(",");

        // 1.设置查询商品类别
        // 2.设置查询商品数量
        int queryTypeNum = Constant.DEFAULT_RECOMMEND_TYPE;
        if (typeArray.length < Constant.DEFAULT_RECOMMEND_TYPE)
        {
            reqRecommendInfo.setCount(Constant.DEFAULT_RECOMMEND_NUM);
            queryTypeNum = Constant.MIN_RECOMMEND_TYPE;
        }

        // 查询推荐商品请求信息
        // 每个类别的商品，分别根据设置的查询数量查询特定数量
        for (int i = 0; i < queryTypeNum; i++)
        {
            reqRecommendInfo.setGoodsType(typeArray[i]);
            List<RspRecommendInfo> temptList = goodsDAO.queryRecommendGoods(reqRecommendInfo);
            commendList.addAll(temptList);
        }

        // 当搜索不到猜你喜欢结果，默认查询销量最高商品
        if (ListTools.isNullOrEmpty(commendList))
        {
            reqRecommendInfo.setGoodsType(null);
            List<RspRecommendInfo> temptList = goodsDAO.queryRecommendGoods(reqRecommendInfo);
            commendList.addAll(temptList);
        }

        // 获取图片地址
        String url = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        // 拼接服务器图片地址
        for (int i = 0; i < commendList.size(); i++)
        {
            if (StringTools.isNullOrEmpty(commendList.get(i))
                    || StringTools.isNullOrEmpty(commendList.get(i).getGoodsPics()))
            {
                continue;
            }
            commendList.get(i).setGoodsPics(url + commendList.get(i).getGoodsPics());
        }

        // 设置返回商品信息
        rspList.setInfo(commendList);
        rspBody.setRspList(rspList);
        return rspBody;
    }

    public GoodsDAO getGoodsDAO()
    {
        return goodsDAO;
    }

    public void setGoodsDAO(GoodsDAO goodsDAO)
    {
        this.goodsDAO = goodsDAO;
    }

    public ShopGoodsDAO getShopGoodsDAO()
    {
        return shopGoodsDAO;
    }

    public void setShopGoodsDAO(ShopGoodsDAO shopGoodsDAO)
    {
        this.shopGoodsDAO = shopGoodsDAO;
    }

    public ParameterDAO getParameterDAO()
    {
        return parameterDAO;
    }

    public void setParameterDAO(ParameterDAO parameterDAO)
    {
        this.parameterDAO = parameterDAO;
    }
}
