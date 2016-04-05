/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.activity.service.impl.ActivityServiceImpl
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
package com.fzjt.xiaoliu.read.interfaces.business.activity.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.activity.bean.Relation.req.ReqRelationInfo;
import com.fzjt.xiaoliu.read.interfaces.business.activity.bean.info.req.ReqActivityBody;
import com.fzjt.xiaoliu.read.interfaces.business.activity.bean.info.rsp.ActivityInfo;
import com.fzjt.xiaoliu.read.interfaces.business.activity.bean.info.rsp.ActivityList;
import com.fzjt.xiaoliu.read.interfaces.business.activity.bean.info.rsp.RspActivityBody;
import com.fzjt.xiaoliu.read.interfaces.business.activity.dao.ActivityDAO;
import com.fzjt.xiaoliu.read.interfaces.business.activity.service.ActivityService;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao.ParameterDAO;
import com.fzjt.xiaoliu.read.interfaces.util.Constant;
import com.fzjt.xiaoliu.read.interfaces.util.DateUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.activity.service.impl.ActivityServiceImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-10 下午9:29:21
 * @author:TangKai
 */
public class ActivityServiceImpl implements ActivityService
{
    private ActivityDAO activityDAO;

    private ParameterDAO parameterDAO;

    /**
     * {@inheritDoc}
     */
    public RspActivityBody queryActivityList(ReqActivityBody reqBody) throws SQLException
    {
        // 定义返回信息
        RspActivityBody rspBody = new RspActivityBody();
        ActivityList rspList = new ActivityList();

        // 查询活动列表
        List<ActivityInfo> activityList = activityDAO.queryActivityList(reqBody.getReqInfo());

        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        // 非空判断
        if (!ListTools.isNullOrEmpty(activityList))
        {

            for (ActivityInfo temp : activityList)
            {
            	if(StringTools.isNullOrEmpty(temp)){
            		continue;
            	}
                // 拼接图片地址
                if (!StringTools.isNullOrEmpty(temp.getActvtPic()))
                {
                	temp.setActvtPic(parameterValue + temp.getActvtPic());
                }
                
                // 日期格式转换
                if (!StringTools.isNullOrEmpty(temp.getDateBegin()))
                {
                	temp.setDateBeginStr(DateUtils.dateToStr(temp.getDateBegin()));
                }   

                if (!StringTools.isNullOrEmpty(temp.getDateEnd()))
                {
                	temp.setDateEndStr(DateUtils.dateToStr(temp.getDateEnd()));
                }
                
            }

        }

        rspList.setActivityList(activityList);
        rspBody.setRspList(rspList);

        return rspBody;
    }

    /**
     * {@inheritDoc}
     */
    public RspActivityBody queryMyActivity(ReqRelationInfo reqInfo) throws SQLException
    {
        // 定义返回信息
        RspActivityBody rspBody = new RspActivityBody();
        ActivityList rspList = new ActivityList();
        List<ActivityInfo> activityList = new ArrayList<ActivityInfo>();

        // 查询我参与活动的活动key
        List<String> actvtKeyList = activityDAO.queryRelationList(reqInfo);

        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        // 根据活动key查询相应的活动信息
        if (!ListTools.isNullOrEmpty(actvtKeyList))
        {
            for (String tempKey : actvtKeyList)
            {
                ActivityInfo info = activityDAO.queryActivityInfo(tempKey);
                
                if(StringTools.isNullOrEmpty(info)){
                	continue;
                }
                // 拼接图片地址
                if (!StringTools.isNullOrEmpty(info.getActvtPic()))
                {
                	info.setActvtPic(parameterValue + info.getActvtPic());
                }   

                // 日期格式转换
                if (!StringTools.isNullOrEmpty(info.getDateBegin()))
                {
                	info.setDateBeginStr(DateUtils.dateToStr(info.getDateBegin()));
                }

                if (!StringTools.isNullOrEmpty(info.getDateEnd()))
                {
                	 info.setDateEndStr(DateUtils.dateToStr(info.getDateEnd()));
                }

                activityList.add(info);
                info = null;
            }
        }

        // 设置返回信息
        rspList.setActivityList(activityList);
        rspBody.setRspList(rspList);

        return rspBody;
    }

    public ActivityDAO getActivityDAO()
    {
        return activityDAO;
    }

    public void setActivityDAO(ActivityDAO activityDAO)
    {
        this.activityDAO = activityDAO;
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
