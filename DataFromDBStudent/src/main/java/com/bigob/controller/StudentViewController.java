package com.bigob.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bigob.domain.Student;
import com.bigob.service.IStudentService;

@Controller
public class StudentViewController {

	@Autowired
	private IStudentService studentService;

	@GetMapping("home")
	public String getHomePage() {
		return "home";
	}

	@GetMapping("getAll")
	public String getAllData(Map<String, Object> map) {
		map.put("all", studentService.getAllstudent());
		return "studentDatas";
	}

	@GetMapping("delete")
	public String deleteById(@RequestParam Integer id, Map<String, Object> map) {
		map.put("message", studentService.deleteStudentById(id));
		map.put("all", studentService.getAllstudent());
		return "studentDatas";
	}

	@GetMapping("register")
	public String studentRegister(Map<String, Object> map) {
		map.put("student", new Student());
		return "register";
	}
	
	@PostMapping("insert")
	public String saveStudent(Map<String, Object> map, @ModelAttribute Student student) {
		map.put("message", studentService.saveStudent(student));
		map.put("student", new Student());
		return "register";
	}
}
