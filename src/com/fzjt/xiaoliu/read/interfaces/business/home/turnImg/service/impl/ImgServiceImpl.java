/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.turn.img.service.impl.ImgServiceImpl
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
package com.fzjt.xiaoliu.read.interfaces.business.home.turnImg.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.home.turnImg.bean.req.ReqImgInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.turnImg.bean.rsp.RspImgInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.turnImg.dao.ImgDAO;
import com.fzjt.xiaoliu.read.interfaces.business.home.turnImg.service.ImgService;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao.ParameterDAO;
import com.fzjt.xiaoliu.read.interfaces.util.Constant;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.turn.img.service.impl.ImgServiceImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-6 下午2:48:25
 * @author:LiangJin
 */
public class ImgServiceImpl implements ImgService
{
	private ImgDAO imgDAO;

	private ParameterDAO parameterDAO;

	/**
	 * {@inheritDoc}
	 */
	public List<RspImgInfo> queryImgInfo(ReqImgInfo reqInfo) throws SQLException
	{
		List<RspImgInfo> list = imgDAO.queryImgInfo(reqInfo);

		// 判断查询结果是否为空
		if (ListTools.isNullOrEmpty(list))
		{
			return null;
		}

		// 获取文件服务器路径
		String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

		// 拼装图片地址路径
		for (RspImgInfo temp : list)
		{
			if (StringTools.isNullOrEmpty(temp)||StringTools.isNullOrEmpty(temp.getImgURL()))
			{
				continue;
			}
			temp.setImgURL(parameterValue + temp.getImgURL());
			
		}

		return list;
	}

	public ImgDAO getImgDAO()
	{
		return imgDAO;
	}

	public void setImgDAO(ImgDAO imgDAO)
	{
		this.imgDAO = imgDAO;
	}

	public ParameterDAO getParameterDAO()
	{
		return parameterDAO;
	}

	public void setParameterDAO(ParameterDAO parameterDAO)
	{
		this.parameterDAO = parameterDAO;
	}

}
