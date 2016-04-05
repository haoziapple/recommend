/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.sku.QueryPropertyByTypeKey
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-13     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.mould.sku;

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
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.req.ReqPropertyBean;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.rsp.RspPropertyBean;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.property.rsp.RspPropertyBody;
import com.fzjt.xiaoliu.read.interfaces.business.sku.service.GoodsSkuService;
import com.fzjt.xiaoliu.read.interfaces.util.BeanUtil;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 根据商品goodskey查询商品特征量
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.sku.QueryPropertyByGoodsKey
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-13 下午7:39:31
 * @author:TangKai
 */
public class QueryPropertyByGoodsKey
{

    // 日志
    private static final Logger logger = Logger.getLogger(QueryPropertyByGoodsKey.class);

    // skuList查询service
    private GoodsSkuService goodsSkuService;

    /**
     * 根据商品goodskey查询商品特征量
     * 
     * @Description:
     * @param servletRequest
     * @param obj
     * @param cont
     * @return
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-12 下午7:33:33
     */
    public String interfaceProcess(ServletRequest servletRequest, Document obj, AbstractApplicationContext cont)
    {
        // 定义变量
        ReqPropertyBean reqBean = null;

        RspPropertyBean rspBean = new RspPropertyBean();
        RspPropertyBody rspBody = null;

        RspHead rspHead = null;

        // 返回信息
        String result = "";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        goodsSkuService = (GoodsSkuService) cont.getBean("goodsSkuService");

        // xml转换成 业务 bean
        try
        {
            // 讲请求报文转换为JavaBean
            reqBean = (ReqPropertyBean) Obj2Xml.xml2Obj(obj.asXML(), ReqPropertyBean.class);

            // 内容请求报文转换之后为空
            if (StringTools.isNullOrEmpty(reqBean))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.XML_WRONG_ERROR, ErrorDescs.XML_WRONG_ERROR);
                return result;
            }

            // 设置返回信息头
            rspHead = BusinessUtils.transformHead(reqBean.getHead());

            // // 非空校验
            // if (StringTools.isNullOrEmpty(reqBean.getReqPropertyBody())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqPropertyBody().getReqPropertyInfo())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqPropertyBody().getReqPropertyInfo().getGoodsKey()))
            // {
            // result =
            // BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR,
            // ErrorDescs.PARAM_NULL_ERROR);
            // return result;
            // }
            //
            // // 返回商品goodskey
            // String goodsKey =
            // StringTools.removeSpace(reqBean.getReqPropertyBody().getReqPropertyInfo().getGoodsKey());

            String goodsKey = "";
            // 说明输入参数具体哪部分为空
            // 如果body为空
            if (StringTools.isNullOrEmpty(reqBean.getReqPropertyBody()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "body"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 如果info为空
            else if (StringTools.isNullOrEmpty(reqBean.getReqPropertyBody().getReqPropertyInfo()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "info"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 输入参数为空
            else
            {
                goodsKey = reqBean.getReqPropertyBody().getReqPropertyInfo().getGoodsKey();

                if (StringTools.isNullOrEmpty(goodsKey))
                {
                    result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "goodskey"
                            + ErrorDescs.PARAM_NULL_ERROR);
                    return result;
                }
            }

            // 数据库交互，获取返回信息
            rspBody = goodsSkuService.queryPListByGoodsKey(goodsKey);

            // 判断获取的PList是否为空
            if (StringTools.isNullOrEmpty(rspBody))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PV_INFO_NULL_ERROR, ErrorDescs.PV_INFO_NULL_ERROR);
                return result;
            }

            // 返回信息Javabean封装
            rspBean.setRspPropertyBody(rspBody);
            rspBean.setHead(rspHead);

            // 校验BEAN属性，将无值的属性初始化值
            BeanUtil.checkFieldValue(rspBean);

            // 返回Javabean转换为xml报文
            Obj2Xml.obj2Xml(RspPropertyBean.class, rspBean, out);
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

    public GoodsSkuService getGoodsSkuService()
    {
        return goodsSkuService;
    }

    public void setGoodsSkuService(GoodsSkuService goodsSkuService)
    {
        this.goodsSkuService = goodsSkuService;
    }

    public static Logger getLogger()
    {
        return logger;
    }

}
