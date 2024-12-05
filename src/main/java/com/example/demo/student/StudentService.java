package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service //Indico que es un bean que sera usado en IoC
public class StudentService{
    /*las interfaces no necesitan la anotacion de @Service o @Component
    porque cuando extiendo de una interfaz del repositorio de Spring data este automaticamente
    detecta y crea una implementacion en tiempo de ejecucion.*/
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    };
}
