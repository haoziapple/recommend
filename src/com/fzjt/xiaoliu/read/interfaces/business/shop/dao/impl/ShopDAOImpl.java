/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.shop.dao.impl.ShopDAOImpl
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
package com.fzjt.xiaoliu.read.interfaces.business.shop.dao.impl;

import java.sql.SQLException;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.business.shop.bean.info.rsp.RspShopInfo;
import com.fzjt.xiaoliu.read.interfaces.business.shop.dao.ShopDAO;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.shop.dao.impl.ShopDAOImpl
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-18 下午3:13:48
 * @author:TangKai
 */
public class ShopDAOImpl extends SqlMapClientDaoSupport implements ShopDAO
{


    /**
     * {@inheritDoc}
     */
    public RspShopInfo queryShopInfoByKey(String shopKey) throws SQLException
    {
        return (RspShopInfo)this.getSqlMapClientTemplate().queryForObject("shop.queryShopInfoByKey", shopKey);
    }
}
