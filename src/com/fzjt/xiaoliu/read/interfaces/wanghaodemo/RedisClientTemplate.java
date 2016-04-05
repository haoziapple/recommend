/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.wanghaodemo.RedisClientTemplate
 * @description:TODO
 * @date:2016-2-22 下午6:02:16
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

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.SortingParams;
import redis.clients.jedis.Tuple;

public class RedisClientTemplate
{
	/**
	 * 日志
	 */
	private static final Logger logger = Logger.getLogger(RedisClientTemplate.class);

	/**
	 * 注入RedisDataSource
	 */
	private RedisDataSource redisDataSource;

	/**
	 * 注入JedisCluster
	 */
	private JedisCluster jedisCluster;

	public void disconnect()
	{
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		shardedJedis.disconnect();
	}

	// 操作String方法
	/**
	 * 设置单个值
	 */
	public String set(String key, String value, boolean cluster)
	{
		if (cluster)
		{
			return clusterSet(key, value);
		}
		return set(key, value);
	}

	public String set(String key, String value)
	{
		String result = null;

		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.set(key, value);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 获取单个值
	 */
	public String get(String key, boolean cluster)
	{
		if (cluster)
		{
			return clusterGet(key);
		}
		return get(key);
	}

	public String get(String key)
	{
		String result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}

		boolean broken = false;
		try
		{
			result = shardedJedis.get(key);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 设置单个值的同事设置生存时间
	 */
	public String setex(String key, int seconds, String value, boolean cluster)
	{
		if (cluster)
		{
			return clusterSetex(key, seconds, value);
		}
		return setex(key, seconds, value);
	}

	public String setex(String key, int seconds, String value)
	{
		String result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.setex(key, seconds, value);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 将key中储存的数字值减一
	 */
	public Long decr(String key, boolean cluster)
	{
		if (cluster)
		{
			return clusterDecr(key);
		}
		return decr(key);
	}

	public Long decr(String key)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.decr(key);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 将key中储存的数字值减去减量
	 */
	public Long decrBy(String key, long integer, boolean cluster)
	{
		if (cluster)
		{
			return clusterDecrBy(key, integer);
		}
		return decrBy(key, integer);
	}

	public Long decrBy(String key, long integer)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.decrBy(key, integer);

		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 将key中储存的数字值加一
	 */
	public Long incr(String key, boolean cluster)
	{
		if (cluster)
		{
			return clusterIncr(key);
		}
		return incr(key);
	}

	public Long incr(String key)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.incr(key);

		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 将key中储存的数字值增加增量
	 */
	public Long incrBy(String key, long integer, boolean cluster)
	{
		if (cluster)
		{
			return clusterIncrBy(key, integer);
		}
		return incrBy(key, integer);
	}

	public Long incrBy(String key, long integer)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.incrBy(key, integer);

		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	// 操作list方法
	/**
	 * 将一个或多个值value插入到列表key的表头 如果key不存在，一个空列表会被创建并执行LPUSH操作
	 */
	public Long lpush(String key, boolean cluster, String... strings)
	{
		if (cluster)
		{
			return clusterLpush(key, strings);
		}
		return lpush(key, strings);
	}

	public Long lpush(String key, String... strings)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.lpush(key, strings);

		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 将一个或多个值value插入到列表key的表尾 如果key不存在，一个空列表会被创建并执行RPUSH操作
	 */
	public Long rpush(String key, boolean cluster, String... strings)
	{
		if (cluster)
		{
			return clusterRpush(key, strings);
		}
		return rpush(key, cluster);
	}

	public Long rpush(String key, String... strings)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.rpush(key, strings);

		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 移除并返回列表key的头元素 当key不存在时，返回null
	 */
	public String lpop(String key, boolean cluster)
	{
		if (cluster)
		{
			return clusterLpop(key);
		}
		return lpop(key);
	}

	public String lpop(String key)
	{
		String result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.lpop(key);

		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 移除并返回列表key的尾元素 当key不存在时，返回null
	 */
	public String rpop(String key, boolean cluster)
	{
		if (cluster)
		{
			return clusterRpop(key);
		}
		return rpop(key);
	}

	public String rpop(String key)
	{
		String result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.rpop(key);

		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 返回列表key中指定区间内的元素 0表示第一个额，-1表示倒数第一个
	 */
	public List<String> lrange(String key, long start, long end, boolean cluster)
	{
		if (cluster)
		{
			return clusterLrange(key, start, end);
		}
		return lrange(key, start, end);
	}

	public List<String> lrange(String key, long start, long end)
	{
		List<String> result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.lrange(key, start, end);

		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 修剪列表key，只保留指定区间内的元素
	 */
	public String ltrim(String key, long start, long end, boolean cluster)
	{
		if (cluster)
		{
			return clusterLtrim(key, start, end);
		}
		return ltrim(key, start, end);
	}

	public String ltrim(String key, long start, long end)
	{
		String result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.ltrim(key, start, end);

		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 返回列表key中,下标为index的元素
	 */
	public String lindex(String key, long index, boolean cluster)
	{
		if (cluster)
		{
			return clusterLindex(key, index);
		}
		return lindex(key, index);
	}

	public String lindex(String key, long index)
	{
		String result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.lindex(key, index);

		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	// 操作key方法
	/**
	 * 删除单个key
	 */
	public Long del(String key, boolean cluster)
	{
		if (cluster)
		{
			return clusterDel(key);
		}
		return del(key);
	}

	public Long del(String key)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.del(key);

		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 返回给定key的剩余生存时间(time to live)(以秒为单位) 当key不存在或没有设置生存时间时，返回-2
	 */
	public Long ttl(String key, boolean cluster)
	{
		if (cluster)
		{
			return clusterTtl(key);
		}
		return ttl(key);
	}

	public Long ttl(String key)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.ttl(key);

		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 为给定key设置生存时间 设置成功返回1。
	 * 当key不存在或者不能为key设置生存时间时(比如在低于2.1.3中你尝试更新key的生存时间)，返回0
	 */
	public Long expire(String key, int seconds, boolean cluster)
	{
		if (cluster)
		{
			return clusterExpire(key, seconds);
		}
		return expire(key, seconds);
	}

	public Long expire(String key, int seconds)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{

			result = shardedJedis.expire(key, seconds);

		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 设置key在某个unix timestamp过期
	 */
	public Long expireAt(String key, long unixTime, boolean cluster)
	{
		if (cluster)
		{
			return clusterExpireAt(key, unixTime);
		}
		return expireAt(key, unixTime);
	}

	public Long expireAt(String key, long unixTime)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.expireAt(key, unixTime);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 移除某个key的生存时间
	 */
	public Long persist(String key, boolean cluster)
	{
		if (cluster)
		{
			return clusterPersist(key);
		}
		return persist(key);
	}

	public Long persist(String key)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.persist(key);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 返回或保存给定列表、集合、有序集合key中经过排序的元素
	 */
	public List<String> sort(String key)
	{
		List<String> result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.sort(key);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	public List<String> sort(String key, SortingParams sortingParameters)
	{
		List<String> result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.sort(key, sortingParameters);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	// 操作hash表方法
	/**
	 * 设置hash表 返回0-field已经存在且被新值覆盖，1-新建了field
	 */
	public Long hset(String key, String field, String value, boolean cluster)
	{
		if (cluster)
		{
			return clusterHset(key, field, value);
		}
		return hset(key, field, value);
	}

	public Long hset(String key, String field, String value)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.hset(key, field, value);

		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 读取hash表单个field
	 */
	public String hget(String key, String field, boolean cluster)
	{
		if (cluster)
		{
			return clusterHget(key, field);
		}
		return hget(key, field);
	}

	public String hget(String key, String field)
	{
		String result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.hget(key, field);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 同时将多个field-value对设置到哈希表key中。此命令会覆盖哈希表中已存在的域。
	 */
	public String hmset(String key, Map<String, String> hash, boolean cluster)
	{
		if (cluster)
		{
			return clusterHmset(key, hash);
		}
		return hmset(key, hash);
	}

	public String hmset(String key, Map<String, String> hash)
	{
		String result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.hmset(key, hash);

		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 返回哈希表key中，一个或多个给定域的值。 如果给定的域不存在于哈希表，那么返回一个nil值。
	 * 因为不存在的key被当作一个空哈希表来处理，所以对一个不存在的key进行HMGET操作将返回一个只带有nil值的表。
	 */
	public List<String> hmget(String key, boolean cluster, String... fields)
	{
		if (cluster)
		{
			return clusterHmget(key, fields);
		}
		return hmget(key, fields);
	}

	public List<String> hmget(String key, String... fields)
	{
		List<String> result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.hmget(key, fields);

		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 返回哈希表key中，所有的域和值
	 */
	public Map<String, String> hgetAll(String key, boolean cluster)
	{
		if (cluster)
		{
			return clusterHgetAll(key);
		}
		return hgetAll(key);
	}

	public Map<String, String> hgetAll(String key)
	{
		Map<String, String> result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.hgetAll(key);

		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 删除哈希表key中的一个或多个指定域，不存在的域将被忽略
	 */
	public Long hdel(String key, boolean cluster, String... field)
	{
		if (cluster)
		{
			return clusterHdel(key, field);
		}
		return hdel(key, field);
	}

	public Long hdel(String key, String... field)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.hdel(key, field);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 为哈希表key中的域field的值加上增量increment 增量也可以为负数，相当于对给定域进行减法操作
	 * 如果key不存在，一个新的哈希表被创建并执行HINCRBY命令 如果域field不存在，那么在执行命令前，域的值被初始化为0
	 */
	public Long hincrBy(String key, String field, long value, boolean cluster)
	{
		if (cluster)
		{
			return clusterHincrBy(key, field, value);
		}
		return hincrBy(key, field, value);
	}

	public Long hincrBy(String key, String field, long value)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.hincrBy(key, field, value);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	// 操作集合
	/**
	 * 将一个或多个member元素加入到集合key当中，已经存在于集合的member元素将被忽略
	 */
	public Long sadd(String key, boolean cluster, String... members)
	{
		if (cluster)
		{
			return clusterSadd(key, members);
		}
		return sadd(key, members);
	}

	public Long sadd(String key, String... members)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.sadd(key, members);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 移除集合key中的一个或多个member元素，不存在的member元素会被忽略
	 */
	public Long srem(String key, boolean cluster, String... members)
	{
		if (cluster)
		{
			return clusterSrem(key, members);
		}
		return srem(key, members);
	}

	public Long srem(String key, String... members)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.srem(key, members);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 返回集合key中的所有成员
	 */
	public Set<String> smembers(String key, boolean cluster)
	{
		if (cluster)
		{
			return clusterSmembers(key);
		}
		return smembers(key);
	}

	public Set<String> smembers(String key)
	{
		Set<String> result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.smembers(key);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 判断member元素是否是集合key的成员
	 */
	public boolean sismember(String key, String member, boolean cluster)
	{
		if (cluster)
		{
			return clusterSismember(key, member);
		}
		return sismember(key, member);
	}

	public boolean sismember(String key, String member)
	{
		boolean result = false;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.sismember(key, member);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 返回集合key集合中元素的数量
	 */
	public Long scard(String key, boolean cluster)
	{
		if (cluster)
		{
			return clusterScard(key);
		}
		return scard(key);
	}

	public Long scard(String key)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.scard(key);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 移除并返回集合中的一个随机元素
	 */
	public String spop(String key, boolean cluster)
	{
		if (cluster)
		{
			return clusterSpop(key);
		}
		return spop(key);
	}

	public String spop(String key)
	{
		String result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.spop(key);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 返回集合中的一个随机元素
	 */
	public String srandmember(String key, boolean cluster)
	{
		if (cluster)
		{
			return clusterSrandmember(key);
		}
		return srandmember(key);
	}

	public String srandmember(String key)
	{
		String result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.srandmember(key);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	// 操作有序集(Sorted Set)
	/**
	 * 将一个或多个member元素及其score值加入到有序集key当中 如果某个member已经是有序集的成员，那么更新这个member的score值
	 * 并通过重新插入这个member元素，来保证该member在正确的位置上
	 */
	public Long zadd(String key, Map<String, Double> scoreMembers, boolean cluster)
	{
		if (cluster)
		{
			return clusterZadd(key, scoreMembers);
		}
		return zadd(key, scoreMembers);
	}

	public Long zadd(String key, Map<String, Double> scoreMembers)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.zadd(key, scoreMembers);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 移除有序集key中的一个或多个成员，不存在的成员将被忽略
	 */
	public Long zrem(String key, boolean cluster, String... members)
	{
		if (cluster)
		{
			return clusterZrem(key, members);
		}
		return zrem(key, members);
	}

	public Long zrem(String key, String... members)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.zrem(key, members);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 移除有序集key中的一个或多个成员，不存在的成员将被忽略
	 */
	public Long zcard(String key, boolean cluster)
	{
		if (cluster)
		{
			return clusterZcard(key);
		}
		return zcard(key);
	}

	public Long zcard(String key)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.zcard(key);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 返回有序集key中，score值在min和max之间,包括score值等于min或max的成员数量
	 */
	public Long zcount(String key, String min, String max, boolean cluster)
	{
		if (cluster)
		{
			return clusterZcount(key, min, max);
		}
		return zcount(key, min, max);
	}

	public Long zcount(String key, String min, String max)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.zcount(key, min, max);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 返回有序集key中，成员member的score值
	 */
	public Double zscore(String key, String member, boolean cluster)
	{
		if (cluster)
		{
			return clusterZscore(key, member);
		}
		return zscore(key, member);
	}

	public Double zscore(String key, String member)
	{
		Double result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.zscore(key, member);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 为有序集key的成员member的score值加上增量increment
	 */
	public Double zincrBy(String key, double increment, String member, boolean cluster)
	{
		if (cluster)
		{
			return clusterZincrBy(key, increment, member);
		}
		return zincrBy(key, increment, member);
	}

	public Double zincrBy(String key, double increment, String member)
	{
		Double result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.zincrby(key, increment, member);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 返回有序集key中,指定区间内的成员,从小到大
	 */
	public Set<String> zrange(String key, Long start, Long end, boolean cluster)
	{
		if (cluster)
		{
			return clusterZrange(key, start, end);
		}
		return zrange(key, start, end);
	}

	public Set<String> zrange(String key, Long start, Long end)
	{
		Set<String> result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.zrange(key, start, end);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 返回有序集key中，指定区间内的成员 成员和它的score值一起返回
	 */
	public Set<Tuple> zrangeWithScores(String key, Long start, Long end, boolean cluster)
	{
		if (cluster)
		{
			return clusterZrangeWithScores(key, start, end);
		}
		return zrangeWithScores(key, start, end);
	}

	public Set<Tuple> zrangeWithScores(String key, Long start, Long end)
	{
		Set<Tuple> result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.zrangeWithScores(key, start, end);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 返回有序集key中，所有score值介于min和max之间(包括等于min或max)的成员
	 */
	public Set<String> zrangeByScore(String key, String min, String max, boolean cluster)
	{
		if (cluster)
		{
			return clusterZrangeByScore(key, min, max);
		}
		return zrangeByScore(key, min, max);
	}

	public Set<String> zrangeByScore(String key, String min, String max)
	{
		Set<String> result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.zrangeByScore(key, min, max);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 返回有序集key中，所有score值介于min和max之间(包括等于min或max)的成员 有序集成员及其score值一起返回
	 */
	public Set<Tuple> zrangeByScoreWithScores(String key, String min, String max, boolean cluster)
	{
		if (cluster)
		{
			return clusterZrangeByScoreWithScores(key, min, max);
		}
		return zrangeByScoreWithScores(key, min, max);
	}

	public Set<Tuple> zrangeByScoreWithScores(String key, String min, String max)
	{
		Set<Tuple> result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.zrangeByScoreWithScores(key, min, max);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 返回有序集key中成员member的排名 其中有序集成员按score值递增(从小到大)顺序排列 排名以0为底,score值最小的成员排名为0
	 */
	public Long zrank(String key, String member, boolean cluster)
	{
		if (cluster)
		{
			return clusterZrank(key, member);
		}
		return zrank(key, member);
	}

	public Long zrank(String key, String member)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.zrank(key, member);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 返回有序集key中成员member的排名 其中有序集成员按score值递减(从大到小)排序 排名以0为底,score值最大的成员排名为0
	 */
	public Long zrevrank(String key, String member, boolean cluster)
	{
		if (cluster)
		{
			return clusterZrevrank(key, member);
		}
		return zrevrank(key, member);
	}

	public Long zrevrank(String key, String member)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.zrevrank(key, member);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 返回有序集中指定区间的成员,从大到小
	 */
	public Set<String> zrevrange(String key, Long start, Long end, boolean cluster)
	{
		if(cluster)
		{
			return clusterZrevrange(key, start, end);
		}
		return zrevrange(key, start, end);
	}
	public Set<String> zrevrange(String key, Long start, Long end)
	{
		Set<String> result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.zrevrange(key, start, end);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 移除有序集key中，指定排名(rank)区间内的所有成员 包含start和end在内
	 */
	public Long zremRangeByRank(String key, Long start, Long end, boolean cluster)
	{
		if (cluster)
		{
			return clusterZremRangeByRank(key, start, end);
		}
		return zremRangeByRank(key, start, end);
	}

	public Long zremRangeByRank(String key, Long start, Long end)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.zremrangeByRank(key, start, end);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	/**
	 * 移除有序集key中，所有score值介于min和max之间(包括等于min或max)的成员
	 */
	public Long zremRangeByScore(String key, String min, String max, boolean cluster)
	{
		if (cluster)
		{
			return clusterZremRangeByScore(key, min, max);
		}
		return clusterZremRangeByScore(key, min, max);
	}

	public Long zremRangeByScore(String key, String min, String max)
	{
		Long result = null;
		ShardedJedis shardedJedis = redisDataSource.getRedisClient();
		if (shardedJedis == null)
		{
			return result;
		}
		boolean broken = false;
		try
		{
			result = shardedJedis.zremrangeByScore(key, min, max);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			broken = true;
		}
		finally
		{
			redisDataSource.returnResource(shardedJedis, broken);
		}
		return result;
	}

	// /////////////集群模式
	// 操作String方法
	/**
	 * 设置单个值(集群模式)
	 */
	public String clusterSet(String key, String value)
	{
		String result = null;
		try
		{
			result = jedisCluster.set(key, value);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 获取单个值(集群模式)
	 */
	public String clusterGet(String key)
	{
		String result = null;
		try
		{
			result = jedisCluster.get(key);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 设置单个值的同事设置生存时间(集群模式)
	 */
	public String clusterSetex(String key, int seconds, String value)
	{
		String result = null;
		try
		{
			result = jedisCluster.setex(key, seconds, value);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 将key中储存的数字值减一(集群模式)
	 */
	public Long clusterDecr(String key)
	{
		Long result = null;
		try
		{
			result = jedisCluster.decr(key);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 将key中储存的数字值减去减量(集群模式)
	 */
	public Long clusterDecrBy(String key, long integer)
	{
		Long result = null;
		try
		{
			result = jedisCluster.decrBy(key, integer);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 将key中储存的数字值加一(集群模式)
	 */
	public Long clusterIncr(String key)
	{
		Long result = null;
		try
		{
			result = jedisCluster.incr(key);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 将key中储存的数值加上增量(集群模式)
	 */
	public Long clusterIncrBy(String key, long integer)
	{
		Long result = null;
		try
		{
			result = jedisCluster.incrBy(key, integer);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	// 操作list方法

	/**
	 * 将一个或多个值value插入到列表key的表头(集群模式) 如果key不存在，一个空列表会被创建并执行LPUSH操作
	 */
	public Long clusterLpush(String key, String... strings)
	{
		Long result = null;
		try
		{
			result = jedisCluster.lpush(key, strings);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 将一个或多个值value插入到列表key的表尾(集群模式) 如果key不存在，一个空列表会被创建并执行RPUSH操作
	 */
	public Long clusterRpush(String key, String... strings)
	{
		Long result = null;
		try
		{
			result = jedisCluster.rpush(key, strings);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 移除并返回列表key的头元素(集群模式) 当key不存在时，返回null
	 */
	public String clusterLpop(String key)
	{
		String result = null;
		try
		{
			result = jedisCluster.lpop(key);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 移除并返回列表key的尾元素(集群模式) 当key不存在时，返回null
	 */
	public String clusterRpop(String key)
	{
		String result = null;
		try
		{
			result = jedisCluster.rpop(key);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 返回列表key中指定区间内的元素(集群模式) 0表示第一个额，-1表示倒数第一个
	 */
	public List<String> clusterLrange(String key, long start, long end)
	{
		List<String> result = null;
		try
		{
			result = jedisCluster.lrange(key, start, end);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 修剪列表key，只保留指定区间内的元素(集群模式)
	 */
	public String clusterLtrim(String key, long start, long end)
	{
		String result = null;
		try
		{
			result = jedisCluster.ltrim(key, start, end);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 返回列表key中,下标为index的元素(集群模式)
	 */
	public String clusterLindex(String key, long index)
	{
		String result = null;
		try
		{
			result = jedisCluster.lindex(key, index);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	// 操作key方法
	/**
	 * 删除单个key(集群模式)
	 */
	public Long clusterDel(String key)
	{
		Long result = null;
		try
		{
			jedisCluster.del(key);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 集群模式 返回给定key的剩余生存时间(time to live)(以秒为单位) 当key不存在或没有设置生存时间时，返回-2
	 */
	public Long clusterTtl(String key)
	{
		Long result = null;
		try
		{
			result = jedisCluster.ttl(key);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 集群模式 为给定key设置生存时间 设置成功返回1。
	 * 当key不存在或者不能为key设置生存时间时(比如在低于2.1.3中你尝试更新key的生存时间)，返回0
	 */
	public Long clusterExpire(String key, int seconds)
	{
		Long result = null;
		try
		{
			result = jedisCluster.expire(key, seconds);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 设置key在某个unix timestamp过期(集群模式)
	 */
	public Long clusterExpireAt(String key, long unixTime)
	{
		Long result = null;
		try
		{
			result = jedisCluster.expireAt(key, unixTime);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 移除某个key的生存时间(集群模式)
	 */
	public Long clusterPersist(String key)
	{
		Long result = null;
		try
		{
			result = jedisCluster.persist(key);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 返回或保存给定列表、集合、有序集合key中经过排序的元素(集群模式)
	 */
	public List<String> clusterSort(String key)
	{
		List<String> result = null;
		try
		{
			result = jedisCluster.sort(key);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	public List<String> clusterSort(String key, SortingParams sortingParameters)
	{
		List<String> result = null;
		try
		{
			result = jedisCluster.sort(key, sortingParameters);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	// 操作hash表方法
	/**
	 * 设置hash表单个field(集群模式)
	 */
	public Long clusterHset(String key, String field, String value)
	{
		Long result = null;
		try
		{
			result = jedisCluster.hset(key, field, value);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 读取hash表单个field(集群模式)
	 */
	public String clusterHget(String key, String field)
	{
		String result = null;
		try
		{
			result = jedisCluster.hget(key, field);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 同时设置多个field-value到哈希表key中(集群模式)
	 */
	public String clusterHmset(String key, Map<String, String> hash)
	{
		String result = null;
		try
		{
			result = jedisCluster.hmset(key, hash);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 返回哈希表key中，一个或多个给定域的值(集群模式)
	 */
	public List<String> clusterHmget(String key, String... fields)
	{
		List<String> result = null;
		try
		{
			result = jedisCluster.hmget(key, fields);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 返回哈希表key中，所有的域和值(集群模式)
	 */
	public Map<String, String> clusterHgetAll(String key)
	{
		Map<String, String> result = null;
		try
		{
			result = jedisCluster.hgetAll(key);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 删除哈希表key中的一个或多个指定域，不存在的域将被忽略(集群模式)
	 */
	public Long clusterHdel(String key, String... field)
	{
		Long result = null;
		try
		{
			result = jedisCluster.hdel(key, field);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;

	}

	/**
	 * 为哈希表key中的域field的值加上增量increment(集群模式) 增量也可以为负数，相当于对给定域进行减法操作
	 * 如果key不存在，一个新的哈希表被创建并执行HINCRBY命令 如果域field不存在，那么在执行命令前，域的值被初始化为0
	 */
	public Long clusterHincrBy(String key, String field, long value)
	{
		Long result = null;
		try
		{
			result = jedisCluster.hincrBy(key, field, value);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;

	}

	// 操作集合(Set)方法
	/**
	 * 将一个或多个member元素加入到集合key当中，已经存在于集合的member元素将被忽略(集群模式)
	 */
	public Long clusterSadd(String key, String... members)
	{
		Long result = null;
		try
		{
			result = jedisCluster.sadd(key, members);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 移除集合key中的一个或多个member元素，不存在的member元素会被忽略(集群模式)
	 */
	public Long clusterSrem(String key, String... members)
	{
		Long result = null;
		try
		{
			result = jedisCluster.srem(key, members);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 返回集合key中的所有成员(集群模式)
	 */
	public Set<String> clusterSmembers(String key)
	{
		Set<String> result = null;
		try
		{
			result = jedisCluster.smembers(key);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 判断member元素是否是集合key的成员(集群模式)
	 */
	public boolean clusterSismember(String key, String member)
	{
		boolean result = false;
		try
		{
			result = jedisCluster.sismember(key, member);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 移除并返回集合中的一个随机元素(集群模式)
	 */
	public String clusterSpop(String key)
	{
		String result = null;
		try
		{
			result = jedisCluster.spop(key);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 返回集合中的一个随机元素(集群模式)
	 */
	public String clusterSrandmember(String key)
	{
		String result = null;
		try
		{
			result = jedisCluster.srandmember(key);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 返回集合key中元素的数量(集群模式)
	 */
	public Long clusterScard(String key)
	{
		Long result = null;
		try
		{
			result = jedisCluster.scard(key);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	// 操作有序集(Sorted Set)
	/**
	 * 将一个或多个member元素及其score值加入到有序集key当中 如果某个member已经是有序集的成员，那么更新这个member的score值
	 * 并通过重新插入这个member元素，来保证该member在正确的位置上
	 */
	public Long clusterZadd(String key, Map<String, Double> scoreMembers)
	{
		Long result = null;
		try
		{
			result = jedisCluster.zadd(key, scoreMembers);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 移除有序集key中的一个或多个成员，不存在的成员将被忽略
	 */
	public Long clusterZrem(String key, String... members)
	{
		Long result = null;
		try
		{
			result = jedisCluster.zrem(key, members);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 返回有序集key的基数
	 */
	public Long clusterZcard(String key)
	{
		Long result = null;
		try
		{
			result = jedisCluster.zcard(key);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 返回有序集key中，score值在min和max之间,包括score值等于min或max的成员数量
	 */
	public Long clusterZcount(String key, String min, String max)
	{
		Long result = null;
		try
		{
			result = jedisCluster.zcount(key, min, max);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 返回有序集key中，成员member的score值
	 */
	public Double clusterZscore(String key, String member)
	{
		Double result = null;
		try
		{
			result = jedisCluster.zscore(key, member);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 为有序集key的成员member的score值加上增量increment
	 */
	public Double clusterZincrBy(String key, double increment, String member)
	{
		Double result = null;
		try
		{
			result = jedisCluster.zincrby(key, increment, member);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 返回有序集key中，指定区间内的成员,从小到大
	 */
	public Set<String> clusterZrange(String key, Long start, Long end)
	{
		Set<String> result = null;
		try
		{
			result = jedisCluster.zrange(key, start, end);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 返回有序集key中，指定区间内的成员 成员和它的score值一起返回
	 */
	public Set<Tuple> clusterZrangeWithScores(String key, Long start, Long end)
	{
		Set<Tuple> result = null;
		try
		{
			result = jedisCluster.zrangeWithScores(key, start, end);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 返回有序集key中，所有score值介于min和max之间(包括等于min或max)的成员
	 */
	public Set<String> clusterZrangeByScore(String key, String min, String max)
	{
		Set<String> result = null;
		try
		{
			result = jedisCluster.zrangeByScore(key, min, max);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 返回有序集key中，所有score值介于min和max之间(包括等于min或max)的成员 有序集成员及其score值一起返回
	 */
	public Set<Tuple> clusterZrangeByScoreWithScores(String key, String min, String max)
	{
		Set<Tuple> result = null;
		try
		{
			result = jedisCluster.zrangeByScoreWithScores(key, min, max);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 返回有序集key中成员member的排名 其中有序集成员按score值递增(从小到大)顺序排列 排名以0为底,score值最小的成员排名为0
	 */
	public Long clusterZrank(String key, String member)
	{
		Long result = null;
		try
		{
			result = jedisCluster.zrank(key, member);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 返回有序集key中成员member的排名 其中有序集成员按score值递减(从大到小)排序 排名以0为底,score值最大的成员排名为0
	 */
	public Long clusterZrevrank(String key, String member)
	{
		Long result = null;
		try
		{
			result = jedisCluster.zrevrank(key, member);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 返回有序集中指定区间的成员,从大到小
	 */
	public Set<String> clusterZrevrange(String key, Long start, Long end)
	{
		Set<String> result = null;
		try
		{
			result = jedisCluster.zrevrange(key, start, end);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 移除有序集key中，指定排名(rank)区间内的所有成员 包含start和end在内
	 */
	public Long clusterZremRangeByRank(String key, Long start, Long end)
	{
		Long result = null;
		try
		{
			result = jedisCluster.zremrangeByRank(key, start, end);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	/**
	 * 移除有序集key中，所有score值介于min和max之间(包括等于min或max)的成员
	 */
	public Long clusterZremRangeByScore(String key, String min, String max)
	{
		Long result = null;
		try
		{
			result = jedisCluster.zremrangeByScore(key, min, max);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}
		return result;
	}

	public RedisDataSource getRedisDataSource()
	{
		return redisDataSource;
	}

	public void setRedisDataSource(RedisDataSource redisDataSource)
	{
		this.redisDataSource = redisDataSource;
	}

	public JedisCluster getJedisCluster()
	{
		return jedisCluster;
	}

	public void setJedisCluster(JedisCluster jedisCluster)
	{
		this.jedisCluster = jedisCluster;
	}

	public static Logger getLogger()
	{
		return logger;
	}

	/**
	 * 测试代码
	 */
	public static void main(String[] args)
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"classpath:com/fzjt/xiaoliu/read/interfaces/cfg/spring/applicationContext.xml");
		RedisClientTemplate redisClient = (RedisClientTemplate) ac.getBean("redisClientTemplate");
		Set<String> set = redisClient.zrevrange("recommend:U201511090405386643", new Long(0), new Long(3));
		for(String temp : set)
		{
			System.out.println(temp);
		}
		// 单个值
		// redisClient.set("a", "abcde");
		// System.out.println(redisClient.get("a"));

		// hash表单个值
		// redisClient.clusterHset("fzjt", "testfield", "abc");
		// System.out.println(redisClient.clusterHget("fzjt", "testfield"));

		// hash表多个值
		// Map<String, String> map = new HashMap<String, String>();
		// map.put("a", "abc");
		// map.put("b", "bcd");
		// map.put("c", "cde");
		// redisClient.hmset("test", map, false);

		// System.out.println(redisClient.hmset("testmap", map));
		// System.out.println(redisClient.hmget("testmap", "a", "b", "c"));
		// hash表删除值
		// System.out.println(redisClient.hdel("testmap", "a", "b"));
		// hash表所有值
		// System.out.println(redisClient.hgetAll("testmap"));
		// System.out.println(redisClient.clusterHdel("testmap", "c"));
		// System.out.println(redisClient.clusterHgetAll("testmap"));
		// 取得生存时间
		// System.out.println(redisClient.expire("testmap", 30));
		// System.out.println(redisClient.clusterExpire("testmap", 30));
		// System.out.println(redisClient.clusterTtl("temap"));
		// System.out.println(redisClient.ttl("temap"));
		// System.out.println(redisClient.clusterSet("wanghaotest", "4"));
		// System.out.println(redisClient.clusterIncrBy("wanghaotest", 2));
		// System.out.println(redisClient.clusterGet("wanghaotest"));
		// System.out.println(redisClient.clusterRpush("wanghaotes", "1", "2",
		// "3"));
		// System.out.println(redisClient.clusterLpop("wanghaotes"));

		// Map<String, Double> set = new HashMap<String, Double>();
		// set.put("a", 1.2); set.put("b", 0.2); set.put("c", 1.1);
		// System.out.println(redisClient.clusterZadd("test sorted set", set));
		// System.out.println(redisClient.clusterZrange("test sorted set", new
		// Long(0), new Long(-1)));
		// System.out.println(redisClient.clusterZrangeWithScores("test sorted set",
		// new Long(0), new Long(-1)));
		// String test = "test String";
		// System.out.println(test);
		// System.out.println(test.hashCode());
	}

}
