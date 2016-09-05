package org.simple.spbo.service;

import javax.annotation.Resource;

import org.simple.spbo.dao.IRedisEntityDao;
import org.simple.spbo.entity.RedisEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class RedisEntitySericeImpl implements IRedisEntityService {

	@Autowired
	private IRedisEntityDao iRedisEntityDao;

	@Resource
	private RedisTemplate<String, String> redisTemplate;

	
	/**
	 * 	Cacheable 支持如下几个参数：
		value：缓存位置名称，不能为空，如果使用EHCache，就是ehcache.xml中声明的cache的name
		key：缓存的key，默认为空，既表示使用方法的参数类型及参数值作为key，支持SpEL
		condition：触发条件，只有满足条件的情况才会加入缓存，默认为空，既表示全部都加入缓存，支持SpEL
	 */
	@Cacheable(value = "redisEntity")
	@Override
	public RedisEntity find(int id) {
		System.err.println("DemoInfoServiceImpl.findById()=========从数据库中进行获取的....id="+ id);
		return iRedisEntityDao.findOne((long) id);
	}

	
	/**
	 * @CacheEvict 支持如下几个参数：
		value：缓存位置名称，不能为空，同上
		key：缓存的key，默认为空，同上
		condition：触发条件，只有满足条件的情况才会清除缓存，默认为空，支持SpEL
		allEntries：true表示清除value中的全部缓存，默认为false
	 */
	@CacheEvict(value = "redisEntity")
	@Override
	public void deleteFromCache(int id) {
		System.out.println("DemoInfoServiceImpl.delete().从缓存中删除.");
	}

	@Override
	public void test() {
		ValueOperations<String,String> valueOperations = redisTemplate.opsForValue();
	    valueOperations.set("mykey4", "random1="+Math.random());
	    System.out.println(valueOperations.get("mykey4"));
	}
}
