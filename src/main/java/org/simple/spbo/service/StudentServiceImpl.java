package org.simple.spbo.service;

import javax.transaction.Transactional;

import org.simple.spbo.dao.IStudentDao;
import org.simple.spbo.dao.StudentDao;
import org.simple.spbo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	@Autowired
	private IStudentDao iStudentDao;
	
	
	@Transactional
	public void saveStudent(Student student) {
		studentDao.save(student);
	}

	/**
	 * 使用jpa实现
	 */
	public Student getStudent(long id) {
		return studentDao.findOne(id);
	}

	/**
	 * 使用jdbcTemplate实现
	 */
	public Student getSudentByTemplate(Student s) {
		return iStudentDao.findStudentById(s);
	}

}
