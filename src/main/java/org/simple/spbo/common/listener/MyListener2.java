package org.simple.spbo.common.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MyListener2 implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		 System.out.println("HttpSessionListener销毁");
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		 System.out.println("HttpSessionListener创建");
		
	}

}
