package org.simple.spbo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * restcontroll����rest���� ����json����
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
