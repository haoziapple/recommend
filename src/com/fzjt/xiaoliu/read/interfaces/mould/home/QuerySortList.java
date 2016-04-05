/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.QuerySortList
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-6     LiangJin       v1.0.0        create
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
import com.fzjt.xiaoliu.read.interfaces.business.home.sort.bean.req.ReqSortBean;
import com.fzjt.xiaoliu.read.interfaces.business.home.sort.bean.req.ReqSortInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.sort.bean.rsp.RspSortBean;
import com.fzjt.xiaoliu.read.interfaces.business.home.sort.bean.rsp.RspSortBody;
import com.fzjt.xiaoliu.read.interfaces.business.home.sort.bean.rsp.RspSortInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.sort.bean.rsp.RspSortList;
import com.fzjt.xiaoliu.read.interfaces.business.home.sort.service.SortService;
import com.fzjt.xiaoliu.read.interfaces.util.BeanUtil;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;
import com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 查询分类信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.sort.QuerySortList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-6 下午3:24:56
 * @author:LiangJin
 */
public class QuerySortList
{
    /**
     * 日志
     */
    private static final Logger logger = Logger.getLogger(QuerySortList.class);

    /**
     * 首页分类功能Service
     */
    private SortService sortService;

    /**
     * 接口处理方法
     * 
     * @Description:
     * @param servletRequest
     * @param obj
     * @param cont
     * @return
     * @version:v1.0
     * @author:LiChangjiang
     * @date:2015-11-7 下午4:20:41
     */
    public String interfaceProcess(ServletRequest servletRequest, Document obj, AbstractApplicationContext cont)
    {
        // 定义业务bean
        ReqSortBean reqBean = null;
        RspSortBean rspBean = new RspSortBean();
        RspSortBody rspBody = new RspSortBody();
        List<RspSortInfo> sortList = null;
        RspSortList rspsortList = new RspSortList();
        RspHead rspHead = null;

        ReqSortInfo reqSortInfo = null;

        // 接口响应信息
        String result = "";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        sortService = (SortService) cont.getBean("sortService");

        try
        {
            // xml转换成 业务 bean
            reqBean = (ReqSortBean) Obj2Xml.xml2Obj(obj.asXML(), ReqSortBean.class);

            // 内容请求报文转换之后为空
            if (StringTools.isNullOrEmpty(reqBean))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.XML_WRONG_ERROR, ErrorDescs.XML_WRONG_ERROR);
                return result;
            }

            // 判断请求参数完整时
            // if (StringTools.isNullOrEmpty(reqBean.getReqSortBody())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqSortBody().getReqSortInfo())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqSortBody().getReqSortInfo().getCity())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqSortBody().getReqSortInfo().getProvince()))
            // {
            // result =
            // BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR,
            // ErrorDescs.PARAM_NULL_ERROR);
            // return result;
            // }

            // 说明输入参数具体哪部分为空
            // 如果body为空
            if (StringTools.isNullOrEmpty(reqBean.getReqSortBody()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "body"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 如果info为空
            else if (StringTools.isNullOrEmpty(reqBean.getReqSortBody().getReqSortInfo()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "info"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 输入参数为空
            else
            {
                String city = reqBean.getReqSortBody().getReqSortInfo().getCity();
                String province = reqBean.getReqSortBody().getReqSortInfo().getProvince();

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

            // 设置返回信息头
            rspHead = BusinessUtils.transformHead(reqBean.getHead());

            reqSortInfo = reqBean.getReqSortBody().getReqSortInfo();

            // 数据库交互，查询首页分类
            sortList = sortService.querySortInfo(reqSortInfo);

            // 返回结果非空判断
            if (ListTools.isNullOrEmpty(sortList))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.SORT_INFO_NULL_ERROR,
                        ErrorDescs.SORT_INFO_NULL_ERROR);
                return result;
            }

            // 返回 xml
            rspBean.setHead(rspHead);
            rspsortList.setRspSortInfo(sortList);
            rspBody.setRspSortList(rspsortList);
            rspBean.setRspSortBody(rspBody);

            // 校验BEAN属性，将无值的属性初始化值
            BeanUtil.checkFieldValue(rspBean);

            // 接口返回信息转换
            Obj2Xml.obj2Xml(RspSortBean.class, rspBean, out);
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

    public SortService getSortService()
    {
        return sortService;
    }

    public void setSortService(SortService sortService)
    {
        this.sortService = sortService;
    }

}
