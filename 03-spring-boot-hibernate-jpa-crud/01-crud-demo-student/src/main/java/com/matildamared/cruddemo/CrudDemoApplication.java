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
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student object...");
		Student student = new Student("Matilda", "Mared", "matildamared@live.se");

		System.out.println("Saving student...");
		studentDAO.save(student);

		System.out.println("Done! Generated id: " + student.getId());
	}

}
