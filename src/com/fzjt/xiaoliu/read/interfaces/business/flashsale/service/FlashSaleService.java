/**
 * Copyright (C) 2016 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.service.FlashSaleService
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
package com.fzjt.xiaoliu.read.interfaces.business.flashsale.service;

import java.sql.SQLException;

import com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.req.ReqFlashSaleBody;
import com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.info.rsp.RspFlashSaleBody;
import com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.list.req.ReqFSGoodsBody;
import com.fzjt.xiaoliu.read.interfaces.business.flashsale.bean.list.rsp.RspFSGoodsBody;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.flashsale.service.FlashSaleService
 * @description:TODO
 * @version:v1.0.0
 * @date:2016-1-6 下午8:22:05
 * @author:TangKai
 */
public interface FlashSaleService
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
     * @date:2016-1-6 下午8:34:11
     */
    RspFlashSaleBody queryFlashSaleList(ReqFlashSaleBody reqBody) throws SQLException;

    /**
     * 查询限时秒杀商品信息
     * 
     * @Description:
     * @param salesKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2016-1-7 上午11:11:25
     */
    RspFSGoodsBody queryFSGoodsList(ReqFSGoodsBody reqBody) throws SQLException;
}
