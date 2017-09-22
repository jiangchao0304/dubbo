package com.sunvalley;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

/**
 * 
 * redis工具类
 */
public class RedisUtil {
	private static ApplicationContext context;
	private static ShardedJedisPool pool;
	static {
		try {
			context = new ClassPathXmlApplicationContext("applicationContext-redis.xml");
		} catch (Exception e) {
			throw new IllegalArgumentException("applicationContext-redis.xml没有被找到");
		}

		if (context == null) {
			throw new IllegalArgumentException("context不允许为空");
		}
		pool = (ShardedJedisPool) context.getBean("shardedJedisPool");
		if (pool == null) {
			throw new IllegalArgumentException("bean name 'shardedJedisPool' is not defined");
		}
		// JedisPoolConfig config = new JedisPoolConfig();//Jedis池配置
		// //config.setMaxActive(500);//最大活动的对象个数
		// config.setMaxIdle(1000 * 60);//对象最大空闲时间
		// //config.setMaxWait(1000 * 10);//获取对象时最大等待时间
		// config.setTestOnBorrow(true);
		// String hostA = "10.45.187.87";
		// int portA = 6379;
		// String hostB = "10.45.184.14";
		// int portB = 6379;
		// List<JedisShardInfo> jdsInfoList = new ArrayList<JedisShardInfo>(2);
		// JedisShardInfo infoA = new JedisShardInfo(hostA, portA);
		// infoA.setPassword("xunke");
		// JedisShardInfo infoB = new JedisShardInfo(hostB, portB);
		// infoB.setPassword("xunke");
		// jdsInfoList.add(infoA);
		// jdsInfoList.add(infoB);
		// pool = new ShardedJedisPool(config, jdsInfoList);
	}

