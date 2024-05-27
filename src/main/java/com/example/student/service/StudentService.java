package com.example.student.service;

import com.example.student.entity.Student;
import com.example.student.repo.StudentRepo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentInterafce {

    private final StudentRepo studentRepo;
    private static final Logger logger = LoggerFactory.getLogger(StudentService.class);
    @Autowired
    private Environment env;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public List<Student> getAllStudents() {
    	 logger.info("-----PORT-----" + env.getProperty("local.server.port"));
        return studentRepo.findAll();
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

}
