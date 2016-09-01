package org.simple.spbo.dao;

import javax.annotation.Resource;

import org.simple.spbo.entity.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements IStudentDao {

	@Resource
	private JdbcTemplate jdbcTemplate;
	
	public Student findStudentById(Student s) {
		String sql = "select * from student where id = ?";
		RowMapper<Student> rowMapper = new BeanPropertyRowMapper<Student>(Student.class);
		return jdbcTemplate.queryForObject(sql, rowMapper, s.getId());
	}

}
