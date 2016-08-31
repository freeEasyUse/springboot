package org.simple.spbo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * restcontroll构建rest服务 返回json数据
 * @author GeL
 *
 */
@RestController
public class HelloController {

	@RequestMapping("/")
	public String sayHello(){
		return "hello";
	}
	
}
