package org.simple.sp.test;

import org.junit.Assert;
import org.junit.Test;
import org.simple.spbo.entity.Student;
import org.simple.spbo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * student test
 * @author GeL
 *
 */
public class StudentTest extends BaseTest {

	@Autowired
	private StudentService studentService;
	
	
	@Test
	public void getStudent(){
		Student s =studentService.getStudent(1);
		Assert.assertEquals(11,s.getAge());
	}
	
	@Test
	public void getStudentByTemplate(){
		Student s = new Student();
		s.setId(1);
		s = studentService.getSudentByTemplate(s);
		Assert.assertEquals(11,s.getAge());
	}
}
