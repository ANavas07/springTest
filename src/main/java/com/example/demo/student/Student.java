package com.example.demo.student;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name= "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long dni;
    private String name;
    private Integer age;
    private LocalDate birthDate;
    private String email;

    public Student() {};

    public Student(Long dni, Integer age, String name, LocalDate birthDate, String email) {
        this.dni = dni;
        this.age = age;
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
    };

    public Student(String email, LocalDate birthDate, Integer age, String name) {
        this.email = email;
        this.birthDate = birthDate;
        this.age = age;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Student{" +
                "dni=" + dni +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                '}';
    }
}
