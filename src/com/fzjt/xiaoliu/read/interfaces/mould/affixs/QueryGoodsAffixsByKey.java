/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.affixs.QueryGoodsAffixsByKey
 * 
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-17     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.mould.affixs;

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
import com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.goods.req.ReqGoodsAffixBean;
import com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.rsp.RspAffixesBean;
import com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.rsp.RspAffixesBody;
import com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.rsp.RspAffixesInfo;
import com.fzjt.xiaoliu.read.interfaces.business.affixs.bean.sku.rsp.RspAffixesList;
import com.fzjt.xiaoliu.read.interfaces.business.affixs.service.AffixesService;
import com.fzjt.xiaoliu.read.interfaces.util.BeanUtil;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 根据商品goodskey查询商品附件信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.affixs.QueryGoodsAffixsByKey
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-17 上午11:30:08
 * @author:TangKai
 */
public class QueryGoodsAffixsByKey
{
    /**
     * 日誌
     */
    private static final Logger logger = Logger.getLogger(QueryGoodsAffixsByKey.class);

    /**
     * service业务类
     */
    private AffixesService affixesService;

    /**
     * 根据商品goodskey查询商品附件信息
     * 
     * @Description:
     * @param servletRequest
     * @param obj
     * @param cont
     * @return String
     * @version:v1.0
     * @author:LiangJin
     * @date:2015-11-14 下午4:46:07
     */

    /**
     * @Description:
     * @param servletRequest
     * @param obj
     * @param cont
     * @return
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-7 下午1:24:07
     */
    public String interfaceProcess(ServletRequest servletRequest, Document obj, AbstractApplicationContext cont)
    {
        // 定义业务bean
        ReqGoodsAffixBean reqBean = null;
        RspAffixesBean rspBean = new RspAffixesBean();
        RspAffixesBody rspBody = new RspAffixesBody();
        RspAffixesList rspList = new RspAffixesList();
        List<RspAffixesInfo> list = null;
        RspHead rspHead = null;

        // 接口响应信息
        String result = "";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        affixesService = (AffixesService) cont.getBean("affixesService");

        try
        {
            // xml转换成 业务 bean
            reqBean = (ReqGoodsAffixBean) Obj2Xml.xml2Obj(obj.asXML(), ReqGoodsAffixBean.class);
            if (StringTools.isNullOrEmpty(reqBean))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.XML_WRONG_ERROR, ErrorDescs.XML_WRONG_ERROR);
                return result;
            }

            // 设置返回信息头
            rspHead = BusinessUtils.transformHead(reqBean.getHead());

            // 非空判断
            // if (StringTools.isNullOrEmpty(reqBean.getReqGoodsAffixBody())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqGoodsAffixBody().getReqGoodsAffixInfo())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqGoodsAffixBody().getReqGoodsAffixInfo().getGoodsKey()))
            // {
            //
            // result =
            // BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR,
            // ErrorDescs.PARAM_NULL_ERROR);
            // return result;
            // }
            //
            // String goodsKey =
            // reqBean.getReqGoodsAffixBody().getReqGoodsAffixInfo().getGoodsKey();

            String goodsKey = "";
            // 说明输入参数具体哪部分为空
            // 如果body为空
            if (StringTools.isNullOrEmpty(reqBean.getReqGoodsAffixBody()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "body"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 如果info为空
            else if (StringTools.isNullOrEmpty(reqBean.getReqGoodsAffixBody().getReqGoodsAffixInfo()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "info"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 输入参数为空
            else
            {
                goodsKey = reqBean.getReqGoodsAffixBody().getReqGoodsAffixInfo().getGoodsKey();

                if (StringTools.isNullOrEmpty(goodsKey))
                {
                    result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "goodskey"
                            + ErrorDescs.PARAM_NULL_ERROR);
                    return result;
                }
            }

            // 业务处理
            list = affixesService.queryGoodsAffixByKey(goodsKey);

            // 如果获取商品信息为空
            if (StringTools.isNullOrEmpty(list))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.AFFIXES_INFO_NULL_ERROR,
                        ErrorDescs.AFFIXES_INFO_NULL_ERROR);
                return result;
            }

            // 返回xml
            rspBean.setHead(rspHead);
            rspList.setRspAffixesInfo(list);
            rspBody.setRspAffixesList(rspList);
            rspBean.setRspAffixesBody(rspBody);

            // 校验BEAN属性，将无值的属性初始化值
            BeanUtil.checkFieldValue(rspBean);

            // 接口返回信息转换
            Obj2Xml.obj2Xml(RspAffixesBean.class, rspBean, out);
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

    public AffixesService getAffixesService()
    {
        return affixesService;
    }

    public void setAffixesService(AffixesService affixesService)
    {
        this.affixesService = affixesService;
    }

}
