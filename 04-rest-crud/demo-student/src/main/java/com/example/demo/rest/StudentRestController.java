package com.example.demo.rest;

import com.example.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    List<Student> theStudents;

    // Load the student data only once
    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();
        theStudents.add(new Student("John", "Smith"));     // studentId = 0
        theStudents.add(new Student("Mary", "Doe"));       // studentId = 1
        theStudents.add(new Student("Mario", "Suzuki"));   // studentId = 2
    }

    @GetMapping("/students")
    public List<Student> getStudents() {

        return theStudents;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudents(@PathVariable int studentId) {

        // check the studentId
        if ( (studentId >= theStudents.size()) || (studentId < 0)) {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }

        return theStudents.get(studentId);
    }
}

