package com.niraj.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.niraj.dao.Person;
import com.niraj.pojo.Student;

public class App 
{
	public static void main( String[] args )
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);

		Person person = context.getBean("studentDao", Person.class);

		// INSERT
//		Student student = new Student(); 
//		student.setId(6317000);
//		student.setName("Miss"); 
//		student.setAddress("India");
//
//		int result = person.insert(student);
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
		List<Student> students = person.selectAll();
		for (Student student : students) {
			System.out.println(student);
		}

		((AbstractApplicationContext) context).close();
	}
}
