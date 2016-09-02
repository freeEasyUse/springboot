package org.simple.spbo.common.command;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 * sprng boot启动时候 执行 run方法
 * order 指定执行顺序
 * 参数在程序启动代码中设置 这里是App.java类中的main方法
 * @author GeL
 *
 */
@Component
@Order(value = 1)
public class MyCommandLineRunner1 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("系统执行时候加载11111111111111-----------------");
		for(String s:args){
			System.out.println("======="+s+"=======");
		}
	}

}
