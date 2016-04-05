package com.fzjt.xiaoliu.read.interfaces.business.home.bottom.dao;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.home.bottom.bean.req.ReqBottomInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.bottom.bean.rsp.RspBottomInfo;

/**
 * app底部按钮管理
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.home.bottom.dao.HomeBottomDAO
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-11 下午17:17:06
 * @author:TangKai
 */
public interface HomeBottomDAO
{
    /**
     * 根据定位省市查询底部按钮信息
     * 
     * @Description:
     * @param 
     * @return list
     * @throws SQLException
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-11 下午17:17:06
     */
     public List<RspBottomInfo> queryBottomList(ReqBottomInfo reqBottomInfo) throws SQLException;
}
