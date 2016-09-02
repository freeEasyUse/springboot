package org.simple.sp.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.simple.spbo.App;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 测试基础类
 * @author GeL
 *
 */
////SpringJUnit支持，由此引入Spring-Test框架支持！
@RunWith(SpringJUnit4ClassRunner.class)

////指定我们SpringBoot工程的Application启动类
@SpringApplicationConfiguration(classes = App.class)

///由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public abstract class BaseTest {

	/**
	 * 每个test执行之前
	 */
	@Before
	public void before(){
		System.out.println("测试执行前");
	}

	/**
	 * 整个测试启动之前
	 */
	@BeforeClass
	public static void beforeClass(){
		System.out.println("整个测试执行之前");
	}
	
	
	@After
	public void after(){
		System.out.println("测试执行之后");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("整个测试执行之后");
	}
}
