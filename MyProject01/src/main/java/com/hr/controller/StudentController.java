package com.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hr.entity.Student;
import com.hr.service.StudentService;
	
@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService ss;
	@RequestMapping("/selectAll")
	public String selectAll(ModelMap map){
		List<Student> list = ss.selectAll();
		for (Student student : list) {
			System.out.println(student.getSid()+" "+student.getSname());
		}
		map.put("list", list);
		return "/list.jsp";
	}
}
