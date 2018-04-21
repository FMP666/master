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
		map.put("list", list);
		return "/list.jsp";
	}
	@RequestMapping("/delete")
	public String delete(int sid,ModelMap map) {
		int delete = ss.delete(sid);
		System.out.println(i);
		return selectAll(map);
	}
}
