package org.simple.spbo.web;

import org.simple.spbo.entity.RedisEntity;
import org.simple.spbo.service.IRedisEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/redis")
public class RedisEntityController {
	
	@Autowired
	private IRedisEntityService iRedisEntityService;
	
	
	@RequestMapping("test")
	@ResponseBody
	public String test(){
		RedisEntity redisEntity = iRedisEntityService.find(1);
		System.out.println("load="+redisEntity);
		
		RedisEntity cacheRedisEntity = iRedisEntityService.find(1);
		System.out.println("cache="+cacheRedisEntity);
		
		redisEntity = iRedisEntityService.find(2);
		System.out.println("loaded2="+redisEntity);
		return "ok";
	}
	
	
	@RequestMapping("/delete")
	@ResponseBody
    public String delete(int id){
		iRedisEntityService.deleteFromCache(id);
        return"ok";
    }
	
	@RequestMapping("/test1")
    public@ResponseBody String test1(){
		iRedisEntityService.test();
        System.out.println("RedisEntityController.test1()");
        return"ok";
    }
}
