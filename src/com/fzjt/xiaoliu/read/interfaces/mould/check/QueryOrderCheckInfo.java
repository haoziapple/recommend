/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.check.QueryOrderCheckInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-8     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.mould.check;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.xml.bind.JAXBException;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.springframework.context.support.AbstractApplicationContext;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspHead;
import com.fzjt.xiaoliu.read.interfaces.business.check.bean.order.req.ReqCheckOrderBean;
import com.fzjt.xiaoliu.read.interfaces.business.check.bean.order.rsp.RspCheckBean;
import com.fzjt.xiaoliu.read.interfaces.business.check.bean.order.rsp.RspCheckBody;
import com.fzjt.xiaoliu.read.interfaces.business.check.service.CheckService;
import com.fzjt.xiaoliu.read.interfaces.util.BeanUtil;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 校验订单信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.check.QueryOrderCheckInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-8 下午4:59:17
 * @author:TangKai
 */
public class QueryOrderCheckInfo
{
    private static final Logger logger = Logger.getLogger(QueryOrderCheckInfo.class);

    private CheckService checkService;

    /**
     * 校验订单信息
     * 
     * @Description:
     * @param servletRequest
     * @param obj
     * @param cont
     * @return
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-8 下午4:59:26
     */
    public String interfaceProcess(ServletRequest servletRequest, Document obj, AbstractApplicationContext cont)
    {
        // 获取业务bean
        ReqCheckOrderBean reqBean = new ReqCheckOrderBean();

        // 获取返回Bean
        RspCheckBean rspBean = new RspCheckBean();
        RspCheckBody rspBody = new RspCheckBody();
        // 返回头
        RspHead rspHead = new RspHead();

        // 接口返回信息
        String result = "";

        // 取得 Service
        checkService = (CheckService) cont.getBean("checkService");
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try
        {
            // xml转成Bean
            reqBean = (ReqCheckOrderBean) Obj2Xml.xml2Obj(obj.asXML(), ReqCheckOrderBean.class);

            // 设置返回信息头
            rspHead = BusinessUtils.transformHead(reqBean.getHead());

            // 验证数据完整性
            if (StringTools.isNullOrEmpty(reqBean))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.XML_WRONG_ERROR, ErrorDescs.XML_WRONG_ERROR);
                return result;
            }

            // 报文校验
            // if (StringTools.isNullOrEmpty(reqBean.getReqBody())
            // || StringTools.isNullOrEmpty(reqBean.getReqBody().getReqInfo())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqBody().getReqInfo().getOrderInfo()))
            // {
            // result = BusinessUtils.rspErrorHeadInfo(PARAM_NULL_ERROR,
            // ErrorDescs.PARAM_NULL_ERROR);
            // return result;
            // }

            String orderInfo ="";
            // 说明输入参数具体哪部分为空
            // 如果body为空
            if (StringTools.isNullOrEmpty(reqBean.getReqBody()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "body"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 如果info为空
            else if (StringTools.isNullOrEmpty(reqBean.getReqBody().getReqInfo()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "info"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 输入参数为空
            else
            {
                orderInfo = reqBean.getReqBody().getReqInfo().getOrderInfo();

                if (StringTools.isNullOrEmpty(orderInfo))
                {
                    result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "orderinfo"
                            + ErrorDescs.PARAM_NULL_ERROR);
                    return result;
                }
            }


            // 设置返回信息
            rspBean.setBody(rspBody);
            rspBean.setHead(rspHead);

            // 校验BEAN属性，将无值的属性初始化值
            BeanUtil.checkFieldValue(rspBean);

            // 接口返回信息转换
            Obj2Xml.obj2Xml(RspCheckBean.class, rspBean, out);
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

    public CheckService getCheckService()
    {
        return checkService;
    }

    public void setCheckService(CheckService checkService)
    {
        this.checkService = checkService;
    }

}