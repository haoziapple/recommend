/**
 * Copyright (C) 2016 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.dao.FlashSaleDAO
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2016-1-6     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.flashsale.dao;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.req.ReqFlashSaleInfo;
import com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.rsp.RspFlashSaleInfo;
import com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.list.req.ReqFSGoodsInfo;
import com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.list.rsp.RspFSGoodsInfo;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.dao.FlashSaleDAO
 * @description:TODO
 * @version:v1.0.0
 * @date:2016-1-6 下午8:22:09
 * @author:TangKai
 */
public interface FlashSaleDAO
{

    /**
     * 查询限时秒杀活动信息
     * 
     * @Description:
     * @param reqBody
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2016-1-6 下午8:38:30
     */
    List<RspFlashSaleInfo> queryFlashSaleList(ReqFlashSaleInfo reqInfo) throws SQLException;

    /**
     * 查询限时秒杀商品信息
     * 
     * @Description:
     * @param reqInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2016-1-7 上午10:22:34
     */
    List<RspFSGoodsInfo> queryFSGoodsList(ReqFSGoodsInfo reqInfo) throws SQLException;

    /**
     * 查询限时秒杀商品数量
     * 
     * @Description:
     * @param reqInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2016-1-7 上午10:22:34
     */
    String queryFSGoodsListCount(String salesKey) throws SQLException;

    /**
     * 
     * @Description:查询活动商品剩余量
     * @param goodsInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:WangHao
     * @date:2016-2-18 下午5:36:00
     */
    String queryFSGoodsLeft(RspFSGoodsInfo goodsInfo) throws SQLException;
}
