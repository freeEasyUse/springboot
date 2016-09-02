package org.simple.spbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * springBoot
 * @author GeL
 *
 */
@SpringBootApplication
@ServletComponentScan	//开启注解注入servlet
@EnableConfigurationProperties	//支持属性文件
public class App {
	public static void main(String[] args) {
		//设置启动执行参数
		args = new String[]{"hello,","world"};
		SpringApplication.run(App.class, args);
	}
}
