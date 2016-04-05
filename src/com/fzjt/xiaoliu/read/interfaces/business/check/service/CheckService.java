/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.service.CheckService
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-8     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.check.service;

import java.sql.SQLException;

import com.fzjt.xiaoliu.read.interfaces.business.check.bean.RspCheckInfo;
import com.fzjt.xiaoliu.read.interfaces.business.check.bean.goods.req.ReqCheckGoodsInfo;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.service.CheckService
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-8 下午3:03:25
 * @author:TangKai
 */
public interface CheckService
{
    /**
     * 校验购买商品是否有效
     * 
     * @Description:校验 商品是否有效，是否下架，是否有库存，是否超过每次限购，是否超过每日限购，用户是否有效
     * @param reqInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-23 下午4:35:41
     */
    public RspCheckInfo checkGoodsInfo(ReqCheckGoodsInfo reqInfo) throws SQLException;
}
