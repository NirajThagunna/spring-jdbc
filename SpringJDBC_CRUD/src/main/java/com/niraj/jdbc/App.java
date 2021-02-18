package com.niraj.jdbc;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niraj.dao.StudentDAO;

public class App 
{
	public static void main( String[] args )
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("jdbcConfig.xml");

		StudentDAO studentDAO = context.getBean("studentDao", StudentDAO.class);

		// INSERT
		//		Student student = new Student(); 
		//		student.setId(6317067);
		//		student.setName("Shalu"); 
		//		student.setAddress("India");
		//
		//		int result = studentDAO.insert(student);
		//		System.out.println("Data inserted successfully ... " + result);


		// UPDATE
		/*
		 * Student student = new Student(); student.setId(6317070);
		 * student.setName("Aarjit"); student.setAddress("USA");
		 * 
		 * int result = studentDAO.update(student);
		 * System.out.println("Updating data successfully ... " + result);
		 */

		// DELETE
		/*
		 * int result = studentDAO.delete(6317075);
		 * System.out.println("Deleting data successully ... " + result);
		 */

		// SELECT 
//		Student student = studentDAO.select(6317080); 
//		System.out.println(student);


		// SELECT ALL
		List<Student> students = studentDAO.selectAll();
		for (Student student : students) {
			System.out.println(student);
		}

		context.close();
	}
}
