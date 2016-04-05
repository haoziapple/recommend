package com.fzjt.xiaoliu.read.interfaces.business.home.bottom.service;

import java.sql.SQLException;

import com.fzjt.xiaoliu.read.interfaces.business.home.bottom.bean.req.ReqBottomBody;
import com.fzjt.xiaoliu.read.interfaces.business.home.bottom.bean.rsp.RspBottomBody;


/**
 * 查询页面商品信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.bottom.service.HomeBottomService
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-11 下午18:19:46
 * @author:TangKai
 */
public interface HomeBottomService
{
    /**
     * 
     * @Description:根据定位省市查询底部按钮信息
     * @param reqBottomBody
     * @return list
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-11 下午18:19:46
     */
    public RspBottomBody queryBottomList(ReqBottomBody reqBottomBody) throws SQLException;

}