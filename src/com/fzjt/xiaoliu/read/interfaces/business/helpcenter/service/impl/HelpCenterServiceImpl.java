/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.service.impl.HelpCenterServiceImpl
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
package com.fzjt.xiaoliu.read.interfaces.business.helpcenter.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.info.rsp.RspHelpInfo;
import com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.req.ReqHelpListBody;
import com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.rsp.HelpInfo;
import com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.rsp.HelpInfoList;
import com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.rsp.HelpListInfo;
import com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.rsp.RspHelpList;
import com.fzjt.xiaoliu.read.interfaces.business.helpcenter.bean.list.rsp.RspHelpListBody;
import com.fzjt.xiaoliu.read.interfaces.business.helpcenter.dao.HelpCenterDAO;
import com.fzjt.xiaoliu.read.interfaces.business.helpcenter.service.HelpCenterService;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.helpcenter.service.impl.HelpCenterServiceImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 下午9:19:49
 * @author:TangKai
 */
public class HelpCenterServiceImpl implements HelpCenterService
{
    // dao服务
    private HelpCenterDAO helpCenterDAO;

    /**
     * {@inheritDoc}
     */
    @Override
    public RspHelpInfo queryHelpCenterInfo(String dataKey) throws SQLException
    {
        return helpCenterDAO.queryHelpCenterInfo(dataKey);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RspHelpListBody queryHelpCenterList(ReqHelpListBody reqBody) throws SQLException
    {
        // 定义返回信息
        RspHelpListBody rspBody = new RspHelpListBody();
        RspHelpList rspHelpList = new RspHelpList();
        List<HelpListInfo> rspList = new ArrayList<HelpListInfo>();
        List<HelpInfo> helpInfoList = new ArrayList<HelpInfo>();

        // 调用返回帮助中心类别信息
        List<HelpListInfo> tempList = helpCenterDAO.queryHelpCenterList(reqBody.getReqInfo());

        // 返回信息非空判断
        if (ListTools.isNullOrEmpty(tempList))
        {
            rspBody.setRspListInfo(null);
        }

        // 1.对返回list中的每个htcKey，查询相应的dataKey和title列表
        //
        for (HelpListInfo temp : tempList)
        {
        	if(StringTools.isNullOrEmpty(temp)){
        		continue;
        	}
        	
            // 对hctKey查询相应的dataKey和title列表
            String hctKey = temp.getHctKey();
            helpInfoList = helpCenterDAO.queryHelpInfoList(hctKey);

            // 设置返回list
            HelpListInfo rspHelpListInfo = new HelpListInfo();
            rspHelpListInfo.setDataKey(temp.getDataKey());
            rspHelpListInfo.setHctKey(temp.getHctKey());
            rspHelpListInfo.setHctName(temp.getHctName());

            HelpInfoList helpList = new HelpInfoList();
            helpList.setRspTitleList(helpInfoList);
            rspHelpListInfo.setTitleList(helpList);

            // 生成返回list
            rspList.add(rspHelpListInfo);
        }

        // 设定返回信息
        rspHelpList.setRspList(rspList);
        rspBody.setRspListInfo(rspHelpList);

        return rspBody;
    }

    public HelpCenterDAO getHelpCenterDAO()
    {
        return helpCenterDAO;
    }

    public void setHelpCenterDAO(HelpCenterDAO helpCenterDAO)
    {
        this.helpCenterDAO = helpCenterDAO;
    }
}
