/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sort.service.impl.SortServiceImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-6     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.sort.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.home.sort.bean.req.ReqSortInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.sort.bean.rsp.RspSortInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.sort.dao.SortDAO;
import com.fzjt.xiaoliu.read.interfaces.business.home.sort.service.SortService;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao.ParameterDAO;
import com.fzjt.xiaoliu.read.interfaces.util.Constant;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sort.service.impl.SortServiceImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-6 下午4:12:04
 * @author:LiangJin
 */
public class SortServiceImpl implements SortService
{
    private SortDAO sortDAO;

    private ParameterDAO parameterDAO;

    /**
     * {@inheritDoc}
     */
    public List<RspSortInfo> querySortInfo(ReqSortInfo reqSortInfo) throws SQLException
    {
        List<RspSortInfo> list = sortDAO.querySortInfo(reqSortInfo);

        // 判断查询结果是否为空
        if (ListTools.isNullOrEmpty(list))
        {
            return null;
        }

        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        // 拼装图片地址路径
        for (RspSortInfo temp : list)
        {
            if (StringTools.isNullOrEmpty(temp)||StringTools.isNullOrEmpty(temp.getLogoImgURL()))
            {
                continue;
            }
            temp.setLogoImgURL(parameterValue + temp.getLogoImgURL());
        }

        return list;
    }

    public SortDAO getSortDAO()
    {
        return sortDAO;
    }

    public void setSortDAO(SortDAO sortDAO)
    {
        this.sortDAO = sortDAO;
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
