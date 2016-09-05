package org.simple.spbo.web;

import org.simple.spbo.entity.EHCacheEntity;
import org.simple.spbo.service.IEHCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ehcache")
public class EHCacheEntityController {

	@Autowired
	private IEHCacheService iehCacheService;
	
	
	@RequestMapping("test")
	public String test() throws NotFoundException{
		
		 //存入两条数据.
		EHCacheEntity e1 = new EHCacheEntity();
        e1.setName("张三");
        e1.setPwd("123456");
        EHCacheEntity e2 = iehCacheService.save(e1);
      
        //不走缓存.
        System.out.println(iehCacheService.findById(e2.getId()));
        //走缓存.
        System.out.println(iehCacheService.findById(e2.getId()));
       
       
        EHCacheEntity e3 = new EHCacheEntity();
        e3.setName("李四");
        e3.setPwd("123456");
        EHCacheEntity e4 = iehCacheService.save(e3);
       
        //不走缓存.
        System.out.println(iehCacheService.findById(e4.getId()));
        //走缓存.
        System.out.println(iehCacheService.findById(e4.getId()));
       
        System.out.println("============修改数据=====================");
        //修改数据.
        EHCacheEntity updated = new EHCacheEntity();
        updated.setName("李四-updated");
        updated.setPwd("123456");
        updated.setId(e3.getId());
        iehCacheService.update(updated);
       
       
       //不走缓存.
       System.out.println(iehCacheService.findById(updated.getId()));
       //走缓存
       System.out.println(iehCacheService.findById(updated.getId()));
       
       return "ok";
		
	}
	
}
