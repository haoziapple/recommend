/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.turn.QueryTurnImgList
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-6     LiangJin       v1.0.0        create
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
import com.fzjt.xiaoliu.read.interfaces.business.home.turnImg.bean.req.ReqImgBean;
import com.fzjt.xiaoliu.read.interfaces.business.home.turnImg.bean.rsp.RspImgBean;
import com.fzjt.xiaoliu.read.interfaces.business.home.turnImg.bean.rsp.RspImgBody;
import com.fzjt.xiaoliu.read.interfaces.business.home.turnImg.bean.rsp.RspImgInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.turnImg.bean.rsp.RspImgList;
import com.fzjt.xiaoliu.read.interfaces.business.home.turnImg.service.ImgService;
import com.fzjt.xiaoliu.read.interfaces.util.BeanUtil;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;
import com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 查询轮播图片信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.turn.QueryTurnImgList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-6 下午3:12:21
 * @author:LiangJin
 */
public class QueryTurnImgList
{
	/**
	 * 日志
	 */
	private static final Logger logger = Logger.getLogger(QueryTurnImgList.class);

	/**
	 * 轮播图片Service
	 */
	private ImgService imgService;

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
	 * @date:2015-11-7 下午4:27:19
	 */
	public String interfaceProcess(ServletRequest servletRequest, Document obj, AbstractApplicationContext cont)
	{
		// 定义业务bean
		ReqImgBean reqBean = null;
		RspImgBean rspBean = new RspImgBean();
		RspImgBody rspBody = new RspImgBody();
		List<RspImgInfo> imgList = null;
		RspImgList rspImgList = new RspImgList();
		RspHead rspHead = null;

		// 接口响应信息
		String result = "";

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		imgService = (ImgService) cont.getBean("imgService");

		try
		{
			// xml转换成 业务 bean
			reqBean = (ReqImgBean) Obj2Xml.xml2Obj(obj.asXML(), ReqImgBean.class);

			// 判断请求参数是否确实
			if (StringTools.isNullOrEmpty(reqBean))
			{
				result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.XML_WRONG_ERROR, ErrorDescs.XML_WRONG_ERROR);
				return result;
			}

			// 判断请求参数是否为空
			// if (StringTools.isNullOrEmpty(reqBean.getReqImgBody())
			// ||
			// StringTools.isNullOrEmpty(reqBean.getReqImgBody().getReqInfo())
			// ||
			// StringTools.isNullOrEmpty(reqBean.getReqImgBody().getReqInfo().getProvince())
			// ||
			// StringTools.isNullOrEmpty(reqBean.getReqImgBody().getReqInfo().getCity()))
			// {
			// result =
			// BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR,
			// ErrorDescs.PARAM_NULL_ERROR);
			// return result;
			// }

			// 说明输入参数具体哪部分为空
			// 如果body为空
			if (StringTools.isNullOrEmpty(reqBean.getReqImgBody()))
			{
				result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "body"
						+ ErrorDescs.PARAM_NULL_ERROR);
				return result;
			}
			// 如果info为空
			else if (StringTools.isNullOrEmpty(reqBean.getReqImgBody().getReqInfo()))
			{
				result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "info"
						+ ErrorDescs.PARAM_NULL_ERROR);
				return result;
			}
			// 输入参数为空
			else
			{
				String city = reqBean.getReqImgBody().getReqInfo().getCity();
				String province = reqBean.getReqImgBody().getReqInfo().getProvince();

				if (StringTools.isNullOrEmpty(city))
				{
					result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "city"
							+ ErrorDescs.PARAM_NULL_ERROR);
					return result;
				}
				else if (StringTools.isNullOrEmpty(province))
				{
					result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "province"
							+ ErrorDescs.PARAM_NULL_ERROR);
					return result;
				}
			}

			// 设置返回信息头
			rspHead = BusinessUtils.transformHead(reqBean.getHead());

			// 数据库交互，查询轮播图片集合
			imgList = imgService.queryImgInfo(reqBean.getReqImgBody().getReqInfo());

			// 返回结果非空判断
			if (ListTools.isNullOrEmpty(imgList))
			{
				result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.TURN_INFO_NULL_ERROR,
						ErrorDescs.TURN_INFO_NULL_ERROR);
				return result;
			}

			// 返回 xml
			rspBean.setHead(rspHead);
			rspImgList.setRspImgInfo(imgList);
			rspBody.setRspImgList(rspImgList);
			rspBean.setRspImgBody(rspBody);

			//校验是否有属性没有值
			BeanUtil.checkFieldValue(rspBean);
			
			// 接口返回信息转换
			Obj2Xml.obj2Xml(RspImgBean.class, rspBean, out);
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

	public ImgService getImgService()
	{
		return imgService;
	}

	public void setImgService(ImgService imgService)
	{
		this.imgService = imgService;
	}

}
