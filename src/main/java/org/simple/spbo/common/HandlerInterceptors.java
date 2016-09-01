package org.simple.spbo.common;

import org.simple.spbo.common.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 注入拦截器
 * 
 * @author GeL
 * 
 */
@Configuration
public class HandlerInterceptors extends WebMvcConfigurerAdapter {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 多个拦截器组成一个拦截器链
		// addPathPatterns 用于添加拦截规则
		// excludePathPatterns 用户排除拦截
		registry.addInterceptor(new MyInterceptor()).addPathPatterns("/student/**");
		super.addInterceptors(registry);
	}
}
