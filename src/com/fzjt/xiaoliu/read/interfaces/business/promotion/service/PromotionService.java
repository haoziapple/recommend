/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.service.PromotionService
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
package com.fzjt.xiaoliu.read.interfaces.business.promotion.service;

import java.sql.SQLException;

import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.detail.RspDetailBody;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.req.ReqPromotionBody;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.rsp.RspPromotionBody;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.list.rsp.RspPromListBody;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.promotion.service.PromotionService
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-9 上午10:38:24
 * @author:TangKai
 */
public interface PromotionService
{

    /**
     * 查询当前活动信息
     * 
     * @Description:
     * @param reqBody
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-9 上午11:03:51
     */
    RspPromotionBody queryPromotionList(ReqPromotionBody promotionKey) throws SQLException;

    /**
     * 查询活动活动商品信息
     * 
     * @Description:
     * @param reqInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-9 下午2:15:55
     */
    RspPromListBody queryPromGoodsInfo(String promotionKey) throws SQLException;

    /**
     * 查询活动详细信息
     * 
     * @Description:
     * @param reqBody
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-9 下午8:10:51
     */
    RspDetailBody queryPromotionInfo(String promotionKey) throws SQLException;
}
