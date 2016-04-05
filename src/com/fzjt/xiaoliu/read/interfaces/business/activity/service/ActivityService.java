/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.activity.service.ActivityService
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
package com.fzjt.xiaoliu.read.interfaces.business.activity.service;

import java.sql.SQLException;

import com.fzjt.xiaoliu.read.interfaces.business.activity.bean.Relation.req.ReqRelationInfo;
import com.fzjt.xiaoliu.read.interfaces.business.activity.bean.info.req.ReqActivityBody;
import com.fzjt.xiaoliu.read.interfaces.business.activity.bean.info.rsp.RspActivityBody;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.activity.service.ActivityService
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-10 下午9:29:24
 * @author:TangKai
 */
public interface ActivityService
{

    /**
     * 查询平台推广活动列表
     * 
     * @Description:
     * @param reqBody
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-10 下午9:51:02
     */
    RspActivityBody queryActivityList(ReqActivityBody reqBody) throws SQLException;

    /**
     * 查询我参与的活动
     * 
     * @Description:
     * @param reqBody
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-14 下午2:11:45
     */
    RspActivityBody queryMyActivity(ReqRelationInfo reqInfo) throws SQLException;
}
