package com.fzjt.xiaoliu.read.interfaces.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.fzjt.xiaoliu.read.interfaces.bean.request.ReqHead;
import com.fzjt.xiaoliu.read.interfaces.bean.response.RspHead;
import com.fzjt.xiaoliu.read.interfaces.sysmanager.parameter.service.ParameterService;

/**
 * 接口中心处理器
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.util.ServletCenterClass
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-10-24 下午12:42:25
 * @author:ZhangYun
 */
public class ServletCenterClass extends HttpServlet
{

	/**
	 * 默认类的初始容量
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 打印日志
	 */
	private static final Logger logger = Logger.getLogger(ServletCenterClass.class);

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

	private ParameterService pService;

	/**
	 * GET方法处理
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{

		// 实例化SESSION
		session = request.getSession();

		// 实例化请求头
		head = new RspHead();

		// 初次加载所有的SPRING的核心配置文件
		AbstractApplicationContext cont = (AbstractApplicationContext) WebApplicationContextUtils
				.getRequiredWebApplicationContext(session.getServletContext());

		// 获取service
		pService = (ParameterService) cont.getBean("parameterService");

		try
		{
			// 获取请求里面的XMl内容
			BufferedReader br = new BufferedReader(new InputStreamReader((ServletInputStream) request.getInputStream(),
					"utf-8"));

			String line = null;

			// 定义接受XML内容的实体
			StringBuilder sb = new StringBuilder();

			// 循环获取XML参数的详细数据
			while ((line = br.readLine()) != null)
			{
				sb.append(line);
			}

			// 判断参数是否为空
			if (StringTools.isNullOrEmpty(sb.toString()))
			{
				String rspXml = BusinessUtils.rspErrorHeadInfo("000001", "参数缺失");
				// 把封装好的数据返回给请求方
				response.setContentType("text/html;charset=UTF-8");
				response.getOutputStream().write(rspXml.getBytes("UTF-8"));
				// ?
				cont.registerShutdownHook();
				return;
			}
			Document xmlDoc = null;

			// 请求字符串转换为Document对象
			xmlDoc = DocumentHelper.parseText(sb.toString().trim());

			// 获取所有的XML节点
			Element rootElt = xmlDoc.getRootElement();

			// 获取XMl几点的集合
			List<?> attrList = rootElt.elements();

			// 实例化XML请求头部BEAN
			ReqHead reqHead = new ReqHead();

			// 获取数据库时间备用
			String oracleTime = pService.queryOracleTime();

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
						if ("username".endsWith(StringTools.removeSpace(it.getQualifiedName())))
						{
							reqHead.setUserName(StringTools.removeSpace(it.getStringValue()));
						}
						if ("password".endsWith(StringTools.removeSpace(it.getQualifiedName())))
						{
							reqHead.setPassword(StringTools.removeSpace(it.getStringValue()));
						}
						if ("requestname".endsWith(StringTools.removeSpace(it.getQualifiedName())))
						{
							reqHead.setRequestName(StringTools.removeSpace(it.getStringValue()));
						}
						if ("timestamp".endsWith(StringTools.removeSpace(it.getQualifiedName())))
						{
							// reqHead.setTimestamp(it.getStringValue());
							reqHead.setTimestamp(oracleTime);
						}
						if ("peoplename".endsWith(StringTools.removeSpace(it.getQualifiedName())))
						{
							reqHead.setPeoplename(StringTools.removeSpace(it.getStringValue()));
						}
						if ("versions".endsWith(StringTools.removeSpace(it.getQualifiedName())))
						{
							reqHead.setVersions(StringTools.removeSpace(it.getStringValue()));
						}
						if ("modular".endsWith(StringTools.removeSpace(it.getQualifiedName())))
						{
							reqHead.setModular(StringTools.removeSpace(it.getStringValue()));
						}
					}
				}
			}

			// 更改报文时间戳
			Node timesTampNode = xmlDoc.selectSingleNode("fzjt/head/timestamp");
			if (timesTampNode != null)
			{
				timesTampNode.setText(oracleTime);
			}

			// 判断必须的参数是否为空
			String flag = checkXmlHead(reqHead);
			if (!"0".equals(flag))
			{
				String rspXml = BusinessUtils.rspErrorHeadInfo("000001", "参数缺失");
				// 把封装好的数据返回给请求方
				response.setContentType("text/html;charset=UTF-8");
				response.getOutputStream().write(rspXml.getBytes("UTF-8"));
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
				response.getOutputStream().write(rspXml.getBytes("UTF-8"));
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

			// 判断请求的接口的名字是否正确，就找跟请求相对应的mould
			String ident = "0";
			for (int u = 0; u < interfaceNames.length; u++)
			{
				if (reqInterfaceName.equals(interfaceNames[u]))
				{
					ident = "1";
					break;
				}
			}
			// 判断是否存在请求的接口
			if ("0".equals(ident))
			{
				String rspXml = BusinessUtils.rspErrorHeadInfo("000007", "接口不存在");
				// 把封装好的数据返回给请求方
				response.setContentType("text/html;charset=UTF-8");
				response.getOutputStream().write(rspXml.getBytes("UTF-8"));
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

			// "com.fzjt.xiaoliu.read.interfaces.mould."+模块名称+类名称(接口名称)+reqInterfaceName
			String beanUrl = Constant.INTERFACES_URL_NAME + moudlar + "." + str;

			// 根据请求的接口的名字找到相关的处理类
			demo = Class.forName(beanUrl);

			// 进处理类找到相关的方法
			Method method = demo.getMethod(reqInterfaceName, ServletRequest.class, Document.class,
					AbstractApplicationContext.class);

			// 进行调用接口处理类，处理后返回结果字符串
			String doc = (String) method.invoke(demo.newInstance(), new Object[]
			{ request, xmlDoc, cont });

//			RedisUtil.saveIntfLog(DateUtils.getStringNow() + "|||||\n" + request.getRemoteHost() + "-"
//					+ request.getRemoteAddr() + "|||||\n" + sb + "|||||\n" + doc);

			// 把封装好的数据返回给请求方
			response.setContentType("text/html;charset=UTF-8");
			response.getOutputStream().write(doc.getBytes("UTF-8"));
		}
		catch (Exception e)
		{
			logger.error("中心处理器错误！", e);
			String rspXml = BusinessUtils.rspErrorHeadInfo("100017", "接口服务异常！");
			try
			{
				response.setContentType("text/html;charset=UTF-8");
				response.getOutputStream().write(rspXml.getBytes("utf-8"));
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
	 * 
	 * @Description:
	 * @param head
	 * @return
	 * @version:v1.0
	 * @author:ZhangYun
	 * @date:2015-10-24 下午12:43:14
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
		if (StringTools.isNullOrEmpty(head.getModular()))
		{
			return "modular";
		}
		return "0";
	}

	/**
	 * 校验请求头中用户和密码
	 * 
	 * @Description:
	 * @param head
	 * @return
	 * @throws SQLException
	 * @version:v1.0
	 * @author:ZhangYun
	 * @date:2015-10-24 下午12:43:31
	 */
	public String checkUserExist(ReqHead head) throws SQLException
	{
		String un = pService.queryParameterValue("user_name");
		String pw = pService.queryParameterValue("password");

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
