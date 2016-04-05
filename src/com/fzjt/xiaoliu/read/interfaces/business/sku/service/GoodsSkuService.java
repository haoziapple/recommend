/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.service.GoodsSkuService
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-13     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.sku.service;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.list.rsp.RspSkuInfoBody;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.rsp.RspPropertyBody;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvkey.rsp.RspPVKeyInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.rsp.RspPListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.rsp.RspPVListBody;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuInfo.rsp.RspGoodsSkuInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuList.req.ReqSkuListBody;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuList.rsp.RspSkuListBody;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuVal.req.ReqSkuValInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuVal.rsp.RspSkuValInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.value.req.ReqValueInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.value.rsp.RspValueBody;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.service.GoodsSkuService
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午3:48:33
 * @author:TangKai
 */
public interface GoodsSkuService
{
    /**
     * 根据商品所属类别key查询特征量
     * 
     * @Description: 根据商品所属类别key查询特征量
     * @param reqPropertyBody
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-13 下午3:49:55
     */
    RspPropertyBody queryPropertyByTypeKey(String typeKey) throws SQLException;

    /**
     * 根据商品特征量查询特征值
     * 
     * @Description:根据商品特征量查询特征值
     * @param pKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-13 下午6:20:16
     */
    RspValueBody queryValueByPropertyKey(ReqValueInfo reqInfo) throws SQLException;

    /**
     * 根据商品goodskey查询特征量
     * 
     * @Description:根据商品goodskey查询特征量
     * @param goodsKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-13 下午7:35:03
     */
    RspPropertyBody queryPListByGoodsKey(String goodsKey) throws SQLException;

    /**
     * 根据商品 skukey查询商品sku信息
     * 
     * @Description:根据商品 skukey查询商品sku信息
     * @param skukey
     * @return RspGoodsSkuInfo
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-11 下午13:21:32
     */
    RspGoodsSkuInfo queryGoodsSkuInfoBySkuKey(String skukey) throws SQLException;

    /**
     * 根据给定的起始与截止条数，查询特定skuname和商品类型的商品信息
     * 
     * @Description:根据给定的起始与截止条数，查询特定skuname和商品类型的商品信息
     * @param reqSkuListBody
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-12 下午6:52:08
     */
    RspSkuListBody querySkuListList(ReqSkuListBody reqSkuListBody) throws SQLException;

    /**
     * 根据商品特征值key查询商品sku值
     * 
     * @Description:根据商品特征值key查询商品sku值
     * @param vKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-13 下午9:38:25
     */
    RspSkuValInfo querySkuValByVKey(ReqSkuValInfo reqSkuValInfo) throws SQLException;

    /**
     * 根据商品goodsKey查询商品特征量和特征量名称list
     * 
     * @Description:根据商品goodsKey查询商品特征量和特征量名称list
     * @param goodsKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-14 下午3:18:38
     */
    List<RspPListInfo> queryPInfolistByGoodsKey(String goodsKey) throws SQLException;

    /**
     * 根据商品goodsKey查询商品特征量和特征量名称list
     * 
     * @Description:根据商品goodsKey查询商品特征量和特征量名称list
     * @param goodsKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-17 下午2:36:17
     */
    RspPVListBody queryPVListListByGKey(String goodsKey) throws SQLException;

    /**
     * 根据skuKey查询特征量key和特征值key
     * 
     * @Description:
     * @param skuKey
     * @return list
     * @throws SQLException
     * @version:v1.0
     * @author:LiangJin
     * @date:2015-11-17 上午10:27:07
     */
    List<RspPVKeyInfo> queryPVListBySkuKey(String skuKey) throws SQLException;

    /**
     * 根据商品type查询商品特征量和特征值list
     * 
     * @Description:
     * @param typeKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-24 下午1:50:22
     */
    RspPVListBody queryPVListByTypeKey(String typeKey) throws SQLException;

    /**
     * 根据goodskey查询sku信息列表
     * 
     * @Description:
     * @param goodsKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-4 下午8:22:09
     */
    RspSkuInfoBody querySkuListByGoodsKey(String goodsKey) throws SQLException;
}
