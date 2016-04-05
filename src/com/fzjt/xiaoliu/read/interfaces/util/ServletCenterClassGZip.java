package com.fzjt.xiaoliu.read.interfaces.util;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqHead;
import com.fzjt.xiaoliu.read.interfaces.bean.response.RspHead;


/**
 * 接口中心处理器
 * @className:com.fzjt.xiaoliu.read.interfaces.util.ServletCenterClassGZip
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 下午12:43:44
 * @author:ZhangYun
 */
public class ServletCenterClassGZip extends HttpServlet
{

	/**
	 * 默认类的初始容量
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 打印日志
	 */
	private static final Logger logger = Logger.getLogger(ServletCenterClassGZip.class);

	/**
	 * 定义一个Session
	 */
	private HttpSession session = null;

	/**
	 * 实例化Http请求
	 */
	private HttpServletRequest request;

	/**
	 * 返回消息头
	 */
	private RspHead head = null;

	/**
	 * GET方法处理
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		session = request.getSession();
		head = new RspHead();
		AbstractApplicationContext cont = (AbstractApplicationContext) WebApplicationContextUtils
				.getRequiredWebApplicationContext(session.getServletContext());

		// 获取请求里面的XMl内容
		try
		{
			request.setCharacterEncoding("UTF-8");
			byte[] bytes = IOUtils.toByteArray(request.getInputStream());

			String xmlDate = GZIPUtils.uncompressToString(bytes, "UTF-8");

			// 判断参数是否为空
			if (StringTools.isNullOrEmpty(xmlDate))
			{

				// 如果请求的参数体位空返回错误TODO
			    String rspXml = BusinessUtils.rspErrorHeadInfo("000001", "参数缺失");
				// 把封装好的数据返回给请求方
				response.setContentType("text/html;charset=UTF-8");
				response.getOutputStream().write(GZIPUtils.compressToByte(rspXml, "UTF-8"));
				cont.registerShutdownHook();
				return;
			}
			Document xmlDoc = null;

			// 字符串转换为Document对象
			xmlDoc = DocumentHelper.parseText(xmlDate.trim());

			// 获取所有的XML节点
			Element rootElt = xmlDoc.getRootElement();

			// 获取XMl几点的集合
			List<?> attrList = rootElt.elements();

			// 实例化XML请求头部BEAN
			ReqHead reqHead = new ReqHead();

			// 循环获取请求头部信息
			for (int i = 0; i < attrList.size(); i++)
			{
				Element item = (Element) attrList.get(i);
				if ("head".equals(item.getQualifiedName()))
				{
					String chilstr = item.asXML();
					Document childDoc = null;
					childDoc = DocumentHelper.parseText(chilstr.trim());
					Element root = childDoc.getRootElement();
					List<?> childList = root.elements();
					for (int y = 0; y < childList.size(); y++)
					{
						// 子节点的操作
						Element it = (Element) childList.get(y);
						if ("username".endsWith(it.getQualifiedName()))
						{
							reqHead.setUserName(it.getStringValue());
						}
						if ("password".endsWith(it.getQualifiedName()))
						{
							reqHead.setPassword(it.getStringValue());
						}
						if ("requestname".endsWith(it.getQualifiedName()))
						{
							reqHead.setRequestName(it.getStringValue());
						}
						if ("timestamp".endsWith(it.getQualifiedName()))
						{
							reqHead.setTimestamp(it.getStringValue());
						}
						if ("peoplename".endsWith(it.getQualifiedName()))
						{
							reqHead.setPeoplename(it.getStringValue());
						}
						if ("versions".endsWith(it.getQualifiedName()))
						{
							reqHead.setVersions(it.getStringValue());
						}
						if ("modular".endsWith(it.getQualifiedName()))
                        {
                            reqHead.setModular(it.getStringValue());
                        }
					}
				}
			}
			// 判断必须的参数是否为空
			String flag = checkXmlHead(reqHead);
			if (!"0".equals(flag))
			{
			    String rspXml = BusinessUtils.rspErrorHeadInfo("000001", "参数缺失");
				// 把封装好的数据返回给请求方
				response.setContentType("text/html;charset=UTF-8");
				response.getOutputStream().write(GZIPUtils.compressToByte(rspXml, "UTF-8"));
				cont.registerShutdownHook();
				return;
			}

			// 判断用户是否存在
            String flag2 = checkUserExist(reqHead);
            if (!"0".equals(flag2))
            {
			    String rspXml = BusinessUtils.rspErrorHeadInfo("000006", "用户标识" + flag2 + "有误");
				// 把封装好的数据返回给请求方
				response.setContentType("text/html;charset=UTF-8");
				response.getOutputStream().write(GZIPUtils.compressToByte(rspXml, "UTF-8"));
				cont.registerShutdownHook();
				return;
			}

			head.setRequestName(reqHead.getRequestName());
			head.setTimestamp(reqHead.getTimestamp());
			head.setVersions(reqHead.getVersions());
			head.setResultCode("0");
			head.setResultDesc("success");

			// 获取请求的接口名
			String reqInterfaceName = reqHead.getRequestName();
			Configurations configurations = new Configurations();
			// 实例化读取配置文件的方法BEAN
			String interfaceName = configurations.getValue("interfaceName", this.getServletContext());

			String interfaceNames[] = interfaceName.split(",");

			// 判断请求的接口的名字是否正确
			String ident = "0";
			for (int u = 0; u < interfaceNames.length; u++)
			{
				if (reqInterfaceName.equals(interfaceNames[u]))
				{
					ident = "1";
				}
			}
			// 判断是否存在请求的接口
			if ("0".equals(ident))
			{
			    String rspXml = BusinessUtils.rspErrorHeadInfo("000007", "接口不存在");
				// 把封装好的数据返回给请求方
				response.setContentType("text/html;charset=UTF-8");
				response.getOutputStream().write(GZIPUtils.compressToByte(rspXml, "UTF-8"));
				cont.registerShutdownHook();
				return;
			}

			// 拼装访问的接口方法名
			// reqInterfaceName = reqInterfaceName + "InterfaceMain";
			reqInterfaceName = "interfaceProcess";
			// 获取请求的接口名
			String reqInterfaceBean = reqHead.getRequestName();
			String str = "";
			str = reqInterfaceBean.substring(0, 1).toUpperCase();
			str = str + reqInterfaceBean.substring(1, reqInterfaceBean.length());
			Class<?> demo = null;
			
			// 获取请求接口的模块路劲
            String moudlar = reqHead.getModular();

			String beanUrl = "com.fzjt.xiaoliu.read.interfaces.mould." +moudlar+"."+ str;
			// 根据请求的接口的名字找到相关的处理类
			demo = Class.forName(beanUrl);

			// 进处理类找到相关的方法
			Method method = demo.getMethod(reqInterfaceName, ServletRequest.class, Document.class,
					AbstractApplicationContext.class);

			// 进行调用接口处理类
			String doc = (String) method.invoke(demo.newInstance(), new Object[]
			{ request, xmlDoc, cont });

			// 获取返回idDOC对象转换成为XML数据
//			String rspXml = doc.asXML();

			// 把封装好的数据返回给请求方
			response.setContentType("text/html;charset=UTF-8");
			// response.getOutputStream().write(rspXml.getBytes("UTF-8"));
			response.getOutputStream().write(GZIPUtils.compressToByte(doc, "UTF-8"));
		}
		catch (Exception e)
		{
		    String rspXml = BusinessUtils.rspErrorHeadInfo("000007", e.getMessage());
			logger.error("中心处理器错误！", e);
			try
			{
				response.setContentType("text/html;charset=UTF-8");
				response.getOutputStream().write(GZIPUtils.compressToByte(rspXml, "UTF-8"));
			}
			catch (IOException e1)
			{
			    logger.error(e1.getMessage(), e1);
				cont.registerShutdownHook();
			}
			return;
		}
		cont.registerShutdownHook();
	}

	/**
	 * POST方法处理
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	{

		doGet(request, response);
	}

	/**
	 * 校验请求头信息
	 * @Description:
	 * @param head
	 * @return
	 * @version:v1.0
	 * @author:ZhangYun
	 * @date:2015-10-24 下午12:45:00
	 */
	public String checkXmlHead(ReqHead head)
	{
		if (StringTools.isNullOrEmpty(head))
		{
			return "head";
		}

		if (StringTools.isNullOrEmpty(head.getUserName()))
		{
			return "username";
		}
		if (StringTools.isNullOrEmpty(head.getPassword()))
		{
			return "password";
		}
		if (StringTools.isNullOrEmpty(head.getTimestamp()))
		{
			return "timestamp";
		}
		if (StringTools.isNullOrEmpty(head.getVersions()))
		{
			return "versions";
		}

		if (StringTools.isNullOrEmpty(head.getRequestName()))
		{
			return "requestname";
		}
		return "0";
	}

	 /**
	  * 校验请求头中用户和密码
	  * @Description:
	  * @param head
	  * @return
	  * @version:v1.0
	  * @author:ZhangYun
	  * @date:2015-10-24 下午12:45:18
	  */
    public String checkUserExist(ReqHead head)
    {
        String un = ConfigurationsUser.getValue("username");
        String pw = ConfigurationsUser.getValue("password");
        if (!un.equals(head.getUserName()))
        {
            return "username";
        }
        if (!pw.equals(head.getPassword()))
        {
            return "password";
        }
        return "0";
    }

	public HttpSession getSession()
	{
		return session;
	}

	public void setSession(HttpSession session)
	{
		this.session = session;
	}

	public void setServletRequest(HttpServletRequest req)
	{
		this.request = req;
	}

	public HttpServletRequest getRequest()
	{
		return request;
	}

	public void setRequest(HttpServletRequest request)
	{
		this.request = request;
	}

}
