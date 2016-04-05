/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.activity.dao.ActivityDAO
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-10     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.activity.dao;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.activity.bean.Relation.req.ReqRelationInfo;
import com.fzjt.xiaoliu.read.interfaces.business.activity.bean.info.req.ReqActivityInfo;
import com.fzjt.xiaoliu.read.interfaces.business.activity.bean.info.rsp.ActivityInfo;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.activity.dao.ActivityDAO
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-10 下午9:28:47
 * @author:TangKai
 */
public interface ActivityDAO
{

    /**
     * 查询平台推广活动列表
     * 
     * @Description:
     * @param reqInfo
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-10 下午9:46:43
     */
    List<ActivityInfo> queryActivityList(ReqActivityInfo reqInfo) throws SQLException;

    /**
     * 查询我参与的活动key列表
     * 
     * @Description:
     * @param userKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-14 下午1:56:01
     */
    List<String> queryRelationList(ReqRelationInfo reqInfo) throws SQLException;

    /**
     * 根据活动key查询活动信息
     * 
     * @Description:
     * @param actvtKey
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-14 下午2:08:23
     */
     ActivityInfo queryActivityInfo(String actvtKey) throws SQLException;
}
