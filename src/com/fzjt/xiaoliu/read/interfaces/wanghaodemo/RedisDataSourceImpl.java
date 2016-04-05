/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.wanghaodemo.RedisDataSourceImpl
 * @description:TODO
 * @date:2016-2-22 下午5:41:07
 * @version:v1.0.0 
 * @author:WangHao
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2016-2-22     WangHao       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.wanghaodemo;

import org.apache.log4j.Logger;

import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

public class RedisDataSourceImpl implements RedisDataSource
{
	/**
	 * 日志
	 */
	private static final Logger logger = Logger.getLogger(RedisDataSourceImpl.class);
	
	/**
	 * 注入连接池
	 */
	private ShardedJedisPool shardedJedisPool;
	
	/**
	 * 取得redis客户端以执行命令
	 */
	@Override
	public ShardedJedis getRedisClient()
	{
		try {
            ShardedJedis shardJedis = shardedJedisPool.getResource();
            return shardJedis;
        } catch (Exception e) {
            logger.error("getRedisClent error", e);
        }
        return null;
	}

	/**
	 * 将资源返还给pool
	 * 目前这个方法弃用了
	 * 也许shardedJedis与jedisCluster类似,会自己管理连接池
	 * 需要查看源码,待查
	 */
	@SuppressWarnings("deprecation")
	@Override
	public void returnResource(ShardedJedis shardedJedis)
	{
		shardedJedisPool.returnResource(shardedJedis);
	}

	/**
	 * 出现异常后,将资源返还给pool
	 * 目前这个方法弃用了
	 * 也许shardedJedis与jedisCluster类似,会自己管理连接池
	 * 需要查看源码,待查
	 */
	@SuppressWarnings("deprecation")
	@Override
	public void returnResource(ShardedJedis shardedJedis, boolean broken)
	{
		if (broken) {
            shardedJedisPool.returnBrokenResource(shardedJedis);
        } else {
            shardedJedisPool.returnResource(shardedJedis);
        }		
	}

	public ShardedJedisPool getShardedJedisPool()
	{
		return shardedJedisPool;
	}

	public void setShardedJedisPool(ShardedJedisPool shardedJedisPool)
	{
		this.shardedJedisPool = shardedJedisPool;
	}

	public static Logger getLogger()
	{
		return logger;
	}

}
