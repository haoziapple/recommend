/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.sku.QuerySkuListBySkyName
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-12    TangKai       v1.0.0        create
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
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuList.req.ReqSkuListBean;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuList.rsp.RspSkuListBean;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuList.rsp.RspSkuListBody;
import com.fzjt.xiaoliu.read.interfaces.business.sku.service.GoodsSkuService;
import com.fzjt.xiaoliu.read.interfaces.util.BeanUtil;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 根据给定的起始与截止条数，查询特定skuname和商品类型的商品信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.sku.QuerySkuListBySkyName
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-12 下午7:30:00
 * @author:TangKai
 */
public class QuerySkuListBySkyName
{

    // 日志
    private static final Logger logger = Logger.getLogger(QuerySkuListBySkyName.class);

    // sku信息获取service
    private GoodsSkuService goodsSkuService;

    /**
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
        ReqSkuListBean reqBean = null;

        RspSkuListBean rspBean = new RspSkuListBean();
        RspSkuListBody rspBody = null;

        RspHead rspHead = null;

        // 返回信息
        String result = "";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        goodsSkuService = (GoodsSkuService) cont.getBean("goodsSkuService");

        // xml转换成 业务 bean
        try
        {
            // 讲请求报文转换为JavaBean
            reqBean = (ReqSkuListBean) Obj2Xml.xml2Obj(obj.asXML(), ReqSkuListBean.class);

            // 内容请求报文转换之后为空
            if (StringTools.isNullOrEmpty(reqBean))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.XML_WRONG_ERROR, ErrorDescs.XML_WRONG_ERROR);
                return result;
            }

            // 设置返回信息头
            rspHead = BusinessUtils.transformHead(reqBean.getHead());

            // 非空校验
            // if (StringTools.isNullOrEmpty(reqBean.getReqSkuListBody())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqSkuListBody().getSkuListInfo())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqSkuListBody().getSkuListInfo().getSkuName())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqSkuListBody().getSkuListInfo().getTypeKey()))
            // {
            // result =
            // BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR,
            // ErrorDescs.PARAM_NULL_ERROR);
            // return result;
            // }

            // 说明输入参数具体哪部分为空
            // 如果body为空
            if (StringTools.isNullOrEmpty(reqBean.getReqSkuListBody()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "body"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 如果info为空
            else if (StringTools.isNullOrEmpty(reqBean.getReqSkuListBody().getSkuListInfo()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "info"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 输入参数为空
            else
            {
                String skuName = reqBean.getReqSkuListBody().getSkuListInfo().getSkuName();
                String typeKey = reqBean.getReqSkuListBody().getSkuListInfo().getTypeKey();

                if (StringTools.isNullOrEmpty(skuName))
                {
                    result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "skuname"
                            + ErrorDescs.PARAM_NULL_ERROR);
                    return result;
                }
                else if (StringTools.isNullOrEmpty(typeKey))
                {
                    result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "typekey"
                            + ErrorDescs.PARAM_NULL_ERROR);
                    return result;
                }
            }

            // 数据库交互，获取返回信息
            rspBody = goodsSkuService.querySkuListList(reqBean.getReqSkuListBody());

            // 返回结果非空验证
            if (StringTools.isNullOrEmpty(rspBody))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.SKU_INFO_NULL_ERROR, ErrorDescs.SKU_INFO_NULL_ERROR);
                return result;
            }

            // 返回信息Javabean封装
            rspBean.setRspSkuListBody(rspBody);
            rspBean.setHead(rspHead);

            // 校验BEAN属性，将无值的属性初始化值
            BeanUtil.checkFieldValue(rspBean);

            // 返回Javabean转换为xml报文
            Obj2Xml.obj2Xml(RspSkuListBean.class, rspBean, out);
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

    public static Logger getLogger()
    {
        return logger;
    }

    public GoodsSkuService getGoodsSkuService()
    {
        return goodsSkuService;
    }

    public void setGoodsSkuService(GoodsSkuService goodsSkuService)
    {
        this.goodsSkuService = goodsSkuService;
    }

}
