package com.niraj.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.niraj.dao.RowMapperImplement;
import com.niraj.dao.StudentDAO;
import com.niraj.jdbc.Student;

public class StudentDaoImplement implements StudentDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	// insert data
	public int insert(Student student) {
		
		// insert query
		String query = "insert into student(id, name, address) values(?, ?, ?)";
		int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getAddress());
		
		return result;
	}
	
	// update data
	public int update(Student student) {
		
		// updating data - update query
		String query = "update student set name = ?, address = ? where id = ?";
		int result = this.jdbcTemplate.update(query, student.getName(), student.getAddress(), student.getId());
		
		return result;
	}
	
	// delete data
	public int delete(int studentId) {
		
		// delete query
		String query = "delete from student where id = ?";
		int result = this.jdbcTemplate.update(query, studentId);
		
		return result;
	}
	
	// select data - single data
	public Student select(int studentId) {
		
		// select query
		String query = "select * from student where id = ?";
		RowMapper<Student> rowMapper = new RowMapperImplement();
		
		// Converting the resultSet into object - rowMapper
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		
		return student;
	}
	
	// select all data
	public List<Student> selectAll() {
		
		// select query fire
		String query = "select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImplement());
		
		return students;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
