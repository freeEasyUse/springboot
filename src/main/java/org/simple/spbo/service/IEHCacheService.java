package org.simple.spbo.service;


import org.simple.spbo.entity.EHCacheEntity;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

public interface IEHCacheService {

	EHCacheEntity findById(long id);
	
	void delete(long id);
	
	EHCacheEntity update(EHCacheEntity updated) throws NotFoundException;
	
	EHCacheEntity save(EHCacheEntity entity);
	
}
