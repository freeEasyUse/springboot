package org.simple.spbo.common;

import javax.servlet.MultipartConfigElement;

import org.simple.spbo.common.filter.MyFilter1;
import org.simple.spbo.common.listener.MyListener;
import org.simple.spbo.common.servlet.MyServlet1;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.embedded.MultipartConfigFactory;
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
	
	/**
	 * 上下文启动监听
	 * @return
	 */
	@Bean
	public ServletListenerRegistrationBean<MyListener> setListener(){
		ServletListenerRegistrationBean listen = new ServletListenerRegistrationBean<MyListener>(new MyListener());
		return listen;
	}
	
	
	/**
	 * 文件上传配置
	 * @return
	 */
	@Bean 
    public MultipartConfigElement multipartConfigElement() { 
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //// 设置文件大小限制 ,超了，页面会抛出异常信息，这时候就需要进行异常信息的处理了;
        factory.setMaxFileSize("3MB"); //KB,MB
        /// 设置总上传数据总大小
        factory.setMaxRequestSize("3MB"); 
        //Sets the directory location where files will be stored.
        //factory.setLocation("classpath:upload");
        return factory.createMultipartConfig(); 
    } 
}
