package org.simple.spbo.web;

import org.simple.spbo.entity.Student;
import org.simple.spbo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("save")
	public String insert(){
		Student student = new Student();
		student.setAge(11);
		student.setClassName("class 2");
		student.setName("goodboy");
		studentService.saveStudent(student);
		return "save sucess";
		
	}
	
}
