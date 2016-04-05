/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.content.service.impl.ContentServiceImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-5     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.floor.content.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.home.floor.content.bean.req.ReqContentInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.content.bean.rsp.RspContentInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.content.dao.ContentDAO;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.content.service.ContentService;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao.ParameterDAO;
import com.fzjt.xiaoliu.read.interfaces.util.Constant;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.content.service.impl.ContentServiceImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-5 下午4:33:34
 * @author:LiangJin
 */
public class ContentServiceImpl implements ContentService
{
    /**
     * 楼层内容DAO
     */
    private ContentDAO contentDAO;

    /**
     * 参数
     */
    private ParameterDAO parameterDAO;

    /**
     * {@inheritDoc}
     */
    public List<RspContentInfo> queryContentInfo(ReqContentInfo reqContentInfo) throws SQLException
    {

        List<RspContentInfo> list = contentDAO.queryContentInfo(reqContentInfo);

        // 判断查询结果是否为空
        if (ListTools.isNullOrEmpty(list))
        {
            return list;
        }

        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        // 拼装图片地址路径
        for (RspContentInfo temp : list)
        {
            if (StringTools.isNullOrEmpty(temp)||StringTools.isNullOrEmpty(temp.getImgURL()))
            {
                continue;
            }
            temp.setImgURL(parameterValue + temp.getImgURL());
        }

        return list;
    }

    public ContentDAO getContentDAO()
    {
        return contentDAO;
    }

    public void setContentDAO(ContentDAO contentDAO)
    {
        this.contentDAO = contentDAO;
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
