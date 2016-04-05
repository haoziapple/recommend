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
package com.fzjt.xiaoliu.read.interfaces.business.home.bottom.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.home.bottom.bean.req.ReqBottomBody;
import com.fzjt.xiaoliu.read.interfaces.business.home.bottom.bean.req.ReqBottomInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.bottom.bean.rsp.RspBottomBody;
import com.fzjt.xiaoliu.read.interfaces.business.home.bottom.bean.rsp.RspBottomInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.bottom.bean.rsp.RspBottomList;
import com.fzjt.xiaoliu.read.interfaces.business.home.bottom.dao.HomeBottomDAO;
import com.fzjt.xiaoliu.read.interfaces.business.home.bottom.service.HomeBottomService;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao.ParameterDAO;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.Constant;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.bottom.service.impl.HomeBottomServiceImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-11 下午18:25:07
 * @author:TangKai
 */
public class HomeBottomServiceImpl implements HomeBottomService
{
    private HomeBottomDAO homeBottomDAO;

    private ParameterDAO parameterDAO;

    /**
     * {@inheritDoc}
     */
    public RspBottomBody queryBottomList(ReqBottomBody reqBottomBody) throws SQLException
    {
        // 设置定位省市
        ReqBottomInfo reqInfo = new ReqBottomInfo();

        // 省市参数为空,返回必填参数为空异常
        if (StringTools.isNullOrEmpty(reqBottomBody.getReqBottomInfo().getCity())
                || StringTools.isNullOrEmpty(reqBottomBody.getReqBottomInfo().getProvince()))
        {
            BusinessUtils.rspErrorHeadInfo("000001", "必填参数为空");
            return null;
        }
        else
        {
            // 设置省市信息
            reqInfo.setCity(reqBottomBody.getReqBottomInfo().getCity());
            reqInfo.setProvince(reqBottomBody.getReqBottomInfo().getProvince());
        }

        // 定义返回信息
        RspBottomBody rspResult = new RspBottomBody();
        RspBottomList rspInfo = new RspBottomList();
        List<RspBottomInfo> rspList = null;

        // 查询按钮集合
        rspList = homeBottomDAO.queryBottomList(reqInfo);

        // 判断查询结果是否为空
        if (ListTools.isNullOrEmpty(rspList))
        {
            rspInfo.setBottomList(rspList);
            rspResult.setRspBottomList(rspInfo);

            return rspResult;
        }

        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        // 拼装图片地址路径
        for (RspBottomInfo temp : rspList)
        {
            if (StringTools.isNullOrEmpty(temp)||StringTools.isNullOrEmpty(temp.getLogoImgUrl()))
            {
                continue;
            }
            temp.setLogoImgUrl(parameterValue + temp.getLogoImgUrl());
        }

        rspInfo.setBottomList(rspList);
        rspResult.setRspBottomList(rspInfo);

        return rspResult;
    }

    public HomeBottomDAO getHomeBottomDAO()
    {
        return homeBottomDAO;
    }

    public void setHomeBottomDAO(HomeBottomDAO homeBottomDAO)
    {
        this.homeBottomDAO = homeBottomDAO;
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
