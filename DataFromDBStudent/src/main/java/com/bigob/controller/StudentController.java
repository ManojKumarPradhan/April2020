package com.bigob.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bigob.domain.Student;
import com.bigob.service.IStudentService;

@RestController
public class StudentController {

	@Autowired
	private IStudentService studentService;
	
	@RequestMapping("/test")
	public String forTest() {
		return "This method is for test";
	}
	
	@RequestMapping("all")
	public List<Student> getAllstudentInfo(){
		return studentService.getAllstudent();
	}
	
}
