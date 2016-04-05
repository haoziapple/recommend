/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.goods.service.GoodsDAOImpl
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
package com.fzjt.xiaoliu.read.interfaces.business.home.goods.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.req.ReqGoodsBody;
import com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.req.ReqGoodsInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.rsp.RspGoodsBody;
import com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.rsp.RspGoodsInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.goods.bean.rsp.RspGoodsList;
import com.fzjt.xiaoliu.read.interfaces.business.home.goods.dao.HomeGoodsDAO;
import com.fzjt.xiaoliu.read.interfaces.business.home.goods.service.HomeGoodsService;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao.ParameterDAO;
import com.fzjt.xiaoliu.read.interfaces.util.Constant;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.goods.service.impl.HomeGoodsServiceImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-7 下午4:25:07
 * @author:LiangJin
 */
public class HomeGoodsServiceImpl implements HomeGoodsService
{
    private HomeGoodsDAO homeGoodsDAO;

    private ParameterDAO parameterDAO;

    /**
     * {@inheritDoc}
     */
    public RspGoodsBody queryGoodsList(ReqGoodsBody reqGoodsBody) throws SQLException
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

        // 定义返回信息
        RspGoodsBody rspResult = new RspGoodsBody();
        RspGoodsList rspInfo = new RspGoodsList();
        List<RspGoodsInfo> rspList = null;
        String count = "";

        // 查询商品集合
        rspList = homeGoodsDAO.queryGoodsList(reqInfo);

        // 查询商品条数
        count = homeGoodsDAO.queryGoodsCount(reqInfo);

        // 判断查询结果是否为空
        if (ListTools.isNullOrEmpty(rspList))
        {
            rspResult.setCount("0");
            rspResult.setRspGoodsList(null);

            return rspResult;
        }

        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        // 拼装图片地址路径
        for (RspGoodsInfo temp : rspList)
        {
            if (StringTools.isNullOrEmpty(temp)||StringTools.isNullOrEmpty(temp.getGoodsPics()))
            {
                continue;
            }
            temp.setGoodsPics(parameterValue + temp.getGoodsPics());
        }

        rspInfo.setRspGoodsInfo(rspList);
        rspResult.setCount(count);
        rspResult.setRspGoodsList(rspInfo);

        return rspResult;
    }

    public HomeGoodsDAO getHomeGoodsDAO()
    {
        return homeGoodsDAO;
    }

    public void setHomeGoodsDAO(HomeGoodsDAO homeGoodsDAO)
    {
        this.homeGoodsDAO = homeGoodsDAO;
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
