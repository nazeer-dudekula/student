package com.example.student.service;

import com.example.student.entity.Student;

import java.util.List;

public interface StudentInterafce {
    List<Student> getAllStudents();
    Student addStudent(Student student);
}
