/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.wanghaodemo.RedisDataSource
 * @description:TODO
 * @date:2016-2-22 下午3:26:31
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

import redis.clients.jedis.ShardedJedis;

public interface RedisDataSource
{
	/**
	 * 取得redis客户端以执行命令
	 * @Description:
	 * @return
	 * @version:v1.0
	 * @author:WangHao
	 * @date:2016-2-22 下午3:30:57
	 */
	public abstract ShardedJedis getRedisClient();
	/**
	 * 将资源返还给pool
	 * @Description:
	 * @param shardedJedis
	 * @version:v1.0
	 * @author:WangHao
	 * @date:2016-2-22 下午3:31:35
	 */
	public void returnResource(ShardedJedis shardedJedis);
	/**
	 * 出现异常后，将资源返还给pool
	 * @Description:
	 * @param shardedJedis
	 * @param broken
	 * @version:v1.0
	 * @author:WangHao
	 * @date:2016-2-22 下午3:32:17
	 */
	public void returnResource(ShardedJedis shardedJedis, boolean broken);
}
