package com.hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.entity.Student;
import com.hr.mapper.StudentMapper;
import com.hr.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper sm;
	@Override
	public List<Student> selectAll() {
		// TODO Auto-generated method stub
		return sm.selectAll();
	}
	@Override
	public int delete(int sid) {
		// TODO Auto-generated method stub
		return sm.deleteByPrimaryKey(sid);
	}

}
