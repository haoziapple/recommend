/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.dao.msgDAO
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-13     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.msg.dao;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.list.req.ReqMsgInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.list.rsp.RspMsgInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.req.ReqMsg4ShopInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.rsp.RspMsgInfo4Shop;
import com.fzjt.xiaoliu.read.interfaces.business.usercenter.msg.bean.customer.req.ReqMsg4UserInfo;

/**
 * 查询用户留言
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.dao.MsgDAO
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午6:16:24
 * @author:LiangJin
 */
public interface MsgDAO
{
	/**
	 * 根据商品key、开始条数、截止条数 分页查询用户留言
	 * 
	 * @Description:
	 * @param goodsKey
	 * @return list
	 * @throws SQLException
	 * @version:v1.0
	 * @author:LiangJin
	 * @date:2015-11-13 下午6:18:05
	 */
	List<RspMsgInfo> queryGoodsMsg(ReqMsgInfo reqMsgInfo) throws SQLException;

	/**
	 * 查询商品留言总条数
	 * 
	 * @Description:
	 * @param reqMsgInfo
	 * @return String
	 * @throws SQLException
	 * @version:v1.0
	 * @author:LiangJin
	 * @date:2015-11-13 下午7:39:40
	 */
	String queryMsgCountByKey(ReqMsgInfo reqMsgInfo) throws SQLException;

	/**
	 * 根据商家查询买家咨询留言信息
	 * 
	 * @Description:
	 * @param reqInfo
	 * @return
	 * @throws SQLException
	 * @version:v1.0
	 * @author:LiChangjiang
	 * @date:2015年11月24日 上午10:14:49
	 */
	List<RspMsgInfo4Shop> queryGoodsMsg4Shop(ReqMsg4ShopInfo reqInfo) throws SQLException;

	/**
	 * 根据商家查询商品回复信息条数
	 * 
	 * @Description:
	 * @param reqMsgInfo
	 * @return
	 * @throws SQLException
	 * @version:v1.0
	 * @author:LiChangjiang
	 * @date:2015年11月24日 上午11:11:09
	 */
	String queryMsgCountByShop(ReqMsg4ShopInfo reqInfo) throws SQLException;
	
	/**
     * 根据用户查询买家咨询留言信息
     * 
     * @Description:
     * @param reqInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-26 下午2:23:27
     */
    List<RspMsgInfo4Shop> queryGoodsMsg4User(ReqMsg4UserInfo reqInfo) throws SQLException;

    /**
     * 根据用户查询买家咨询留言信息数量
     * 
     * @Description:
     * @param reqInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-26 下午2:24:46
     */
    String queryMsgCountByUser(ReqMsg4UserInfo reqInfo) throws SQLException;

}
