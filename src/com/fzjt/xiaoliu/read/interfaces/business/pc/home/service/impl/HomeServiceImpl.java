/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.service.impl.HomeServiceImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-2     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.pc.home.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.bottom.req.ReqBottomInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.bottom.rsp.RspBottomInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.turn.req.ReqTurnInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.turn.rsp.RspTurnInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.dao.HomeDAO;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.service.HomeService;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao.ParameterDAO;
import com.fzjt.xiaoliu.read.interfaces.util.Constant;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * HomeService实现类
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.service.impl.HomeServiceImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 下午1:27:30
 * @author:LiangJin
 */
public class HomeServiceImpl implements HomeService
{
    /**
     * dao注入
     */
    private HomeDAO homeDAO;

    private ParameterDAO parameterDAO;

    /**
     * {@inheritDoc}
     */
    public List<RspTurnInfo> queryTurnInfo(ReqTurnInfo reqTurnInfo) throws SQLException
    {
        // 调用dao
        List<RspTurnInfo> list = homeDAO.queryTurnInfo(reqTurnInfo);

        // 判断查询结果是否为空
        if (ListTools.isNullOrEmpty(list))
        {
            return null;
        }

        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        for (RspTurnInfo temp : list)
        {
            if (StringTools.isNullOrEmpty(temp)||StringTools.isNullOrEmpty(temp.getCarouselImg()))
            {
                continue;
            }
            temp.setCarouselImg(parameterValue + temp.getCarouselImg());
        }

        return list;
    }

    /**
     * {@inheritDoc}
     */
    public RspBottomInfo queryBottomInfo(ReqBottomInfo reqBottomInfo) throws SQLException
    {
        // 调用dao
        RspBottomInfo rspBottomInfo = homeDAO.queryBottomInfo(reqBottomInfo);

        // 判断查询结果是否为空
        if (StringTools.isNullOrEmpty(rspBottomInfo))
        {
            return null;
        }

        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        // 拼装图片地址路径
        if (!StringTools.isNullOrEmpty(rspBottomInfo.getSloLogo()))
        {
            rspBottomInfo.setSloLogo(parameterValue + rspBottomInfo.getSloLogo());
        }

        return rspBottomInfo;
    }

    public HomeDAO getHomeDAO()
    {
        return homeDAO;
    }

    public void setHomeDAO(HomeDAO homeDAO)
    {
        this.homeDAO = homeDAO;
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
