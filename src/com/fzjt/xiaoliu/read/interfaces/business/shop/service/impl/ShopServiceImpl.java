/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.shop.service.impl.ShopServiceImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-18     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.shop.service.impl;

import java.sql.SQLException;

import com.fzjt.xiaoliu.read.interfaces.business.shop.bean.info.rsp.RspShopInfo;
import com.fzjt.xiaoliu.read.interfaces.business.shop.bean.info.rsp.RspShopInfoBody;
import com.fzjt.xiaoliu.read.interfaces.business.shop.dao.ShopDAO;
import com.fzjt.xiaoliu.read.interfaces.business.shop.service.ShopService;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao.ParameterDAO;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.shop.service.impl.ShopServiceImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-18 下午3:30:19
 * @author:TangKai
 */
public class ShopServiceImpl implements ShopService
{
    /**
     * 商家DAO
     */
    private ShopDAO shopDAO;

    /**
     * 参数
     */
    private ParameterDAO parameterDAO;

    /**
     * {@inheritDoc}
     */
    public RspShopInfoBody queryShopInfoByKey(String shopKey) throws SQLException
    {
        // 定义返回信息
        RspShopInfoBody rspBody = new RspShopInfoBody();
        RspShopInfo rspInfo = null;
        // 返回商家信息
        rspInfo = shopDAO.queryShopInfoByKey(shopKey);

        // 判断查询结果是否为空
        if (StringTools.isNullOrEmpty(rspInfo))
        {
            rspBody.setRspShopInfo(null);
            return rspBody;
        }

        rspBody.setRspShopInfo(rspInfo);
        return rspBody;
    }

    public ShopDAO getShopDAO()
    {
        return shopDAO;
    }

    public void setShopDAO(ShopDAO shopDAO)
    {
        this.shopDAO = shopDAO;
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
