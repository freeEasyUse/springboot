package org.simple.spbo.util;

import org.simple.spbo.entity.PropEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 用于获取系统环境变量 以及 Property 文件内容
 * @author GeL
 *
 */
@Component
public class GetProperty implements EnvironmentAware {

	//获取属性文件中的值
	@Value(value="${spring.datasource.type}")
	private String dataType;
	
	/**
	 * 该方法在系统启动时候执行
	 * environment 环境包括当前默认属性文件 已经系统变量设置
	 */
	@Override
	public void setEnvironment(Environment environment) {
		System.out.println("输出属性文件中注入的值:======="+this.dataType);
		System.out.println("输出系统参数JAVA_HOME======="+environment.getProperty("JAVA_HOME"));
		
	}

}
