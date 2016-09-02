package org.simple.outpack;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value=3)
public class OutPackCommand implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("这个是启动类包之外的启动执行命令###################");
	}

}
