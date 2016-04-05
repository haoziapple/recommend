/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.dao.HelpCenterDAO
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-2     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.helpcenter.dao;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.info.rsp.RspHelpInfo;
import com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.req.ReqHelpListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.rsp.HelpInfo;
import com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.rsp.HelpListInfo;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.dao.HelpCenterDAO
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 下午8:51:11
 * @author:TangKai
 */
public interface HelpCenterDAO
{

    /**
     * 根据帮助内容key查询帮助信息
     * 
     * @Description:
     * @param dataKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-2 下午8:52:28
     */
    RspHelpInfo queryHelpCenterInfo(String dataKey) throws SQLException;

    /**
     * 根据hctkey查询datekey和title列表
     * 
     * @Description:
     * @param hctKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-2 下午9:42:39
     */
    List<HelpInfo> queryHelpInfoList(String hctKey) throws SQLException;

    /**
     * 查询PC商城帮助中心类别
     * 
     * @Description:
     * @param reqInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-2 下午9:10:36
     */
    List<HelpListInfo> queryHelpCenterList(ReqHelpListInfo reqInfo) throws SQLException;
}
