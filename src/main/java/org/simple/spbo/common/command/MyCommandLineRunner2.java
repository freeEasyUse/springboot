package org.simple.spbo.common.command;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 * sprng boot启动时候 执行 run方法
 * order 指定执行顺序
 * @author GeL
 *
 */
@Component
@Order(value = 2)
public class MyCommandLineRunner2 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("系统执行时候加载2222222222-----------------");
		for(String s:args){
			System.out.println("======="+s+"=======");
		}
	}

}
