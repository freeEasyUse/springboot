package org.simple.spbo.dao;

import org.simple.spbo.entity.RedisEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * 
 * @author GeL
 * 使用jpa实现redisEntity 持久化操作
 */
public interface IRedisEntityDao extends CrudRepository<RedisEntity, Long> {

}
