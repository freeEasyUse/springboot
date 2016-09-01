package org.simple.spbo.dao;

import org.simple.spbo.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Student, Long> {
	
}
