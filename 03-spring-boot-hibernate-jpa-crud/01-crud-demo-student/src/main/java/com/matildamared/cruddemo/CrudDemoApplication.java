package com.matildamared.cruddemo;

import com.matildamared.cruddemo.dao.StudentDAO;
import com.matildamared.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
//			createStudent(studentDAO);
			createMultipleStudents(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student object...");
		Student student = new Student("Matilda", "Mared", "matildamared@live.se");

		System.out.println("Saving student...");
		studentDAO.save(student);

		System.out.println("Done! Generated id: " + student.getId());
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		System.out.println("Creating 3 new student object...");
		Student student = new Student("Matilda", "Mared", "matildamared@live.se");
		Student student2 = new Student("John", "Doe", "johndoe@matildamared.se");
		Student student3 = new Student("Jane", "Doe", "janedoe@matildamared.se");

		System.out.println("Saving students...");
		studentDAO.save(student);
		studentDAO.save(student2);
		studentDAO.save(student3);

		System.out.println("Done! Generated id for student 1: " + student.getId());
		System.out.println("Done! Generated id for student 2: " + student2.getId());
		System.out.println("Done! Generated id for student 3: " + student3.getId());
	}

}
