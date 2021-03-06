/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.goods.QueryGoodsDetByGoodsKey
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-9     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.mould.goods;

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
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.detail.rsp.RspGoodsDetBean;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.detail.rsp.RspGoodsDetBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.detail.rsp.RspGoodsDetInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.info.req.ReqGoodsObjBean;
import com.fzjt.xiaoliu.read.interfaces.business.goods.service.GoodsService;
import com.fzjt.xiaoliu.read.interfaces.util.BeanUtil;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 通过goodskey查询商品详情
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.goods.QueryGoodsDetByGoodsKey
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-10 下午5:12:45
 * @author:LiangJin
 */
public class QueryGoodsDetByKey
{
    /**
     * 日志
     */
    private static final Logger logger = Logger.getLogger(QueryGoodsDetByKey.class);

    /**
     * 商品模块Service
     */
    private GoodsService goodsService;

    /**
     * 通过goodskey查询商品详情
     * 
     * @Description:
     * @param servletRequest
     * @param obj
     * @param cont
     * @return String
     * @version:v1.0
     * @author:LiangJin
     * @date:2015-11-10 下午5:12:57
     */
    public String interfaceProcess(ServletRequest servletRequest, Document obj, AbstractApplicationContext cont)
    {
        // 定义业务bean
        ReqGoodsObjBean reqBean = null;
        RspGoodsDetBean rspBean = new RspGoodsDetBean();
        RspGoodsDetBody rspBody = new RspGoodsDetBody();
        RspHead rspHead = null;
        RspGoodsDetInfo rspGoodsDetInfo = null;

        // 接口响应信息
        String result = "";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        goodsService = (GoodsService) cont.getBean("goodsService");
        try
        {
            // xml转换成 业务 bean
            reqBean = (ReqGoodsObjBean) Obj2Xml.xml2Obj(obj.asXML(), ReqGoodsObjBean.class);
            if (StringTools.isNullOrEmpty(reqBean))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.XML_WRONG_ERROR, ErrorDescs.XML_WRONG_ERROR);
                return result;
            }

            // 设置返回信息头
            rspHead = BusinessUtils.transformHead(reqBean.getHead());

            // 非空校验
            // if (StringTools.isNullOrEmpty(reqBean.getReqGoodsBody())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqGoodsBody().getGoodsKeyInfo())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqGoodsBody().getGoodsKeyInfo().getGoodsKey()))
            // {
            // result =
            // BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR,
            // ErrorDescs.PARAM_NULL_ERROR);
            // return result;
            // }
            //
            // // 获取查询goodskey
            // String goodsKey =
            // reqBean.getReqGoodsBody().getGoodsKeyInfo().getGoodsKey();

            String goodsKey = "";

            // 说明输入参数具体哪部分为空
            // 如果body为空
            if (StringTools.isNullOrEmpty(reqBean.getReqGoodsBody()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "body"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 如果info为空
            else if (StringTools.isNullOrEmpty(reqBean.getReqGoodsBody().getGoodsKeyInfo()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "info"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 输入参数为空
            else
            {
                // 获取查询goodskey
                goodsKey = reqBean.getReqGoodsBody().getGoodsKeyInfo().getGoodsKey();

                if (StringTools.isNullOrEmpty(goodsKey))
                {
                    result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "goodskey"
                            + ErrorDescs.PARAM_NULL_ERROR);
                    return result;
                }
            }

            // 业务处理，回去返回goods信息
            rspGoodsDetInfo = goodsService.queryGoodsDetByGoodsKey(goodsKey);

            // 如果获取商品信息为空
            if (StringTools.isNullOrEmpty(rspGoodsDetInfo))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.GOODS_INFO_NULL_ERROR,
                        ErrorDescs.GOODS_INFO_NULL_ERROR);
                return result;
            }

            // 返回 xml
            rspBean.setHead(rspHead);
            rspBody.setRspGoodsDetInfo(rspGoodsDetInfo);
            rspBean.setRspGoodsDetBody(rspBody);

            // 校验BEAN属性，将无值的属性初始化值
            BeanUtil.checkFieldValue(rspBean);

            // 接口返回信息转换
            Obj2Xml.obj2Xml(RspGoodsDetBean.class, rspBean, out);
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

    public GoodsService getGoodsService()
    {
        return goodsService;
    }

    public void setGoodsService(GoodsService goodsService)
    {
        this.goodsService = goodsService;
    }

}
