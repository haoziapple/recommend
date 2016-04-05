/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.check.QueryGoodsCheckInfo
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-23     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.mould.check;

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
import com.fzjt.xiaoliu.read.interfaces.business.check.bean.RspCheckInfo;
import com.fzjt.xiaoliu.read.interfaces.business.check.bean.goods.req.ReqCheckGoodsBean;
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
 * 校验购买商品信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.check.QueryGoodsCheckInfo
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-23 下午5:08:24
 * @author:TangKai
 */
public class QueryGoodsCheckInfo
{
    private static final Logger logger = Logger.getLogger(QueryGoodsCheckInfo.class);

    private CheckService checkService;

    /**
     * 校验购买商品信息
     * 
     * @Description:
     * @param servletRequest
     * @param obj
     * @param cont
     * @return
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-23 下午5:09:09
     */
    public String interfaceProcess(ServletRequest servletRequest, Document obj, AbstractApplicationContext cont)
    {
        // 获取业务bean
        ReqCheckGoodsBean reqBean = new ReqCheckGoodsBean();

        // 获取返回Bean
        RspCheckBean rspBean = new RspCheckBean();
        RspCheckBody rspBody = new RspCheckBody();
        RspCheckInfo rspInfo = new RspCheckInfo();
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
            reqBean = (ReqCheckGoodsBean) Obj2Xml.xml2Obj(obj.asXML(), ReqCheckGoodsBean.class);

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
            // StringTools.isNullOrEmpty(reqBean.getReqBody().getReqInfo().getGoodsKey())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqBody().getReqInfo().getNum())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqBody().getReqInfo().getSkuKey())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqBody().getReqInfo().getUserKey()))
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
            if (StringTools.isNullOrEmpty(reqBean.getReqBody().getReqInfo()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "info"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 输入参数为空
            String userKey = reqBean.getReqBody().getReqInfo().getUserKey();
            String goodsKey = reqBean.getReqBody().getReqInfo().getGoodsKey();
            String num = reqBean.getReqBody().getReqInfo().getNum();
            String skuKey = reqBean.getReqBody().getReqInfo().getSkuKey();
            String style = reqBean.getReqBody().getReqInfo().getStyle();

            if (StringTools.isNullOrEmpty(userKey))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "userkey"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            else if (StringTools.isNullOrEmpty(goodsKey))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "goodskey"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            else if (StringTools.isNullOrEmpty(num))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "num"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            else if (StringTools.isNullOrEmpty(skuKey))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "skukey"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            else if (StringTools.isNullOrEmpty(style))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "style"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }

            // 调用service
            rspInfo = checkService.checkGoodsInfo(reqBean.getReqBody().getReqInfo());

            // 判断返回结果
            if (!StringTools.isNullOrEmpty(rspInfo))
            {
                // 非空时，设置返回头的返回码为错误码
                rspBody.setRspInfo(rspInfo);
                rspBean.setBody(rspBody);
                rspBean.setHead(rspHead);
                rspBean.getHead().setResultCode(rspInfo.getCheckInfo());
                rspBean.getHead().setResultDesc(rspInfo.getCheckDesc());
            }
            else
            {
                // 设置校验成功返回信息
                rspBody.setRspInfo(rspInfo);
                rspBean.setBody(rspBody);
                rspBean.setHead(rspHead);
            }

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

    public CheckService getCheckService()
    {
        return checkService;
    }

    public void setCheckService(CheckService checkService)
    {
        this.checkService = checkService;
    }

}