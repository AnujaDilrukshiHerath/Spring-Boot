package com.example.student.service;

import com.example.student.dto.StudentDto;
import com.example.student.entity.Student;
import javassist.NotFoundException;

import java.util.List;

public interface StudentService {
    List<Student> getStudents();
    StudentDto getStudent(int studentId) throws NotFoundException;
    String addStudent(StudentDto studentDto);
    void deleteStudent(Integer studentId);
    Student updateStudent(StudentDto studentDto);

}
