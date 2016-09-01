package org.simple.spbo.common.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 自定义 servlet listener 当servlet触发
 * 通过代码注册
 * @author GeL
 *
 */
public class MyListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		 System.out.println("ServletContextListener销毁");
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("ServletContextListener初始化时候 设置系统参数========");
		arg0.getServletContext().setAttribute("init", "init");
		System.out.println("ServletContextListener初始化");
		
	}

}
