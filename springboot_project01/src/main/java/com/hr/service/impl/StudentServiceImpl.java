package com.hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hr.entity.Student;
import com.hr.mapper.StudentMapper;
import com.hr.service.StudentService;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper sm;
	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<Student> selectAll() {
		// TODO Auto-generated method stub
		System.out.println("这是service层");
		return sm.selectAll();
	}
	@Override
	public int delete(int sid) {
		// TODO Auto-generated method stub
		return sm.deleteByPrimaryKey(sid);
	}
	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public Student selectById(int sid) {
		// TODO Auto-generated method stub
		return sm.selectByPrimaryKey(sid);
	}

}