	/**
	 * 
	 * @Description: 删除键
	 * @remark
	 * @param key
	 * @author 
	 * @date 2016-4-23
	 */
	public static Long delete(String key) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			long a = jedis.del(key);
			return a;
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}

	/**
	 * 
	 * @Description: 存储数据(string)
	 * @remark
	 * @param key
	 *            键名
	 * @param value
	 *            被保存的值
	 * @author 
	 * @date 2016-4-20
	 */
	public static String set(String key, String value) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			String result = jedis.set(key, value);
			return result;
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}

	/**
	 *
	 * @Description: 当字符串类型的时在value后面追加
	 * @remark
	 * @param key
	 *            键名
	 * @param value
	 *            被保存的值
	 * @author
	 * @date 2016-4-20
	 */
	public static long append(String key, String value) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			long result = jedis.append(key, value);
			return result;
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}

	/**
	 * 
	 * @Description: 设置过期时间
	 * @remark
	 * @param key
	 * @param seconds
	 * @return
	 * @throws Exception
	 * @author 
	 * @date 2016-7-8
	 */
	public static long expire(String key, int seconds) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			Long result = jedis.expire(key, seconds);
			return result;
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}

	/**
	 * 
	 * @Description: 获取数据(string)
	 * @remark
	 * @param key
	 *            键名
	 * @return
	 * @author 
	 * @date 2016-4-20
	 */
	public static String get(String key) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			String result = jedis.get(key);
			return result;
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}



	/**
	 * 
	 * @Description: 存储数据到列表头部(list)
	 * @remark
	 * @param key
	 * @param value
	 * @author 
	 * @date 2016-4-23
	 */
	public static Long lpush(String key, String... value) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			long result = jedis.lpush(key, value);
			return result;
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}

	/**
	 * 
	 * @Description: 存储数据到列表尾部(list)
	 * @remark
	 * @param key
	 * @param value
	 * @author 
	 * @date 2016-4-23
	 */
	public static long rpush(String key, String... value) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			long result = jedis.rpush(key, value);
			return result;
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}

	/**
	 * 
	 * @Description: 返回并删除名称为key的list中的头元素(list)
	 * @remark
	 * @param key
	 * @return
	 * @author 
	 * @date 2016-4-25
	 */
	public static String lpop(String key) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			String value = jedis.lpop(key);
			return value;
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}

	/**
	 * 
	 * @Description: 返回并删除名称为key的list中的尾元素(list)
	 * @remark
	 * @param key
	 * @return
	 * @author 
	 * @date 2016-4-25
	 */
	public static String rpop(String key) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			String value = jedis.rpop(key);
			return value;
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}

	/**
	 * 
	 * @Description: 获取列表长度(list)
	 * @remark
	 * @param key
	 * @return
	 * @author 
	 * @date 2016-4-25
	 */
	public static Long llen(String key) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			Long length = jedis.llen(key);
			return length;
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}

	/**
	 * 
	 * @Description: 删除列表中的值(list)
	 * @remark
	 * @param key
	 * @param value
	 * @author 
	 * @date 2016-4-25
	 */
	public static Long lrem(String key, String value) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			// 删除count个名称为key的list中值为value的元素。count为0，删除所有值为value的元素，count>0
			// 从头至尾删除count个值为value的元素，count<0从尾到头删除|count|个值为value的元素
			Long size = jedis.lrem(key, 0, value);
			return size;
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}

	/**
	 * 
	 * @Description: 根据匹配的键名，删除相应的值
	 * @remark
	 * @param keyPattern
	 * @param value
	 * @author 
	 * @date 2016-6-23
	 */
	public static void removeValueByMatchkey(String keyPattern, String value) throws Exception {
		ShardedJedis shardedJedis = pool.getResource();
		try {
			Collection<Jedis> jedisCollection = shardedJedis.getAllShards();
			for (Jedis jedis : jedisCollection) {
				Set<String> keys = jedis.keys("*" + keyPattern + "*");
				for (String key : keys) {
					RedisUtil.lrem(key, value);
				}
			}
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(shardedJedis);
		}

	}

	/**
	 * 
	 * @Description: 获取列表所有记录(list)
	 * @remark
	 * @param key
	 * @return
	 * @author 
	 * @date 2016-4-23
	 */
	public static List<String> getAll(String key) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			List<String> list = jedis.lrange(key, 0, -1);
			return list;
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}

	/**
	 * 
	 * @Description: 获范围取出列表数据(list)
	 * @remark
	 * @param key
	 *            键
	 * @param start
	 *            开始位置
	 * @param end
	 *            结束位置
	 * @return
	 * @author 
	 * @date 2016-4-25
	 */
	public static List<String> getList(String key, int start, int end) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			List<String> list = jedis.lrange(key, start, end);
			return list;
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}

	/**
	 *
	 * @Description: 获取随机N条数据(list)
	 * @remark
	 * @param key
	 *            键
	 * @return null
	 * @author jiangchao
	 * @date 2017-05-07
	 */
	public static List<String> sgetRandom(String key, int count) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			List<String> list = jedis.srandmember(key,count);
			return list;
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}


	/**
	 * getSet
	 * @param key
	 * @param value
	 * @return
	 * @throws Exception
	 */
	public static String sget(String key,String value) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			String result = jedis.getSet(key,value);
			return result;
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}

	public static  Set<String> smembers(String key) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			Set<String> result = jedis.smembers(key);
			return result;
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}

	/**
	 * sadd
	 * @param key
	 * @param value
	 * @return
	 * @throws Exception
	 */
	public static Long sadd(String key, String... value) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			return  jedis.sadd(key,value);
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}


	/**
	 * 获取key集合的总数量
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static Long scard(String key) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			return  jedis.scard(key);
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}

	/**
	 * 随机取一个值并且删除.
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static String spop(String key) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			return jedis.spop(key);
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}

	public static Long srem(String key,String ... value) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			return jedis.srem(key,value);
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}


	public static String hmset(String key, Map<String, String> map) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			return jedis.hmset(key, map);
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}
	
	public static Map<String, String> hgetAll(String key) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			return jedis.hgetAll(key);
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}


	public static List<String> hmget(String key, String... fields) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			return jedis.hmget(key, fields);
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}
	
	public static String hget(String key, String field) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			return jedis.hget(key, field);
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}
	public static void hset(String key, String field,String value) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			jedis.hset(key, field,value);
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}
	
	public static Long hdel(String key, String field) throws Exception {
	    ShardedJedis jedis = pool.getResource();
	    try {
	        return jedis.hdel(key, field);
	    } catch (Exception e) {
	        throw e;
	    } finally {
	        pool.returnResource(jedis);
	    }
	}

	public static Boolean exists (String key) throws Exception {
		ShardedJedis jedis = pool.getResource();
		try {
			return jedis.exists(key);
		} catch (Exception e) {
			throw e;
		} finally {
			pool.returnResource(jedis);
		}
	}
}
