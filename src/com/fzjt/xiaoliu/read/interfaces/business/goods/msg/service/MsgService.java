/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.service.msgService
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
package com.fzjt.xiaoliu.read.interfaces.business.goods.msg.service;

import java.sql.SQLException;

import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.list.req.ReqMsgBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.list.rsp.RspMsgBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.req.ReqMsg4ShopBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.rsp.RspMsgBody4Shop;
import com.fzjt.xiaoliu.read.interfaces.business.usercenter.msg.bean.customer.req.ReqMsg4UserBody;

/**
 * 查询用户留言
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.msg.service.MsgService
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午6:26:14
 * @author:LiangJin
 */
public interface MsgService
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
     * @date:2015-11-13 下午6:26:28
     */
    RspMsgBody queryGoodsMsg(ReqMsgBody reqMsgBody) throws SQLException;

    /**
     * 根据商家查询买家咨询留言列表
     * 
     * @Description:
     * @param reqBody
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:LiChangjiang
     * @date:2015年11月24日 上午10:10:00
     */
    RspMsgBody4Shop queryGoodsMsg4Shop(ReqMsg4ShopBody reqBody) throws SQLException;

    /**
     * 根据用户查询买家咨询留言列表
     * 
     * @Description:
     * @param reqBody
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-26 下午2:53:47
     */
    RspMsgBody4Shop queryGoodsMsg4User(ReqMsg4UserBody reqBody) throws SQLException;
}
