package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(
                1L,
                12,
                "Ariel",
                LocalDate.of(2000, Month.APRIL, 8),
                "ariel@gmail.com"
        ));
    };
}
