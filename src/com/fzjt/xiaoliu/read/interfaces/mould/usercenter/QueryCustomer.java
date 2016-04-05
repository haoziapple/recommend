package com.fzjt.xiaoliu.read.interfaces.mould.usercenter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletRequest;
import javax.xml.bind.JAXBException;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.springframework.context.support.AbstractApplicationContext;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspHead;
import com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.bean.CustomerInfo;
import com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.bean.req.ReqCustomerBean;
import com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.bean.rsp.RspCustomerBean;
import com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.bean.rsp.RspCustomerBody;
import com.fzjt.xiaoliu.read.interfaces.business.usercenter.customer.service.CustomerService;
import com.fzjt.xiaoliu.read.interfaces.util.BeanUtil;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 通过userkey获取账户个人信息
 * 
 * @Description:
 * @param servletRequest
 * @param obj
 * @param cont
 * @return
 * @version:v1.0
 * @author:LiangJin
 * @date:2015-11-2 下午4:28:36
 */
public class QueryCustomer
{

    // 日志
    private static final Logger logger = Logger.getLogger(QueryCustomer.class);

    // 用户信息service
    private CustomerService customerService;

    /**
     * 通过userkey获取账户个人信息
     * 
     * @Description:
     * @param servletRequest
     * @param obj
     * @param cont
     * @return String
     * @version:v1.0
     * @author:LiangJin
     * @date:2015-11-17 下午2:37:04
     */
    public String interfaceProcess(ServletRequest servletRequest, Document obj, AbstractApplicationContext cont)
    {

        // 业务bean
        ReqCustomerBean reqBean = null;
        RspCustomerBean rspBean = new RspCustomerBean();
        RspCustomerBody rspBody = new RspCustomerBody();
        RspHead rspHead = null;
        CustomerInfo customerInfo = null;

        // 接口响应信息
        String result = "";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        customerService = (CustomerService) cont.getBean("customerService");

        try
        {
            // xml转换成 业务 bean
            reqBean = (ReqCustomerBean) Obj2Xml.xml2Obj(obj.asXML(), ReqCustomerBean.class);
            if (StringTools.isNullOrEmpty(reqBean))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.XML_WRONG_ERROR, ErrorDescs.XML_WRONG_ERROR);
                return result;
            }

            // 设置返回信息头
            rspHead = BusinessUtils.transformHead(reqBean.getHead());

            // 请求参数非空判断
            // if (StringTools.isNullOrEmpty(reqBean.getBody())
            // || StringTools.isNullOrEmpty(reqBean.getBody().getUserKeyInfo())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getBody().getUserKeyInfo().getUserKey()))
            // {
            // result =
            // BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR,
            // ErrorDescs.PARAM_NULL_ERROR);
            // return result;
            // }
            //
            // // 业务处理
            // String userKey = reqBean.getBody().getUserKeyInfo().getUserKey();

            String userKey = "";
            // 说明输入参数具体哪部分为空
            // 如果body为空
            if (StringTools.isNullOrEmpty(reqBean.getBody()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "body"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 如果info为空
            else if (StringTools.isNullOrEmpty(reqBean.getBody().getUserKeyInfo()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "info"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 输入参数为空
            else
            {
                userKey = reqBean.getBody().getUserKeyInfo().getUserKey();

                if (StringTools.isNullOrEmpty(userKey))
                {
                    result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "userkey"
                            + ErrorDescs.PARAM_NULL_ERROR);
                    return result;
                }
            }

            customerInfo = customerService.queryCustomerInfoByUserKey(userKey);

            // 返回结果非空判断
            if (StringTools.isNullOrEmpty(customerInfo))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.ACCOUNT_INFO_NULL_ERROR,
                        ErrorDescs.ACCOUNT_INFO_NULL_ERROR);
                return result;
            }

            // 返回 xml
            rspBean.setHead(rspHead);
            rspBody.setCustomerInfo(customerInfo);
            rspBean.setBody(rspBody);

            // 校验BEAN属性，将无值的属性初始化值
            BeanUtil.checkFieldValue(rspBean);

            // 接口返回信息转换
            Obj2Xml.obj2Xml(RspCustomerBean.class, rspBean, out);
            result = out.toString();
        }
        catch (JAXBException e)
        {
            logger.error("请求数据内容转换错误", e);
            result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.REQ_FORMAT_ERROR, ErrorDescs.REQ_FORMAT_ERROR);
            return result;
        }
        catch (DocumentException e)
        {
            logger.error("请求数据格式错误", e);
            result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.REQ_FORMAT_ERROR, ErrorDescs.REQ_FORMAT_ERROR);
            return result;
        }
        catch (IOException e)
        {
            logger.error("远程方法调用异常", e);
            result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.RMI_RESULT_ERROR, ErrorDescs.RMI_RESULT_ERROR);
            return result;
        }
        catch (SQLException e)
        {
            logger.error("查询数据库操作异常", e);
            result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.EXECUTE_DB_ERROR, ErrorDescs.EXECUTE_DB_ERROR);
            return result;
        }
        catch (Exception e)
        {
            logger.error("返回数据转换异常", e);
            result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.RESPONSE_DATE_ERROR, ErrorDescs.RESPONSE_DATE_ERROR);
            return result;
        }
        finally
        {
            if (!StringTools.isNullOrEmpty(out))
            {
                try
                {
                    out.close();
                }
                catch (IOException e)
                {
                    logger.error("请求数据内容转换错误", e);
                    result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.RMI_RESULT_ERROR, ErrorDescs.RMI_RESULT_ERROR);
                    return result;
                }
            }
        }

        return result;
    }

    public CustomerService getCustomerService()
    {
        return customerService;
    }

    public void setCustomerService(CustomerService customerService)
    {
        this.customerService = customerService;
    }

    public static Logger getLogger()
    {
        return logger;
    }

}
