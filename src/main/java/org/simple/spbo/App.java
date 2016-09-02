package org.simple.spbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * springBoot
 * @author GeL
 *
 */
@SpringBootApplication
@ServletComponentScan	//开启注解注入servlet
@EnableConfigurationProperties	//支持属性文件
@ComponentScan(basePackages={"org.simple"})	//指定spring boot扫描的类
public class App {
	public static void main(String[] args) {
		//设置启动执行参数
		args = new String[]{"hello,","world"};
		SpringApplication.run(App.class, args);
	}
}
