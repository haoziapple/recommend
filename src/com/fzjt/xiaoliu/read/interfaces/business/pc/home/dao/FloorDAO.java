/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.dao.FloorDAO
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-4     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.pc.home.dao;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.req.ReqFloorInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.rsp.FloorInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.rsp.PriceInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.view.req.ReqViewInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.view.rsp.ViewInfo;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.dao.FloorDAO
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-4 下午3:06:20
 * @author:TangKai
 */
public interface FloorDAO
{

    /**
     * 查询首页楼层商品、商家、活动信息
     * 
     * @Description:
     * @param reqInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-4 下午3:18:30
     */
    List<FloorInfo> queryFloorInfoList(ReqFloorInfo reqInfo) throws SQLException;

    /**
     * 查询商品价格
     * 
     * @Description:
     * @param reqInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-4 下午3:18:30
     */
    PriceInfo queryGoodsPrice(FloorInfo floorInfo) throws SQLException;

    /**
     * 查询楼层list信息
     * 
     * @Description:
     * @param reqInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-4 下午5:10:55
     */
    List<ViewInfo> queryViewList(ReqViewInfo reqInfo) throws SQLException;
}
