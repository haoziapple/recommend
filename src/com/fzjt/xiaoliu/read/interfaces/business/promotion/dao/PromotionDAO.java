/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.dao.PromotionDAO
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-9     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.promotion.dao;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.detail.RspDetailInfo;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.req.ReqPromotionInfo;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.rsp.PromotionInfo;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.rsp.PacketInfo;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.rsp.SkuInfo;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.dao.PromotionDAO
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-9 上午10:38:27
 * @author:TangKai
 */
public interface PromotionDAO
{

    /**
     * 查询当前活动信息
     * 
     * @Description:
     * @param reqInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-9 上午10:55:25
     */
    List<PromotionInfo> queryPromotionList(ReqPromotionInfo reqInfo) throws SQLException;

    /**
     * 根据活动key，查询活动组key
     * 
     * @Description:
     * @param promKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-9 下午1:48:07
     */
    List<PacketInfo> queryPacketKeyList(String promKey) throws SQLException;

    /**
     * 根据活动组key，查询商品信息
     * 
     * @Description:
     * @param packetKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-9 下午1:56:59
     */
    List<SkuInfo> queryPacketGoodsInfo(String packetKey) throws SQLException;

    /**
     * 查询活动详细信息
     * 
     * @Description:
     * @param promKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-9 下午8:04:38
     */
    RspDetailInfo queryPromotionInfo(String promKey) throws SQLException;

}
