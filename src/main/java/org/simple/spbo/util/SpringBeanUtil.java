package org.simple.spbo.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 定义spring bean工具类 普通类通过改类 可以获取spring 管理的bean
 * 
 * @author GeL
 * 需要添加componet注解  在注入时候 进行上下文的注入 容器启动时候 给上下文赋值
 */
@Component
public class SpringBeanUtil implements ApplicationContextAware {

	private static ApplicationContext applicationContext = null;

	/**
	 * 注册上下文
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		if (SpringBeanUtil.applicationContext == null) {
			SpringBeanUtil.applicationContext = applicationContext;
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println("========ApplicationContext配置成功,在普通类可以通过调用SpringBeanUtil.getAppContext()获取applicationContext对象========");
		System.out.println("---------------------------------------------------------------------");
	}

	
    //获取applicationContext
    public static ApplicationContext getApplicationContext() {
       return applicationContext;
    }
   
    //通过name获取 Bean.
    public static Object getBean(String name){
       return getApplicationContext().getBean(name);
    }
   
    //通过class获取Bean.
    public static <T> T getBean(Class<T> clazz){
       return getApplicationContext().getBean(clazz);
    }
   
    //通过name,以及Clazz返回指定的Bean
    public static <T> T getBean(String name,Class<T> clazz){
       return getApplicationContext().getBean(name, clazz);
    }
	
	
}
