package com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.service.impl;

import java.sql.SQLException;
import java.util.Date;

import com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.bean.CustomerInfo;
import com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.dao.CustomerDAO;
import com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.service.CustomerService;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.dao.ParameterDAO;
import com.fzjt.xiaoliu.read.interfaces.util.Constant;
import com.fzjt.xiaoliu.read.interfaces.util.DateUtils;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.service.impl.CustomerServiceImpl
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-2 下午4:09:12
 * @author:LiangJin
 */
public class CustomerServiceImpl implements CustomerService
{
    private CustomerDAO customerDAO;
    private ParameterDAO parameterDAO;

    /**
     * {@inheritDoc}
     */
    public CustomerInfo queryCustomerInfoByUserKey(String userkey) throws SQLException
    {
        CustomerInfo customerInfo = null;
        customerInfo = customerDAO.queryCustomerInfoByUserKey(userkey);
        // 账号存在

        if (!StringTools.isNullOrEmpty(customerInfo))
        {
            // 转换时间格式
            Date date = customerInfo.getDbirthday();
            if (!StringTools.isNullOrEmpty(date))
            {
                customerInfo.setBirthday(DateUtils.dateToStr(date));
            }
            // 图片存在
            String url = customerInfo.getHeadPortrait();
            if (!StringTools.isNullOrEmpty(url))
            {
                // 获取文件服务器路径
                String parameterValue = parameterDAO.queryParameterValue(Constant.SERVER_URL);

                // 拼装图片地址路径
                String path = parameterValue + url;
                customerInfo.setHeadPortrait(path);
            }
        }
        return customerInfo;
    }

    public void setCustomerDAO(CustomerDAO customerDAO)
    {
        this.customerDAO = customerDAO;
    }

    public void setParameterDAO(ParameterDAO parameterDAO)
    {
        this.parameterDAO = parameterDAO;
    }

}
