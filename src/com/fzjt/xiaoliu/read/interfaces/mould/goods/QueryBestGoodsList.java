/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.goods.QueryBestGoodsList
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-19     TangKai       v1.0.0        create
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
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.req.ReqRecommendBean;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.rsp.RspRecommendBean;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.recommend.rsp.RspRecommendBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.service.GoodsService;
import com.fzjt.xiaoliu.read.interfaces.util.BeanUtil;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 猜你喜欢，查询推荐商品列表
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.goods.QueryBestGoodsList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-19 下午1:44:24
 * @author:TangKai
 */
public class QueryBestGoodsList
{
    /**
     * 日志
     */
    private static final Logger logger = Logger.getLogger(QueryBestGoodsList.class);

    /**
     * 商品模块Service
     */
    private GoodsService goodsService;

    /**
     * 查询推荐商品列表
     * 
     * @Description:
     * @param servletRequest
     * @param obj
     * @param cont
     * @return
     * @version:v1.0
     * @author:TangKai
     * @date:2015-11-19 下午1:44:54
     */
    public String interfaceProcess(ServletRequest servletRequest, Document obj, AbstractApplicationContext cont)
    {
        // 获取service
        goodsService = (GoodsService) cont.getBean("goodsService");

        // 获取业务bean
        ReqRecommendBean reqBean = null;
        RspRecommendBean rspBean = new RspRecommendBean();
        RspHead rspHead = null;

        // 返回业务bean
        RspRecommendBody rspBody = new RspRecommendBody();

        // 接口返回信息
        String result = "";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try
        {
            // xml转换成 业务 bean
            reqBean = (ReqRecommendBean) Obj2Xml.xml2Obj(obj.asXML(), ReqRecommendBean.class);

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
            // || StringTools.isNullOrEmpty(reqBean.getReqBody().getInfo())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqBody().getInfo().getProvince())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqBody().getInfo().getCity()))
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
            else if (StringTools.isNullOrEmpty(reqBean.getReqBody().getInfo()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "info"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 输入参数为空
            else
            {
                String province = reqBean.getReqBody().getInfo().getProvince();
                String city = reqBean.getReqBody().getInfo().getCity();

                if (StringTools.isNullOrEmpty(province))
                {
                    result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "province"
                            + ErrorDescs.PARAM_NULL_ERROR);
                    return result;
                }
                else if (StringTools.isNullOrEmpty(city))
                {
                    result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "city"
                            + ErrorDescs.PARAM_NULL_ERROR);
                    return result;
                }
            }

            // 1.查询最近浏览商品信息
            // 2.设置最近浏览商品显示数量
            rspBody = goodsService.queryRecommendGoods(reqBean.getReqBody());
            if (!StringTools.isNullOrEmpty(rspBody.getRspList()))
            {
                rspBody.setCount(String.valueOf(rspBody.getRspList().getInfo().size()));
            }

            // 判断返回结果是否为空
            if (StringTools.isNullOrEmpty(rspBody))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.GOODS_INFO_NULL_ERROR,
                        ErrorDescs.GOODS_INFO_NULL_ERROR);
                return result;
            }

            rspBean.setHead(rspHead);
            rspBean.setRspBody(rspBody);

            // 校验BEAN属性，将无值的属性初始化值
            BeanUtil.checkFieldValue(rspBean);

            // 接口返回信息转换
            Obj2Xml.obj2Xml(RspRecommendBean.class, rspBean, out);
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
