package com.bigob.service;

import java.util.List;

import com.bigob.domain.Student;

public interface IStudentService {

	public List<Student> getAllstudent();
	
	public String deleteStudentById(Integer id);
	
	public String saveStudent(Student student);
}
