package com.fzjt.xiaoliu.read.interfaces.business.first.dao;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.first.bean.FirstBean;


/**
 * 查询首页商品列表
 * @className:com.fzjt.xiaoliu.read.interfaces.business.first.dao.FirstDAO
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 上午11:21:45
 * @author:ZhangYun
 */
public interface FirstDAO
{
	/**
	 * 查询首页商品列表
	 * @Description:
	 * @param firstBean
	 * @return
	 * @throws SQLException
	 * @version:v1.0
	 * @author:ZhangYun
	 * @date:2015-10-24 上午11:21:55
	 */
	 List<FirstBean> queryFirstList(FirstBean firstBean) throws SQLException;
	
}
