/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.type.service.impl.TypeServiceImpl
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-13     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.goods.type.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.rsp.RspTypeInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.type.dao.TypeDAO;
import com.fzjt.xiaoliu.read.interfaces.business.goods.type.service.TypeService;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao.ParameterDAO;
import com.fzjt.xiaoliu.read.interfaces.util.Constant;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.goods.type.service.impl.TypeServiceImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午1:23:45
 * @author:LiangJin
 */
public class TypeServiceImpl implements TypeService
{
    private TypeDAO typeDAO;

    private ParameterDAO parameterDAO;

    /**
     * {@inheritDoc}
     */
    public List<RspTypeInfo> queryGoodsType(String typeKey) throws SQLException
    {

        List<RspTypeInfo> rspList = null;
        // 根据typeKey的值判断，
        // 如果typeKey等于-1，查询所有分类；
        // 如果typeKey不等于-1，则根据key查询下级类别集合
        if (Constant.STRING_NAME.equals(typeKey))
        {
            rspList = typeDAO.queryGoodsType();
        }
        else
        {
            rspList = typeDAO.queryGoodsTypeByKey(typeKey);
        }
        
        // 判断查询结果是否为空
        if (ListTools.isNullOrEmpty(rspList))
        {
            return rspList;
        }

        // 获取文件服务器路径
        String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

        // 拼装图片地址路径
        for (RspTypeInfo temp : rspList)
        {
            if (StringTools.isNullOrEmpty(temp)||StringTools.isNullOrEmpty(temp.getTypePic()))
            {
                continue;
            }
            temp.setTypePic(parameterValue + temp.getTypePic());
        }

        return rspList;
    }

    public TypeDAO getTypeDAO()
    {
        return typeDAO;
    }

    public void setTypeDAO(TypeDAO typeDAO)
    {
        this.typeDAO = typeDAO;
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
