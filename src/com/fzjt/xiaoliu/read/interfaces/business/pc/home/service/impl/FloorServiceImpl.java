/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.service.impl.FloorServiceImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-4     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.pc.home.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.req.ReqFloorInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.rsp.FloorInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.rsp.PriceInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.view.req.ReqViewInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.view.rsp.ViewInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.dao.FloorDAO;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.service.FloorService;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao.ParameterDAO;
import com.fzjt.xiaoliu.read.interfaces.util.Constant;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.service.impl.FloorServiceImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-4 下午3:07:34
 * @author:TangKai
 */
public class FloorServiceImpl implements FloorService
{
    /**
     * dao注入
     */
    private FloorDAO floorDAO;

    /**
     * 系统参数dao
     */
    private ParameterDAO parameterDAO;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<FloorInfo> queryFloorInfoList(ReqFloorInfo reqInfo) throws SQLException
    {
        List<FloorInfo> rspList = new ArrayList<FloorInfo>();

        // 获取楼层对象信息，其中商品的原价现价没有查出
        rspList = floorDAO.queryFloorInfoList(reqInfo);

        // 返回结果非空
        if (!ListTools.isNullOrEmpty(rspList))
        {
            // 获取文件服务器路径
            String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

            for (FloorInfo temp : rspList)
            {
                // 图片地址拼接
                if (StringTools.isNullOrEmpty(temp) || StringTools.isNullOrEmpty(temp.getImgUrl()))
                {
                    continue;
                }
                temp.setImgUrl(parameterValue + temp.getImgUrl());

                // 对于在PC首页展示的商品，查询价格时楼层key即是价格标识
                // PC首页更多显示的商品，价格标识为-1
                if ("1".equals(temp.getIsShow()))
                {
                    temp.setFloorKey("-1");
                }

                // 对每个商品对象，调用dao得到商品价格
                PriceInfo priceInfo = floorDAO.queryGoodsPrice(temp);

                // 设置相应的价格
                if (!StringTools.isNullOrEmpty(priceInfo))
                {
                    temp.setPriceNow(priceInfo.getPriceNow());
                    temp.setPriceOld(priceInfo.getPriceOld());
                }
            }
        }

        return rspList;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ViewInfo> queryViewList(ReqViewInfo reqInfo) throws SQLException
    {
        List<ViewInfo> rspList = new ArrayList<ViewInfo>();

        // 获取楼层信息
        rspList = floorDAO.queryViewList(reqInfo);

        // 返回结果非空
        if (!ListTools.isNullOrEmpty(rspList))
        {
            // 获取文件服务器路径
            String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

            for (ViewInfo temp : rspList)
            {
                // 图片地址拼接
                if (StringTools.isNullOrEmpty(temp) || StringTools.isNullOrEmpty(temp.getFloorLogo()))
                {
                    continue;
                }
                temp.setFloorLogo(parameterValue + temp.getFloorLogo());
            }
        }

        return rspList;
    }

    public FloorDAO getFloorDAO()
    {
        return floorDAO;
    }

    public void setFloorDAO(FloorDAO floorDAO)
    {
        this.floorDAO = floorDAO;
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
