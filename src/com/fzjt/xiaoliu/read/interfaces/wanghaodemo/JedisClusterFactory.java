/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.wanghaodemo.JedisClusterFactory
 * @description:TODO
 * @date:2016-2-23 上午10:52:59
 * @version:v1.0.0 
 * @author:WangHao
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2016-2-23     WangHao       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.wanghaodemo;

import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Pattern;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.Resource;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

public class JedisClusterFactory implements FactoryBean<JedisCluster>, InitializingBean
{
	private Resource addressConfig;
	private String addressKeyPrefix;
	
	private JedisCluster jedisCluster;
	private Integer timeout;
	//最大重导向次数,一个节点上不存在相应key时,redis会试着重导向到别的节点上去寻找
	private Integer maxRedirections;
	//设置redis cluster的连接池
	private GenericObjectPoolConfig genericObjectPoolConfig;
	
	private Pattern p = Pattern.compile("^.+[:]\\d{1,5}\\s*$");
	
	/**
	 * 解析节点地址
	 * 
	 * @Description:
	 * @return
	 * @throws Exception
	 * @version:v1.0
	 * @author:WangHao
	 * @date:2016-2-23 上午10:59:29
	 */
	private Set<HostAndPort> parseHostAndPort() throws Exception {
		try {
			Properties prop = new Properties();
			prop.load(this.addressConfig.getInputStream());

			Set<HostAndPort> haps = new HashSet<HostAndPort>();
			for (Object key : prop.keySet()) {

				if (!((String) key).startsWith(addressKeyPrefix)) {
					continue;
				}

				String val = (String) prop.get(key);

				boolean isIpPort = p.matcher(val).matches();

				if (!isIpPort) {
					throw new IllegalArgumentException("ip 或 port 不合法");
				}
				String[] ipAndPort = val.split(":");

				HostAndPort hap = new HostAndPort(ipAndPort[0], Integer.parseInt(ipAndPort[1]));
				haps.add(hap);
			}

			return haps;
		} catch (IllegalArgumentException ex) {
			throw ex;
		} catch (Exception ex) {
			throw new Exception("解析 jedis 配置文件失败", ex);
		}
	}
	
	/**
	 * 设定jedisCluster
	 */
	@Override
	public void afterPropertiesSet() throws Exception
	{
		Set<HostAndPort> haps = this.parseHostAndPort();
		jedisCluster = new JedisCluster(haps, timeout, maxRedirections, genericObjectPoolConfig);
	}

	@Override
	public JedisCluster getObject() throws Exception
	{
		return jedisCluster;
	}

	@Override
	public Class<? extends JedisCluster> getObjectType()
	{
		return (this.jedisCluster != null ? this.jedisCluster.getClass() : JedisCluster.class);
	}

	@Override
	public boolean isSingleton()
	{
		return true;
	}

	public void setAddressConfig(Resource addressConfig) {
		this.addressConfig = addressConfig;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public void setMaxRedirections(int maxRedirections) {
		this.maxRedirections = maxRedirections;
	}

	public void setAddressKeyPrefix(String addressKeyPrefix) {
		this.addressKeyPrefix = addressKeyPrefix;
	}

	public void setGenericObjectPoolConfig(GenericObjectPoolConfig genericObjectPoolConfig) {
		this.genericObjectPoolConfig = genericObjectPoolConfig;
	}
}
