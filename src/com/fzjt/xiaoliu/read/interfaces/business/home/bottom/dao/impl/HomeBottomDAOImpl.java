package com.fzjt.xiaoliu.read.interfaces.business.home.bottom.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fzjt.xiaoliu.read.interfaces.business.home.bottom.bean.req.ReqBottomInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.bottom.bean.rsp.RspBottomInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.bottom.dao.HomeBottomDAO;


/**
 * app底部按钮管理
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.bottom.dao.impl.HomeBottomDAOImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-11 下午17:17:06
 * @author:TangKai
 */
public class HomeBottomDAOImpl extends SqlMapClientDaoSupport implements HomeBottomDAO
{
	 /**
     * {@inheritDoc}
     */
	@SuppressWarnings("unchecked")
    public List<RspBottomInfo> queryBottomList(ReqBottomInfo reqBottomInfo) throws SQLException
	{
		return this.getSqlMapClientTemplate().queryForList("homeBottom.queryBottomList", reqBottomInfo);
	}

}
