/**
 * Copyright (C) 2015 Fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.util.RedisUtil
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiChangjiang
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015年11月25日     LiChangjiang       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.util.RedisUtil
 * @description:TODO
 * @version:v1.0.0
 * @date:2015年11月26日 上午9:17:09
 * @author:LiChangjiang
 */
public class RedisUtil
{

	// private static String serverInfo = "192.168.102.10:12001," +
	// "192.168.102.10:12002," + "192.168.102.10:12003,"
	// + "192.168.102.10:12004," + "192.168.102.11:12005," +
	// "192.168.102.11:12006," + "192.168.102.11:12007,"
	// + "192.168.102.11:12008";
	private static String serverInfo = "10.108.110.230:7000,10.108.110.230:7003,"
			+ "10.108.110.230:7001,10.108.110.230:7004," + "10.108.110.230:7002,10.108.110.230:7005";

	private static String key = "xlintf";
	private static JedisCluster jc = null;

	static
	{
		Set<HostAndPort> jedisClusterNodes = getClusterInfo(serverInfo);
		jc = new JedisCluster(jedisClusterNodes);
	}

	private static Set<HostAndPort> getClusterInfo(String serverInfo)
	{
		Set<HostAndPort> set = new HashSet<HostAndPort>();
		if (serverInfo == null || "".equals(serverInfo.length()))
		{
			throw new RuntimeException("The serverInfo can not be empty");
		}
		String ipPort[] = serverInfo.split(",");
		int len = ipPort.length;
		for (int i = 0; i < len; i++)
		{
			String server[] = ipPort[i].split(":");
			set.add(new HostAndPort(server[0], Integer.parseInt(server[1])));
		}

		return set;
	}

	// clear interface logs
	public static void clearIntfLog()
	{
		jc.del(key);
	}

	// add interface log
	public static void saveIntfLog(String val)
	{
		jc.lpush(key, val);
	}

	// get all interface logs
	public static List<String> getAllIntfLog()
	{
		List<String> logs = jc.lrange(key, 0, -1);
		return logs;
	}

	public static void main(String[] args)
	{
		// RedisUtil.clearIntfLog();
		//
		// for (int i = 0; i < 100; i ++) {
		// RedisUtil.saveIntfLog("util-" + i);
		// }
		System.out.println(RedisUtil.getAllIntfLog());
	}
}