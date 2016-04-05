package com.fzjt.xiaoliu.read.interfaces.business.first.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.business.first.bean.FirstBean;
import com.fzjt.xiaoliu.read.interfaces.business.first.dao.FirstDAO;


/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.first.dao.impl.FirstDAOImpl
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 上午11:21:36
 * @author:ZhangYun
 */
public class FirstDAOImpl extends SqlMapClientDaoSupport implements FirstDAO
{

	@SuppressWarnings("unchecked")
	public List<FirstBean> queryFirstList(FirstBean firstBean) throws SQLException
	{
		return  this.getSqlMapClientTemplate().queryForList("first.queryFirstList", firstBean);
	}

}
