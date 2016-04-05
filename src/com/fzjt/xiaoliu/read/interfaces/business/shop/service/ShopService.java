/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.shop.service.ShopService
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
package com.fzjt.xiaoliu.read.interfaces.business.shop.service;

import java.sql.SQLException;

import com.fzjt.xiaoliu.read.interfaces.business.shop.bean.info.rsp.RspShopInfoBody;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.shop.service.ShopService
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-18 下午2:31:21
 * @author:TangKai
 */
public interface ShopService
{

    /**
     * 根据shopkey查询商家信息
     * 
     * @Description:
     * @param shopKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-18 下午3:33:35
     */
    RspShopInfoBody queryShopInfoByKey(String shopKey) throws SQLException;
}
