/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.shop.dao.ShopDAO
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
package com.fzjt.xiaoliu.read.interfaces.business.shop.dao;

import java.sql.SQLException;

import com.fzjt.xiaoliu.read.interfaces.business.shop.bean.info.rsp.RspShopInfo;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.shop.dao.ShopDAO
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-18 下午2:31:41
 * @author:TangKai
 */
public interface ShopDAO
{

    /**
     * 查询商家信息
     * 
     * @Description:根据商家key查询商家信息
     * @param shopKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-18 下午3:11:38
     */
    RspShopInfo queryShopInfoByKey(String shopKey) throws SQLException;
}
