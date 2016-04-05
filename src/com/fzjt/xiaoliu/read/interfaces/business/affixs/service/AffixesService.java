/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.affixs.service.AffixesService
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
package com.fzjt.xiaoliu.read.interfaces.business.affixs.service;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.rsp.RspAffixesInfo;

/**
 * 查询sku附件
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.affixs.service.AffixesService
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-17 上午11:00:22
 * @author:TangKai
 */
public interface AffixesService
{
    /**
     * 通过skuKey 查询附件
     * 
     * @Description:
     * @param skuKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:LiangJin
     * @date:2015-11-14 下午3:23:00
     */
    List<RspAffixesInfo> querySkuAffixsByKey(String skuKey) throws SQLException;

    /**
     * 根据商品goodskey查询商品附件信息
     * 
     * @Description:根据商品goodskey查询商品附件信息
     * @param goodsKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-17 下午12:23:42
     */
    List<RspAffixesInfo> queryGoodsAffixByKey(String goodsKey) throws SQLException;
}
