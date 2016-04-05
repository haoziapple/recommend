/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.service.impl.GoodsSkuServiceImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-13     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sku.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.list.rsp.RspSkuInfoBody;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.list.rsp.SkuInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.list.rsp.SkuInfoList;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.rsp.RspPropertyBody;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.rsp.RspPropertyInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.rsp.RspPropertyList;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvkey.rsp.RspPVKeyInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.req.ReqPVListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.rsp.RspPListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.rsp.RspPVListBody;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.rsp.RspPVListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.rsp.RspPVListList;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.rsp.RspVListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.rsp.RspVListList;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuInfo.rsp.RspGoodsSkuInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuList.req.ReqSkuListBody;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuList.req.SkuListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuList.rsp.RspSkuListBody;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuList.rsp.RspSkuListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuList.rsp.RspSkuListList;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuVal.req.ReqSkuValInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuVal.rsp.RspSkuValInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.value.req.ReqValueInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.value.rsp.RspValueBody;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.value.rsp.RspValueInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.value.rsp.RspValueList;
import com.fzjt.xiaoliu.read.interfaces.business.sku.dao.GoodsSkuDAO;
import com.fzjt.xiaoliu.read.interfaces.business.sku.service.GoodsSkuService;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao.ParameterDAO;
import com.fzjt.xiaoliu.read.interfaces.util.Constant;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.service.impl.GoodsSkuServiceImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午8:16:26
 * @author:LiChangjiang
 */
public class GoodsSkuServiceImpl implements GoodsSkuService
{
    private GoodsSkuDAO goodsSkuDAO;

    /**
     * 参数
     */
    private ParameterDAO parameterDAO;

    /**
     * {@inheritDoc}
     */
    public RspPropertyBody queryPropertyByTypeKey(String typeKey) throws SQLException
    {
        // 定义返回信息
        RspPropertyBody rspResult = new RspPropertyBody();
        RspPropertyList rspInfo = new RspPropertyList();
        List<RspPropertyInfo> rspList = null;

        // 查询商品集合
        rspList = goodsSkuDAO.queryPropertyByTypeKey(typeKey);

        // 判断查询结果是否为空
        if (ListTools.isNullOrEmpty(rspList))
        {
            rspResult.setRspPropertyList(null);

            return rspResult;
        }

        rspInfo.setRspPropertylist(rspList);
        rspResult.setRspPropertyList(rspInfo);
        return rspResult;

    }

    /**
     * {@inheritDoc}
     */
    public RspValueBody queryValueByPropertyKey(ReqValueInfo reqInfo) throws SQLException
    {
        // 定义返回信息
        RspValueBody rspResult = new RspValueBody();
        RspValueList rspInfo = new RspValueList();
        List<RspValueInfo> rspList = null;

        // 查询商品集合
        rspList = goodsSkuDAO.queryValueByPropertyKey(reqInfo);

        // 判断查询结果是否为空
        if (ListTools.isNullOrEmpty(rspList))
        {
            rspResult.setRspValueList(null);

            return rspResult;
        }

        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        // 拼装图片地址路径
        for (RspValueInfo temp : rspList)
        {
            if (StringTools.isNullOrEmpty(temp)||StringTools.isNullOrEmpty(temp.getvPic()))
            {
                continue;
            }
            temp.setvPic(parameterValue + temp.getvPic());
        }

        rspInfo.setRspValuelist(rspList);
        rspResult.setRspValueList(rspInfo);

        return rspResult;
    }

    /**
     * {@inheritDoc}
     */
    public RspPropertyBody queryPListByGoodsKey(String goodsKey) throws SQLException
    {
        // 定义返回信息
        RspPropertyBody rspResult = new RspPropertyBody();
        RspPropertyList rspInfo = new RspPropertyList();
        List<RspPropertyInfo> rspList = null;

        // 查询商品集合
        rspList = goodsSkuDAO.queryPListByGoodsKey(goodsKey);

        // 判断查询结果是否为空
        if (ListTools.isNullOrEmpty(rspList))
        {
            rspResult.setRspPropertyList(null);
            return rspResult;
        }

        rspInfo.setRspPropertylist(rspList);
        rspResult.setRspPropertyList(rspInfo);
        return rspResult;
    }

    /**
     * {@inheritDoc}
     */
    public RspGoodsSkuInfo queryGoodsSkuInfoBySkuKey(String skukey) throws SQLException
    {
        RspGoodsSkuInfo rspGoodsSkuInfo = null;

        // 根据skukey查询sku信息
        rspGoodsSkuInfo = goodsSkuDAO.queryGoodsSkuInfoBySkuKey(skukey);

        // 查询结果不为空
        if (!StringTools.isNullOrEmpty(rspGoodsSkuInfo))
        {
            // 图片存在
            String url = rspGoodsSkuInfo.getSkuPic();
            if (!StringTools.isNullOrEmpty(url))
            {
                // 获取文件服务器路径
                String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

                // 拼装图片地址路径
                String path = parameterValue + url;
                rspGoodsSkuInfo.setSkuPic(path);
            }
        }
        return rspGoodsSkuInfo;
    }

