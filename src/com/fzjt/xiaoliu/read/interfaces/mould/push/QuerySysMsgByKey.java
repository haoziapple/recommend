/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.push.QuerySysMsgByKey
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-19     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.mould.push;

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
import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.info.req.ReqSysMsgKeyBean;
import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.info.rsp.RspSysMsgKeyBean;
import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.info.rsp.RspSysMsgKeyBody;
import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.service.SysMsgService;
import com.fzjt.xiaoliu.read.interfaces.util.BeanUtil;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 根据msgkey查询系统推送信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.push.QuerySysMsgByKey
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-19 下午8:22:36
 * @author:TangKai
 */
public class QuerySysMsgByKey
{
    /**
     * 日誌
     */
    private static final Logger logger = Logger.getLogger(QuerySysMsgByKey.class);

    /**
     * 业务service
     */
    private SysMsgService sysMsgService;

    /**
     * 根据msgkey查询系统推送信息
     * 
     * @Description:
     * @param servletRequest
     * @param obj
     * @param cont
     * @return
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-19 下午8:27:42
     */
    public String interfaceProcess(ServletRequest servletRequest, Document obj, AbstractApplicationContext cont)
    {
        // 定义业务bean
        ReqSysMsgKeyBean reqBean = null;
        RspSysMsgKeyBean rspBean = new RspSysMsgKeyBean();
        RspSysMsgKeyBody rspBody = null;

        RspHead rspHead = null;

        // 接口响应信息
        String result = "";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        sysMsgService = (SysMsgService) cont.getBean("sysMsgService");

        try
        {
            // xml转换成 业务 bean
            reqBean = (ReqSysMsgKeyBean) Obj2Xml.xml2Obj(obj.asXML(), ReqSysMsgKeyBean.class);
            if (StringTools.isNullOrEmpty(reqBean))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.XML_WRONG_ERROR, ErrorDescs.XML_WRONG_ERROR);
                return result;
            }

            // 设置返回信息头
            rspHead = BusinessUtils.transformHead(reqBean.getHead());

            // 非空判断
            // if (StringTools.isNullOrEmpty(reqBean.getReqSysMsgKeyBody())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqSysMsgKeyBody().getReqSysMsgKeyInfo())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqSysMsgKeyBody().getReqSysMsgKeyInfo().getMsgKey()))
            // {
            // result =
            // BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR,
            // ErrorDescs.PARAM_NULL_ERROR);
            // return result;
            // }

            String msgKey = "";
            // 说明输入参数具体哪部分为空
            // 如果body为空
            if (StringTools.isNullOrEmpty(reqBean.getReqSysMsgKeyBody()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "body"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 如果info为空
            else if (StringTools.isNullOrEmpty(reqBean.getReqSysMsgKeyBody().getReqSysMsgKeyInfo()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "info"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 输入参数为空
            else
            {
                msgKey = reqBean.getReqSysMsgKeyBody().getReqSysMsgKeyInfo().getMsgKey();

                if (StringTools.isNullOrEmpty(msgKey))
                {
                    result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "msgkey"
                            + ErrorDescs.PARAM_NULL_ERROR);
                    return result;
                }
            }

            // 业务处理类
            rspBody = sysMsgService.querySysMsgByKey(msgKey);

            // 如果获取系统消息为空
            if (StringTools.isNullOrEmpty(rspBody))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.SYSMSG_INFO_NULL_ERROR,
                        ErrorDescs.SYSMSG_INFO_NULL_ERROR);
                return result;
            }

            // 返回bean设置
            rspBean.setHead(rspHead);
            rspBean.setRspSysMsgKeyBody(rspBody);

            // 校验BEAN属性，将无值的属性初始化值
            BeanUtil.checkFieldValue(rspBean);

            // 接口返回信息转换
            Obj2Xml.obj2Xml(RspSysMsgKeyBean.class, rspBean, out);
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

}
