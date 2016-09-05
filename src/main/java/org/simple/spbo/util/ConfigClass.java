package org.simple.spbo.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 
 * @author GeL
 * 配置文件类 导入xml配置文件
 * classpath路径：locations={"classpath:application-bean1.xml","classpath:application-bean2.xml"}
 * file路径： locations = {"file:d:/test/application-bean1.xml"};
 */
@Configuration
@ImportResource(locations={"classpath:application-bean.xml"})
public class ConfigClass {

}
