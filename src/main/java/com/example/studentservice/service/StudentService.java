package com.example.studentservice.service;
import com.example.studentservice.entity.Student;
import com.example.studentservice.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student addStudent(Student student){
        return repository.save(student);
    }

    public Student getStudent(String id){
        return repository.findById(id).orElseThrow();
    }

    public List<Student> getStudents(){
        return repository.findAll();
    }
}
