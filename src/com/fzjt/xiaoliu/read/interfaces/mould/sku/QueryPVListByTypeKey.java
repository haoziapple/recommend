/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.sku.QueryPVListByTypeKey
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-24     TangKai       v1.0.0        create
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
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.req.ReqPVListBean;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.rsp.RspPVListBean;
import com.fzjt.xiaoliu.read.interfaces.business.sku.bean.pvlist.rsp.RspPVListBody;
import com.fzjt.xiaoliu.read.interfaces.business.sku.service.GoodsSkuService;
import com.fzjt.xiaoliu.read.interfaces.util.BeanUtil;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 根据商品typekey查询特征量特征值list
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.sku.QueryPVListByTypeKey
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-24 下午1:58:35
 * @author:TangKai
 */
public class QueryPVListByTypeKey
{
    // 日志
    private static final Logger logger = Logger.getLogger(QueryPVListByTypeKey.class);

    // sku信息获取service
    private GoodsSkuService goodsSkuService;

    /**
     * 根据商品typekey查询特征量特征值list
     * 
     * @Description:根据商品typekey查询特征量特征值list
     * @param servletRequest
     * @param obj
     * @param cont
     * @return
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-24 下午1:59:11
     */
    public String interfaceProcess(ServletRequest servletRequest, Document obj, AbstractApplicationContext cont)
    {

        // 业务bean
        ReqPVListBean reqBean = new ReqPVListBean();
        RspPVListBean rspBean = new RspPVListBean();
        RspPVListBody rspBody = new RspPVListBody();
        RspHead rspHead = new RspHead();

        // 接口响应信息
        String result = "";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        goodsSkuService = (GoodsSkuService) cont.getBean("goodsSkuService");

        try
        {
            // xml转换成 业务 bean
            reqBean = (ReqPVListBean) Obj2Xml.xml2Obj(obj.asXML(), ReqPVListBean.class);
            if (StringTools.isNullOrEmpty(reqBean))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.XML_WRONG_ERROR, ErrorDescs.XML_WRONG_ERROR);
                return result;
            }

            // 设置返回信息头
            rspHead = BusinessUtils.transformHead(reqBean.getHead());

            // 请求信息非空验证
            // if (StringTools.isNullOrEmpty(reqBean.getReqPVListBody())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqPVListBody().getReqPVListInfo())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqPVListBody().getReqPVListInfo().getTypeKey()))
            // {
            // result =
            // BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR,
            // ErrorDescs.PARAM_NULL_ERROR);
            // return result;
            // }
            //
            // // 业务处理
            // String typeKey =
            // StringTools.removeSpace(reqBean.getReqPVListBody().getReqPVListInfo().getTypeKey());

            String typeKey = "";
            // 说明输入参数具体哪部分为空
            // 如果body为空
            if (StringTools.isNullOrEmpty(reqBean.getReqPVListBody()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "body"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 如果info为空
            else if (StringTools.isNullOrEmpty(reqBean.getReqPVListBody().getReqPVListInfo()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "info"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 输入参数为空
            else
            {
                typeKey = reqBean.getReqPVListBody().getReqPVListInfo().getTypeKey();

                if (StringTools.isNullOrEmpty(typeKey))
                {
                    result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "typekey"
                            + ErrorDescs.PARAM_NULL_ERROR);
                    return result;
                }
            }

            rspBody = goodsSkuService.queryPVListByTypeKey(typeKey);

            // 返回结果非空验证
            if (StringTools.isNullOrEmpty(rspBody))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PV_INFO_NULL_ERROR, ErrorDescs.PV_INFO_NULL_ERROR);
                return result;
            }

            // 返回 xml
            rspBean.setHead(rspHead);
            rspBean.setBody(rspBody);

            // 校验BEAN属性，将无值的属性初始化值
            BeanUtil.checkFieldValue(rspBean);

            // 接口返回信息转换
            Obj2Xml.obj2Xml(RspPVListBean.class, rspBean, out);
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
