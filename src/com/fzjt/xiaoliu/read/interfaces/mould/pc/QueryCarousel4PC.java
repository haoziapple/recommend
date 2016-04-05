/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.pc.QueryCarousel4PC
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-2     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.mould.pc;

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
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.turn.req.ReqTurnBean;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.turn.rsp.RspTurnBean;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.turn.rsp.RspTurnBody;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.turn.rsp.RspTurnInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.turn.rsp.RspTurnList;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.service.HomeService;
import com.fzjt.xiaoliu.read.interfaces.util.BeanUtil;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;
import com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 查询pc首页轮播图片集合
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.pc.QueryCarousel4PC
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-2 下午1:44:24
 * @author:LiangJin
 */
public class QueryCarousel4PC
{
    /**
     * 日志
     */
    private static final Logger logger = Logger.getLogger(QueryCarousel4PC.class);

    /**
     * 轮播图片Service
     */
    private HomeService homeService;

    /**
     * 查询pc首页轮播图片集合
     * 
     * @Description:
     * @param servletRequest
     * @param obj
     * @param cont
     * @return
     * @version:v1.0
     * @author:LiangJin
     * @date:2015-12-2 下午1:45:02
     */
    public String interfaceProcess(ServletRequest servletRequest, Document obj, AbstractApplicationContext cont)
    {
        // 定义业务bean
        ReqTurnBean reqBean = null;
        RspTurnBean rspBean = new RspTurnBean();
        RspTurnBody rspBody = new RspTurnBody();
        List<RspTurnInfo> list = null;
        RspTurnList rspList = new RspTurnList();
        RspHead rspHead = null;

        // 接口响应信息
        String result = "";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        homeService = (HomeService) cont.getBean("homeService");

        try
        {
            // xml转换成 业务 bean
            reqBean = (ReqTurnBean) Obj2Xml.xml2Obj(obj.asXML(), ReqTurnBean.class);

            // 判断请求参数是否确实
            if (StringTools.isNullOrEmpty(reqBean))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.XML_WRONG_ERROR, ErrorDescs.XML_WRONG_ERROR);
                return result;
            }

            // 设置返回信息头
            rspHead = BusinessUtils.transformHead(reqBean.getHead());

            // 判断请求参数完整时
            // if (StringTools.isNullOrEmpty(reqBean.getReqTurnBody())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqTurnBody().getReqTurnInfo())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqTurnBody().getReqTurnInfo().getProvince())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqTurnBody().getReqTurnInfo().getCity()))
            // {
            // result =
            // BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR,
            // ErrorDescs.PARAM_NULL_ERROR);
            // return result;
            // }

            // 说明输入参数具体哪部分为空
            // 如果body为空
            if (StringTools.isNullOrEmpty(reqBean.getReqTurnBody()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "body"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 如果info为空
            else if (StringTools.isNullOrEmpty(reqBean.getReqTurnBody().getReqTurnInfo()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "info"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 输入参数为空
            else
            {
                String city = reqBean.getReqTurnBody().getReqTurnInfo().getCity();
                String province = reqBean.getReqTurnBody().getReqTurnInfo().getProvince();

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

            // 数据库交互，查询轮播图片集合
            list = homeService.queryTurnInfo(reqBean.getReqTurnBody().getReqTurnInfo());

            // 返回信息非空判断
            if (ListTools.isNullOrEmpty(list))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.BOTTOM_INFO_NULL_ERROR,
                        ErrorDescs.BOTTOM_INFO_NULL_ERROR);
                return result;
            }

            // 返回 xml
            rspBean.setHead(rspHead);
            rspList.setRspTurnInfo(list);
            rspBody.setRspTurnList(rspList);
            rspBean.setRspTurnBody(rspBody);

            // 校验BEAN属性，将无值的属性初始化值
            BeanUtil.checkFieldValue(rspBean);

            // 接口返回信息转换
            Obj2Xml.obj2Xml(RspTurnBean.class, rspBean, out);
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

    public HomeService getHomeService()
    {
        return homeService;
    }

    public void setHomeService(HomeService homeService)
    {
        this.homeService = homeService;
    }

}
