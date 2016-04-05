/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.dao.HomeDAO
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-2     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.pc.home.dao;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.bottom.req.ReqBottomInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.bottom.rsp.RspBottomInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.turn.req.ReqTurnInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.turn.rsp.RspTurnInfo;
/**
 * pc首页信息dao
 * @className:com.fzjt.xiaoliu.read.interfaces.business.pc.home.dao.HomeDAO
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-12-2 下午1:25:38
 * @author:LiangJin
 */
public interface HomeDAO
{
	/**
	 * 查询pc首页轮播图片集合
	 * 
	 * @Description:
	 * @return
	 * @throws SQLException
	 * @version:v1.0
	 * @author:LiangJin
	 * @date:2015-12-2 下午1:20:45
	 */
	List<RspTurnInfo> queryTurnInfo(ReqTurnInfo reqTurnInfo) throws SQLException;
	
	/**
	 * 查询pc端首页底部按钮信息
	 * @Description:
	 * @param reqTurnInfo
	 * @return
	 * @throws SQLException
	 * @version:v1.0
	 * @author:LiangJin
	 * @date:2015-12-2 下午3:33:15
	 */
	RspBottomInfo queryBottomInfo(ReqBottomInfo reqBottomInfo) throws SQLException;

}
