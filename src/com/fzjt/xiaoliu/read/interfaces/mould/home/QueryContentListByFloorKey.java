/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.floor.QueryContentListByFloorKey
 * @description:
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-5     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.mould.home;

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
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.content.bean.req.ReqContentBean;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.content.bean.req.ReqContentInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.content.bean.rsp.RspContentBean;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.content.bean.rsp.RspContentBody;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.content.bean.rsp.RspContentInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.content.bean.rsp.RspContentList;
import com.fzjt.xiaoliu.read.interfaces.business.home.floor.content.service.ContentService;
import com.fzjt.xiaoliu.read.interfaces.util.BeanUtil;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;
import com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 根据楼层查询楼层内容
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.home.QueryContentListByFloorKey
 * @description:根据楼层查询楼层内容
 * @version:v1.0.0
 * @date:2015-11-7 上午11:23:29
 * @author:LiChangjiang
 */
public class QueryContentListByFloorKey
{
	/**
	 * 日志
	 */
	private static final Logger logger = Logger.getLogger(QueryContentListByFloorKey.class);

	/**
	 * 首页楼层模块service
	 */
	private ContentService contentService;

	/**
	 * 根据楼层查询楼层内容
	 * 
	 * @Description: 根据楼层查询楼层内容
	 * @param servletRequest
	 * @param obj
	 * @param cont
	 * @return
	 * @version:v1.0
	 * @author:LiChangjiang
	 * @date:2015-11-7 上午11:24:14
	 */
	public String interfaceProcess(ServletRequest servletRequest, Document obj, AbstractApplicationContext cont)
	{
		// 定义业务bean
		ReqContentBean reqBean = null;
		ReqContentInfo reqInfo = null;
		RspContentBean rspBean = new RspContentBean();
		RspContentBody rspBody = new RspContentBody();
		List<RspContentInfo> contentList = null;
		RspContentList rspContentList = new RspContentList();
		RspHead rspHead = null;

		// 接口响应信息
		String result = "";

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		contentService = (ContentService) cont.getBean("contentService");

		try
		{
			// xml转换成 业务 bean
			reqBean = (ReqContentBean) Obj2Xml.xml2Obj(obj.asXML(), ReqContentBean.class);

			// 如果查询楼层内容请求报文转换之后为空
			if (StringTools.isNullOrEmpty(reqBean))
			{
				result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.XML_WRONG_ERROR, ErrorDescs.XML_WRONG_ERROR);
				return result;
			}

			// 设置返回信息头
			rspHead = BusinessUtils.transformHead(reqBean.getHead());

			// 查询楼层内容必须要有确定的楼层key，当楼层key缺失时候
			// if (StringTools.isNullOrEmpty(reqBean.getReqContentBody())
			// ||
			// StringTools.isNullOrEmpty(reqBean.getReqContentBody().getReqContentInfo())
			// ||
			// StringTools.isNullOrEmpty(reqBean.getReqContentBody().getReqContentInfo().getFloorKey()))
			// {
			// result =
			// BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR,
			// ErrorDescs.PARAM_NULL_ERROR);
			// return result;
			// }
			// // 获取请求参数
			// String floorKey =
			// reqBean.getReqContentBody().getReqContentInfo().getFloorKey();
			// 说明输入参数具体哪部分为空
			// 如果body为空
			if (StringTools.isNullOrEmpty(reqBean.getReqContentBody()))
			{
				result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "body"
						+ ErrorDescs.PARAM_NULL_ERROR);
				return result;
			}
			// 如果info为空
			if (StringTools.isNullOrEmpty(reqBean.getReqContentBody().getReqContentInfo()))
			{
				result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "info"
						+ ErrorDescs.PARAM_NULL_ERROR);
				return result;
			}
			// 输入参数为空
			if (StringTools.isNullOrEmpty(reqBean.getReqContentBody().getReqContentInfo().getFloorKey()))
			{
				result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "floorkey"
						+ ErrorDescs.PARAM_NULL_ERROR);
				return result;
			}
			if (StringTools.isNullOrEmpty(reqBean.getReqContentBody().getReqContentInfo().getProvince()))
			{
				result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "province"
						+ ErrorDescs.PARAM_NULL_ERROR);
				return result;
			}
			if (StringTools.isNullOrEmpty(reqBean.getReqContentBody().getReqContentInfo().getCity()))
			{
				result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "city"
						+ ErrorDescs.PARAM_NULL_ERROR);
				return result;
			}

			reqInfo = reqBean.getReqContentBody().getReqContentInfo();
			// 数据库交互，查询楼层内容
			contentList = contentService.queryContentInfo(reqInfo);

			// 返回结果非空判断
			if (ListTools.isNullOrEmpty(contentList))
			{
				result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.FLOOR_INFO_NULL_ERROR,
						ErrorDescs.FLOOR_INFO_NULL_ERROR);
				return result;
			}

			// 返回 xml
			rspBean.setHead(rspHead);
			rspContentList.setContentList(contentList);
			rspBody.setRspContentList(rspContentList);
			rspBean.setRspContentBody(rspBody);

			// 校验BEAN属性，将无值的属性初始化值
			BeanUtil.checkFieldValue(rspBean);

			// 接口返回信息转换
			Obj2Xml.obj2Xml(RspContentBean.class, rspBean, out);
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

	public ContentService getContentService()
	{
		return contentService;
	}

	public void setContentService(ContentService contentService)
	{
		this.contentService = contentService;
	}

}
