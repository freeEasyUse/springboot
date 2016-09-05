package org.xmconf;

/**
 * 当前类不再App.class的子包下 也没有在App.class中配置扫描
 * 定义在xml文件
 * @author GeL
 *
 */
public class HelloService {

	public HelloService(){
		System.out.println("this is HelloServie no config in appClass");
	}
	
}
