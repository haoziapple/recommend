/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.affixes.sku.service.impl.skuAffixesServiceImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-14     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.affixs.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.rsp.RspAffixesInfo;
import com.fzjt.xiaoliu.read.interfaces.business.affixs.dao.AffixesDAO;
import com.fzjt.xiaoliu.read.interfaces.business.affixs.service.AffixesService;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao.ParameterDAO;
import com.fzjt.xiaoliu.read.interfaces.util.Constant;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.affixs.service.impl.AffixesServiceImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-17 上午11:03:25
 * @author:TangKai
 */
public class AffixesServiceImpl implements AffixesService
{
    /**
     * 注入查询附件dao
     */
    private AffixesDAO affixesDAO;

    /**
     * 获取地址前缀到dao
     */
    private ParameterDAO parameterDAO;

    /**
     * {@inheritDoc}
     */
    public List<RspAffixesInfo> querySkuAffixsByKey(String skuKey) throws SQLException
    {
        // 获取附件
        List<RspAffixesInfo> list = affixesDAO.querySkuAffixsByKey(skuKey);

        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        // 附件信息为空
        if (StringTools.isNullOrEmpty(list))
        {
            return list;
        }

        // 循环附件集合，设置完整地址
        for (RspAffixesInfo rspInfo : list)
        {
            if (!StringTools.isNullOrEmpty(rspInfo)&&!StringTools.isNullOrEmpty(rspInfo.getAffURL()))
            {
                rspInfo.setAffURL(parameterValue + rspInfo.getAffURL());
            }

        }
        return list;
    }

    /**
     * {@inheritDoc}
     */
    public List<RspAffixesInfo> queryGoodsAffixByKey(String goodsKey) throws SQLException
    {
        // 获取附件
        List<RspAffixesInfo> list = affixesDAO.queryGoodsAffixsByKey(goodsKey);

        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        // 附件信息为空
        if (StringTools.isNullOrEmpty(list))
        {
            return list;
        }

        // 循环附件集合，设置完整地址
        for (RspAffixesInfo rspInfo : list)
        {
            if (!StringTools.isNullOrEmpty(rspInfo)&&!StringTools.isNullOrEmpty(rspInfo.getAffURL()))
            {
                rspInfo.setAffURL(parameterValue + rspInfo.getAffURL());
            }

        }
        return list;
    }

    public AffixesDAO getAffixesDAO()
    {
        return affixesDAO;
    }

    public void setAffixesDAO(AffixesDAO affixesDAO)
    {
        this.affixesDAO = affixesDAO;
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
