package com.example.studentservice.service;

import com.example.studentservice.entity.Student;
import com.example.studentservice.repository.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StudentServiceTest {

    @Mock
    private StudentRepository repository;

    @InjectMocks
    private StudentService service;

    private Student student;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        student = new Student();
        student.setStudentId("S1");
        student.setStudentName("Praneeth RallaBandi");
        student.setGrade("5");
        student.setMobileNumber("1234567890");
        student.setSchoolName("ABC School");
    }

    @Test
    void addStudentTest() {
        when(repository.save(student)).thenReturn(student);
        Student saved = service.addStudent(student);
        assertNotNull(saved);
        assertEquals("S1", saved.getStudentId());
    }

    @Test
    void getStudentTest() {
        when(repository.findById("S1")).thenReturn(Optional.of(student));
        Student fetched = service.getStudent("S1");
        assertEquals("Praneeth RallaBandi", fetched.getStudentName());
    }
}
