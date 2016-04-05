/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.goods.QueryGoodsType
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-13     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.mould.goods;

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
import com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.req.ReqTypeBean;
import com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.rsp.RspTypeBean;
import com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.rsp.RspTypeBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.rsp.RspTypeInfo;
import com.fzjt.xiaoliu.read.interfaces.business.goods.type.bean.rsp.RspTypeList;
import com.fzjt.xiaoliu.read.interfaces.business.goods.type.service.TypeService;
import com.fzjt.xiaoliu.read.interfaces.util.BeanUtil;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;
/**
 * 查询商品类别
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.goods.QueryGoodsType
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-11-13 下午2:48:31
 * @author:LiangJin
 */
public class QueryGoodsType
{
	/**
	 * 日誌
	 */
	private static final Logger logger = Logger.getLogger(QueryGoodsType.class);

	/**
	 * service业务类
	 */
	private TypeService typeService;
	/**
	 * 查询商品类别
	 * @Description:
	 * @param servletRequest
	 * @param obj
	 * @param cont
	 * @return String
	 * @version:v1.0
	 * @author:LiangJin
	 * @date:2015-11-13 下午2:48:35
	 */
	public String interfaceProcess(ServletRequest servletRequest, Document obj, AbstractApplicationContext cont)
	{
		// 定义业务bean
		ReqTypeBean reqBean = null;
		RspTypeBean rspBean = new RspTypeBean();
		RspTypeBody rspBody = new RspTypeBody();
		RspTypeList rspList = new RspTypeList();
		List<RspTypeInfo> list = null;
		RspHead rspHead = null;

		// 接口响应信息
		String result = "";

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		typeService = (TypeService) cont.getBean("typeService");

		try
		{
			// xml转换成 业务 bean
			reqBean = (ReqTypeBean) Obj2Xml.xml2Obj(obj.asXML(), ReqTypeBean.class);
			if (StringTools.isNullOrEmpty(reqBean))
			{
				result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.XML_WRONG_ERROR, ErrorDescs.XML_WRONG_ERROR);
				return result;
			}

			// 设置返回信息头
			rspHead = BusinessUtils.transformHead(reqBean.getHead());

			// 非空判断
//			if (StringTools.isNullOrEmpty(reqBean.getReqTypeBody())
//					|| StringTools.isNullOrEmpty(reqBean.getReqTypeBody().getReqTypeInfo())
//					|| StringTools.isNullOrEmpty(reqBean.getReqTypeBody().getReqTypeInfo().getTypeKey()))
//			{
//				result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, ErrorDescs.PARAM_NULL_ERROR);
//				return result;
//			}
//
//			String typeKey = reqBean.getReqTypeBody().getReqTypeInfo().getTypeKey();
			
			String typeKey="";
			
			// 说明输入参数具体哪部分为空
            // 如果body为空
            if (StringTools.isNullOrEmpty(reqBean.getReqTypeBody()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "body"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 如果info为空
            else if (StringTools.isNullOrEmpty(reqBean.getReqTypeBody().getReqTypeInfo()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "info"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 输入参数为空
            else
            {
                typeKey = reqBean.getReqTypeBody().getReqTypeInfo().getTypeKey();

                if (StringTools.isNullOrEmpty(typeKey))
                {
                    result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "typekey"
                            + ErrorDescs.PARAM_NULL_ERROR);
                    return result;
                }
            }
			// 业务处理类
			list = typeService.queryGoodsType(typeKey);

			// 如果获取商品信息为空
			if (StringTools.isNullOrEmpty(list))
			{
				result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.GOODS_INFO_NULL_ERROR, ErrorDescs.GOODS_INFO_NULL_ERROR);
				return result;
			}

			// 返回xml
			rspBean.setHead(rspHead);
			rspList.setRspTypeInfo(list);
			rspBody.setRspTypeList(rspList);
			rspBean.setRspTypeBody(rspBody);
			
			// 校验BEAN属性，将无值的属性初始化值
            BeanUtil.checkFieldValue(rspBean);

			// 接口返回信息转换
			Obj2Xml.obj2Xml(RspTypeBean.class, rspBean, out);
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

	public TypeService getTypeService()
	{
		return typeService;
	}

	public void setTypeService(TypeService typeService)
	{
		this.typeService = typeService;
	}

}
