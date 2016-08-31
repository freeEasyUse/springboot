package org.simple.spbo.web;

import java.util.Arrays;
import java.util.Date;

import org.simple.spbo.entity.Demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 返回json数据
 * @author GeL
 *
 */

@RestController
@RequestMapping("/demo")
public class DemoController {

	@RequestMapping("getDemo")
	public Demo getDemo(){
		Demo d = new Demo();
		d.setAge(18);
		d.setId(1);
		d.setName("test");
		d.setBirthday(new Date());
		d.setLikse(Arrays.asList("basketboll","pingpang","football"));
		return d;
	}
	
	@RequestMapping("getException")
	public String getException(){
		int a = 100/0;
		return "正常返回";
	}
	
}
