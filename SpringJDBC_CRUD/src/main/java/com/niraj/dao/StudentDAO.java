package com.niraj.dao;

import java.util.List;

import com.niraj.jdbc.Student;

public interface StudentDAO {
	
	// inserting data
	public int insert(Student student);
	
	// updating data
	public int update(Student student);
	
	// deleting data from database using id
	public int delete(int studentId);
	
	// selecting data from database - selecting only one row - data
	public Student select(int studentId);
	
	// Selecting all the data from database
	public List<Student> selectAll();
	
}
