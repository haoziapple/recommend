/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.street.service.impl.StreetServiceImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-21     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.sysmanager.street.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao.ParameterDAO;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.street.bean.info.rsp.RspStreetBody;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.street.bean.info.rsp.RspStreetInfo;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.street.bean.info.rsp.RspStreetList;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.street.dao.StreetDAO;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.street.service.StreetService;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.sysmanager.street.service.impl.StreetServiceImpl
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-21 下午5:38:08
 * @author:TangKai
 */
public class StreetServiceImpl implements StreetService
{
    /**
     * Street DAO服务
     */
    private StreetDAO streetDAO;

    /**
     * 系统消息dao
     */
    private ParameterDAO parameterDAO;

    /**
     * 
     * {@inheritDoc}
     */
    public RspStreetBody queryStreetInfoByAreaCode(String areaCode) throws SQLException
    {
        // 定义返回信息
        RspStreetBody rspBody = new RspStreetBody();
        RspStreetList rspList = new RspStreetList();
        List<RspStreetInfo> rspStreetInfoList = new ArrayList<RspStreetInfo>();

        // 根据areacode查询街道信息
        rspStreetInfoList = streetDAO.queryStreetInfoByAreaCode(areaCode);
        // 判断查询结果是否为空
        if (ListTools.isNullOrEmpty(rspStreetInfoList))
        {
            rspBody.setRspStreetList(null);
            return rspBody;
        }

        // 设置返回信息
        rspList.setRspStreetInfoList(rspStreetInfoList);
        rspBody.setRspStreetList(rspList);

        return rspBody;
    }

    public StreetDAO getStreetDAO()
    {
        return streetDAO;
    }

    public void setStreetDAO(StreetDAO streetDAO)
    {
        this.streetDAO = streetDAO;
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
