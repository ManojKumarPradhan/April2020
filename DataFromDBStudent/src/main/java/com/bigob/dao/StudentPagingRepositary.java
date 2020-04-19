package com.bigob.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.bigob.domain.Student;

public interface StudentPagingRepositary extends PagingAndSortingRepository<Student, Integer> {

}
