/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.push.QueryPushSysMsg
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-18     LiangJin       v1.0.0        create
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
import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.list.req.ReqSysMsgBean;
import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.list.rsp.RspSysMsgBean;
import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.bean.list.rsp.RspSysMsgBody;
import com.fzjt.xiaoliu.read.interfaces.business.sysmsg.service.SysMsgService;
import com.fzjt.xiaoliu.read.interfaces.util.BeanUtil;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 查询系统推送信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.push.QueryPushSysMsg
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-18 下午2:25:38
 * @author:LiangJin
 */
public class QueryPushSysMsg
{
    /**
     * 日誌
     */
    private static final Logger logger = Logger.getLogger(QueryPushSysMsg.class);

    /**
     * 业务service
     */
    private SysMsgService sysMsgService;

    /**
     * 查询系统推送信息列表
     * 
     * @Description:
     * @param servletRequest
     * @param obj
     * @param cont
     * @return String
     * @version:v1.0
     * @author:LiangJin
     * @date:2015-11-18 下午2:35:11
     */
    public String interfaceProcess(ServletRequest servletRequest, Document obj, AbstractApplicationContext cont)
    {
        // 定义业务bean
        ReqSysMsgBean reqBean = null;
        RspSysMsgBean rspBean = new RspSysMsgBean();
        RspSysMsgBody rspBody = null;

        RspHead rspHead = null;

        // 接口响应信息
        String result = "";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        sysMsgService = (SysMsgService) cont.getBean("sysMsgService");

        try
        {
            // xml转换成 业务 bean
            reqBean = (ReqSysMsgBean) Obj2Xml.xml2Obj(obj.asXML(), ReqSysMsgBean.class);
            if (StringTools.isNullOrEmpty(reqBean))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.XML_WRONG_ERROR, ErrorDescs.XML_WRONG_ERROR);
                return result;
            }

            // 设置返回信息头
            rspHead = BusinessUtils.transformHead(reqBean.getHead());

            // 非空判断
            // if (StringTools.isNullOrEmpty(reqBean.getReqSysMsgBody())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqSysMsgBody().getReqSysMsgInfo())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqSysMsgBody().getReqSysMsgInfo().getProvince())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqSysMsgBody().getReqSysMsgInfo().getCity()))
            // {
            // result =
            // BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR,
            // ErrorDescs.PARAM_NULL_ERROR);
            // return result;
            // }

            // 说明输入参数具体哪部分为空
            // 如果body为空
            if (StringTools.isNullOrEmpty(reqBean.getReqSysMsgBody()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "body"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 如果info为空
            else if (StringTools.isNullOrEmpty(reqBean.getReqSysMsgBody().getReqSysMsgInfo()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "info"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 输入参数为空
            else
            {
                String city = reqBean.getReqSysMsgBody().getReqSysMsgInfo().getCity();
                String province = reqBean.getReqSysMsgBody().getReqSysMsgInfo().getProvince();

                if (StringTools.isNullOrEmpty(city))
                {
                    result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "city"
                            + ErrorDescs.PARAM_NULL_ERROR);
                    return result;
                }
                else if (StringTools.isNullOrEmpty(province))
                {
                    result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "province"
                            + ErrorDescs.PARAM_NULL_ERROR);
                    return result;
                }
            }

            // 业务处理类
            rspBody = sysMsgService.queryPushSysMsg(reqBean.getReqSysMsgBody());

            // 如果获取系统消息为空
            if (StringTools.isNullOrEmpty(rspBody))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.SYSMSG_INFO_NULL_ERROR,
                        ErrorDescs.SYSMSG_INFO_NULL_ERROR);
                return result;
            }

            // 返回xml
            rspBean.setHead(rspHead);
            rspBean.setRspSysMsgBody(rspBody);

            // 校验BEAN属性，将无值的属性初始化值
            BeanUtil.checkFieldValue(rspBean);

            // 接口返回信息转换
            Obj2Xml.obj2Xml(RspSysMsgBean.class, rspBean, out);
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
