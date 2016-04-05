package com.fzjt.xiaoliu.read.interfaces.business.first.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.first.bean.FirstBean;
import com.fzjt.xiaoliu.read.interfaces.business.first.dao.FirstDAO;
import com.fzjt.xiaoliu.read.interfaces.business.first.service.FirstService;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao.ParameterDAO;
import com.fzjt.xiaoliu.read.interfaces.util.Constant;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;


/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.first.service.impl.FirstServiceImpl
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 上午11:22:03
 * @author:ZhangYun
 */
public class FirstServiceImpl implements FirstService
{
    
	private FirstDAO firstDAO ;
    private ParameterDAO parameterDAO;
	
	/**
     * 查询首页商品列表
     * @Description:
     * @param firstBean
     * @return
     * @throws SQLException
     * @version:v1.0
     * @author:ZhangYun
     * @date:2014-10-13 下午4:36:52
     */
	@Override
	public List<FirstBean> queryFirstList(FirstBean firstBean) throws SQLException
	{
		// TODO Auto-generated method stub
	    List<FirstBean> list=new ArrayList<FirstBean>();
	    list =  firstDAO.queryFirstList(firstBean);
	    //判断集合是否为空
	    if(!ListTools.isNullOrEmpty(list))
        {
            //获取文件服务器路径
            String parameterValue=parameterDAO.queryParameterValue(Constant.SERVER_URL); 
            for(int i=0;i<list.size();i++)
            {
             //拼装图片地址路径
             String path=parameterValue+list.get(i).getGoodsUrl();
             list.get(i).setGoodsUrl(path);   
            }
        }
        return list;
	}

	
	
    public FirstDAO getFirstDAO()
    {
        return firstDAO;
    }

    public void setFirstDAO(FirstDAO firstDAO)
    {
        this.firstDAO = firstDAO;
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
