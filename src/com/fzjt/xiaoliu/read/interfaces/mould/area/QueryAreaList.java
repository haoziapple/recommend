/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.area.QueryAreaList
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-12     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.mould.area;

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
import com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.req.ReqAreaBean;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.rsp.RspAreaBean;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.rsp.RspAreaBody;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.rsp.RspAreaInfo;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.area.bean.rsp.RspAreaList;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.area.service.AreaListService;
import com.fzjt.xiaoliu.read.interfaces.util.BeanUtil;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.Constant;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;
import com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 查询行政区域列表
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.area.QueryAreaList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-12 下午7:31:16
 * @author:LiangJin
 */
public class QueryAreaList
{
    /**
     * 日誌
     */
    private static final Logger logger = Logger.getLogger(QueryAreaList.class);

    /**
     * service业务类
     */
    private AreaListService areaListService;

    /**
     * 查询行政区域列表
     * 
     * @Description:
     * @param servletRequest
     * @param obj
     * @param cont
     * @return String
     * @version:v1.0
     * @author:LiangJin
     * @date:2015-11-12 下午8:16:05
     */
    public String interfaceProcess(ServletRequest servletRequest, Document obj, AbstractApplicationContext cont)
    {
        // 定义业务bean
        ReqAreaBean reqBean = null;
        RspAreaBean rspBean = new RspAreaBean();
        RspAreaBody rspBody = new RspAreaBody();
        RspAreaList rspList = new RspAreaList();
        List<RspAreaInfo> list = null;
        RspHead rspHead = null;

        // 接口响应信息
        String result = "";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        areaListService = (AreaListService) cont.getBean("areaListService");

        try
        {
            // xml转换成 业务 bean
            reqBean = (ReqAreaBean) Obj2Xml.xml2Obj(obj.asXML(), ReqAreaBean.class);
            if (StringTools.isNullOrEmpty(reqBean))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.XML_WRONG_ERROR, ErrorDescs.XML_WRONG_ERROR);
                return result;
            }

            // 设置返回信息头
            rspHead = BusinessUtils.transformHead(reqBean.getHead());

            // 非空判断
            // if (StringTools.isNullOrEmpty(reqBean.getReqAreaBody())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqAreaBody().getReqAreaInfo())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqAreaBody().getReqAreaInfo().getAreaKey()))
            // {
            // result =
            // BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR,
            // ErrorDescs.PARAM_NULL_ERROR);
            // return result;
            // }
            //
            // String areaKey =
            // reqBean.getReqAreaBody().getReqAreaInfo().getAreaKey();

            String areaKey = "";
            // 说明输入参数具体哪部分为空
            // 如果body为空
            if (StringTools.isNullOrEmpty(reqBean.getReqAreaBody()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "body"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 如果info为空
            else if (StringTools.isNullOrEmpty(reqBean.getReqAreaBody().getReqAreaInfo()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "info"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 输入参数为空
            else
            {
                areaKey = reqBean.getReqAreaBody().getReqAreaInfo().getAreaKey();

                if (StringTools.isNullOrEmpty(areaKey))
                {
                    result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "areakey"
                            + ErrorDescs.PARAM_NULL_ERROR);
                    return result;
                }
            }

            // 根据areaKey的值判断 执行if分支
            if (Constant.STRING_NAME.equals(areaKey))
            {
                list = areaListService.queryAreaAllList();
            }
            else
            {
                list = areaListService.queryAreaList(areaKey);
            }

            // 判断返回结果是否为空
            if (ListTools.isNullOrEmpty(list))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.AREA_INFO_NULL_ERROR,
                        ErrorDescs.AREA_INFO_NULL_ERROR);
                return result;
            }

            // 返回xml
            rspBean.setHead(rspHead);
            rspList.setRspAreaInfo(list);
            rspBody.setRspAreaList(rspList);
            rspBean.setRspAreaBody(rspBody);

            // 校验BEAN属性，将无值的属性初始化值
            BeanUtil.checkFieldValue(rspBean);

            // 接口返回信息转换
            Obj2Xml.obj2Xml(RspAreaBean.class, rspBean, out);
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

    public AreaListService getAreaListService()
    {
        return areaListService;
    }

    public void setAreaListService(AreaListService areaListService)
    {
        this.areaListService = areaListService;
    }

}
