/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.pc.QueryFloorInfoList
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-4     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.mould.pc;

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
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.req.ReqFloorInfoBean;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.rsp.FloorInfo;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.rsp.FloorInfoList;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.rsp.RspFloorInfoBean;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.bean.floor.info.rsp.RspFloorInfoBody;
import com.fzjt.xiaoliu.read.interfaces.business.pc.home.service.FloorService;
import com.fzjt.xiaoliu.read.interfaces.util.BeanUtil;
import com.fzjt.xiaoliu.read.interfaces.util.BusinessUtils;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorCodes;
import com.fzjt.xiaoliu.read.interfaces.util.ErrorDescs;
import com.fzjt.xiaoliu.read.interfaces.util.ListTools;
import com.fzjt.xiaoliu.read.interfaces.util.Obj2Xml;
import com.fzjt.xiaoliu.read.interfaces.util.StringTools;

/**
 * 查询首页楼层对象信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.mould.pc.QueryFloorInfoList
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-4 下午4:27:03
 * @author:TangKai
 */
public class QueryFloorInfoList
{
    /**
     * 日志
     */
    private static final Logger logger = Logger.getLogger(QueryFloorInfoList.class);

    /**
     * 楼层Service
     */
    private FloorService floorService;

    /**
     * 查询首页楼层对象信息
     * 
     * @Description:
     * @param servletRequest
     * @param obj
     * @param cont
     * @return
     * @version:v1.0
     * @author:TangKai
     * @date:2015-12-4 下午4:27:41
     */
    public String interfaceProcess(ServletRequest servletRequest, Document obj, AbstractApplicationContext cont)
    {
        // 定义业务bean
        ReqFloorInfoBean reqBean = null;
        RspFloorInfoBean rspBean = new RspFloorInfoBean();
        RspFloorInfoBody rspBody = new RspFloorInfoBody();
        List<FloorInfo> list = null;
        FloorInfoList rspList = new FloorInfoList();
        RspHead rspHead = null;

        // 接口响应信息
        String result = "";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        floorService = (FloorService) cont.getBean("floorService");

        try
        {
            // xml转换成 业务 bean
            reqBean = (ReqFloorInfoBean) Obj2Xml.xml2Obj(obj.asXML(), ReqFloorInfoBean.class);

            // 判断请求参数是否确实
            if (StringTools.isNullOrEmpty(reqBean))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.XML_WRONG_ERROR, ErrorDescs.XML_WRONG_ERROR);
                return result;
            }

            // 设置返回信息头
            rspHead = BusinessUtils.transformHead(reqBean.getHead());

            // 判断请求参数完整性
            // if (StringTools.isNullOrEmpty(reqBean.getReqBody())
            // || StringTools.isNullOrEmpty(reqBean.getReqBody().getReqInfo())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqBody().getReqInfo().getProvince())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqBody().getReqInfo().getCity())
            // ||
            // StringTools.isNullOrEmpty(reqBean.getReqBody().getReqInfo().getFloorKey()))
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
                String city = reqBean.getReqBody().getReqInfo().getCity();
                String province = reqBean.getReqBody().getReqInfo().getProvince();
                String floorKey = reqBean.getReqBody().getReqInfo().getFloorKey();

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
                else if (StringTools.isNullOrEmpty(floorKey))
                {
                    result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.PARAM_NULL_ERROR, "floorkey"
                            + ErrorDescs.PARAM_NULL_ERROR);
                    return result;
                }
            }

            // 数据库交互
            list = floorService.queryFloorInfoList(reqBean.getReqBody().getReqInfo());

            // 如果获取楼层信息为空
            if (ListTools.isNullOrEmpty(list))
            {
                result = BusinessUtils.rspErrorHeadInfo(ErrorCodes.FLOOR_INFO_NULL_ERROR,
                        ErrorDescs.FLOOR_INFO_NULL_ERROR);
                return result;
            }

            // 返回 xml
            rspBean.setHead(rspHead);
            rspList.setFloorInfoList(list);
            rspBody.setRspList(rspList);
            rspBean.setRspBody(rspBody);

            // 校验BEAN属性，将无值的属性初始化值
            BeanUtil.checkFieldValue(rspBean);

            // 接口返回信息转换
            Obj2Xml.obj2Xml(RspFloorInfoBean.class, rspBean, out);
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

    public FloorService getFloorService()
    {
        return floorService;
    }

    public void setFloorService(FloorService floorService)
    {
        this.floorService = floorService;
    }

}
