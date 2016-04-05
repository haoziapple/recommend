/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.dao.GoodsSkuDAO
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
package com.fzjt.xiaoliu.read.interfaces.business.sku.dao;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.list.rsp.SkuInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.rsp.RspPropertyInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvkey.rsp.RspPVKeyInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.req.ReqPVListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.rsp.RspPListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.rsp.RspVListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuInfo.rsp.RspGoodsSkuInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuList.req.SkuListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuList.rsp.RspSkuListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuVal.req.ReqSkuValInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuVal.rsp.RspSkuValInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.value.req.ReqValueInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.value.rsp.RspValueInfo;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.sku.dao.GoodsSkuDAO
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午8:16:48
 * @author:LiChangjiang
 */
public interface GoodsSkuDAO
{
    /**
     * 根据商品所属类别key查询特征量
     * 
     * @Description 根据商品所属类别key查询特征量
     * @param reqPropertyInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-13 下午3:33:26
     */
    List<RspPropertyInfo> queryPropertyByTypeKey(String typeKey) throws SQLException;

    /**
     * 根据商品特征量查询特征值
     * 
     * @Description:根据商品特征量查询特征值
     * @param propertyKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-13 下午6:17:21
     */
    List<RspValueInfo> queryValueByPropertyKey(ReqValueInfo reqInfo) throws SQLException;

    /**
     * 根据商品key查询商品特征量
     * 
     * @Description:根据商品key查询商品特征量
     * @param goodsKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-13 下午7:23:05
     */
    List<RspPropertyInfo> queryPListByGoodsKey(String goodsKey) throws SQLException;

    /**
     * 根据商品 skukey查询商品sku信息
     * 
     * @Description:
     * @param skukey
     * @return RspGoodsSkuInfo
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-11 下午13:05:06
     */
    RspGoodsSkuInfo queryGoodsSkuInfoBySkuKey(String skuKey) throws SQLException;

    /**
     * 根据skuname和商品类型查到的商品
     * 
     * @Description:根据skuname和商品类型查到的商品
     * @param skuListInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-12 下午6:36:43
     */
    List<RspSkuListInfo> querySkuListList(SkuListInfo skuListInfo) throws SQLException;

    /**
     * 查询商品总条数
     * 
     * @Description:查询商品总条数
     * @param skuListInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-12 下午6:36:18
     */
    String querySkuListCount(SkuListInfo skuListInfo) throws SQLException;

    /**
     * 根据商品特征值key查询商品sku值
     * 
     * @Description:根据商品特征值key查询商品sku值
     * @param vKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-13 下午9:29:27
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
     * @date:2015-11-14 下午3:11:32
     */
    List<RspPListInfo> queryPInfolistByGoodsKey(String goodsKey) throws SQLException;

    /**
     * 根据商品特征量和goodskey查询特征值
     * 
     * @Description:根据商品特征量和goodskey查询特征值
     * @param reqPVListInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-13 下午6:17:21
     */
    List<RspVListInfo> queryVListByGPKey(ReqPVListInfo reqPVListInfo) throws SQLException;

    /**
     * 根据商品特征量查询特征值
     * 
     * @Description:根据商品特征量查询特征值
     * @param pKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-13 下午6:17:21
     */
    List<RspVListInfo> queryVListByPKey(String pKey) throws SQLException;

    /**
     * 根据skuKey查询特征量key和特征值key
     * 
     * @Description:
     * @param skuKey
     * @return list
     * @throws SQLException
     * @version:v1.0
     * @author:LiangJin
     * @date:2015-11-17 上午10:23:25
     */
    List<RspPVKeyInfo> queryPVListBySkuKey(String skuKey) throws SQLException;

    /**
     * 根据typekey查询商品特征量和特征量名称list
     * 
     * @Description:
     * @param typekey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-24 下午1:42:48
     */
    List<RspPListInfo> queryPInfolistByTypeKey(String typekey) throws SQLException;

    /**
     * 根据goodskey查询sku信息列表
     * 
     * @Description:
     * @param goodsKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-4 下午8:20:10
     */
    List<SkuInfo> querySkuListByGoodsKey(String goodsKey) throws SQLException;
}
