package org.simple.spbo.common;

import java.util.EventListener;

import org.simple.spbo.common.filter.MyFilter1;
import org.simple.spbo.common.listener.MyListener;
import org.simple.spbo.common.servlet.MyServlet1;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.embedded.ServletListenerRegistrationBean;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 代码注册组件
 * @author GeL
 *
 */
@Configuration
public class CommonConfig {

	private int ServletListenerRegistrationBean;

	/**
	 * 代码组织serverlet
	 * @return
	 */
	@Bean
	public ServletRegistrationBean setServlet(){
		ServletRegistrationBean servlet = new ServletRegistrationBean(new MyServlet1(), "/myservlet");
		return servlet;
	}
	
	/**
	 * 代码注册 filter
	 * @return
	 */
	@Bean
	public FilterRegistrationBean setFilter(){
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new MyFilter1());
		filterRegistrationBean.addUrlPatterns("/*");
		return filterRegistrationBean;
	}
	
	@Bean
	public ServletListenerRegistrationBean<MyListener> setListener(){
		ServletListenerRegistrationBean listen = new ServletListenerRegistrationBean<MyListener>(new MyListener());
		return listen;
	}
	
}
