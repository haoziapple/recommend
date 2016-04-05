/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.module.dao.ModuleDAO
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
package com.fzjt.xiaoliu.read.interfaces.business.home.floor.module.dao;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.home.floor.module.bean.req.ReqModuleInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.module.bean.rsp.RspModuleInfo;

/**
 * 查询楼层信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.module.dao.ModuleDAO
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-5 下午2:10:55
 * @author:LiangJin
 */
public interface ModuleDAO
{
    /**
     * 首页查询展示所需的楼层模块集合
     * 
     * @Description:
     * @return List
     * @throws SQLException
     * @version:v1.0
     * @author:LiChangjiang
     * @date:2015-11-7 下午2:50:55
     */
	List<RspModuleInfo> queryModule(ReqModuleInfo reqModuleInfo) throws SQLException;
}
