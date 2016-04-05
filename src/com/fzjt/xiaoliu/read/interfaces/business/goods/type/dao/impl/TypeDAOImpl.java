/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.type.dao.impl.TypeDAOImpl
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
package com.fzjt.xiaoliu.read.interfaces.business.goods.type.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.rsp.RspTypeInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.type.dao.TypeDAO;

/**
 * TypeDao实现类
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.type.dao.impl.TypeDAOImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 上午11:18:59
 * @author:LiangJin
 */
public class TypeDAOImpl extends SqlMapClientDaoSupport implements TypeDAO
{

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public List<RspTypeInfo> queryGoodsTypeByKey(String typeKey) throws SQLException
	{
		return this.getSqlMapClientTemplate().queryForList("type.queryGoodsTypeByKey", typeKey);
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public List<RspTypeInfo> queryGoodsType() throws SQLException
	{
		return this.getSqlMapClientTemplate().queryForList("type.queryGoodsType");
	}

}
