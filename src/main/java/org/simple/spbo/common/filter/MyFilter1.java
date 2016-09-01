package org.simple.spbo.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 使用代码组织filter demo
 * @author GeL
 *
 */
public class MyFilter1 implements Filter {

	@Override
	public void destroy() {
		System.out.println("==========销毁myfilter1============");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
        System.out.println("执行过滤操作");
        chain.doFilter(req, res);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("==========初始化myfilter1============");
	}

}
