/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.account.QueryAccountByUserkey
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:WangHao
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-11     WangHao       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.mould.account;


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
import com.fzjt.xiaoliu.read.interfaces.business.account.bean.req.ReqAccount;
import com.fzjt.xiaoliu.read.interfaces.business.account.bean.rsp.RspAccountBean;
import com.fzjt.xiaoliu.read.interfaces.business.account.bean.rsp.RspAccountBody;
import com.fzjt.xiaoliu.read.interfaces.business.account.bean.rsp.RspAccountInfo;
import com.fzjt.xiaoliu.read.interfaces.business.account.bean.rsp.RspAccountList;
import com.fzjt.xiaoliu.read.interfaces.business.account.service.AccountService;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

public class QueryAccountByUserkey
{
	/**
	 * 日志
	 */
	private static final Logger logger = Logger.getLogger(QueryAccountByUserkey.class);
	private AccountService accountService;
	/**
	 * 
	 * @Description:
	 * @param servletRequest
	 * @param obj
	 * @param cont
	 * @return
	 * @version:v1.0
	 * @author:WangHao
	 * @date:2015-12-12 下午1:28:56
	 */
	public String interfaceProcess(ServletRequest servletRequest, Document obj, AbstractApplicationContext cont)
	{
		// 定义业务bean
        ReqAccount reqBean = null;
        RspAccountBean rspBean = new RspAccountBean();
        RspAccountBody rspBody = new RspAccountBody();
        RspAccountList rspList = new RspAccountList();
        List<RspAccountInfo> list = null;
        RspHead rspHead = null;
        
        //借口相应信息
        String result= "";
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        accountService = (AccountService) cont.getBean("accountService");
        
        try
        {
        	//xml转换成业务bean
        	reqBean = (ReqAccount) Obj2Xml.xml2Obj(obj.asXML(), ReqAccount.class);
        	if (StringTools.isNullOrEmpty(reqBean))
        	{
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.XML_WRONG_ERROR, ErrorDescs.XML_WRONG_ERROR);
                return result;
            }
        	
        	//设置返回信息头
        	rspHead = BusinessUtils.transformHead(reqBean.getHead());
        	String userkey = "";
        	if (StringTools.isNullOrEmpty(reqBean.getReqAccountBody()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "body"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 如果info为空
            else if (StringTools.isNullOrEmpty(reqBean.getReqAccountBody().getReqAccountInfo()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "info"
                        + ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }
            // 输入参数为空
            else
            {
                userkey = reqBean.getReqAccountBody().getReqAccountInfo().getUserkey();

                if (StringTools.isNullOrEmpty(userkey))
                {
                    result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "skukey"
                            + ErrorDescs.PARAM_NULL_ERROR);
                    return result;
                }
            }

            // 业务处理
        	list = accountService.queryAccount(userkey);

            // 如果获取商品信息为空
            if (StringTools.isNullOrEmpty(list))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.AFFIXES_INFO_NULL_ERROR,
                        ErrorDescs.AFFIXES_INFO_NULL_ERROR);
                return result;
            }

            // 返回xml
            rspBean.setHead(rspHead);
            rspList.setRspAccountInfo(list);
            rspBody.setRspAccountList(rspList);
            rspBean.setRspAccountBody(rspBody);

            // 接口返回信息转换
            Obj2Xml.obj2Xml(RspAccountBean.class, rspBean, out);
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
	 * @return the accountService
	 */
	public AccountService getAccountService()
	{
		return accountService;
	}
	/**
	 * @param accountService the accountService to set
	 */
	public void setAccountService(AccountService accountService)
	{
		this.accountService = accountService;
	}

}
