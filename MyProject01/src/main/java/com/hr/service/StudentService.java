package com.hr.service;

import java.util.List;

import com.hr.entity.Student;

public interface StudentService {
	List<Student> selectAll();
	
	int delete(int sid);
}
