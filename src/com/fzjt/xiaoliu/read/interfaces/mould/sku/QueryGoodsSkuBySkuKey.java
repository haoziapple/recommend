/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.sku.QueryGoodsSkuBySkuKey
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-11    TangKai       v1.0.0        create
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
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuInfo.req.ReqGoodsSkuBean;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuInfo.rsp.RspGoodsSkuBean;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuInfo.rsp.RspGoodsSkuBody;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.skuInfo.rsp.RspGoodsSkuInfo;
import com.fzjt.xiaoliu.read.interfaces.business.sku.service.GoodsSkuService;
import com.fzjt.xiaoliu.read.interfaces.util.BeanUtil;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.sku.QueryGoodsSkuBySkuKey
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-11 下午4:19:36
 * @author:TangKai
 */
public class QueryGoodsSkuBySkuKey
{

    // 日志
    private static final Logger logger = Logger.getLogger(QueryGoodsSkuBySkuKey.class);

    // sku信息获取service
    private GoodsSkuService goodsSkuService;

    /**
     * 
     * @Description:
     * @param servletRequest
     * @param obj
     * @param cont
     * @return
     * @version:v1.0
     * @author:LiChangjiang
     * @date:2015-11-11 下午4:19:36
     */
    public String interfaceProcess(ServletRequest servletRequest, Document obj, AbstractApplicationContext cont)
    {

        // 业务bean
        ReqGoodsSkuBean reqBean = null;
        RspGoodsSkuBean rspBean = new RspGoodsSkuBean();
        RspGoodsSkuBody rspBody = new RspGoodsSkuBody();
        RspHead rspHead = null;
        RspGoodsSkuInfo rspGoodsSkuInfo = null;

        // 接口响应信息
        String result = "";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        goodsSkuService = (GoodsSkuService) cont.getBean("goodsSkuService");

        try
        {
            // xml转换成 业务 bean
            reqBean = (ReqGoodsSkuBean) Obj2Xml.xml2Obj(obj.asXML(), ReqGoodsSkuBean.class);
            if (StringTools.isNullOrEmpty(reqBean))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.XML_WRONG_ERROR, ErrorDescs.XML_WRONG_ERROR);
                return result;
            }

            // 设置返回信息头
            rspHead = BusinessUtils.transformHead(reqBean.getHead());

            // 请求信息非空判断
            // if (StringTools.isNullOrEmpty(reqBean.getReqGoodsSkuBody())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqGoodsSkuBody().getSkuKeyInfo())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqGoodsSkuBody().getSkuKeyInfo().getSkuKey()))
            // {
            // result =
            // BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR,
            // ErrorDescs.PARAM_NULL_ERROR);
            // return result;
            // }
            //
            // // 业务处理
            // String skuKey =
            // StringTools.removeSpace(reqBean.getReqGoodsSkuBody().getSkuKeyInfo().getSkuKey());

            String skuKey = "";
            // 说明输入参数具体哪部分为空
            // 如果body为空
            if (StringTools.isNullOrEmpty(reqBean.getReqGoodsSkuBody()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "body"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 如果info为空
            else if (StringTools.isNullOrEmpty(reqBean.getReqGoodsSkuBody().getSkuKeyInfo()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "info"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 输入参数为空
            else
            {
                skuKey = reqBean.getReqGoodsSkuBody().getSkuKeyInfo().getSkuKey();

                if (StringTools.isNullOrEmpty(skuKey))
                {
                    result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "skukey"
                            + ErrorDescs.PARAM_NULL_ERROR);
                    return result;
                }
            }

            rspGoodsSkuInfo = goodsSkuService.queryGoodsSkuInfoBySkuKey(skuKey);

            // 查询结果非空判断
            if (StringTools.isNullOrEmpty(rspGoodsSkuInfo))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.SKU_INFO_NULL_ERROR, ErrorDescs.SKU_INFO_NULL_ERROR);
                return result;
            }

            // 返回 xml
            rspBean.setHead(rspHead);
            rspBody.setRspGoodsSkuInfo(rspGoodsSkuInfo);
            rspBean.setRspGoodsSkuBody(rspBody);

            // 校验BEAN属性，将无值的属性初始化值
            BeanUtil.checkFieldValue(rspBean);

            // 接口返回信息转换
            Obj2Xml.obj2Xml(RspGoodsSkuBean.class, rspBean, out);
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
