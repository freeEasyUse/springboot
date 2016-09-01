package org.simple.spbo.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/**
 * 自定义静态文件映射
 * @author GeL
 *
 */
@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/img/**").addResourceLocations(
				"classpath:/static/img/");
		super.addResourceHandlers(registry);
	}
}
