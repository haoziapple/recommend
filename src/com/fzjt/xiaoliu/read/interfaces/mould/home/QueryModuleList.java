/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.floor.QueryModuleList
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-5     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.mould.home;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletRequest;
import javax.xml.bind.JAXBException;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.springframework.context.support.AbstractApplicationContext;

import com.fzjt.xiaoliu.read.interfaces.bean.response.RspHead;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.module.bean.req.ReqModuleBean;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.module.bean.req.ReqModuleInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.module.bean.rsp.RspModuleBean;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.module.bean.rsp.RspModuleBody;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.module.bean.rsp.RspModuleInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.module.bean.rsp.RspModuleList;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.module.service.ModuleService;
import com.fzjt.xiaoliu.read.interfaces.util.BeanUtil;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;
import com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 查询楼层模块信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.home.QueryModuleList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-7 下午2:44:14
 * @author:LiChangjiang
 */
public class QueryModuleList
{
    /**
     * 日志
     */
    private static final Logger logger = Logger.getLogger(QueryModuleList.class);

    /**
     * 首页楼层Service
     */
    private ModuleService moduleService;

    /**
     * 查询楼层模块信息
     * 
     * @Description:
     * @param servletRequest
     * @param obj
     * @param cont
     * @return
     * @version:v1.0
     * @author:LiangJin
     * @date:2015-11-5 下午2:44:31
     */
    public String interfaceProcess(ServletRequest servletRequest, Document obj, AbstractApplicationContext cont)
    {
        // 定义业务bean
        ReqModuleBean reqBean = null;
        RspModuleBean rspBean = new RspModuleBean();
        RspModuleBody rspBody = new RspModuleBody();
        List<RspModuleInfo> moduleList = null;
        RspModuleList rspModuleList = new RspModuleList();
        RspHead rspHead = null;
        ReqModuleInfo reqModule = null;

        // 接口响应信息
        String result = "";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        moduleService = (ModuleService) cont.getBean("moduleService");

        try
        {
            // xml转换成 业务 bean
            reqBean = (ReqModuleBean) Obj2Xml.xml2Obj(obj.asXML(), ReqModuleBean.class);

            // 内容请求报文转换之后为空
            if (StringTools.isNullOrEmpty(reqBean))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.XML_WRONG_ERROR, ErrorDescs.XML_WRONG_ERROR);
                return result;
            }

            // 报文请求参数是否为空
            // if (StringTools.isNullOrEmpty(reqBean.getBody())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getBody().getReqModuleInfo())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getBody().getReqModuleInfo().getProvince())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getBody().getReqModuleInfo().getCity()))
            // {
            // result =
            // BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR,
            // ErrorDescs.PARAM_NULL_ERROR);
            // return result;
            // }

            // 说明输入参数具体哪部分为空
            // 如果body为空
            if (StringTools.isNullOrEmpty(reqBean.getBody()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "body"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 如果info为空
            else if (StringTools.isNullOrEmpty(reqBean.getBody().getReqModuleInfo()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "info"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 输入参数为空
            else
            {
                String city = reqBean.getBody().getReqModuleInfo().getCity();
                String province = reqBean.getBody().getReqModuleInfo().getProvince();

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

            reqModule = reqBean.getBody().getReqModuleInfo();
            // 设置返回信息头
            rspHead = BusinessUtils.transformHead(reqBean.getHead());

            // 数据库交互查询楼层模块集合
            moduleList = moduleService.queryModule(reqModule);

            // 返回结果非空判断
            if (ListTools.isNullOrEmpty(moduleList))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.FLOOR_INFO_NULL_ERROR,
                        ErrorDescs.FLOOR_INFO_NULL_ERROR);
                return result;
            }

            // 返回 xml
            rspBean.setHead(rspHead);
            rspModuleList.setRspModuleInfo(moduleList);
            rspBody.setRspModuleList(rspModuleList);
            rspBean.setBody(rspBody);

            // 校验BEAN属性，将无值的属性初始化值
            BeanUtil.checkFieldValue(rspBean);

            // 接口返回信息转换
            Obj2Xml.obj2Xml(RspModuleBean.class, rspBean, out);
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

    public ModuleService getModuleService()
    {
        return moduleService;
    }

    public void setModuleService(ModuleService moduleService)
    {
        this.moduleService = moduleService;
    }

}
