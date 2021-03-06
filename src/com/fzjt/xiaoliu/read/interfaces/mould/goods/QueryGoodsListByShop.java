/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.goods.QueryGoodsListByShop
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiChangjiang
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-10-30     LiChangjiang       v1.0.0        create
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
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.list.req.ReqGoodsBean;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.list.rsp.RspGoodsBean;
import com.fzjt.xiaoliu.read.interfaces.business.goods.bean.list.rsp.RspGoodsBody;
import com.fzjt.xiaoliu.read.interfaces.business.goods.service.GoodsService;
import com.fzjt.xiaoliu.read.interfaces.util.BeanUtil;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 根据商家信息查询商品集合
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.goods.QueryGoodsListByShop
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-10-30 下午4:42:39
 * @author:LiChangjiang
 */
public class QueryGoodsListByShop
{
	/**
	 * 日志
	 */
	private static final Logger logger = Logger.getLogger(QueryGoodsListByShop.class);

	/**
     * 
     */
	private GoodsService goodsService;

	/**
	 * 根据商家信息查询商品集合
	 * 
	 * @Description:方法主入口
	 * @param servletRequest
	 * @param obj
	 * @param cont
	 * @return
	 * @version:v1.0
	 * @author:LiChangjiang
	 * @date:2015-10-30 下午4:51:52
	 */
	public String interfaceProcess(ServletRequest servletRequest, Document obj, AbstractApplicationContext cont)
	{
		// 定义变量
		ReqGoodsBean reqBean = null;

		RspGoodsBean rspBean = new RspGoodsBean();
		RspGoodsBody rspBody = null;

		RspHead rspHead = null;

		// 返回信息
		String result = "";
		ByteArrayOutputStream out = new ByteArrayOutputStream();

		goodsService = (GoodsService) cont.getBean("goodsService");

		// xml转换成 业务 bean
		try
		{
			// 讲请求报文转换为JavaBean
			reqBean = (ReqGoodsBean) Obj2Xml.xml2Obj(obj.asXML(), ReqGoodsBean.class);

			// 如果查询商家信息请求报文转换之后为空
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
			// StringTools.isNullOrEmpty(reqBean.getReqGoodsBody().getReqGoodsInfo())
			// ||
			// StringTools.isNullOrEmpty(reqBean.getReqGoodsBody().getReqGoodsInfo().getSupTypeKey())
			// ||
			// StringTools.isNullOrEmpty(reqBean.getReqGoodsBody().getReqGoodsInfo().getTypeKey())
			// ||
			// StringTools.isNullOrEmpty(reqBean.getReqGoodsBody().getReqGoodsInfo().getIsEnd())
			// ||
			// StringTools.isNullOrEmpty(reqBean.getReqGoodsBody().getReqGoodsInfo().getShopKey())
			// ||
			// (StringTools.isNullOrEmpty(reqBean.getReqGoodsBody().getReqGoodsInfo().getFromPrice())
			// && (!StringTools
			// .isNullOrEmpty(reqBean.getReqGoodsBody().getReqGoodsInfo().getToPrice())))
			// ||
			// (!StringTools.isNullOrEmpty(reqBean.getReqGoodsBody().getReqGoodsInfo().getFromPrice())
			// && (StringTools
			// .isNullOrEmpty(reqBean.getReqGoodsBody().getReqGoodsInfo().getToPrice())))
			// ||
			// (StringTools.isNullOrEmpty(reqBean.getReqGoodsBody().getReqGoodsInfo().getFromTime())
			// && (!StringTools
			// .isNullOrEmpty(reqBean.getReqGoodsBody().getReqGoodsInfo().getToTime())))
			// ||
			// (!StringTools.isNullOrEmpty(reqBean.getReqGoodsBody().getReqGoodsInfo().getFromTime())
			// && (StringTools
			// .isNullOrEmpty(reqBean.getReqGoodsBody().getReqGoodsInfo().getToTime()))))
			// {
			// result =
			// BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR,
			// ErrorDescs.PARAM_NULL_ERROR);
			// return result;
			// }

			// 说明输入参数具体哪部分为空
			// 如果body为空
			if (StringTools.isNullOrEmpty(reqBean.getReqGoodsBody()))
			{
				result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "body"
						+ ErrorDescs.PARAM_NULL_ERROR);
				return result;
			}
			// 如果info为空
			else if (StringTools.isNullOrEmpty(reqBean.getReqGoodsBody().getReqGoodsInfo()))
			{
				result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "info"
						+ ErrorDescs.PARAM_NULL_ERROR);
				return result;
			}
			// 输入参数为空
			else
			{
				String shopKey = reqBean.getReqGoodsBody().getReqGoodsInfo().getShopKey();
				String fromPrice = reqBean.getReqGoodsBody().getReqGoodsInfo().getFromPrice();
				String toPrice = reqBean.getReqGoodsBody().getReqGoodsInfo().getToPrice();
				String fromTime = reqBean.getReqGoodsBody().getReqGoodsInfo().getFromTimeStr();
				String toTime = reqBean.getReqGoodsBody().getReqGoodsInfo().getToTimeStr();

				if (StringTools.isNullOrEmpty(shopKey))
				{
					result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "shopkey"
							+ ErrorDescs.PARAM_NULL_ERROR);
					return result;
				}
				else if (StringTools.isNullOrEmpty(fromPrice) && !StringTools.isNullOrEmpty(toPrice))
				{
					result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "fromprice"
							+ ErrorDescs.PARAM_NULL_ERROR);
					return result;
				}
				else if (!StringTools.isNullOrEmpty(fromPrice) && StringTools.isNullOrEmpty(toPrice))
				{
					result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "toprice"
							+ ErrorDescs.PARAM_NULL_ERROR);
					return result;
				}
				else if (StringTools.isNullOrEmpty(fromTime) && !StringTools.isNullOrEmpty(toTime))
				{
					result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "fromtime"
							+ ErrorDescs.PARAM_NULL_ERROR);
					return result;
				}
				else if (!StringTools.isNullOrEmpty(fromTime) && StringTools.isNullOrEmpty(toTime))
				{
					result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "totime"
							+ ErrorDescs.PARAM_NULL_ERROR);
					return result;
				}
			}

			// 数据库交互，获取返回信息
			rspBody = goodsService.queryGoodsListByShop(reqBean.getReqGoodsBody());

			// 如果获取商品信息为空
			if (StringTools.isNullOrEmpty(rspBody))
			{
				result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.GOODS_INFO_NULL_ERROR,
						ErrorDescs.GOODS_INFO_NULL_ERROR);
				return result;
			}

			// 返回信息Javabean封装
			rspBean.setRspGoodsBody(rspBody);
			rspBean.setHead(rspHead);

			// 校验BEAN属性，将无值的属性初始化值
			BeanUtil.checkFieldValue(rspBean);

			// 返回Javabean转换为xml报文
			Obj2Xml.obj2Xml(RspGoodsBean.class, rspBean, out);
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
