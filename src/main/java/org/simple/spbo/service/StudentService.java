package org.simple.spbo.service;

import org.simple.spbo.entity.Student;

/**
 * student service
 * @author GeL
 *
 */
public interface StudentService {

	void saveStudent(Student student);
	
	Student getStudent(long id);
	
	Student getSudentByTemplate(Student student);
	
}
