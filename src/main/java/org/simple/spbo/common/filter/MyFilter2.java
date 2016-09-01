package org.simple.spbo.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * 使用注解 注册filter
 * @author GeL
 *
 */
@WebFilter(urlPatterns="/*",description="filter2")
public class MyFilter2 implements Filter {

	@Override
	public void destroy() {
		System.out.println("==========销毁myfilter2============");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
        System.out.println("执行过滤操作2");
        chain.doFilter(req, res);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("==========初始化myfilter2============");
	}

}
