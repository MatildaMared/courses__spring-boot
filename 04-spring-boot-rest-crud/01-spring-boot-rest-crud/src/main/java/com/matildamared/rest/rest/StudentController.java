package com.matildamared.rest.rest;

import com.matildamared.rest.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Matilda", "Mared"));
        students.add(new Student("John", "Doe"));
        students.add(new Student("Mary", "Public"));

        return students;
    }
}
