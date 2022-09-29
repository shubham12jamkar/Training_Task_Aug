package com.yash.Springjdbc.dao;

import java.util.List;

import com.yash.Springjdbc.entities.Student;

public interface StudentDao {
	public int insert(Student stu);
	public int updatedetails(Student stu);
	public int deletedetails(int stuid);
	public Student selectDetails(int stuid);
	public List<Student> getAllDetails();

}
