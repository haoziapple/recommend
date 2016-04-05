package com.fzjt.xiaoliu.read.interfaces.mould.first;

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
import com.fzjt.xiaoliu.read.interfaces.business.first.bean.FirstBean;
import com.fzjt.xiaoliu.read.interfaces.business.first.bean.req.ReqFirstBody;
import com.fzjt.xiaoliu.read.interfaces.business.first.bean.rsp.RspFirstBody;
import com.fzjt.xiaoliu.read.interfaces.business.first.bean.rsp.RspFirstInfo;
import com.fzjt.xiaoliu.read.interfaces.business.first.bean.rsp.RspFirstList;
import com.fzjt.xiaoliu.read.interfaces.business.first.service.FirstService;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.first.QueryFirstList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-10-24 上午11:27:03
 * @author:ZhangYun
 */
public class QueryFirstList
{
    private static final Logger logger = Logger.getLogger(QueryFirstList.class);

    private FirstService firstService;

    /**
     * 查询首页商品列表
     * 
     * @Description:
     * @param servletRequest
     * @param obj
     * @param cont
     * @return
     * @version:v1.0
     * @author:ZhangYun
     * @date:2015-10-24 上午11:27:10
     */
    public String interfaceProcess(ServletRequest servletRequest, Document obj, AbstractApplicationContext cont)
    {
        // 定义业务bean
        ReqFirstBody reqBean = null;
        RspFirstBody rspBean = new RspFirstBody();
        List<FirstBean> firstList = null;
        RspFirstList rspFirstList = new RspFirstList();
        RspFirstInfo rspFirstInfo = new RspFirstInfo();
        RspHead rspHead = null;

        // 接口响应信息
        String result = "";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        firstService = (FirstService) cont.getBean("firstService");

        try
        {
            // xml转换成 业务 bean
            reqBean = (ReqFirstBody) Obj2Xml.xml2Obj(obj.asXML(), ReqFirstBody.class);

            // 请求报文转换之后为空
            if (StringTools.isNullOrEmpty(reqBean))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.XML_WRONG_ERROR, ErrorDescs.XML_WRONG_ERROR);
                return result;
            }
            
            // 设置返回信息头
            rspHead = BusinessUtils.transformHead(reqBean.getHead());

            // 非空校验
            if (StringTools.isNullOrEmpty(reqBean.getBody())
                    || StringTools.isNullOrEmpty(reqBean.getBody().getFirstBean())
                    || StringTools.isNullOrEmpty(reqBean.getBody().getFirstBean().getServiceTypeKey()))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, ErrorDescs.PARAM_NULL_ERROR);
                return result;
            }

            FirstBean bean = reqBean.getBody().getFirstBean();

            firstList = firstService.queryFirstList(bean);

            // 返回 xml
            rspBean.setHead(rspHead);
            rspFirstInfo.setList(firstList);
            rspFirstList.setRspFirstInfo(rspFirstInfo);
            rspBean.setBody(rspFirstList);

            // 接口返回信息转换
            Obj2Xml.obj2Xml(RspFirstBody.class, rspBean, out);
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
            result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.EXECUTE_DB_ERROR,ErrorDescs.EXECUTE_DB_ERROR);
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

    public FirstService getFirstService()
    {
        return firstService;
    }

    public void setFirstService(FirstService firstService)
    {
        this.firstService = firstService;
    }

}
