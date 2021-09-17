package com.example.student.controller;

import com.example.student.dto.ClassRoomDto;
import com.example.student.dto.StudentDto;
import com.example.student.entity.Student;
import com.example.student.service.imple.StudentImpl;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentImpl studentImpl;

    @Autowired
    public StudentController(StudentImpl studentImpl) {
        this.studentImpl = studentImpl;
    }




    @GetMapping
    public List<Student> getStudents(){
        return studentImpl.getStudents();
        }

    @GetMapping(value = "/{id}")
    public StudentDto getStudent(@PathVariable("id") int studentId) throws NotFoundException{
        return studentImpl.getStudent(studentId);
        }

        @PostMapping
        public ResponseEntity<?> addStudent(@RequestBody StudentDto studentDto, BindingResult result) {
            if (result.hasErrors()) {
                Map<String, String> errors = new HashMap<>();
                for (FieldError error : result.getFieldErrors()) {
                    errors.put(error.getField(), error.getDefaultMessage());
                }
                return new ResponseEntity<Map<String, String>>(errors, HttpStatus.BAD_REQUEST);
            }

            String c = studentImpl.addStudent(studentDto);
            return new ResponseEntity<String>(c, HttpStatus.CREATED);
        }

        @PutMapping()
        public Student updateStudent( @RequestBody StudentDto studentDto) {
            Student student= studentImpl.updateStudent(studentDto);
            return student;
        }

        @DeleteMapping(value = "/{id}")
        public void deleteStudent(@PathVariable("id") int studentId) {
            studentImpl.deleteStudent(studentId);
        }

    }

