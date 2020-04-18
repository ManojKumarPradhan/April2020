package com.bigob.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(generator = "student_generator")
	@GenericGenerator(name = "student_generator", strategy = "increment")
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "course")
	private String course;
	
	@Column(name = "age")
	private Integer age;

	public Student() {
		// No Arg Constructor
	}

	public Student(Integer id, String name, String course, Integer age) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.age = age;
	}

	public Student(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", age=" + age + "]";
	}

}
