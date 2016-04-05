/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.content.dao.impl.ContentDaoImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-5     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.floor.content.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.business.home.floor.content.bean.req.ReqContentInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.content.bean.rsp.RspContentInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.content.dao.ContentDAO;

/**
 * dao实现类
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.content.dao.impl.ContentDaoImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-5 下午5:31:36
 * @author:LiangJin
 */
public class ContentDaoImpl extends SqlMapClientDaoSupport implements ContentDAO
{
	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public List<RspContentInfo> queryContentInfo(ReqContentInfo reqContentInfo) throws SQLException
	{
		return this.getSqlMapClientTemplate().queryForList("content.queryContentInfo", reqContentInfo);
	}

}
