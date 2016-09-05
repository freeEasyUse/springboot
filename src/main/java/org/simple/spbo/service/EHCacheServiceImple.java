package org.simple.spbo.service;


import org.simple.spbo.dao.IEHCacheEntityDao;
import org.simple.spbo.entity.EHCacheEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

@Service
public class EHCacheServiceImple implements IEHCacheService {

    //这里的单引号不能少，否则会报错，被识别是一个对象;
    public static final String CACHE_KEY = "'ehcache'";
	
    /**
     * value属性表示使用哪个缓存策略，缓存策略在ehcache.xml
    */
    public static final String DEMO_CACHE_NAME = "demo";
    
	@Autowired
	private IEHCacheEntityDao iehCacheEntityDao;

	
	@Cacheable(value=DEMO_CACHE_NAME,key="'ehcache_'+#id")
	@Override
	public EHCacheEntity findById(long id) {
		System.err.println("从数据库中获取 ehcacheentity"+id);
		return iehCacheEntityDao.findOne(id);
	}

	
	 @CacheEvict(value = DEMO_CACHE_NAME,key = "'ehcache_'+#id")//这是清除缓存.
	@Override
	public void delete(long id) {
		 iehCacheEntityDao.delete(id);
	}

	 
 	/**
     * http://www.mincoder.com/article/2096.shtml:
     *
     * 修改数据.
     *
     * 在支持Spring Cache的环境下，对于使用@Cacheable标注的方法，Spring在每次执行前都会检查Cache中是否存在相同key的缓存元素，如果存在就不再执行该方法，而是直接从缓存中获取结果进行返回，否则才会执行并将返回结果存入指定的缓存中。
     * @CachePut也可以声明一个方法支持缓存功能。与@Cacheable不同的是使用@CachePut标注的方法在执行前不会去检查缓存中是否存在之前执行过的结果，而是每次都会执行该方法，并将执行结果以键值对的形式存入指定的缓存中。
 
       @CachePut也可以标注在类上和方法上。使用@CachePut时我们可以指定的属性跟@Cacheable是一样的。
     *
     * @param updated
     * @return
     *
     * @throws NotFoundException
     */
    @CachePut(value = DEMO_CACHE_NAME,key = "'ehcache_'+#updated.getId()")	//执行后 加入缓存
    @CacheEvict(value = DEMO_CACHE_NAME,key = "'ehcache_'+#updated.getId()")	//删除缓存
	@Override
	public EHCacheEntity update(EHCacheEntity updated) throws NotFoundException {
		EHCacheEntity res = iehCacheEntityDao.findOne(updated.getId());
		if(res == null){
			res = new EHCacheEntity();
		}
		res.setName(updated.getName());
		res.setPwd(updated.getPwd());
		return res;
	}

	
	@CacheEvict(value=DEMO_CACHE_NAME,key=CACHE_KEY)
	@Override
	public EHCacheEntity save(EHCacheEntity entity) {
		return iehCacheEntityDao.save(entity);
	}
	
	
	
}
