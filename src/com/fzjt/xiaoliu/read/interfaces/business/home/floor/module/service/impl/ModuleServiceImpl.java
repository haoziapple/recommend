package com.fzjt.xiaoliu.read.interfaces.business.home.floor.module.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.home.floor.module.bean.req.ReqModuleInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.module.bean.rsp.RspModuleInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.module.dao.ModuleDAO;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.module.service.ModuleService;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.floor.module.service.impl.ModuleServiceImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-5 下午2:40:51
 * @author:LiangJin
 */
public class ModuleServiceImpl implements ModuleService
{
    private ModuleDAO moduleDAO;

    /**
     * {@inheritDoc}
     */
    public List<RspModuleInfo> queryModule(ReqModuleInfo reqModuleInfo) throws SQLException
    {
        /**
         * 查询楼层信息
         */
        List<RspModuleInfo> list = moduleDAO.queryModule(reqModuleInfo);
        return list;
    }

    public ModuleDAO getModuleDAO()
    {
        return moduleDAO;
    }

    public void setModuleDAO(ModuleDAO moduleDAO)
    {
        this.moduleDAO = moduleDAO;
    }

}
