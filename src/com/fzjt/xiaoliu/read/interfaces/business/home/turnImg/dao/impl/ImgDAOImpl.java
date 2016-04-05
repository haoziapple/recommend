/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.turn.img.dao.impl.ImgDAOImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-6     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.turnImg.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.business.home.turnImg.bean.req.ReqImgInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.turnImg.bean.rsp.RspImgInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.turnImg.dao.ImgDAO;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.turn.img.dao.impl.ImgDAOImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-6 下午2:39:35
 * @author:LiangJin
 */
public class ImgDAOImpl extends SqlMapClientDaoSupport implements ImgDAO
{

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public List<RspImgInfo> queryImgInfo(ReqImgInfo reqInfo) throws SQLException
	{
		return this.getSqlMapClientTemplate().queryForList("turnImg.queryImgInfo", reqInfo);

	}

}
