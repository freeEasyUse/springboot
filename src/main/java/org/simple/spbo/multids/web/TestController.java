package org.simple.spbo.multids.web;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("multi")
public class TestController {

    //没有指定为主数据源.
    @Autowired
    private DataSource dataSource;
   
    @Autowired
    @Qualifier("ds1")
    private DataSource dataSource1;
    
    @RequestMapping("/get")
    public void get(){
       //观察控制台的打印信息.
    	System.out.println("get===");
    	System.out.println(dataSource);
    }
   
    @RequestMapping("/get1")
    public void get1(){
       //观察控制台的打印信息.
    	System.out.println("get1");
    	System.out.println(dataSource1);
    }
	
}
