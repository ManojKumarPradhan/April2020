package com.bigob.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.bigob.dao.StudentPagingRepositary;
import com.bigob.dao.StudentRepositary;
import com.bigob.domain.Student;
import com.bigob.service.IStudentService;

@Service
public class StudentServieImpl implements IStudentService {

	@Autowired
	private StudentRepositary studentRepo;

	@Autowired
	private StudentPagingRepositary studentPageingRepo;

	@Override
	public List<Student> getAllstudent() {
		return (List<Student>) studentRepo.findAll();
	}

	@Override
	public String deleteStudentById(Integer id) {
		studentRepo.deleteById(id);
		Optional<Student> stud = studentRepo.findById(id);
		return stud.isEmpty() ? "Student with ID" + id + "is Deleted Sucesfully "
				: "Student not Delete due to some error";
	}

	@Override
	public String saveStudent(Student student) {
		Student student2 = studentRepo.save(student);
		return student2 != null ? student2.getId() + " saved sucesfuly " : "some error happend";
	}

	@Override
	public Object getStudentbyPage(Integer pageNo) {
		return studentPageingRepo.findAll(PageRequest.of(pageNo-1, 4));
	}

	@Override
	public Integer getpageLinkCount() {
		List<Student> pageList = (List<Student>) studentRepo.findAll();
		Integer count = pageList.size();
		return (count % 4 == 0) ? count / 4 : count / 4 + 1;
	}
}
