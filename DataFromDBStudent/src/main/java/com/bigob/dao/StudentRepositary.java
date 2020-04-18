package com.bigob.dao;

import org.springframework.data.repository.CrudRepository;

import com.bigob.domain.Student;

public interface StudentRepositary extends CrudRepository<Student, Integer> {

}
