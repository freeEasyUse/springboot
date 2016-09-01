package org.simple.spbo.timer;

import org.simple.spbo.entity.Student;
import org.simple.spbo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 定时任务
 * @author GeL
 *
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {

	@Autowired
	private StudentService studentService;
	
	/**
	 * 每20s 输出
	 */
	@Scheduled(cron = "0/20 * * * * ?")
	public void sayHelloEvery20Mis(){
		System.out.println(">>>>>>>>> SchedulingConfig.scheduler()");
		//每20s获取数据库中数据输出
		Student s = studentService.getStudent(1);
		System.out.println("student info"+s);
	}
	
}