    /**
     * {@inheritDoc}
     */
    public RspSkuListBody querySkuListList(ReqSkuListBody reqSkuListBody) throws SQLException
    {
        // 设置分页信息
        SkuListInfo reqInfo = reqSkuListBody.getSkuListInfo();

        // 确保分页信息参数不为空
        if (StringTools.isNullOrEmpty(reqSkuListBody.getPageBean())
                || StringTools.isNullOrEmpty(reqSkuListBody.getPageBean().getFromNum())
                || StringTools.isNullOrEmpty(reqSkuListBody.getPageBean().getToNum()))
        {
            reqInfo.setFromNum(Constant.DEFAULT_PAGE_FROM);
            reqInfo.setToNum(Constant.DEFAULT_PAGE_TO);
        }
        else
        {
            // 设置分页信息
            reqInfo.setFromNum(reqSkuListBody.getPageBean().getFromNum());
            reqInfo.setToNum(reqSkuListBody.getPageBean().getToNum());
        }

        // 定义返回信息
        RspSkuListBody rspResult = new RspSkuListBody();
        RspSkuListList rspInfo = new RspSkuListList();
        List<RspSkuListInfo> rspList = null;
        String count = "";

        // 查询商品集合
        rspList = goodsSkuDAO.querySkuListList(reqInfo);

        // 查询商品条数
        count = goodsSkuDAO.querySkuListCount(reqInfo);

        // 判断查询结果是否为空
        if (ListTools.isNullOrEmpty(rspList))
        {
            rspResult.setCount("0");
            rspResult.setRspSkuListList(null);

            return rspResult;
        }

        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        // 拼装图片地址路径
        for (RspSkuListInfo temp : rspList)
        {
            if (StringTools.isNullOrEmpty(temp)||StringTools.isNullOrEmpty(temp.getSkuPic()))
            {
                continue;
            }
            temp.setSkuPic(parameterValue + temp.getSkuPic());
        }

        rspInfo.setRspSkuListInfo(rspList);
        rspResult.setCount(count);
        rspResult.setRspSkuListList(rspInfo);

        return rspResult;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RspSkuValInfo querySkuValByVKey(ReqSkuValInfo reqSkuValInfo) throws SQLException
    {
        RspSkuValInfo rspSkuValInfo = goodsSkuDAO.querySkuValByVKey(reqSkuValInfo);
        // 查询结果不为空
        if (!StringTools.isNullOrEmpty(rspSkuValInfo)&&!StringTools.isNullOrEmpty(rspSkuValInfo.getSkuPic()))
        {
            // 获取文件服务器路径
            String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);
            // 拼装图片地址路径
            rspSkuValInfo.setSkuPic(parameterValue + rspSkuValInfo.getSkuPic());
        }
        return rspSkuValInfo;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<RspPListInfo> queryPInfolistByGoodsKey(String goodsKey) throws SQLException
    {
        List<RspPListInfo> rspPListList = goodsSkuDAO.queryPInfolistByGoodsKey(goodsKey);
        return rspPListList;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RspPVListBody queryPVListListByGKey(String goodsKey) throws SQLException
    {
        // 定义返回信息
        RspPVListBody rspResult = new RspPVListBody();
        RspPVListList rspInfo = new RspPVListList();
        List<RspPListInfo> rspPList = null;
        List<RspVListInfo> rspVList = null;
        List<RspPVListInfo> rspList = new ArrayList<RspPVListInfo>();
        RspPVListInfo rspPVListInfo = new RspPVListInfo();
        RspVListList rspVListList = new RspVListList();

        // 根据goodskey查询特征量和特征量名称集合
        rspPList = goodsSkuDAO.queryPInfolistByGoodsKey(goodsKey);

        // 查询结果非空判断
        if (StringTools.isNullOrEmpty(rspPList))
        {
            rspResult.setRspPVList(null);
            return rspResult;
        }

        // 对于每一个特征量查询相应特征值集合
        // 返回一个集合，集合的每一项是由 特征量+相应的特征值集合 组成
        for (RspPListInfo temp : rspPList)
        {
            rspPVListInfo = new RspPVListInfo();
            rspVListList = new RspVListList();
            rspVList = new ArrayList<RspVListInfo>();
            if (!StringTools.isNullOrEmpty(temp.getpKey()))
            {
                // 设定goodskey和pkey查询特征值
                ReqPVListInfo reqPVListInfo = new ReqPVListInfo();
                reqPVListInfo.setGoodsKey(goodsKey);
                reqPVListInfo.setpKey(temp.getpKey());
                // 对于每一个特征量查询相应特征值集合
                rspVList = goodsSkuDAO.queryVListByGPKey(reqPVListInfo);

                // 查询特征值不为空，则添加特质量和特征值集合到预定义集合中
                if (!StringTools.isNullOrEmpty(rspVList))
                {
                    rspPVListInfo.setpKey(temp.getpKey());
                    rspPVListInfo.setpName(temp.getpName());
                    rspVListList.setRspVListInfo(rspVList);
                    rspPVListInfo.setRspVListList(rspVListList);
                    rspList.add(rspPVListInfo);
                }
                rspVList = null;
            }
        }

        // 设定返回信息
        rspInfo.setRspPVListList(rspList);
        rspResult.setRspPVList(rspInfo);

        return rspResult;
    }

    /**
     * {@inheritDoc}
     */
    public List<RspPVKeyInfo> queryPVListBySkuKey(String skuKey) throws SQLException
    {
        return goodsSkuDAO.queryPVListBySkuKey(skuKey);
    }

    /**
     * {@inheritDoc}
     */
    public RspPVListBody queryPVListByTypeKey(String typeKey) throws SQLException
    {
        // 定义返回信息
        RspPVListBody rspResult = new RspPVListBody();
        RspPVListList rspInfo = new RspPVListList();
        List<RspPListInfo> rspPList = null;
        List<RspVListInfo> rspVList = null;
        List<RspPVListInfo> rspList = new ArrayList<RspPVListInfo>();
        RspPVListInfo rspPVListInfo = new RspPVListInfo();
        RspVListList rspVListList = new RspVListList();

        // 根据type查询特征量和特征量名称集合
        rspPList = goodsSkuDAO.queryPInfolistByTypeKey(typeKey);
        if (StringTools.isNullOrEmpty(rspPList))
        {
            rspResult.setRspPVList(null);
            return rspResult;
        }

        // 对于每一个特征量查询相应特征值集合
        // 返回一个集合，集合的每一项是由 特征量+相应的特征值集合 组成
        for (RspPListInfo temp : rspPList)
        {
            rspPVListInfo = new RspPVListInfo();
            rspVListList = new RspVListList();
            rspVList = new ArrayList<RspVListInfo>();
            if (!StringTools.isNullOrEmpty(temp)&&!StringTools.isNullOrEmpty(temp.getpKey()))
            {
                // 对于每一个特征量查询相应特征值集合
                rspVList = goodsSkuDAO.queryVListByPKey(temp.getpKey());

                // 查询特征值不为空，则添加特质量和特征值集合到预定义集合中
                if (!StringTools.isNullOrEmpty(rspVList))
                {
                    rspPVListInfo.setpKey(temp.getpKey());
                    rspPVListInfo.setpName(temp.getpName());
                    rspVListList.setRspVListInfo(rspVList);
                    rspPVListInfo.setRspVListList(rspVListList);
                    rspList.add(rspPVListInfo);
                }
                rspVList = null;
            }
        }

        // 设定返回信息
        rspInfo.setRspPVListList(rspList);
        rspResult.setRspPVList(rspInfo);

        return rspResult;
    }

    /**
     * {@inheritDoc}
     */
    public RspSkuInfoBody querySkuListByGoodsKey(String goodsKey) throws SQLException
    {
        //定义返回信息
        RspSkuInfoBody rspBody = new RspSkuInfoBody();
        SkuInfoList rspList = new SkuInfoList();
        List<SkuInfo> List = new ArrayList<SkuInfo>();
        
        //查询sku信息列表
        List = goodsSkuDAO.querySkuListByGoodsKey(goodsKey);
        
        //判断返回结果是否为空
        if(ListTools.isNullOrEmpty(List))
        {
            rspBody.setRspList(null);
            return rspBody;
        }
        
        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        // 拼装图片地址路径
        for (SkuInfo temp : List)
        {
            if (StringTools.isNullOrEmpty(temp)||StringTools.isNullOrEmpty(temp.getSkuPic()))
            {
                continue;
            }
            temp.setSkuPic(parameterValue + temp.getSkuPic());
        }
        
        rspList.setSkuList(List);
        rspBody.setRspList(rspList);
        return rspBody;
    }

    public GoodsSkuDAO getGoodsSkuDAO()
    {
        return goodsSkuDAO;
    }

    public void setGoodsSkuDAO(GoodsSkuDAO goodsSkuDAO)
    {
        this.goodsSkuDAO = goodsSkuDAO;
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
