/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.promotion.QueryPromotionList
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-9     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.mould.promotion;

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
import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.req.ReqPromotionBean;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.rsp.RspPromotionBean;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.bean.info.rsp.RspPromotionBody;
import com.fzjt.xiaoliu.read.interfaces.business.promotion.service.PromotionService;
import com.fzjt.xiaoliu.read.interfaces.util.BeanUtil;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 查询促销活动信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.promotion.QueryPromotionList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-9 上午11:21:19
 * @author:TangKai
 */
public class QueryPromotionList
{
    /**
     * 日志
     */
    private static final Logger logger = Logger.getLogger(QueryPromotionList.class);

    /**
     * 活动模块Service
     */
    private PromotionService promotionService;

    /**
     * 查询活动信息
     * 
     * @Description:
     * @param servletRequest
     * @param obj
     * @param cont
     * @return
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-9 上午11:21:04
     */
    public String interfaceProcess(ServletRequest servletRequest, Document obj, AbstractApplicationContext cont)
    {
        // 获取service
        promotionService = (PromotionService) cont.getBean("promotionService");

        // 获取业务bean
        ReqPromotionBean reqBean = null;
        RspPromotionBean rspBean = new RspPromotionBean();
        RspHead rspHead = null;

        // 返回业务bean
        RspPromotionBody rspBody = null;

        // 接口返回信息
        String result = "";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try
        {
            // xml转换成 业务 bean
            reqBean = (ReqPromotionBean) Obj2Xml.xml2Obj(obj.asXML(), ReqPromotionBean.class);

            // 验证数据完整性
            if (StringTools.isNullOrEmpty(reqBean))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.XML_WRONG_ERROR, ErrorDescs.XML_WRONG_ERROR);
                return result;
            }

            // 设置返回信息头
            rspHead = BusinessUtils.transformHead(reqBean.getHead());
            // 请求信息非空判断
            // if (StringTools.isNullOrEmpty(reqBean.getReqBody())
            // || StringTools.isNullOrEmpty(reqBean.getReqBody().getReqInfo())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqBody().getReqInfo().getCity())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqBody().getReqInfo().getProvince()))
            // {
            // result =
            // BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR,
            // ErrorDescs.PARAM_NULL_ERROR);
            // return result;
            // }

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
                String city = reqBean.getReqBody().getReqInfo().getCity();
                String province = reqBean.getReqBody().getReqInfo().getProvince();

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

            // 查询活动信息
            rspBody = promotionService.queryPromotionList(reqBean.getReqBody());

            // 判断返回结果是否为空
            if (StringTools.isNullOrEmpty(rspBody))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PROMOTION_INFO_NULL_ERROR,
                        ErrorDescs.PROMOTION_INFO_NULL_ERROR);
                return result;
            }

            rspBean.setHead(rspHead);
            rspBean.setRspBody(rspBody);

            // 校验BEAN属性，将无值的属性初始化值
            BeanUtil.checkFieldValue(rspBean);

            // 接口返回信息转换
            Obj2Xml.obj2Xml(RspPromotionBean.class, rspBean, out);
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

    public PromotionService getPromotionService()
    {
        return promotionService;
    }

    public void setPromotionService(PromotionService promotionService)
    {
        this.promotionService = promotionService;
    }

}
