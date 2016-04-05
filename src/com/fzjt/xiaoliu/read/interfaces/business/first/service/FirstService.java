package com.fzjt.xiaoliu.read.interfaces.business.first.service;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.first.bean.FirstBean;


/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.first.service.FirstService
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 上午11:22:08
 * @author:ZhangYun
 */
public interface FirstService
{
    /**
     * 查询首页商品列表
     * @Description:
     * @param firstBean
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:ZhangYun
     * @date:2014-11-15 上午9:39:53
     */
     List<FirstBean> queryFirstList(FirstBean firstBean) throws SQLException;
    
}
