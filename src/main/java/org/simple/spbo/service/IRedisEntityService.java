package org.simple.spbo.service;

import org.simple.spbo.entity.RedisEntity;

/**
 * RedisEntity service
 * @author GeL
 *
 */
public interface IRedisEntityService {
	public RedisEntity find(int id);
	
	public void deleteFromCache(int id);
	
	public void test();
}
