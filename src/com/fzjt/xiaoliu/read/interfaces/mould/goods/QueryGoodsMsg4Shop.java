/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.goods.QueryGoodsMsg4Shop
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiChangjiang
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015年11月23日     LiChangjiang       v1.0.0        create
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
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.req.ReqMsg4ShopBean;
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.rsp.RspMsgBean4Shop;
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.bean.shop.rsp.RspMsgBody4Shop;
import com.fzjt.xiaoliu.read.interfaces.business.goods.msg.service.MsgService;
import com.fzjt.xiaoliu.read.interfaces.util.BeanUtil;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 商家自助平台查询用户咨询信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.goods.QueryGoodsMsg4Shop
 * @description:TODO
 * @version:v1.0.0
 * @date:2015年11月23日 下午10:21:37
 * @author:LiChangjiang
 */
public class QueryGoodsMsg4Shop
{
    /**
     * 日志
     */
    private static final Logger logger = Logger.getLogger(QueryGoodsMsg.class);

    /**
     * 咨询业务service
     */
    private MsgService msgService;

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
     * @date:2015年11月23日 下午10:24:02
     */
    public String interfaceProcess(ServletRequest servletRequest, Document obj, AbstractApplicationContext cont)
    {
        ReqMsg4ShopBean reqBean = null;
        RspMsgBean4Shop rspBean = new RspMsgBean4Shop();
        RspMsgBody4Shop rspBody = null;

        RspHead rspHead = null;
        // 接口响应信息
        String result = "";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        msgService = (MsgService) cont.getBean("msgService");

        try
        {
            // xml转换成 业务 bean
            reqBean = (ReqMsg4ShopBean) Obj2Xml.xml2Obj(obj.asXML(), ReqMsg4ShopBean.class);
            if (StringTools.isNullOrEmpty(reqBean))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.XML_WRONG_ERROR, ErrorDescs.XML_WRONG_ERROR);
                return result;
            }

            // 设置返回信息头
            rspHead = BusinessUtils.transformHead(reqBean.getHead());

            // 非空判断
            // if (StringTools.isNullOrEmpty(reqBean.getReqBody())
            // || StringTools.isNullOrEmpty(reqBean.getReqBody().getReqInfo())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqBody().getReqInfo().getReplyType())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqBody().getReqInfo().getShopKey()))
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
                String replyType = reqBean.getReqBody().getReqInfo().getReplyType();
                String shopKey = reqBean.getReqBody().getReqInfo().getShopKey();

                if (StringTools.isNullOrEmpty(replyType))
                {
                    result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "replytype"
                            + ErrorDescs.PARAM_NULL_ERROR);
                    return result;
                }
                else if (StringTools.isNullOrEmpty(shopKey))
                {
                    result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "shopkey"
                            + ErrorDescs.PARAM_NULL_ERROR);
                    return result;
                }
            }

            // 业务处理类
            rspBody = msgService.queryGoodsMsg4Shop(reqBean.getReqBody());

            // 如果获取商品信息为空
            if (StringTools.isNullOrEmpty(rspBody))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.GOODS_INFO_NULL_ERROR,
                        ErrorDescs.GOODS_INFO_NULL_ERROR);
                return result;
            }

            // 返回xml
            rspBean.setHead(rspHead);
            rspBean.setRspBody(rspBody);

            // 校验BEAN属性，将无值的属性初始化值
            BeanUtil.checkFieldValue(rspBean);

            // 接口返回信息转换
            Obj2Xml.obj2Xml(RspMsgBean4Shop.class, rspBean, out);
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

    /**
     * @return the msgService
     */
    public MsgService getMsgService()
    {
        return msgService;
    }

    /**
     * @param msgService
     *            the msgService to set
     */
    public void setMsgService(MsgService msgService)
    {
        this.msgService = msgService;
    }

}
